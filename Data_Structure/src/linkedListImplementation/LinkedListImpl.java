package linkedListImplementation;

public class LinkedListImpl {

	Node head = null;

	public void insert(int data) {

		Node node = new Node();
		node.setData(data);
		node.setNext(null);

		if (head == null) {
			head = node;
		} else {
			Node n = head;

			while (n.getNext() != null) {
				n = n.getNext();
			}
			n.setNext(node);
		}

	}

	public void insertAt(int index, int data) {

		Node node = new Node();
		int counter = 0;
		Node n = head;

		if (index == 0) {
			insertAtStart(data);
		}

		while (n.getNext() != null) {
			if (counter == (index - 1)) {
				node.setData(data);
				node.setNext(n.getNext());
				n.setNext(node);
			}
			n = n.getNext();
			counter++;
		}
	}

	public void insertAtStart(int data) {
		Node node = new Node();
		node.setData(data);
		node.setNext(head);
		head = node;
	}

	public void deleteAtIndex(int index) {
		Node n = head;
		int counter = 0;
		if (index == 0) {
			head = n.getNext();
		} else {
			while (n.getNext() != null) {
				if (counter == index - 1) {
					n.setNext(n.getNext().getNext());
				}

				n = n.getNext();
				counter++;
			}
		}

	}

	public int countData() {
		Node n = head;
		int counter=0;
		while(n.getNext()!=null) {
			counter++;
			n = n.getNext();
		}
		return counter+1;
	}
	
	public void show() {

		int length = countData();
		
		if (head != null) {
			Node n = head;
			while (n.getNext() != null) {
				System.out.print(n.getData()+" ---> ");
				n = n.getNext();
			}
			System.out.print(n.getData());
		} else {
			System.out.println("Empty Linked List");
		}
	}
}
