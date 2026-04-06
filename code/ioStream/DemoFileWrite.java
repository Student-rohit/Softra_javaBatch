package com.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class DemoFileWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			FileWriter fw;//used to write data into a text file
			
			BufferedReader br;//used to read data from the console
			
			InputStreamReader isr; // converts byte to chars
			try {
			fw=new FileWriter("emp.txt",true);  //creates new text file ,if not existing ,if existing overwrite
			
			//prompting data from the console
			
//			isr=new InputStreamReader(System.in);
//			
//			br=new BufferedReader(isr);
			
			// above 2 lines can be replaced by the following
			
			br=new BufferedReader(new InputStreamReader(System.in));
			
			// read data from console
			
			System.out.println("enter the emp id");
			String emp_id=br.readLine();
			System.out.println("enter the emp name");
			String emp_name=br.readLine();
			
			System.out.println("enter emp basic sal");
			
			String emp_bsal=br.readLine();
			
			//writing data into the text file
			
			fw.write(emp_id);
			fw.write("#");
			fw.write(emp_name);
			fw.write("#");
			fw.write(emp_bsal);
			fw.write("\n");
			fw.close(); // important as data will not be updated
			
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			
			
	}

}
