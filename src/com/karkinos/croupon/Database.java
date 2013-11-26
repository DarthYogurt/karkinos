package com.karkinos.croupon;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import android.content.Context;


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

	public void writeDataToFile()
	
}
