package hashMaps;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashMap {
	
	private int counter;//This will be used to count the amount of linked lists in the array in which will depict weather or not to increase the size of the hashmap 
	private LinkedList<Integer>[] values;//This will contain all the linked lists involving the integers values
	private LinkedList<String>[] keys;//This will contain all the linked lists involving the keys that access the values within the values array

	@SuppressWarnings("unchecked")
	public MyHashMap() {
		values = new LinkedList[8];//This initializes the value array to 8 spaces
		keys = new LinkedList[8];//This initializes the key array to 8 spaces
		counter = 0;//This initializes the counter to 0;
	}

	public void put(String key, int value) {
		int index = hash(key);
		if(keys[index] == null) {
		values[index] = new LinkedList<Integer>();
		keys[index] = new LinkedList<String>();
		}
		values[index].add(value);
		keys[index].add(key);
		
		
		counter++;
		if(counter > Math.sqrt(values.length)) {
			resize();
		}
	}
	
	public Integer get(String key) {
		int index = hash(key);
		return values[index].get(keys[index].indexOf(key));
	}

	private int hash(String key) {
		//Implement this hashing function:
		//s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
		int y = 0;
		for (int x = 0; x < key.length() - 1; x++) {
			y = key.charAt(x);
			y = y * key.charAt(x + 1);
		}
		return Math.abs(y % keys.length);
		//return Math.abs(test(key, 0) % keys.length);
	}
	
	@SuppressWarnings("unchecked")
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
