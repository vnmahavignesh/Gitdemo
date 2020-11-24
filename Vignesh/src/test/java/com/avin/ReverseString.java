package com.avin;

public class ReverseString {

	public static void main(String[] args) {
		String org="Original",reverse="";
		char[] ch = org.toCharArray();
		int characters= ch.length-1;
		for (int i =characters; i >=0; i--) 
		{	
			reverse=reverse+ch[i];			
		}
		System.out.println("String Reversed -> "+reverse);
	}
}
