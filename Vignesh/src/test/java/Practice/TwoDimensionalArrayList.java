package Practice;

import java.util.ArrayList;

public class TwoDimensionalArrayList {
	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList<String>();
		
		al.add("1");
		al.add("2");
		al.add("3");		
		ArrayList<ArrayList<String>> ali = new ArrayList<ArrayList<String>>();
		ali.add(al);
		
		System.out.println(ali.get(0).get(2));
	}

}
