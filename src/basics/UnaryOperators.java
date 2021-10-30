package basics;

public class UnaryOperators {

	public static void main(String[] args) {
		int num=5;
		//1+5=6
		System.out.println(++num);
		//5+1=6
		System.out.println(num++);
		
		int a=12, b=12;
		int result1, result2;
		
		System.out.println("Original value of a "+ a);//(concatenate)
		
		//increment operator
		result1=++a;
		System.out.println("After increment " +result1);
		
		//decrement operator
		result2=--b;
		System.out.println("After decrement "+result2);
		
		
	}

}
