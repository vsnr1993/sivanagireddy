package firstJavaPackage;

public class Even {
	public static void main(String[] args) {
		Even obj = new Even();
		obj.evenOrOdd(101);
	    
		
		
	}

	public void evenOrOdd(int x) {
		int siva= x % 2;
		boolean result;
		if (siva == 0)
		{
			result = true;
		}
		else
		{
			result = false;
		}
		if(result)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd Number");
		}
	}
}
