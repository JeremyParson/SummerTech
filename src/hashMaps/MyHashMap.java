package hashMaps;

import java.util.stream.IntStream;

public class MyHashMap {

	private int[] values;
	private String[] keys;

	public MyHashMap() {
		values = new int[8];
		keys = new String[8];
	}

	public void put(String key, int value) {

	}

	public int hash(String key) {
		int y = 0;
		for (int x = 0; x < key.length() - 1; x++) {
			y = key.charAt(x);
			y = y * key.charAt(x + 1);
		}
		return Math.abs(y % keys.length);
		//return Math.abs(test(key, 0) % keys.length);
	}
	
	private int test(String key, int x) {
		if(x == key.length()) {
			return 1;
		}
		return key.charAt(x) * test(key, x + 1);
	}

}
