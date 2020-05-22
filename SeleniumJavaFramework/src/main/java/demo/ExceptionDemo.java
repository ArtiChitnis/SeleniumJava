package demo;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
		System.out.println("Hello World");
		int i = 1/0;
		System.out.println("Completed");
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println(e.getMessage()); 
			e.printStackTrace();
		
		}
		finally {
			System.out.println("Finally");
		}
	}

}
