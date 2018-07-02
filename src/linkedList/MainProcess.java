package linkedList;

public class MainProcess {

	public static void main(String[] args) {
		MyLinkedList<String> test = new MyLinkedList<String>();
		test.add("Test0");
		test.add("Test1");
		test.add("Test2");
		test.add("Test3");
		
		System.out.println(test.size());
		
		for(int x = 0; x < test.size(); x++) {
			System.out.println(test.get(x));
		}
		
		System.out.println("---------------------------");
		System.out.println("---------------------------");
		
		test.add(2, "I am in the middle!");
		
		for(int x = 0; x < test.size(); x++) {
			System.out.println(test.get(x));
		}
		
		System.out.println("---------------------------");
		System.out.println("---------------------------");
	}

}
