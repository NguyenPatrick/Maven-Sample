package com.nguyen.internet;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

import org.apache.commons.io.IOUtils;

/**
* This class retrieves a CSV file from a URL and returns the data in an ArrayList
* 
* @author  Patrick Nguyen
*/

public class RetrieveFile
{

	/**
     * Function to retrieve the data of a CSV file from a URL 
     * 
     * @param url
     * 		URL of the file to download
     * 
     * @return an ArrayList containing data of the CSV file
     * 		
     */
	public static ArrayList<String> parseFile(String url)
	{
		ArrayList<String> myList = null;
		
		try(InputStream inputStream = new URL(url).openStream())
		{
			String list =  IOUtils.toString(inputStream, StandardCharsets.UTF_8);
			myList = new ArrayList<String>(Arrays.asList(list.split(",")));
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return myList;
	}

}
