
public class test {

	public static void main(String[] args) {
		MyArrayList test = new MyArrayList();
		test.add("Apple");
		test.add("Apple");
		test.add("Bannana");
		test.add("Apple");
		test.add("Apple");

		for (int x = 0; x < test.size(); x++) {
			System.out.println(test.get(x) + ":" + x);
		}

		System.out.println("---------------------------------");
		System.out.println("---------------------------------");

		test.remove(2);

		for (int x = 0; x < test.size(); x++) {
			System.out.println(test.get(x) + ":" + x);
		}

		System.out.println("---------------------------------");
		System.out.println("---------------------------------");

		test.add("Tomato");
		test.add("Tomato");
		test.add("Tomato");
		test.add("Tomato");
		test.add("Apple");
		test.add("Apple");
		test.add("Apple");
		test.add("Apple");
		
		for (int x = 0; x < test.size(); x++) {
			System.out.println(test.get(x) + ":" + x);
		}
		
		System.out.println(test.indexOf("Tomato"));
		
		
		System.out.println("---------------------------------");
		System.out.println("---------------------------------");
		
		test.remove(4);
		test.remove(4);
		test.remove(4);
		test.remove(4);
		
		for (int x = 0; x < test.size(); x++) {
			System.out.println(test.get(x) + ":" + x);
		}
		
		System.out.println("---------------------------------");
		System.out.println("---------------------------------");
		
		test.add("Tomato");
		
		for (int x = 0; x < test.size(); x++) {
			System.out.println(test.get(x) + ":" + x);
		}
		
		System.out.println(test.indexOf("Tomato"));
		
		System.out.println("---------------------------------");
		System.out.println("---------------------------------");
		
		System.out.println(test.contains("Tomato"));
		System.out.println(test.contains("Orange"));
		
		System.out.println("---------------------------------");
		System.out.println("---------------------------------");
		
		test.add("Tomato");
		test.add("Tomato");
		test.add("Tomato");
		test.add("Tomato");
		
		MyArrayList test2 = (MyArrayList) test.subList(8, 10); //fix this
		
		for (int x = 0; x < test2.size(); x++) {
			System.out.println(test2.get(x) + ":" + x);
		}
		
	}

}
