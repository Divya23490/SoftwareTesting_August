package basics;

public class ConditionalStatements {

	public static void main(String[] args) {
		int age=18;
		
		if(age>18) {
			System.out.println("Age is greater than 18");
		}
		else if(age >18 || age<19) {
			System.out.println("Age is between 18 or 19");
		}
		else {
			System.out.println("Age is not greater than 18");
		}

	}
	

}
