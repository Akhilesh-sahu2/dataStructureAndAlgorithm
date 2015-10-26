package dataStructureAndAlgorithm.datastructure.list;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList linkList = new LinkedList();

		// add elements to LinkedList
		linkList.add("15");
		linkList.add("32");
		linkList.add("43");
		linkList.add("64");
		linkList.add("95");

		/*
		 * Please note that primitive values can not be added into LinkedList
		 * directly. They must be converted to their corresponding wrapper
		 * class.
		 */

		System.out.println("lList - print linkedlist: " + linkList);
		System.out.println("lList.size() - print linkedlist size: "
				+ linkList.size());
		System.out
				.println("lList.get(3) - get 3rd element: " + linkList.get(3));
		System.out.println("lList.remove(2) - remove 2nd element: "
				+ linkList.remove(2));
		System.out
				.println("lList.get(3) - get 3rd element: " + linkList.get(3));
		System.out.println("lList.size() - print linkedlist size: "
				+ linkList.size());
		System.out.println("lList - print linkedlist: " + linkList);
	}
}
