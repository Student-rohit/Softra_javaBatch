package Inheritance;

public class DemoInh_1 {
	int id;
	String name;
	
	void showData() {
		System.out.println(" parent");
		
	}

}
class  Rohit extends DemoInh_1{
	String subj[];
	
	public Rohit(int id,String name,String[] subj ){
		
		this.subj=subj;
		
	}
	void showData() {
		System.out.println("child");
		
	}
}
