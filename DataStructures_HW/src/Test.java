
public class Test {

	public static void main(String[] args) {
		MyDoublyLinkedList list = new MyDoublyLinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
		}
		System.out.println();
		
		list.remove(3);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
		}
		System.out.println();
		System.out.println("Is list empty? " + list.isEmpty());
		
		System.out.println("Is it contains? " + list.contains(4));
	}

}
