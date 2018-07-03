package linkedList;

import java.util.LinkedList;

public class MainProcess {

	public static void main(String[] args) {
		MyLinkedList<String> test = new MyLinkedList<String>();
		test.add("Apple");
		test.add("Orange");
		test.add("Tomato");
		test.add("Grapefruit");

		System.out.println(test.size());

		for (int x = 0; x < test.size(); x++) {
			System.out.println(test.get(x) + " " + x);
		}

		System.out.println("---------------------------");
		System.out.println("--------Add Index----------");

		test.add(2, "I am in the middle!");

		for (int x = 0; x < test.size(); x++) {
			System.out.println(test.get(x) + " " + x);
		}

		System.out.println("---------------------------");
		System.out.println("---------Remove------------");

		test.remove(2);

		for (int x = 0; x < test.size(); x++) {
			System.out.println(test.get(x) + " " + x);
		}

		System.out.println("---------------------------");
		System.out.println("-------make an array-------");

		Object[] testArr = test.toArray();

		for (int x = 0; x < testArr.length; x++) {
			System.out.println(testArr[x] + " " + x);
		}

		System.out.println("---------------------------");
		System.out.println("----------sublist----------");

		MyLinkedList<String> test2 = test.sublist(2, 3);

		for (int x = 0; x < test2.size(); x++) {
			System.out.println(test2.get(x) + " " + x);
		}

		System.out.println("---------------------------");
		System.out.println("----------index of---------");

		System.out.println(test.indexOf("Tomato"));

		System.out.println("---------------------------");
		System.out.println("--------last index of------");

		test2.add("Apple");
		test2.add("Apple");
		test2.add("Apple");
		test2.add("Apple");
		test2.add("Apple");
		test2.add("Apple");
		test2.add("Apple");
		test2.add("Grapefruit");

		for (int x = 0; x < test2.size(); x++) {
			System.out.println(test2.get(x) + " " + x);
		}

		System.out.println(test2.lastIndexOf("Apple"));
	}

}
