import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import android.content.res.AssetManager;


public class DealData {

	/**
	 * @param args
	 */


	public List<String> readLines(String filename) throws IOException {
	    List<String> lines = new ArrayList<String>();
	    AssetManager assets = context.getAssets();
	    BufferedReader reader = new BufferedReader(new InputStreamReader(assets.open(filename)));
	    while(true) {
	        String line = reader.readLine();
	        if(line == null) {
	            break;
	        }
	        lines.add(line);
	    }
	    return lines;
	}
	
	public static void main(String[] args) {
		

	}
	
}
