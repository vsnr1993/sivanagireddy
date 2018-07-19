package selenum;

public class PalindromeNumber {
	
	public void palindrome(int y) 
	{
		
		int sum =0;
		int	rem;
		
		
		for(int i = y;i!= 0; i=i/10)
		{

			 rem = i % 10;
			 sum = sum*10 + rem;
		}
		if (sum == y)
		{
			System.out.println("PalindromeNumber");
			
		}
		else
		{
		System.out.println("Not PalindromeNum ber");	
		}
	}
	public static void main(String[] args) {
		PalindromeNumber pn = new PalindromeNumber();
		pn.palindrome(1234321);
	}

}
