package com.nguyen.internet;

import java.util.ArrayList;
import java.util.Collections;

/**
* This class sorts an ArrayList of Strings by removing elements where there 
* is an integer then sorting it alphabetically
* 
* @author  Patrick Nguyen
*/


public class SortData {

	/**
     * Function to clean an inputed ArrayList of Strings by removing elements with integers
     * 
     * @param lst
     * 		ArrayList to be cleaned
     * 
     * @return a cleaned ArrayList of Strings
     * 		
     */
	public static ArrayList<String> cleanList(ArrayList<String> lst)
	{
		ArrayList<String> tempList = new ArrayList<>();
		
		for (String value: lst) 
		{
			boolean state;
			state = false;

			for(char c : value.toCharArray()) 
			{
				if(Character.isDigit(c)) 
				{
					state = true;
				}
			}
			
			if(state == false)
			{
				tempList.add(value);
			}
		}

		return tempList;
	}
	
	/**
     * Function to sort an inputed ArrayList of Strings
     * 
     * @param lst
     * 		ArrayList to be sorted
     * 
     * @return a sorted ArrayList of Strings
     * 		
     */
	public static ArrayList<String> sortList(ArrayList<String> lst)
	{
		Collections.sort(lst, String.CASE_INSENSITIVE_ORDER);
		
		return lst;

	}
}
