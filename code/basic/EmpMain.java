
public class EmpMain {

    public static void main(String[] args) {

        Employee emp;           // reference 
        emp = new Employee();   // object create

        emp.empId = 101;
        emp.empName = "Rohit Bandgar";
        emp.basicSalary = 30000;

       
        emp.showEmployeeSalary();
        
    }
}
