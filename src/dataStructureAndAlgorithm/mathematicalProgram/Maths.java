package dataStructureAndAlgorithm.mathematicalProgram;

public class Maths {
	
	
	
/**
 * Method to check the number is perfect or not
 * perfect number is the number whose some of the perfect divisor are the number itself
 * example 6 = 1,2,3 = 1+2+3 = 6
 * example 28 = 1,2,7,14 = 1+2+7+14 = 28
 * @param number
 * @return
 */
	public boolean isNumberPerfect(int number){
		int reminder=0;
		int sumOfPerfectDivisor=0;
		for(int divisor=1;divisor<number;divisor++ ){
			reminder = number%divisor;
			if(reminder==0){
				sumOfPerfectDivisor = sumOfPerfectDivisor+divisor;
			}
		}
		if(sumOfPerfectDivisor==number)
			return true;
		return false;
	}
	
	/**
	 * method to check the number is prime or not
	 * prime number is the number who has only two divisor 1 and the number itself
	 * 
	 */
	
	
}
