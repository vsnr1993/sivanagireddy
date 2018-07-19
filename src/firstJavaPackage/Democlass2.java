package firstJavaPackage;

public class Democlass2 {
	int exp = 50;
	public static void main(String[] args) {
		Democlass2 d=new Democlass2();
		d.mul();
		
		int result1=d.mulTwoValues(30, 40);
		int result2=d.mulThreeValues(50, 60, 70);
		System.out.println(result1);
		System.out.println(result2);
		Democlass2 d2=new Democlass2();
		d2.mul();
		int secobjresult1=d2.mulTwoValues(80, 90);
		int secobjresult2=d2.mulThreeValues(100, 110, 120);
		System.out.println(secobjresult1);
		System.out.println(secobjresult2);
		Democlass2 d3=new Democlass2();
		d3.mul();
		int thiobjresult1=d.mulTwoValues(130, 140);
		int thiobjresult2=d.mulThreeValues(150, 160, 170);
		System.out.println(thiobjresult1);
		System.out.println(thiobjresult2);
			}
public void mul()
{
int a=10;
int b=20;
int c=a*b;
System.out.println(exp);
System.out.println(c);
}
public int mulTwoValues(int a,int b)
{
	int x=a*b;
	return x;
			
	}
public int mulThreeValues(int a,int b,int c)
{
int x=a*b*c;
return x;
}
}
