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
		values[hash(key)] = value;
		keys[hash(key)] = key;
	}
	
	public int get(String key) {
		return values[hash(key)];
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

}
