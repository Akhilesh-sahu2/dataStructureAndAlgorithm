package dataStructureAndAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import dataStructureAndAlgorithm.arrays.OneDArrays;

public class Arrays {
	public static void main(String[] args) throws IOException {
		Arrays array = new Arrays();
		OneDArrays oneD =  new OneDArrays();
		int options = 0;
		do {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			array.printChoiceOptions();
			try {
				options = Integer.parseInt(br.readLine());
			} catch (NumberFormatException nfe) {
				options = 0;
			}
			switch (options) {
				case 1:
					System.out.print("\tPlease enter number to Push\n");
					BufferedReader brOned = new BufferedReader(new InputStreamReader(System.in));
					try {
						oneD.push(Integer.parseInt(brOned.readLine()));
					} catch (NumberFormatException nfe) {
						System.out.print("\tPlease enter a valid number\n");
					}
					
					break;
					
				case 2:
					System.out.print("\tPoped up number is "+oneD.pop()+"\n");
					break;
					
				case 3:
					oneD.printElement();
					break;
					
				default:
			}

		} while (options!=0);

	}

	private void printChoiceOptions() {
		System.out.print("\t============================================================\n");
		System.out.print("\tEnter Your Choice using number\n");
		System.out.print("\t1. One Dimension Array push operation\n");
		System.out.print("\t2. One Dimension Array pop operation\n");
		System.out.print("\t3. One Dimension Array print operation\n");
		System.out.print("\t============================================================\n");
	}
	
}
