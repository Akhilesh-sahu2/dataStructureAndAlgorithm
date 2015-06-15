package dataStructureAndAlgorithm.mathematicalProgram;

public class EvenNumberUptoGivenRange {
	
	/**
	 * method to get the even number till the given range
	 * odd number is equal to  n = 2k
	 * @param range
	 */
	public int[] getEvenNumberUptoRange(int range){
		int evenNumberArray[] = new int[range%2==0 ? range/2:(range/2)+1];//turtiory operator to check the size of even number array 	
		int oddArrayCount=0;
		System.out.print("\tEven number for the given range is\n\t");
		for (int count =1; count<=range; count++){
			int mod=(count)%2;
			if(mod==0){
				evenNumberArray[oddArrayCount++]=count;				
			}
		}
		return evenNumberArray;
	}

}
