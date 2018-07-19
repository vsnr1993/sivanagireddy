package firstJavaPackage;

public class PerfectNumber {
	public static void main(String[] args) {
		PerfectNumber p= new PerfectNumber();
		p.perfect(8);
	}

	
	public void perfect(int n)
	{
		int sum = 0;
		for(int x =1; x < n; x++)
		{
			if(n % x ==0)
			{
				sum=sum+x;
			}
		}
		System.out.println(sum);
		if(sum == n)
		{
			System.out.println("perfect number");
		}
		else
		{
			System.out.println("not perfect number");
		}
	}
}
