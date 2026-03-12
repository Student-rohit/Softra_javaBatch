package interface_static;

public class DemoStaticMain {
	public  static void main(String[] args) {
		FundCollected fc1 = new FundCollected("rohit" , 100);
		FundCollected fc2= new FundCollected("DJ" , 200);

		
		System.out.println(FundCollected.getFundCollected()); 
	}
	
}
