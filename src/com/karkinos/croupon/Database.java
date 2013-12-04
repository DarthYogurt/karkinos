package com.karkinos.croupon;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;
import android.os.Environment;
import android.util.JsonWriter;


public class Database{
	private Context parentContext;
	private JsonWriter writer;
	private File STOREDIR = Environment.getExternalStorageDirectory();
	private String JSONFILENAME = "TESTJSON.JSON";
	
	
	public Database(Context context){
		this.parentContext = context;
	}
	
	public void getCurrentDeals(){
	
	}

	public void readDataFromFile(){
		String displayText = "";
		JSONObject jsonFromFile = null;
		
		try {
			InputStream fileStream = new FileInputStream(STOREDIR + "/" + JSONFILENAME);
			int fileLen = fileStream.available();
			// Read the entire resource into a local byte buffer.
			byte[] fileBuffer = new byte[fileLen];
			fileStream.read(fileBuffer);
			fileStream.close();
			displayText = new String(fileBuffer);
			
			
		
		} catch (IOException e) {
		  // exception handling
		}
		
		try{
			jsonFromFile = new JSONObject(displayText);
		}
		catch (JSONException e){
			System.out.println();
		}
		
		
		try {
			JSONArray jArray = jsonFromFile.getJSONArray("deals");
			System.out.println();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println();
	}

	public void writeDataToFile(){
		
		File sdDir = Environment.getExternalStorageDirectory();
		
		try {
			writer = new JsonWriter(new FileWriter(STOREDIR + "/" + JSONFILENAME, false));;
			writer.beginObject();
			writer.name("deals");
			writer.beginArray();
			
			String [][] deals = new String[][] {
					{"412", "Samsung TV 1100Hz 10902p", "", "100", "400.15","300.50"},
					{"12", "LGS TV, Larger than life 1231312", "" , "69696969", "800", "42.5"},
					{"2", "PS8", "" , "214123", "10000", "600"},
			};
			        
			for (int i=0; i<deals.length;i++){
				writer.beginObject();
				
				writer.name("id").value(deals[i][0]);
				writer.name("description").value(deals[i][1]);
				writer.name("image").value(deals[i][2]);
				writer.name("currentSupporters").value(deals[i][3]);
				writer.name("regularPrice").value(deals[i][4]);
				writer.name("discountPrice").value(deals[i][5]);

				writer.endObject();
			}
			writer.endArray();
			writer.endObject();
			writer.close();
			System.out.println();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println();
		}

		
		//Toast.makeText(this.parentContext, jsonString, Toast.LENGTH_LONG).show();
		
/*		String error = null;
		JSONObject mainObject = null;
		try{
			mainObject = new JSONObject(jsonString);
		}
		catch (JSONException e){
			Toast.makeText(this.parentContext, "JSON Could not write", Toast.LENGTH_SHORT).show();
		}
		*/


	
		
		
	}
	
}
