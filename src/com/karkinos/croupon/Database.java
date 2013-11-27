package com.karkinos.croupon;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;
import android.widget.Toast;


public class Database{
	private Context parentContext;
	
	
	public Database(Context context){
		this.parentContext = context;
		
	}
	
	public void getCurrentDeals(){
		
		String filename = "deal.json";
		File file = new File(this.parentContext.getFilesDir(), filename);
		
	
		//String string = "hello world!";

		//FileOutputStream fos = openFileOutput(filename, Context.MODE_PRIVATE);
		//fos.write(string.getBytes());
		//fos.close();
		
		//FileInputStream fis = openFileInput(filename,Context.MODE_PRIVATE);
		FileInputStream fis;
		//InputStreamReader isr = new InputStreamReader(fis);
		

		String a = new String("");
		if (file.exists() && file.isFile()) {
		   try {
			   fis = new FileInputStream(file);
			   InputStreamReader isr = new InputStreamReader(fis);
			   BufferedReader buffered_reader = new BufferedReader(isr);
			   a = buffered_reader.readLine();
			   
		   } catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		
				
		   } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		else {

		  // error
		}
		
		System.out.println();
	}

	public void writeDataToFile(){
		//String jsonString = "{ deal:[ {id:1, description:'Samsung TV', image:'', currentSupporters:100, regularPrice:400.15, discountedPrice:300.50} ] } ";
		String jsonString = "{ 'id':1, 'description':'Samsung TV', image:'', 'currentSupporters':100, regularPrice:400.15, discountedPrice:300.50}";
		
		//Toast.makeText(this.parentContext, jsonString, Toast.LENGTH_LONG).show();
		
		String error = null;
		JSONObject mainObject = null;
		try {
			mainObject = new JSONObject(jsonString);
			
			String toToast = (String) mainObject.get("description");
			Toast.makeText(this.parentContext, toToast, Toast.LENGTH_LONG).show();
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			Toast.makeText(this.parentContext, e.toString(), Toast.LENGTH_LONG).show();
		}
		
		int i=0;
		
/*		try{
			JSONObject description = mainObject.getJSONObject("description");

			System.out.println();
		}
		catch (JSONException e){
			Toast.makeText(this.parentContext, "FAIL TO READ", Toast.LENGTH_LONG).show();
		}*/

		

		
		
	}
	
}
