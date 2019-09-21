package linkedListImplementation;

public class LinkedListRunner {

	public static void main(String[] args) {
		
		LinkedListImpl lli = new LinkedListImpl();
		lli.insert(54);
		lli.insert(43);
		lli.insert(87);
		lli.insert(65);
		
		lli.insertAt(1,78);
		lli.insertAtStart(98);
		lli.deleteAtIndex(9);
		lli.show();
		System.out.println();
		System.out.println("Length of Linked List is "+lli.countData());
	}

}
