package dataStructureAndAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import dataStructureAndAlgorithm.mathematicalProgram.EvenNumberUptoGivenRange;
import dataStructureAndAlgorithm.mathematicalProgram.Maths;
import dataStructureAndAlgorithm.mathematicalProgram.OddNumberUptoRange;
/**
 * @author akhilesh_sahu
 * MathematicalProgram to operate the mathematical function and operations 
 */
public class MathematicalProgram {

	public static void main(String[] args)throws IOException  {
		OddNumberUptoRange oddNumberUptoRange= new 	OddNumberUptoRange();
		EvenNumberUptoGivenRange  evenNumberUptoGivenRange = new EvenNumberUptoGivenRange();
		Maths maths= new Maths();
		MathematicalProgram mathematicalProgram = new MathematicalProgram();
		int options = 0;
		do {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			mathematicalProgram.printChoiceOptions();
			try {
				options = Integer.parseInt(br.readLine());
			} catch (NumberFormatException nfe) {
				options = 0;
			}
			
			switch (options) {
			
				case 1:
					
					int oddNumberArray[] = oddNumberUptoRange.getOddNumberUptoRange(mathematicalProgram.getNumberInput("Odd"));
					mathematicalProgram.printNumber(oddNumberArray);
					break;
					
				case 2:
					
					int evenNumberArray[] = evenNumberUptoGivenRange.getEvenNumberUptoRange(mathematicalProgram.getNumberInput("Even"));
					mathematicalProgram.printNumber(evenNumberArray);
					break;
					
				case 3:
					int number = mathematicalProgram.getNumberInput("Perfect");
					boolean isPerfect = maths.isNumberPerfect(number);
					if(isPerfect)
						System.out.print("\t"+number+" is a perfect number\n");
					else
						System.out.print("\t"+number+" is a not perfect number\n");
					break;
				
				case 4:
					int prime = mathematicalProgram.getNumberInput("Prime");
					boolean isPrime = maths.isPrimeNumber(prime);
					if(isPrime)
						System.out.print("\t"+prime+" is a Prime number\n");
					else
						System.out.print("\t"+prime+" is a not Prime number\n");
					break;
					
				case 5:
					int amstrong = mathematicalProgram.getNumberInput("Amstrong");
					boolean isAmstrong = maths.isAmstrongNumber(amstrong);
					if(isAmstrong)
						System.out.print("\t"+amstrong+" is a Amstrong number\n");
					else
						System.out.print("\t"+amstrong+" is a not Amstrong number\n");
					break;
					
				case 6:
					int numberToReverse = mathematicalProgram.getNumberInput("Reverse");
					int reverse = maths.reverseANumber(numberToReverse);
					System.out.print("\tReverse of "+numberToReverse+" is "+reverse+"\n");
					break;
					
				case 7:
					int number1 = mathematicalProgram.getNumberInput("Number1");
					int number2 = mathematicalProgram.getNumberInput("Number2");
					maths.swapNumber(number1, number2);
					break;
				
				case 8:
					int primeFactor = mathematicalProgram.getNumberInput("PremeFactors");
					int primeFactors[]= maths.primeFactorsOfNumber(primeFactor);
					mathematicalProgram.printNumber(primeFactors);
					break;
					
				case 9:
					int pelindromNumber = mathematicalProgram.getNumberInput("Pelindrom");
					boolean isPalindrom = maths.isPelindromNumber(pelindromNumber);
					if(isPalindrom)
						System.out.print("\t"+pelindromNumber+" is a Palindrom number\n");
					else
						System.out.print("\t"+pelindromNumber+" is a not Palindrom number\n");
					break;
				
				case 10:
					int range = mathematicalProgram.getNumberInput("Fibonacci");
					int fibonacciSeries[]= maths.fibonacciSeries(range);
					mathematicalProgram.printNumber(fibonacciSeries);
					break;
					
				case 11:
					int floydRange = mathematicalProgram.getNumberInput("floydRange");
					maths.FloydTriangle(floydRange);
					break;
					
				case 12:
					int digitTrangleRange = mathematicalProgram.getNumberInput("DigitRange");
					maths.digitTriangle(digitTrangleRange);
					break;
					
				case 13:
					int starTrangleRange = mathematicalProgram.getNumberInput("Star Triangle Range");
					maths.starPattern(starTrangleRange);
					break;
					
				case 14:
					int digitPyramidTrangleRange = mathematicalProgram.getNumberInput("Digit Triangle Range");
					maths.digitPyramidTriangle(digitPyramidTrangleRange);
					break;
				
				case 15:
					int pascalsTrangleRange = mathematicalProgram.getNumberInput("Pascals Triangle Range");
					maths.paskalTriangle(pascalsTrangleRange);
					break;
				default:
			}
		} while (options!=0);

	}
	
	private int getNumberInput(String type) throws IOException {
		int inputNos=0;
		try {
			System.out.print("\tPlease enter number to get "+type+" number\n");
			BufferedReader brOned = new BufferedReader(new InputStreamReader(System.in));
			inputNos= Integer.parseInt(brOned.readLine());
		} catch (NumberFormatException nfe) {
			System.out.print("\tPlease enter a valid number\n");
		}
		return inputNos;
	}
	
	private void printChoiceOptions() {
		System.out.print("\t============================================================\n");
		System.out.print("\tEnter Your Choice using number\n");
		System.out.print("\t 1. Odd Numeber upto given range\n");
		System.out.print("\t 2. Even Numeber upto given range\n");
		System.out.print("\t 3. Enterd numbers is perfect or not\n");
		System.out.print("\t 4. Enterd numbers is prime or not\n");
		System.out.print("\t 5. Enterd numbers is Amstrong or not\n");
		System.out.print("\t 6. Reverse A number\n");
		System.out.print("\t 7. Swapping of two number without using 3rd vairable\n");
		System.out.print("\t 8. Prime factors of number\n");
		System.out.print("\t 9. Enterd numbers is Palindrom or not\n");
		System.out.print("\t10. Fibonacci series for the given range\n");
		System.out.print("\t11. Floyd Triangle Upto range\n");
		System.out.print("\t12. Digit Triangle Upto range\n");
		System.out.print("\t13. Star Triangle Upto range\n");
		System.out.print("\t14. Digit pyramid Triangle Upto range\n");
		System.out.print("\t15. Pascal's Triangle Upto range\n");
		System.out.print("\t============================================================\n");
	}
	
	private void printNumber(int [] numberArray){
		for (int count =0; count<numberArray.length; count++){
			if(count==numberArray.length-1)
				System.out.print(numberArray[count]+". \n");
			else{
				System.out.print(numberArray[count]+", ");
			}
		}
	}

}
