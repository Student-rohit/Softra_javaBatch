package com.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class DemoST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileReader fr;
		
		BufferedReader br;
		
		StringTokenizer st;
		
		String data;
		
		try {
		fr=new FileReader("emp.txt");
		
		br=new BufferedReader(fr);
		
		data=br.readLine();
		
		while(data!=null) {
			st=new StringTokenizer(data,"#");
			while(st.hasMoreElements()) {
				String id=st.nextToken();
				String name=st.nextToken();
				String bsal=st.nextToken();
				
				System.out.println("emp data " + id + "\t" + name + "\t" + bsal);
				
				
			} // end of inner most loop 
			data=br.readLine();
		}  // end of outer loop
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
