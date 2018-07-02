package linkedList;

public class Node<E> {
	private Node nextNode;
	private E storage;

	public Node(E input) {
		storage = input;
	}

	public void setNextNode(Node input) {
		nextNode = input;
	}

	public void setStorage(E input) {
		storage = input;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public E getStorage() {
		return storage;
	}

	public boolean hasNext() {
		return nextNode != null;
	}

}
