package binarySearchTree;

public class Tree {
	Node root = new Node(0);

	public void add(int input) {
		Node temp = root;
		if (temp.hasNext()) {
			if (input > temp.getStorage()) {
				if (temp.hasRightChild()) {
					while (temp.hasRightChild()) {
						temp = temp.getRightNode();
					}
				} else {
					temp.setRightNode(new Node(input));
				}
			} else {
				if (temp.hasLeftChild()) {
					while (temp.hasLeftChild()) {
						temp = temp.getLeftNode();
					}
				} else {
					temp.setLeftNode(new Node(input));
				}
			}
		} else {
			if (input > temp.getStorage()) {
				root.setRightNode(new Node(input));
			} else {
				root.setLeftNode(new Node(input));
			}
		}

	}

	public void get(int input) {
		Node temp = root;
		while (input != temp.getLeftNode().getStorage() && input != temp.getLeftNode().getStorage()) {
			if (input < temp.getStorage()) {
				temp = temp.getLeftNode();
			} else {
				temp = temp.getRightNode();
			}
		}

	}

	public void size() {

	}

	public void add(int index, int input) {

	}

	public void remove(int index) {

	}
}
