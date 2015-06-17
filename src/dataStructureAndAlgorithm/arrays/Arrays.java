package dataStructureAndAlgorithm.arrays;

import java.util.Random;

public class Arrays {
		private int top=0;
		private int integerArray[] = new int[20];
		
		public boolean isFull(){
			if(top==(integerArray.length)){
				return true;
			}else{
				return false;
			}
		}
		public void push(int value){
			if(!isFull()){// if array is not full
				integerArray[top]=value;
				top++;
			}else{
				System.out.print("\tInteger array is completely full\n");
			}
		}
		
		public boolean isEmpty(){
			if(top==0){
				return true;
			}else{
				return false;
			}
		}
		
		public int pop(){
			int popValue=0;
			if(!isEmpty()){
				--top;
				popValue=integerArray[top];
			}else{
				System.out.print("\tInteger array is empty\n");
			}
			return popValue;
		}
		
		/**
		 * method to find the smallest element without sorting the array 
		 * @return
		 */
		public int smallestElement(){
			int min =0;
			min=integerArray[0];
			for(int i=1;i<integerArray.length;i++){
				if(min >= integerArray[i]){
				   min = integerArray[i];
				}
			}
			return min;
		}
		
		/**
		 * Linear search or sequential search 
		 * linear search or sequential search is a method for finding a particular value in a list 
		 * that checks each element in sequence until the desired element is found or the list is exhausted. 
		 * The list need not be ordered.A linear search is the most basic of search algorithm you can have. 
		 * A linear search sequentially moves through your collection (or data structure) 
		 * looking for a matching value
		 * 
		 * Characteristics
		 *  The worst case performance scenario for a linear search is that it needs to loop through 
		 *  the entire collection; either because the item is the last one, or because the item isn't found.
		 *  In other words, if you have N items in your collection, the worst case scenario to find an item is N iterations. 
		 *  This is known as O(N) using the Big O Notation. The speed of search grows 
		 *  linearly with the number of items within your collection.
		 *  Linear searches don't require the collection to be sorted.
		 *  In some cases, you'll know ahead of time that some items will be disproportionally searched for.
		 *  In such situations, frequently requested items can be kept at the start of the collection.
		 *  This can result in exceptional performance, regardless of size, for these frequently requested items.
		 */
		public int[] linearSearch(int itemToSearch){
			int searchResult[] = new int[2];
			int searchResultCount=0;
			for(int i=0;i<integerArray.length;i++){
				if(itemToSearch==integerArray[i]){
					searchResult[searchResultCount]=i+1;
					searchResultCount++;
				}
			}
			return searchResult;
		}
		
		/**
		 * Automatically populate array with picking some random number
		 */
		public void populateAutoArray(){
			Random random = new Random();
			for(int i=0;i<20;i++){
				integerArray[i] = random.nextInt(100);
			}
		}
		
		/**
		 * Print the element of array 
		 */
		
		public void printElement(){
			System.out.print("[ ");
			int length=(top!=0)?top-1:integerArray.length;			
			for(int count=0;count<length;count++){
				if(count==0){
					System.out.print(+integerArray[count]);
				}else{
					System.out.print(" ,"+integerArray[count]);
				}
			}
			System.out.print(" ]\n");
		}
		
				
		public static void main(String args[]){
			Arrays arr= new Arrays();
			arr.populateAutoArray();
			arr.printElement();
		}
		
}
