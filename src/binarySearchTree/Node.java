package binarySearchTree;

public class Node {
	Node left = null;
	Node right = null;
	int storage;

	public Node(int element) {
		storage = element;
	}
	
	public int getStorage() {
		return storage;
	}
	
	public void setStorage(int element) {
		storage = element;
	}
	
	public Node getLeftNode() {
		return left;
	}
	
	public Node getRightNode(){
		return right;
	}
	
	public void setLeftNode(Node newNode) {
		left = newNode;
	}
	
	public void setRightNode(Node newNode) {
		right = newNode;
	}
	
	public boolean hasNext() {
			return left != null || right != null;
	}
	
	public boolean hasRightChild() {
		return right != null;
	}
	
	public boolean hasLeftChild() {
		return left != null;
	}
	
}
