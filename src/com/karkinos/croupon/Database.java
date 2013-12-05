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
				d.setRegularPrice(sd.getDouble("regularPrice"));
				d.setDiscountPrice(sd.getDouble("discountPrice"));
				d.setMsrp(sd.getDouble("msrp"));
				d.setLowestMarketPrice(sd.getDouble("lowestMarketPrice"));
				
				
				
				d.setRank(3);
				d.setVotes(100);
				d.setCategoryId(41);
				d.setChampionId(32);
				d.setQa("is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
				d.setComments("Sed interdum felis et nisl sollicitudin aliquet. Nullam et ligula ullamcorper, adipiscing nulla ut, luctus dui. Nam iaculis vitae sem id pellentesque. Aliquam fringilla aliquam dignissim. Sed rhoncus quam lorem, accumsan varius nibh posuere non. Etiam ligula nisi, tincidunt eget fermentum nec, tincidunt quis nisl. Duis id justo et augue adipiscing laoreet in a nunc. Donec placerat ut dolor vel sollicitudin. Nullam sodales felis ut nulla interdum, quis posuere justo laoreet. Sed scelerisque felis ut libero malesuada suscipit. Sed sit amet egestas turpis, sit amet adipiscing sapien. Quisque viverra odio id accumsan tincidunt. Sed nibh justo, porta eget mi tristique, consectetur scelerisque dolor. Nullam dapibus, diam at sagittis ornare, mi tellus tristique odio, a venenatis purus nunc at urna.");
				d.setWebUrls("www.google.com");
				
				
				//d.setRank(sd.getInt("rank"));
				//d.setVotes(sd.getInt("votes"));
				//d.setCategoryId(sd.getInt("categoryId"));
				//d.setChampionId(sd.getInt("championId"));
				//d.setQa(sd.getString("qa"));
				//d.setComments(sd.getString("comments"));
				//d.setWebUrls(sd.getString("webUrls"));
	
				
				
				
				
				
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
					{"412", "Samsung TV 1100Hz 10902p", Integer.toString(R.drawable.samsung_tv), "100", "999", "400.15","300.50","Samsung TV 1000Hz 10920p", "1000.0", "999"},
					{"12", "LGS TV, Larger than life 1231312", Integer.toString(R.drawable.test_image) , "32", "55", "800", "42.5","LGS TV, Larger than life 1231312","1200", "1150"},
					{"2", "PS8", Integer.toString(R.drawable.samsung_tv), "1", "5", "600","123", "PS8", "400", "390"},
					{"2", "PS8", Integer.toString(R.drawable.test_image), "10000", "12131", "600","123",  "PS8", "700", "660"},
					{"2", "PS8", Integer.toString(R.drawable.samsung_tv), "10000", "124123","600","123",  "PS8", "800", "777"},
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
				writer.name("msrp").value(deals[i][8]);
				writer.name("lowestMarketPrice").value(deals[i][9]);

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
