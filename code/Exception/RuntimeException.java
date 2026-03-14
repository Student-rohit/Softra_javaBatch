package Exception;

//import java.nio.channels.AlreadyBoundException;

public class RuntimeException {
	public static  void main(String[] args) {
		int len= args.length;
		int a=20;
		try {
			System.out.println("division"+ (a/len));
			System.out.println("completion of task1");
		}
		catch(ArithmeticException ae) {
			System.out.println("can not divided by 0");
			//ae.printStackTrace();
			
		}
		
		try {
			System.out.println("delete task 1");
			System.out.println(args[0] + args[1]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("can not access out of bound ");
			
		}
		finally {
			System.out.println("end of task");
		}
		
	}

}

