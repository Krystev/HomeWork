public class MyDoublyLinkedList {
	private Node head;
	private Node tail;
	private int count = 0;

	public boolean add(Object element) {

		Node newNode = new Node(element, null);

		if (head != null) {
			Node temp = head;

			while (temp.getNext() != null) {
				temp = temp.getNext();
			}

			temp.setNext(newNode);
			tail = newNode;
			newNode.setPrev(temp); // doubly linked method here

		} else {
			this.head = newNode;
			tail = head;
			head.setPrev(null); // and here
		}
		this.count++;
		return true;
	}

	public boolean remove(Object item) {

		if (this.size() == 1 && this.head.getData().equals(item)) {
			this.head = null;
			this.count--;
			return true;
		}

		if (this.head.getData().equals(item)) {
			this.head = this.head.getNext();
			this.head.setPrev(null);
			this.count--;
			return true;
		}

		if (this.tail.getData().equals(item)) {
			this.tail = this.tail.getPrev();
			this.tail.setNext(null);
			this.count--;
			return true;
		}
		for (Node current = this.head; current != null; current = current
				.getNext()) {
			if (current.getData().equals(item)) {
				Node previous = current.getPrev();
				Node next = current.getNext();
				previous.setNext(next);
				next.setPrev(previous);
				this.count--;
				return true;

			}
		}
		return false;

	}

	public int size() {
		return this.count;
	}

	public boolean isEmpty() {
		if (count == 0) {
			return true;
		}
		return false;
	}

	public boolean contains(Object item) {
		Node current = head;
		while (current != null) {
			if ((current.getData() != null && current.getData().equals(item))
					|| ((current.getData() == null) && (item == null))) {
				return true;
			}
			current = current.getNext();

		}
		return false;
	}

	public Object get(int pos) {

		if (head != null) {
			Node temp = head;
			int tempCount = 0;
			while (temp.getNext() != null && tempCount < pos) {
				temp = temp.getNext();
				tempCount++;
			}
			if (tempCount == pos) {
				return temp.getData();
			}

		}
		return null;
	}
}
