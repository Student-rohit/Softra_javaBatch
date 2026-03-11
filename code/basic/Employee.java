public class Employee {

    // properties
    int empId;
    String empName;
    float basicSalary;

    // default constructor
    public Employee() {
        super();
    }

    // parameterized constructor
    public Employee(int empId, String empName, float basicSalary) {
        this.empId = empId;
        this.empName = empName;
        this.basicSalary = basicSalary;
    }

    
    void showEmployeeSalary() {

    	 float pf = 0.12f * basicSalary;   
         float hra = 0.14f * basicSalary;  
         float totalSalary = basicSalary + hra - pf;

         System.out.println("Emp ID: " + empId);
         System.out.println("Emp Name: " + empName);
         
         System.out.println("Basic Salary: " + basicSalary);
         System.out.println("PF (12%): " + pf);
         
         System.out.println("HRA (14%): " + hra);
         System.out.println("Total Salary: " + totalSalary);
    }
}
