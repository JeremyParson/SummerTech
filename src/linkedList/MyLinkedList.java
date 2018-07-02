package linkedList;

public class MyLinkedList<E> {
	private Node head;

	public MyLinkedList() {
		head = new Node(null);
	}

	public void add(E input) {

		Node temp = head;
		while(temp.hasNext()) {	
			temp = temp.getNextNode();
		}
		temp.setNextNode(new Node(input));
	}
	
	public E get(int input) {
		Node temp = head;
		for(int x = 0; x <= input; x++) {
			if(temp.hasNext()) {
				temp = temp.getNextNode();
			}
		}
				
		return (E) temp.getStorage();
	}
	
	public int size() {
		Node temp = head;
		int size = 0;
		while(temp.hasNext()) {
			if(temp.hasNext()) {
				temp = temp.getNextNode();
				size++;
			}else {
				break;
			}
		}
		return size;
	}
	
	public void add(int index, E input) {
		Node temp = head;
		for(int x = 0; x != index - 1; x++) {
			if(temp.hasNext()) {
				temp = temp.getNextNode();
			}else {
				break;
			}
		}
		temp.setNextNode(new Node(input));
		Node temp2 = temp.getNextNode();
		temp2.setNextNode(temp2.getNextNode());
	}
}
