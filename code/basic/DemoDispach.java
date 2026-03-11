
public class DemoDispach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create a referance variable to the abstract class
		
		Employees e;
		RegEmp re = new RegEmp(111,"java" , 5678);
		CtrEmp ce= new CtrEmp(222, " spring");
		
		// implementing the concept of DMD
		// get the salary of reg Emp
		e=re;
		System.out.println("reg emp sal is" + e.calcSal());
		
		// get the sal of contract
		
		e=ce;
		System.out.println("CTR emp sal is" + e.calcSal());

		

	}

}
