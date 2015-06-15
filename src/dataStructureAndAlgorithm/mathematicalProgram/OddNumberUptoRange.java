package dataStructureAndAlgorithm.mathematicalProgram;

public class OddNumberUptoRange {
	
	/**
	 * method to get the odd number till the given range
	 * odd number is equal to  n = 2k+1
	 * @param range
	 */
	public int[] getOddNumberUptoRange(int range){
		int oddNumberArray[] = new int[range%2==0 ? range/2:(range/2)+1];//turtiory operator to check the size of odd number array 	
		int oddArrayCount=0;
		System.out.print("\tOdd number for the given range is\n\t");
		for (int count =0; count<=range; count++){
			int mod=(count-1)%2;
			if(mod==0){
				oddNumberArray[oddArrayCount++]=count;				
			}
		}
		return oddNumberArray;
	}
}
