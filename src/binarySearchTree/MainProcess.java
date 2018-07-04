package binarySearchTree;

public class MainProcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree test = new Tree();
		test.add(1);
		test.add(2);
		test.add(3);
		test.add(14);
		
		int test2 = test.get(14);
		System.out.println(test2);
		
		test2 = test.get(2);
		System.out.println(test2);
	}

}
