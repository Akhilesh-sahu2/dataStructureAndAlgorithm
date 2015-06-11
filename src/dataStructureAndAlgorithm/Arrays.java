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
					System.out.print("\tPlease Enter 10 number to fill the integer array\n");
					for(int i=0;i<10;i++){
						System.out.print("\tPlease Enter "+(i+1)+" number  \n");
						BufferedReader brOned = new BufferedReader(new InputStreamReader(System.in));
						try {
							oneD.push(Integer.parseInt(brOned.readLine()));
							System.out.print("\tDo you want to enter more number Y/N \n");
							BufferedReader yorn = new BufferedReader(new InputStreamReader(System.in));
							if(yorn.readLine().equalsIgnoreCase("Y")){
								continue;
							}else{
								break;
							}
						} catch (NumberFormatException nfe) {
							options = 0;
						}
					}			
					oneD.printElement();
					break;
				case 2:
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
