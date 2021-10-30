package basics;

import java.util.Scanner;

public class SwappingNumbers {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);//new object
		int a= sc.nextInt();
		int b= sc.nextInt();
		
		int temp;//default=0
		
		temp=a; //10
		a=b; //a=5;
		b=temp; //b=10;
		
		System.out.println(a + " "+ b);

	}
}
