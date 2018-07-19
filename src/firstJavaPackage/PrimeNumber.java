package firstJavaPackage;

public class PrimeNumber {
	public static void main(String[] args) {
		int temp = 20;
		PrimeNumber p = new PrimeNumber();
		int x = p.primeNumber(temp);
		if(x ==0)
		{
			System.out.println("The given number is prime number");
		}
		else
		{
			System.out.println("The given number is not prime number");
		}
		
	}
   public int primeNumber(int y)
   {
   int count = 0;
   int x = 2;
   while(x < y)
   {
	   if(y % x == 0)
	   {
		   count = count + 1;
		   
	   }
	   x++;
   }
   return count;
}
}
