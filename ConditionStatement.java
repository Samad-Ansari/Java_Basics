public class ConditionStatement {
	public static void main(String[] args){
		// if statement
		int age = 19;
		if(age > 18){
			System.out.println("you are eligible for ride");
		}

		// if-else 
		int number = 43;
		if(number%2 == 0){
			System.out.println("It is an Even Number");
		} else {
			System.out.println("It is an Odd Number");
		}

		int year = 2300;
		if(((year%4 == 0 && year%100 != 0) || (year%400 == 0))){
			System.out.println("Its a Leap Year");
		} else {
			System.out.println("It is not a Leap Year ");
		}

		// Ternary Operator
		String result = (number%2 == 0)? "Even Number": "Odd Number";
		System.out.println(result);

		// if-else Ladder
		int marks = 74;

		if(marks >= 90){
			System.out.println("A Grade");
		}
		else if(marks > 80 && marks < 90){
			System.out.println("B Grade");
		}
		else if(marks > 70 && marks < 80){
			System.out.println("C Grade");	
		}
		else {
			System.out.println("Fail");
		}

		// if-else nested

		int weight = 83;
		if(age >= 18){
			if(weight < 80){
				System.out.println("You are eligible for boating");
			}
			else {
				System.out.println("Sorry You're not eligible");
			}
		}

	}
}









