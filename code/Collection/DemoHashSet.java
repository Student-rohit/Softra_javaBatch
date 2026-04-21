package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s = new HashSet<>();
		s.add("java");
		s.add("java   ");
		s.add("spring");
		s.add(" apple");
		s.add("1");
		
		for(String h:s) {
			System.out.println(h);
		}
		TreeSet<String> s1 = new TreeSet<>();
		s1.add("10");
		s1.add("java");
		//s1.addAll(s);
		
		for(String a:s1) {
			System.out.println(a);
		}
		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(5);
		for(Integer b:hs) {
			System.out.println(hs);
		}

	}

}
