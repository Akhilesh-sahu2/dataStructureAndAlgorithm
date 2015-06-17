package dataStructureAndAlgorithm.arrays;

public class OneDArrays {
		private int top=0;
		private int integerArray[] = new int[10];
//		
//		public static void main(String args[]){
//			OneDArrays a= new OneDArrays();
//			System.out.println("Size "+a.integerArray.length);
//				a.push(200);
//				System.out.println("nos of element in array "+a.top+" and push number is 200");
//				a.push(43);
//				System.out.println("nos of element in array "+a.top+" and push number is 43");
//				a.push(423);
//				System.out.println("nos of element in array "+a.top+" and push number is 423");
//				a.push(342);
//				System.out.println("nos of element in array "+a.top+" and push number is 342");
//				a.push(321);
//				System.out.println("nos of element in array "+a.top+" and push number is 321");
//				System.out.println("nos of element in array "+a.top +" and poped number is "+a.pop());
//				System.out.println("nos of element in array "+a.top +" and poped number is "+a.pop());
//				System.out.println("nos of element in array "+a.top +" and poped number is "+a.pop());
//				System.out.println("nos of element in array "+a.top +" and poped number is "+a.pop());
//				System.out.println("nos of element in array "+a.top +" and poped number is "+a.pop());
//				System.out.println("nos of element in array "+a.top +" and poped number is "+a.pop());
//				System.out.println("nos of element in array "+a.top +" and poped number is "+a.pop());
//				
//		}
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
		
		public void printElement(){
			for(int count=0;count<=top-1;count++){
				System.out.print("\t"+(count+1)+" element for Integer array is "+integerArray[count]+"\n");
			}
		}
	
}
