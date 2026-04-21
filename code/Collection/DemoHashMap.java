package com.collection;

import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer ,String> m = new HashMap<Integer, String>();
		// add objects 
		m.put(10, "india");
		m.put(11, "USA");
		m.put(10, "malaysia");
		// list out all the elements
		
			System.out.println(m);
			
			// retrieve a specific object
			System.out.println(m.get(10));
			System.out.println(m.containsKey(10));
		

	}

}
