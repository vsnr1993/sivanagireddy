package practiceExamples;

public class Perfect {
	public static void main(String[] args) {
		Perfect p =new Perfect();
		p.perfectNumber(496);
	}


public void perfectNumber(int n)
{
  int 	sum = 0;
	for(int x=1; x<n; x++)
	{
		if (n % x ==0) 
		{
			sum=sum+x;
		}
	}
	if (sum == n)
	{
		System.out.println("PerfectNumber");
	}else {
		System.out.println("Not PerfectNumber");
	}
}
}