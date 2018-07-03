package linkedList;

import java.util.LinkedList;

public class MainProcess {

	public static void main(String[] args) {
		MyLinkedList<String> test = new MyLinkedList<String>();
		test.add("Test");
		test.add("Test");
		test.add("Test");
		test.add("Test");

		System.out.println(test.size());

		for (int x = 0; x < test.size(); x++) {
			System.out.println(test.get(x) + x);
		}

		System.out.println("---------------------------");
		System.out.println("--------Add Index----------");

		test.add(2, "I am in the middle!");

		for (int x = 0; x < test.size(); x++) {
			System.out.println(test.get(x) + x);
		}

		System.out.println("---------------------------");
		System.out.println("---------Remove------------");

		test.remove(2);

		for (int x = 0; x < test.size(); x++) {
			System.out.println(test.get(x) + x);
		}
		
		System.out.println("---------------------------");
		System.out.println("-------make an array-------");
		
		Object[] testArr = test.toArray();
		
		for (int x = 0; x < testArr.length; x++) {
			System.out.println(testArr[x]);
		}

		LinkedList<String> realLL = new LinkedList<String>();
		realLL.add("test");
		String[] realArr = realLL.toArray(new String[] {});
	}

}
