package com.nguyen.internet.test;

import java.util.ArrayList;

import org.junit.Test;

import com.nguyen.internet.RetrieveFile;

import junit.framework.TestCase;

public class RetrieveFileTest extends TestCase
{
	@Test
	public void testParseFile()
	{
		ArrayList<String> myData = RetrieveFile.parseFile("https://wipebook.org/vnps.csv");
		
		assertNotNull(myData);
		
		for(String data : myData)
		{
			System.out.println(data);
		}
	}
}
