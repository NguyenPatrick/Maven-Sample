package com.nguyen.internet.test;

import java.util.ArrayList;

import org.junit.Test;

import com.nguyen.internet.RetrieveFile;
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
		ArrayList<String> myData = RetrieveFile.parseFile("https://wipebook.org/vnps.csv");
		ArrayList<String> tempData;

		assertNotNull(myData);
		tempData = SortData.cleanList(myData);
		
		for(String data : tempData)
		{
			System.out.println(data);
		}
	}

}
