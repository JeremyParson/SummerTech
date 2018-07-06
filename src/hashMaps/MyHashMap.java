package hashMaps;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashMap {
	
	private int counter;
	private LinkedList<Integer>[] values;
	private LinkedList<String>[] keys;

	public MyHashMap() {
		values = new LinkedList[8];
		keys = new LinkedList[8];
		counter = 0;
	}

	public void put(String key, int value) {
		int index = hash(key);
		values[index] = new LinkedList<Integer>();
		keys[index] = new LinkedList<String>();
		values[index].add(value);
		keys[index].add(key);
		
		
		counter++;
		if(counter > Math.sqrt(values.length)) {
			resize();
		}
	}
	
	public int get(String key) {
		int index = hash(key);
		return keys[index].indexOf(key);
	}

	private int hash(String key) {
		int y = 0;
		for (int x = 0; x < key.length() - 1; x++) {
			y = key.charAt(x);
			y = y * key.charAt(x + 1);
		}
		return Math.abs(y % keys.length);
		//return Math.abs(test(key, 0) % keys.length);
	}
	
	private void resize() {
		//Resizing should be the square of the previous array length
		counter = 0;
		LinkedList<Integer>[] tempValues = Arrays.copyOf(values, values.length);
		LinkedList<String>[] tempKeys = Arrays.copyOf(keys, keys.length);
		
		values = new LinkedList[values.length * values.length];
		keys = new LinkedList[keys.length * keys.length];

		for(int x = 0; x < tempKeys.length - 1; x++) {
			
			if(tempKeys[x] != null) {
				for(int y = 0; y < tempKeys[x].size(); y++) {
				put(tempKeys[x].get(y),tempValues[x].get(y));
				}
			}
		}
	}
	
	public int size() {
		return values.length;
	}

}
