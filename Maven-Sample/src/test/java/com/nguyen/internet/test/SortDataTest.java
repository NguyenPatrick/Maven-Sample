package com.nguyen.internet.test;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import com.nguyen.internet.SortData;

import junit.framework.TestCase;

/**
* This class test functions(s) from the class SortData
* 
* @author Patrick Nguyen
*/

public class SortDataTest extends TestCase
{
	
	@Test
	public static void testCleanList()
	{
		
		String names = "34,Alex,Ruby,John1,_Victoria,Ham4let,111";

		ArrayList<String> myData = new ArrayList<String>(Arrays.asList(names.split(",")));
		
		myData = SortData.cleanList(myData); // should clean the list
		assertEquals(myData.get(0), "Alex");
		
		for(String data : myData)
		{
			System.out.println(data);
		}
		
	}

	
	@Test
	public static void testSortList()
	{
		String names = "Larry,Arthur,Gertrude,_Juliette,Richard";
		
		ArrayList<String> myData = new ArrayList<String>(Arrays.asList(names.split(",")));
		
		myData = SortData.sortList(myData); // should sort the list
		assertEquals(myData.get(0), "_Juliette");
		assertEquals(myData.get(4), "Richard");
		
		for(String data : myData)
		{
			System.out.println(data);
		}
	}
	
	
	
	

}
