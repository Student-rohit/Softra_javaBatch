package com.collection;

import java.util.TreeSet;

public class DemoTreeSet {

    public static void main(String[] args) {

        TreeSet<Employees> s = new TreeSet<>();

        Employees e1 = new Employees(1, "Rohit");
        Employees e2 = new Employees(1, "Rohit");
        
        Employees e3 = e2;
        Employees e4 = new Employees(2, "Java");

        s.add(e1);
        s.add(e2);
        s.add(e3);
        s.add(e4);

        System.out.println(s);

        System.out.println("is e1 equal to e2 : " + e1.equals(e2));
        System.out.println("is e3 equal to e2 : " + e3.equals(e2));

        System.out.println("e1 hashcode : " + e1.hashCode());
        System.out.println("e2 hashcode : " + e2.hashCode());
    }
}

class Employees implements Comparable<Employees> {

    Integer emp_id;
    String emp_name;

    public Employees(Integer emp_id, String emp_name) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
    }

    @Override
    public String toString() {
        return "Employees [emp_id=" + emp_id + ", emp_name=" + emp_name + "]";
    }

    @Override
    public int hashCode() {
        return emp_id.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Employees) {
            Employees e = (Employees) obj;
            return this.emp_id.equals(e.emp_id);
        }
        return false;
    }

    @Override
    public int compareTo(Employees o) {
        return this.emp_id.compareTo(o.emp_id);
    }
}