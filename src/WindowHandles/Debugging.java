package WindowHandles;

public class Debugging {
			
		public void palindrome(int n) 
		{
			int y=n;
			int sum =0;
			int	rem;
			while (y != 0) 
			{
			 rem = y % 10;
			 sum = sum*10 + rem;
			 y = y/10;	
			 	
			}                                
			
			if (sum == n) 
			{
			System.out.println("Palindrome");	
			}
			else
			{
				System.out.println("Not a Palidrome");
			}
		}
		public static void main(String[] args) {
			Debugging d = new Debugging();
			d.palindrome(1231);
		}

	}


