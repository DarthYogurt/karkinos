package com.karkinos.croupon;

import java.io.File;
import java.io.InputStream;

import android.content.Context;


public class Database{
	private Context parentContext;
	
	public Database(Context context){
		this.parentContext = context;
		
	}
	
	public void getCurrentDeals(){
		
		String filename = "config.txt";
		File file = new File(this.parentContext.getFilesDir(), filename);
		
	
		
		
		System.out.println();
		
		
	}

}
