package binarySearchTree;

public class Tree {
	Node root = new Node(0);

	public void add(int input) {
		Node temp = root;
		while (temp.hasNext() == true) {
			temp = temp.getLeftNode();
		}
		if (temp.getLeftNode() != null) {
			if (temp.getStorage() < input) {
				temp.setRightNode(new Node(input));
			} else {
				Node temp2 = temp.getLeftNode();
				temp.setLeftNode(new Node(input));
				temp.setRightNode(temp2);
			}
		} else {
			temp.setLeftNode(new Node(input));
		}

	}

	public void get(int input) {
		Node temp = root;
		while (temp.getStorage() != input) {
			if (input <= temp.getStorage()) {
				if (temp.hasNext()) {
					temp = temp.getLeftNode();
				} else {
					break;
				}
			} else {
				if (temp.hasNext()) {
					temp = temp.getRightNode();
				} else {
					break;
				}
			}
				if (temp.getStorage() == input) {
					System.out.println("I found it!" + temp.getStorage());
					break;
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
