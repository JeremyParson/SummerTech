
public class test {

	public static void main(String[] args) {
		MyArrayList test = new MyArrayList();
		test.add("I will not be removed! 0");
		test.add("I will not be removed! 1");
		test.add("I will be removed! 2");
		test.add("I will not be removed! 3");
		test.add("I will not be removed! 4");
	
		for(int x = 0; x < test.size(); x++) {
			System.out.println(test.get(x));
		}
		System.out.println("---------------------------------");
		System.out.println("---------------------------------");
		test.remove(2);
		for(int x = 0; x < test.size(); x++) {
			System.out.println(test.get(x));
		}
	}

}
