package firstJavaPackage;

public class Democlass3 {
	public static void main(String[] args) {
		Democlass3 d=new Democlass3();
		d.mul();
		double result1=d.mulTwoValues(2, 3.1);
		double result2=d.mulThreeValues(4, 5.1, 6);
		System.out.println(result1);
		System.out.println(result2);
		Democlass3 d2=new Democlass3();
		d2.mul();
		double secobjresult1=d2.mulTwoValues(7, 8.1);
		double secobjresult2=d2.mulThreeValues(9, 10.1, 11);
		System.out.println(secobjresult1);
		System.out.println(secobjresult2);
	}
public void mul()
{
	int a=1;
	double b=1.1;
	double c=a*b;
	System.out.println(c);
	
}
public double mulTwoValues(int a,double b)
{
	double x=a*b;
	return x;
	
}
public double mulThreeValues(int a,double b,int c)
{
	double x=a*b*c;
	return x;
}
}


