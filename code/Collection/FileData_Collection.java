package com.collection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class FileData_Collection {

    public static void main(String[] args) {

        ArrayList<EmployeeBean> al = new ArrayList<>();

        try {
        	FileReader fr = new FileReader("C:\\Users\\rohit\\OneDrive\\Desktop\\1.txt");
            BufferedReader br = new BufferedReader(fr);

            String data;

            while ((data = br.readLine()) != null) {

                StringTokenizer st = new StringTokenizer(data, "#");

                if (st.countTokens() == 3) {

                    String id = st.nextToken();
                    String name = st.nextToken();
                    String bsal = st.nextToken();

                    EmployeeBean eb = new EmployeeBean();

                    eb.setEmp_id(Integer.parseInt(id));
                    eb.setEmp_name(name);
                    eb.setEmp_bsal(Integer.parseInt(bsal));

                    al.add(eb);
                }
            }

            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Print data
        for (EmployeeBean e : al) {
            int pf = (int) (0.12 * e.getEmp_bsal()); 
            int sal = e.getEmp_bsal() - pf;

            System.out.println("Salary for emp " + e.getEmp_id() + " = " + sal);
        }
    }
}