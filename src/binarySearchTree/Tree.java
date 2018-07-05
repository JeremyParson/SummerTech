package binarySearchTree;

import linkedList.Vector2;

public class Tree {
	Node root = new Node(0);

	public void add(int input) {
		Node temp = root;
		if (temp.hasNext()) {
			if (input > temp.getStorage() || input == temp.getStorage()) {
				if (temp.hasRightChild()) {
					while (temp.hasRightChild()) {
						temp = temp.getRightNode();
					}
					if (input > temp.getStorage()) {
						temp.setRightNode(new Node(input));
					} else {
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
					} else {
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
					} else {
						temp = temp.getLeftNode();
					}
				} else {
					System.out.println("Node does not exist");
					break;
				}
			} else {
				if (temp.hasRightChild()) {
					if (input == temp.getRightNode().getStorage()) {
						temp = temp.getRightNode();
						break;
					} else {
						temp = temp.getRightNode();
					}
				} else {
					System.out.println("Node does not exist");
					break;
				}
			}
		}
		if (input == temp.getStorage()) {
			return temp.getStorage();
		}
		return -1;
	}

	public int getIndex(int x, int y) {
		Node temp = root;
		int xPosition = 0;
		int depth = 0;

		while (x != xPosition && y != depth) {
			if (x > xPosition) {
				temp = temp.getRightNode();
				xPosition++;
				depth++;
			}
			if (x < xPosition) {
				temp = temp.getLeftNode();
				xPosition--;
				depth++;
			}
		}
		return temp.getStorage();
	}

	public Vector2<Integer> indexOf() {
		return new Vector2<Integer>(-1, -1);
	}

	public void set(int x, int y, int input) {
		Node temp = root;
		int xPosition = 0;
		int depth = 0;

		while (x != xPosition && y != depth) {
			if (x > xPosition) {
				temp = temp.getRightNode();
				xPosition++;
				depth++;
			}
			if (x < xPosition) {
				temp = temp.getLeftNode();
				xPosition--;
				depth++;
			}
		}
		temp.setStorage(input);
	}

	public void remove(int input) {
		Node temp = root;
		while (true) {
			if (input < temp.getStorage()) {

				if (temp.hasLeftChild()) {
					if (input == temp.getLeftNode().getStorage()) {
						if(temp.getRightNode().hasRightChild()) {
							temp.setLeftNode(temp.getLeftNode().getRightNode());
						}else {
							temp.setRightNode(null);
						}
						
						if(temp.getLeftNode().hasLeftChild()) {
							temp.setLeftNode(temp.getLeftNode().getLeftNode());
							}else {
								temp.setLeftNode(null);
							}
						break;
					} else {
						temp = temp.getLeftNode();
					}
				} else {
					System.out.println("Node does not exist");
					break;
				}
			} else {
				if (temp.hasRightChild()) {
					if (input == temp.getRightNode().getStorage()) {
						if(temp.getLeftNode().hasRightChild()) {
							temp.setLeftNode(temp.getLeftNode().getRightNode());
						}else {
							temp.setRightNode(null);
						}
						
						if(temp.getLeftNode().hasLeftChild()) {
							temp.setLeftNode(temp.getLeftNode().getLeftNode());
							}else {
								temp.setLeftNode(null);
							}
						break;
					} else {
						temp = temp.getRightNode();
					}
				} else {
					System.out.println("Node does not exist");
					break;
				}
			}
		}
		

	}
}
