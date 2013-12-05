package com.karkinos.croupon;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;
import android.os.Environment;
import android.util.JsonWriter;
import android.util.Log;


public class Database{
	private Context parentContext;
	private JsonWriter writer;
	private File STOREDIR = Environment.getExternalStorageDirectory();
	private String JSONFILENAME = "TESTJSON.JSON";
	
	
	public Database(Context context){
		this.parentContext = context;
	}
	
	public Deal getDeal(int id){
		
		Deal d = new Deal();
		
		return d;
	}
	
	public ArrayList<Deal> getCurrentDeals(){
		JSONObject jsonFromFile = null;
		JSONArray dealArray = null;
		String displayText = readDataFromFile();
		
		ArrayList<Deal> dealsToReturn;
		
		try{
			jsonFromFile = new JSONObject(displayText);
		}
		catch (JSONException e){
			System.out.println();
		}
		
		
		try {
			dealArray= jsonFromFile.getJSONArray("deals");
			
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		dealsToReturn = new ArrayList<Deal>();
		
		for (int i=0; i < dealArray.length(); i++){
			JSONObject sd = null;
			try {
				sd = (JSONObject) dealArray.get(i);
				Deal d = new Deal();
				
				d.setId(sd.getInt("id"));
				d.setImage(sd.getInt("image"));
				d.setTitle(sd.getString("title"));
				d.setDescription(sd.getString("description"));
				d.setCurrentSupporters(sd.getInt("currentSupporters"));
				d.setMaxSupporters(sd.getInt("maxSupporters"));
				//d.setRegularPrice(sd.getDouble("regularPrice"));
		

//			    public float regularPrice = 0;
//			    public float discountPrice = 0;
//			    public float msrp = 0;
//			    public float lowestMarketPrice = 0;
//			    public int rank = 0;
//			    public int votes = 0;
//			    public int categoryId = 0;
//			    public int championId = 0;
//			    public String qa = "";
//			    public String comments = "";
//			    public String webUrls = "";
//				
//				String description = sd.getString("description");
//				int image = R.drawable.samsung_tv;
//				int currentSupporters = Integer.parseInt(sd.getString("currentSupporters"));
//				int maxSupporters = 50;    //NEEDS EDITING
//				float regularPrice = Float.parseFloat(sd.getString("regularPrice"));
//				float discountPrice = Float.parseFloat(sd.getString("discountPrice"));
				
				
				
				
				
				
				dealsToReturn.add(d);
			} catch (JSONException e) {e.printStackTrace();}
		}
		
		//Log.d("BETA", (String)dealsToReturn[0].getId());
		return dealsToReturn;
		//public Deal(String description, int image, int currentSupporters, 
		 //int maxSupporters, int regularPrice, int discountPrice) {
	
	}

	public String readDataFromFile(){
		String displayText = "";
		
		
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

		return displayText;
}

	public void writeDataToFile(){
		
		File sdDir = Environment.getExternalStorageDirectory();
		try {
			writer = new JsonWriter(new FileWriter(STOREDIR + "/" + JSONFILENAME, false));;
			writer.beginObject();
			writer.name("deals");
			writer.beginArray();
			
			// samsung TV 2130837508
			String [][] deals = new String[][] {
					{"412", "Samsung TV 1100Hz 10902p", Integer.toString(R.drawable.samsung_tv), "100", "999", "400.15","300.50","Samsung TV 1000Hz 10920p"},
					{"12", "LGS TV, Larger than life 1231312", Integer.toString(R.drawable.test_image) , "32", "55", "800", "42.5","LGS TV, Larger than life 1231312"},
					{"2", "PS8", Integer.toString(R.drawable.samsung_tv), "1", "5", "600","123", "PS8"},
					{"2", "PS8", Integer.toString(R.drawable.test_image), "10000", "12131", "600","123",  "PS8"},
					{"2", "PS8", Integer.toString(R.drawable.samsung_tv), "10000", "124123","600","123",  "PS8"},
			};
			        
			for (int i=0; i<deals.length;i++){
				writer.beginObject();
				
				writer.name("id").value(deals[i][0]);
				writer.name("description").value(deals[i][1]);
				writer.name("image").value(deals[i][2]);
				writer.name("currentSupporters").value(deals[i][3]);
				writer.name("maxSupporters").value(deals[i][3]);
				writer.name("regularPrice").value(deals[i][5]);
				writer.name("discountPrice").value(deals[i][6]);
				writer.name("title").value(deals[i][7]);

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


	}
	
}
