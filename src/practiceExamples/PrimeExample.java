package practiceExamples;

public class PrimeExample {
	public static void main(String[] args) {
		PrimeExample p=new PrimeExample();
		p.primeNumber();
	}
 public void primeNumber() {
	 
	 for(int j=1;j<=20;j++)
	 {
		 int sum = 0;
	 
	 for(int y=2; y< j; y++)
	 {
		 if (j % y ==0) 
		{
		sum =sum+1;
		}
	 }
	 if (sum == 0) 
	 {
		 System.out.println(j);
	 }
	 
	 }
 }
}
