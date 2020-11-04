package Linkedlist;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class P1 {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("123");
		ll.add("234");
		ll.add("123");
		ll.add(null);
		ll.add(null);
		System.out.println(ll);
		Set<String> hs=new HashSet<String>();
		hs.add(null);
		hs.add("1");
		hs.add(null);
		hs.add("3");
		hs.add(null);
		System.out.println(hs.size());
	}

}
