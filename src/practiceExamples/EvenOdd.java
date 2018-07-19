package practiceExamples;

public class EvenOdd {
	public static void main(String[] args) {
		EvenOdd obj=new EvenOdd();
		obj.evenOrOdd(201);
	}
   public void evenOrOdd(int x) {
	   int value=x % 2;
	  /* boolean result;
	   if (value ==0)
	   {
		result= true;
	}else {
		result = false;
		
	}*/
	   if(value == 0) {
		   System.out.println("EvenNumber");
		
	}else {
		System.out.println("OddNumber");
	}
	   
   }
}
