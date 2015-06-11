package dataStructureAndAlgorithm.arrays;

public class OneDArrays {
		private int min=0;
		private int max=0;
		private int integerArray[] = new int[10];
		
		public static void main(String args[]){
			OneDArrays a= new OneDArrays();
			System.out.println("Size "+a.integerArray.length);
				a.push(200);
				System.out.println("nos of element in array "+a.max+" and push number is 200");
				a.push(43);
				System.out.println("nos of element in array "+a.max+" and push number is 43");
				a.push(423);
				System.out.println("nos of element in array "+a.max+" and push number is 423");
				a.push(342);
				System.out.println("nos of element in array "+a.max+" and push number is 342");
				a.push(321);
				System.out.println("nos of element in array "+a.max+" and push number is 321");
				System.out.println("nos of element in array "+a.max +" and poped number is "+a.pop());
				System.out.println("nos of element in array "+a.max +" and poped number is "+a.pop());
				System.out.println("nos of element in array "+a.max +" and poped number is "+a.pop());
				System.out.println("nos of element in array "+a.max +" and poped number is "+a.pop());
				System.out.println("nos of element in array "+a.max +" and poped number is "+a.pop());
				System.out.println("nos of element in array "+a.max +" and poped number is "+a.pop());
				System.out.println("nos of element in array "+a.max +" and poped number is "+a.pop());
				
		}
		
		public void push(int value){
			if(max==(integerArray.length)){
				System.out.print("\tInteger array is complete full\n");
			}else{
				integerArray[max]=value;
				max++;
			}
		}
		
		public int pop(){
			int popValue=0;
			if(max==0){
				System.out.print("\tInteger array is empty\n");
			}else{
				--max;
				popValue=integerArray[max];
			}
			return popValue;
		}
		
		public void printElement(){
			for(int count=0;count<=max-1;count++){
				System.out.print("\t"+(count+1)+" element for Integer array is "+integerArray[count]+"\n");
			}
			
		}
	
}
