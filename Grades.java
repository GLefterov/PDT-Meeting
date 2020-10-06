
//imports appear here before the class definition but after the package definition
import java.util.Scanner;
public class Grades {

	public static void main(String[] args) {
		int value;
		Scanner scanner = new Scanner(System.in);
		value = scanner.nextInt();
		for(int i=0; i<1000; i++) {
			if(i%value == 0) {
				System.out.println(i);
			}
		}
		
		
		
		
		/**
		int age;
		int annualSalary;
		int amountRequested;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age: ");
		age = scanner.nextInt();
		System.out.println("Enter your annual salary: ");
		annualSalary = scanner.nextInt();
		System.out.println("Enter the amount of money you request: ");
		amountRequested = scanner.nextInt();
		
		double monthlyEarnings = annualSalary/12;
		
		if(age<18) {
			System.out.println("Loan is declined!");
		}
		else if(age>18 && age<25) {
			if(monthlyEarnings<amountRequested) {
				System.out.println("Loan is declined!");
			}else {
				System.out.println("Loan is approved!");
			}
		}else if(age>25) {
			if(monthlyEarnings*2<amountRequested) {
				System.out.println("Loan is declined!");
			}else {
				System.out.println("Loan is approved!");
			}
			
		}
		*/
		
	/**	
		int result; 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input a students result: ");
		result = scanner.nextInt();
		if(result >= 40) {
			System.out.println("Student passed!");
		}
		else {
			System.out.println("Student didn't pass!");
		}
		scanner.close();
		*/
		
		
/**
		int[] studentMarks = { 68, 92, 86, 58, 43, 66, 60, 84, 58, 59, 93, 56, 18, 41, 62, 64, 38, 49, 48, 76, 68, 47,
				70, 41, 51, 54, 58, 64, 57, 37, 51, 69, 42, 47, 96, 43, 32, 60, 58, 73, 83, 70, 55, 27, 32, 31, 72, 59,
				46, 63, 85, 80, 61, 43, 88, 74, 72, 44, 25, 79, 49, 58, 75, 77, 60, 68, 70, 82, 56, 61, 35, 11, 85, 60,
				58, 40, 64, 58, 56, 85, 62, 38, 54, 31, 66, 41, 53, 72, 19, 44, 41, 84, 66, 72, 88, 48, 91, 70, 4, 24 };

		System.out.println(studentMarks.length);
*/
		
		
		/**
		 * Add code to calculate
		 * 
		 * a) the mean (average) grade 
		 * b) the median grade (hint middle value or average of middle 2 values)
		 * c) the number of students that got less than 40% 
		 * d) the number of students that got 70% or more
		 * 
		 */

	}

}