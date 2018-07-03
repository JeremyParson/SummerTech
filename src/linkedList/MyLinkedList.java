package linkedList;

public class MyLinkedList<E> {
	private Node head;

	public MyLinkedList() {
		head = new Node(null);
	}

	public void add(E input) {

		Node temp = head;
		while (temp.hasNext()) {
			temp = temp.getNextNode();
		}
		temp.setNextNode(new Node(input));
	}

	public E get(int input) {
		Node temp = head;
		for (int x = 0; x <= input; x++) {
			if (temp.hasNext()) {
				temp = temp.getNextNode();
			}
		}

		return (E) temp.getStorage();
	}

	public int size() {
		Node temp = head;
		int size = 0;
		while (temp.hasNext()) {
			if (temp.hasNext()) {
				temp = temp.getNextNode();
				size++;
			} else {
				break;
			}
		}
		return size;
	}

	public void add(int index, E input) {
		Node temp = head;
		for (int x = 0; x <= index - 1; x++) {
			if (temp.hasNext()) {
				temp = temp.getNextNode();
			} else {
				break;
			}
		}
		Node tempNextNode = temp.getNextNode();
		temp.setNextNode(new Node(input));
		Node newNode = temp.getNextNode();
		newNode.setNextNode(tempNextNode);
	}

	public void remove(int index) {
		Node temp = head;
		for (int x = 0; x < index; x++) {
			temp = temp.getNextNode();
		}
		temp.setNextNode(temp.getNextNode().getNextNode());
	}

	public E[] toArray() {
		@SuppressWarnings("unchecked")
		E[] arr = (E[]) new Object[size()];
		Node<E> temp = head;
		for (int x = 0; x < arr.length; x++) {
			temp = temp.getNextNode();
			arr[x] = temp.getStorage();
		}
		return  arr;
	}

	public MyLinkedList sublist(int from, int to) {
		MyLinkedList<E> newList = new MyLinkedList<E>();
		Node<E> temp = head;
		for (int x = 0; x <= from; x++) {
			temp = temp.getNextNode();
		}
		newList.add(temp.getStorage());

		for (int x = from; x <= to; x++) {
			newList.add(temp.getStorage());
		}
			return newList;
		
	}

}
