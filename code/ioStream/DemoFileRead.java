package com.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class DemoFileRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=null;
		FileReader fr = null;
		String  data = null;
		try {
		      fr=new FileReader("C:\\Users\\rohit\\OneDrive\\Desktop\\afkjkeop'bv.dat");
			//fr=new FileWriter("C:\\Users\\rohit\\OneDrive\\Desktop\\afkjkeop'bv.dat");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 //fr = null;
		br=new BufferedReader(fr);
		
		
		try {
			data=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(data != null) {
			System.out.println(data);
			try {
				data =br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
