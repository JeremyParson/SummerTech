package binarySearchTree;

import linkedList.Vector2;

public class MainProcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree test = new Tree();
		test.add(1);
		test.add(2);
		test.add(3);
		test.add(14);
		test.add(-1);
		test.add(-1);
		test.add(-2);
		
		int test2 = test.get(14);
		System.out.println(test2);
		
		test2 = test.get(2);
		System.out.println(test2);
		System.out.println("---------------------------");
		System.out.println("---------------------------");
		int index = test.getIndex(4, 5);
		System.out.println(index);
		index = test.getIndex(3, 3);
		System.out.println(index);
		index = test.getIndex(2, 2);
		System.out.println(index);
		System.out.println("---------------------------");
		System.out.println("---------------------------");
		test.set(4, 5, -14);
		index = test.getIndex(4, 5);
		System.out.println(index);
		System.out.println("---------------------------");
		System.out.println("---------------------------");
		test.add(1);
		test.remove(2);
		System.out.println(test.getIndex(2, 2));
	}
}
