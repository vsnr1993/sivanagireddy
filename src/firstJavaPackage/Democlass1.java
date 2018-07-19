package firstJavaPackage;

public class Democlass1 {
	public static void main(String[] args) {
		Democlass1 d=new Democlass1();
		d.addingDoubleValue();
		double result1= d.addTwoDoubleValues(23.98, 98.97);
		double result2 = d.addThreeDoubleValues(33.33, 44.44, 55.55);
		System.out.println(result1);
		System.out.println(result2);
		Democlass1 d1= new Democlass1();
		d1.addingDoubleValue();
		double secondobjres1=d1.addTwoDoubleValues(45.32, 55.66);
		double secondobjres2=d1.addThreeDoubleValues(2345.456, 24353.56456, 9876.2346);
		System.out.println(secondobjres1);
		System.out.println(secondobjres2);
		
		
	}
	public void addingDoubleValue()
	{
		double a=11.11;
		double b=22.22;
		double c=a+b;
		System.out.println(c);
	}
public double addTwoDoubleValues(double a,double b)
{
	double x=a+b;
	return x;
	}
public double addThreeDoubleValues(double a,double b,double c)
{
	double x=a+b+c;
	return x;
	}

}
