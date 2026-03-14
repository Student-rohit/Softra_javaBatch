package Exception;

public class CompileException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplyForLicence card=new ApplyForLicence("ganesh");
		try {
			card.applyForLicence(10);
		} catch (AgeException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("pls try after " + (18 - e.getAge()) + " years");		}

	}

}


class AgeException extends Exception{ // user defined
	int age;

	public AgeException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AgeException(int age) {
		super();
		this.age = age;
	}
	int getAge() {
		return age;
	}
	
}

class ApplyForLicence{
	String name;
	//int age;

	public ApplyForLicence() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ApplyForLicence(String name) {
		super();
		this.name = name;
	}
	void applyForLicence(int age)throws AgeException{
		if(age<16) {
			throw new AgeException(age);
		}
		else {
			System.out.println("cand is eligible");
		}
		
	}
	
}
