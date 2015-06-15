package dataStructureAndAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import dataStructureAndAlgorithm.mathematicalProgram.OddNumberUptoRange;
/**
 * @author akhilesh_sahu
 * MathematicalProgram to operate the mathematical function and operations 
 */
public class MathematicalProgram {

	public static void main(String[] args)throws IOException  {
		OddNumberUptoRange oddNumberUptoRange= new 	OddNumberUptoRange();
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
					System.out.print("\tPlease enter range to get odd number\n");
					BufferedReader brOned = new BufferedReader(new InputStreamReader(System.in));
					try {
						int oddNumberArray[] = oddNumberUptoRange.getOddNumberUptoRange(Integer.parseInt(brOned.readLine()));
						mathematicalProgram.printOddNumber(oddNumberArray);
					} catch (NumberFormatException nfe) {
						System.out.print("\tPlease enter a valid number\n");
					}
					break;
					
				case 2:
				//	System.out.print("\tPoped up number is "+oneD.pop()+"\n");
					break;
					
				case 3:
					//oneD.printElement();
					break;
					
				default:
			}
		} while (options!=0);

	}
	
	private void printChoiceOptions() {
		System.out.print("\t============================================================\n");
		System.out.print("\tEnter Your Choice using number\n");
		System.out.print("\t1. Odd Numeber upto given range\n");
		System.out.print("\t2. One Dimension Array pop operation\n");
		System.out.print("\t3. One Dimension Array print operation\n");
		System.out.print("\t============================================================\n");
	}
	
	private void printOddNumber(int [] numberArray){
		for (int count =0; count<numberArray.length; count++){
			if(count==numberArray.length-1)
				System.out.print(numberArray[count]+". \n");
			else{
				System.out.print(numberArray[count]+", ");
			}
		}
	}

}
