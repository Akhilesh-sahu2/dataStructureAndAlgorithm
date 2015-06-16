package dataStructureAndAlgorithm.mathematicalProgram;

public class Maths {

	/**
	 * Method to check the number is perfect or not perfect number is the number
	 * whose some of the perfect divisor are the number itself example 6 = 1,2,3
	 * = 1+2+3 = 6 example 28 = 1,2,7,14 = 1+2+7+14 = 28
	 * 
	 * @param number
	 * @return
	 */
	public boolean isNumberPerfect(int number) {
		int reminder = 0;
		int sumOfPerfectDivisor = 0;
		for (int divisor = 1; divisor < number; divisor++) {
			reminder = number % divisor;
			if (reminder == 0) {
				sumOfPerfectDivisor = sumOfPerfectDivisor + divisor;
			}
		}
		if (sumOfPerfectDivisor == number)
			return true;
		return false;
	}

	/**
	 * If n is a natural number, then 1 and n divide n without remainder.
	 * Therefore, the condition of being a prime can also be restated as: a
	 * number is prime if it is greater than one and if none of 2, 3, …, n-1
	 * divides n (without remainder). The most basic method of checking the
	 * primality of a given integer n is called trial division. This routine
	 * consists of dividing n by each integer m that is greater than 1 and less
	 * than or equal to the square root of n. If the result of any of these
	 * divisions is an integer, then n is not a prime, otherwise it is a prime.
	 * For example, for n = 37, the trial divisions are by m = 2, 3, 4, 5, and
	 * 6. None of these numbers divides 37, so 37 is prime.
	 * 
	 */

	public boolean isPrimeNumber(int number) {
		if (number == 1)
			return false;
		if (number == 2)
			return true;
		for (int i = 2; i <= Math.ceil(Math.sqrt(number)); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * An Armstrong number of three digits is an integer such that the sum of
	 * the cubes of its digits is equal to the number itself. For example, 371
	 * is an Armstrong number since 3**3 + 7**3 + 1**3 = 371.
	 * 
	 */

	public boolean isAmstrongNumber(int number) {
		int nos = number;
		int reminder = 0;
		int num = 0;
		while (nos != 0) {
			reminder = nos % 10;
			num = num + (reminder * reminder * reminder);
			nos = nos / 10;
		}
		if (number == num)
			return true;
		return false;
	}

	/**
	 * Reversing a number example number = 123 to reverse reverse = 0; 1.
	 * reverse = reverse * 10 , reverse=0; reverse = reverse + number mod 10,
	 * reverse = 3; number = number/10, number =12; 2. reverse = reverse * 10 ,
	 * reverse=30; reverse = reverse + number mod 10, reverse = 32; number =
	 * number/10, number =1; 3. reverse = reverse * 10 , reverse=320; reverse =
	 * reverse + number mod 10, reverse = 321; number = number/10, number =0;
	 */

	public int reverseANumber(int number) {
		int reverse = 0;
		while (number != 0) {
			reverse = reverse * 10;
			reverse = reverse + number % 10;
			number = number / 10;
		}
		return reverse;
	}

	/**
	 * Swapping two number without using 3rd variable example a = 123, b=23
	 * a=a+b, a=146 b=a-b, b=123 a=a-b, a=23 or a=a*b a= 2023 b=a/b b=123 a=a/b
	 * a=23
	 */

	public void swapNumber(int number1, int number2) {
		System.out.println("\tNumber to be swap is number1: " + number1
				+ " and number2: " + number2 + "\n");
		number1 = number1 + number2;
		number2 = number1 - number2;
		number1 = number1 - number2;
		System.out.println("\tAfter Swapping number1: " + number1
				+ " and number2: " + number2 + "\n");
	}

	/**
	 * Prime factor of number
	 */

	public int[] primeFactorsOfNumber(int number) {
		int primeFactorsArray[] = new int[(int) Math.sqrt(number / 2)];
		int arraySize = 0;
		// Print the number of 2s that divide n
		while (number % 2 == 0) {
			primeFactorsArray[arraySize] = 2;
			arraySize++;
			number = number / 2;
		}

		// n must be odd at this point. So we can skip one element (Note i = i
		// +2)
		for (int i = 3; i <= Math.sqrt(number); i = i + 2) {
			// While i divides n, print i and divide n
			while (number % i == 0) {
				primeFactorsArray[arraySize] = i;
				arraySize++;
				number = number / i;
			}
		}

		// This condition is to handle the case whien n is a prime number
		// greater than 2
		if (number > 2) {
			primeFactorsArray[arraySize] = number;
			arraySize++;
		}
		return primeFactorsArray;
	}

	/**
	 * A palindrome number is a number such that if we reverse it, it will not
	 * change. For example some palindrome numbers examples are 121, 212, 12321,
	 * -454. To check whether a number is palindrome or not first we reverse it
	 * and then compare the number obtained with the original, if both are same
	 * then number is palindrome otherwise not.
	 * 
	 */

	public boolean isPelindromNumber(int number) {
		int reverse = 0;
		int originalNumber = number;
		while (number != 0) {
			reverse = reverse * 10;
			reverse = reverse + number % 10;
			number = number / 10;
		}
		if (reverse == originalNumber)
			return true;
		else
			return false;
	}

	/**
	 * The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13,
	 * 21, 34, ... The next number is found by adding up the two numbers before
	 * it. Similarly, the 3 is found by adding the two numbers before it (1+2),
	 */

	public int[] fibonacciSeries(int number) {
		int primeFactorsArray[] = new int[number];
		for (int count = 0; count < primeFactorsArray.length; count++) {
			if (count < 2)
				primeFactorsArray[count] = count;
			else
				primeFactorsArray[count] = primeFactorsArray[count - 2]
						+ primeFactorsArray[count - 1];
		}
		return primeFactorsArray;
	}

	/**
	 * The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13,
	 * 21, 34, ... The next number is found by adding up the two numbers before
	 * it. Similarly, the 3 is found by adding the two numbers before it (1+2),
	 */

	public void FloydTriangle(int range) {
		int num = 1, c, d;
		System.out.println("Floyd's triangle :-");
		for (c = 1; c <= range; c++) {
			for (d = 1; d <= c; d++) {
				System.out.print("\t" + num + " ");
				num++;
			}

			System.out.println();
		}
	}
}
