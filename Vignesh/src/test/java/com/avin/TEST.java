package com.avin;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Spliterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

//going to webpage
//click on the link
//new tab open and get the title

public class TEST 
{

	public static void main(String[] args) {
		LinkedHashMap<String,String> lhm = new LinkedHashMap<String,String>();
		lhm.put("A", "1");
		lhm.put("B", "2");
		lhm.put("C", "3");
		for (Entry<String, String> key : lhm.entrySet()) 
		{
			System.out.println(key);
		}

}
}
