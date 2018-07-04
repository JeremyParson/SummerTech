
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(5));
		System.out.println(fibonacci(0,1,6));
		System.out.println(factorial(fibonacci(0,1,6)));
		System.out.println(factorial(21));
	}

	public static int factorial(int number) {
		if (number == 1) {
			return 1;
		}
		return number * factorial(number - 1);
	}

	public static int fibonacci(int firstNumber, int secondNumber, int depth) {
		if(depth == 0) {
			return firstNumber + secondNumber;
		}

		return fibonacci(secondNumber, firstNumber + secondNumber, depth - 1);
	}

}
