package polymorphism;
public abstract class Employees {
	int empId;
	String empName;
	public Employees() {
		super();
	}
	
	public Employees(int empId ,String Name) {
		super();
		this.empId=empId;
		this.empName=empName;
	}
	void showEmpData() {
		System.out.println("data id" + empId+ ""+empName);
	}
	abstract int calcSal();

}

class RegEmp extends Employees{
	int bsal;

	@Override
	int calcSal() {
		// TODO Auto-generated method stub
		int pf =(int)(0.12f * bsal);
		return bsal-pf;
	}

	public RegEmp(int empId , String empName , int bsal) {
		super(empId , empName);
		this.bsal = bsal;
	}
	
	void test() {
		System.out.println("not recommended");
	}
}

class CtrEmp extends Employees{

	@Override
	int calcSal() {
		// TODO Auto-generated method stub
		return 25000;
	}

	public CtrEmp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CtrEmp(int empId, String Name) {
		super(empId, Name);
		// TODO Auto-generated constructor stub
	}
	
}
