package com.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class StudentResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			FileWriter fw;
			
			InputStreamReader is;
			
			BufferedReader br;
			
			try {
				fw=new FileWriter("stu.txt",true);
				
				br=new BufferedReader(new InputStreamReader(System.in));
				
				 System.out.println("Enter number of students:");
		            int n = Integer.parseInt(br.readLine());

		            
				 for (int i = 1; i <= n; i++) {

		                System.out.println("\n--- Student " + i + " ---");

		                System.out.println("Enter Student ID:");
		                String studId = br.readLine();

		                System.out.println("Enter Student Name:");
		                String studName = br.readLine();

		                System.out.println("Enter number of subjects:");
		                int subjects = Integer.parseInt(br.readLine());

		                int totalObtained = 0;
		                int totalMax = 0;

		                String marksData = "";

		                for (int j = 1; j <= subjects; j++) {

		                    System.out.println("Enter total marks for subject " + j + ":");
		                    int maxMarks = Integer.parseInt(br.readLine());

		                    System.out.println("Enter obtained marks for subject " + j + ":");
		                    int obtained = Integer.parseInt(br.readLine());

		                    totalMax += maxMarks;
		                    totalObtained += obtained;

		                    marksData += obtained + "/" + maxMarks;

		                    if (j != subjects) {
		                        marksData += ",";
		                    }
		                }

		                // Percentage
		                double percentage = (totalObtained * 100.0) / totalMax;

		                // Result
		                String result = (percentage >= 35) ? "Pass" : "Fail";

		                // Grade
		                String grade;
		                if (percentage >= 75) {
		                    grade = "A";
		                } else if (percentage >= 60) {
		                    grade = "B";
		                } else if (percentage >= 35) {
		                    grade = "C";
		                } else {
		                    grade = "F";
		                }

		                // Write to file
		                fw.write(studId + "/" + studName + "/" +
		                         marksData + "/" +
		                         totalObtained + "/" + totalMax + "/" +
		                         String.format("%.2f", percentage) + "%/" +
		                         result + "/" + grade + "\n");
		            }

		            fw.close();

		            
			}
			catch(Exception e) {
				e.printStackTrace();
			}
	}

}
