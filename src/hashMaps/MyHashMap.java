package hashMaps;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashMap {
	
	private int counter;//This will be used to count the amount of linked lists in the array in which will depict weather or not to increase the size of the hashmap 
	private LinkedList<Integer>[] values; //This will contain all the linked lists involving the integers values
	private LinkedList<String>[] keys; //This will contain all the linked lists involving the keys that access the values within the values array

	@SuppressWarnings("unchecked")
	public MyHashMap() {
		values = new LinkedList[8]; //This initializes the value array to 8 spaces
		keys = new LinkedList[8]; //This initializes the key array to 8 spaces
		counter = 0; //This initializes the counter to 0;
	}

	public void put(String key, int value) { //This function is responsible for setting values in both the keys and storage arrays;
		int index = hash(key); //this  hashes the input key and will return the index that the value should be stored in the storage array;
		if(keys[index] == null) { //this tests if the space is empty, if it is than it will create a new linked list at that position otherwise, it will just add to the previous linked list;
		values[index] = new LinkedList<Integer>(); //This creates a new LinkedList object in the value array
		keys[index] = new LinkedList<String>(); //this creates a new linked list object in the key array
		}
		values[index].add(value); //this adds the value to the linked list at index's position within the storage array
		keys[index].add(key); //this adds the key to the linked list at index's position within the keyd array
		
		
		counter++; //After an element is added the counter will go up
		if(counter > Math.sqrt(values.length)) { //If the number of elements within the array is greater than the length of the values array thatn it will run the resize function
			resize();
		}
	}
	
	public Integer get(String key) { //This function will get an element from the values array based off of the index that returns from the hash function after inputing a key. 
		int index = hash(key);
		return values[index].get(keys[index].indexOf(key)); //It makes sense once you read over it a couple times
	}

	private int hash(String key) { //This is the hashing function that will take in a key and turn it into an index value to be unsed in an array
		//Implement this hashing function:
		//s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
		int y = 0; //This variable will e used to intake the ASCII values of each character
		for (int x = 0; x < key.length() - 1; x++) {
			y = key.charAt(x); //This sets that y variable to the ASCII number at a particialar position within the array
			y *= key.charAt(x + 1); //This will multiply yhe current character key times the next character key and then store it.
		}
		return Math.abs(y % keys.length); //This will return an index in which is the remainder of the operation. (The absolute value will be used to prevent an overflow error)
		//return Math.abs(test(key, 0) % keys.length); Dont use this
	}
	
	@SuppressWarnings("unchecked")
	private void resize() { //This function will be used to resize the arrays when to many elements are within them
		//Resizing should be the square of the previous array length
		counter = 0;
		LinkedList<Integer>[] tempValues = Arrays.copyOf(values, values.length); //This will copy all the information within values to temp values
		LinkedList<String>[] tempKeys = Arrays.copyOf(keys, keys.length); //This will copy all the information within the keys array
		
		values = new LinkedList[values.length * values.length]; //This part doubles the sizes of the original arrays
		keys = new LinkedList[keys.length * keys.length];

		for(int x = 0; x < tempKeys.length - 1; x++) { //This for loop is used to remap all the values to the new array
			
			if(tempKeys[x] != null) {
				for(int y = 0; y < tempKeys[x].size(); y++) {
				put(tempKeys[x].get(y),tempValues[x].get(y));
				}
			}
		}
	}
	
	public int size() { //This will return the size of the arrays
		return values.length;
	}

	public void remove(int index) { //This willremove a value from a node from a linked list
		Node temp = head;
		for (int x = 0; x < index; x++) {
			temp = temp.getNextNode();
		}
		temp.setNextNode(temp.getNextNode().getNextNode());
	}

	public E[] toArray() { 
		@SuppressWarnings("unchecked")
		E[] arr = (E[]) new Object[size()];
		Node<E> temp = head;
		for (int x = 0; x < arr.length; x++) {
			temp = temp.getNextNode();
			arr[x] = temp.getStorage();
		}
		return arr;
	}

	public MyLinkedList sublist(int from, int to) {
		MyLinkedList<E> newList = new MyLinkedList<E>();
		Node<E> temp = head;
		for (int x = 0; x <= from; x++) {
			temp = temp.getNextNode();
		}
		newList.add(temp.getStorage());

		for (int x = from + 1; x <= to; x++) {
			temp = temp.getNextNode();
			newList.add(temp.getStorage());
		}
		return newList;

	}

	public int indexOf(E element) {
		Node<E> temp = head.getNextNode();
		int index = 0;

		while (!temp.getStorage().equals(element)) {
			temp = temp.getNextNode();
			index++;
		}

		return index;
	}

	public int lastIndexOf(E element) {
		Node<E> temp = head.getNextNode();
		int index = 0;
		for (int x = 0; x < size() - 1; x++) {
			if (temp.getStorage().equals(element)) {
				index = x;
			}
			temp = temp.getNextNode();
		}

		return index;
	}

}
