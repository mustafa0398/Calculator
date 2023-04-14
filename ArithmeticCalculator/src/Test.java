import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean isFlag = false;
		do {
		System.out.println("For addition, enter 1.");
		System.out.println("For subtraction, enter 2.");
		System.out.println("For multiplication, enter 3.");
		System.out.println("For division, enter 4.");
		System.out.println("For exit, enter 0.");
		int selectedNumber = scanner.nextInt();
		
		switch(selectedNumber) {
			case 1:
				isFlag = true;
				System.out.println("Enter the first number!");
				double firstNumber = scanner.nextDouble();
				System.out.println("Enter the second number!");
				double secondNumber = scanner.nextDouble();
				System.out.println("The result of the addition is: " + add(firstNumber, secondNumber));
				System.out.println();
				break;
			case 2:
				isFlag = true;
				System.out.println("Enter the first number!");
				firstNumber = scanner.nextDouble();
				System.out.println("Enter the second number!");
				secondNumber = scanner.nextDouble();
				System.out.println("The result of the subtraction is: " + subtract(firstNumber, secondNumber));
				System.out.println();
				break;
			case 3:
				isFlag = true;
				System.out.println("Enter the first number!");
				firstNumber = scanner.nextDouble();
				System.out.println("Enter the second number!");
				secondNumber = scanner.nextDouble();
				System.out.println("The result of the multiplication is: " + multiply(firstNumber, secondNumber));
				System.out.println();
				break;
			case 4:
				isFlag = true;
				System.out.println("Enter the first number!");
				firstNumber = scanner.nextDouble();
				System.out.println("Enter the second number!");
				secondNumber = scanner.nextDouble();
				System.out.println("The result of the division is: " + divide(firstNumber, secondNumber));
				System.out.println();
				break;
			case 0:
				System.out.println("Bye...");
				isFlag = false;
			}
		} while(isFlag == true);
		
	}
	
	
	public static double add(double firstNumber, double secondNumber) {
		return firstNumber + secondNumber;
	}
	
	public static double subtract(double firstNumber, double secondNumber) {
		return firstNumber - secondNumber;
	}
	
	public static double multiply(double firstNumber, double secondNumber) {
		return firstNumber * secondNumber;
	}
	
	public static double divide(double firstNumber, double secondNumber) {
		return firstNumber / secondNumber;
	}
}
