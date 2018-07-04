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
					if (input > temp.getStorage()) {
						temp.setRightNode(new Node(input));
					}else {
						temp.setLeftNode(new Node(input));
					}
				} else {
					temp.setRightNode(new Node(input));
				}
			} else {
				if (temp.hasLeftChild()) {
					while (temp.hasLeftChild()) {
						temp = temp.getLeftNode();
					}
					if (input > temp.getStorage()) {
						temp.setRightNode(new Node(input));
					}else {
						temp.setLeftNode(new Node(input));
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

	public int get(int input) {
		Node temp = root;
		while (true) {
			if (input < temp.getStorage()) {

				if (temp.hasLeftChild()) {
					if (input == temp.getLeftNode().getStorage()) {
						temp = temp.getLeftNode();
						break;
					}else {
						temp = temp.getLeftNode();
					}
				}else {
					System.out.println("Node does not exist");
				}
			} else {
				if (temp.hasRightChild()) {
					if (input == temp.getRightNode().getStorage()) {
						temp = temp.getRightNode();
						break;
					}else {
						temp = temp.getRightNode();
					}
				}else {
					System.out.println("Node does not exist");
				}
			}
		}
		if (input == temp.getStorage()) {
			return temp.getStorage();
		}
		return -1;
	}

	public void size() {

	}

	public void add(int index, int input) {

	}

	public void remove(int index) {

	}
}
