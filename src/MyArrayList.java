import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

public class MyArrayList<E> {

	private E[] storage;

	public MyArrayList() {
		storage = (E[]) new Object[0];
	}


	public boolean add(E e) {
		E[] tempStorage = (E[]) new Object[storage.length + 1];
		for (int x = 0; x < storage.length; x++) {
			tempStorage[x] = storage[x];
		}
		tempStorage[storage.length] = e;
		storage = tempStorage;
		return true;
	}


	public void add(int index, E element) {
		E[] tempStorage = (E[]) new Object[storage.length + 1];
		
		for(int x = 0; x < index; x++) {
			tempStorage[x] = storage[x];
		}
		
		for(int x = index; x < storage.length; x++) {
			tempStorage[x+1] = storage[x];
		}
		tempStorage[index] = element;
		
		storage = tempStorage;

	}


	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}


	public boolean addAll(int index, Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	public void clear() {
		// TODO Auto-generated method stub
		storage = (E[]) new Object[0];

	}


	public boolean contains(E o) {

		for(int x = 0; x < storage.length; x++) {
			if(storage[x].equals(o)) {
				return true;
			}
		}
		return false;
	}


	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	public Object get(int index) {
		return storage[index];
	}


	public int indexOf(E o) {
		// TODO Auto-generated method stub
		int indexOfObj = -1;
		for(int x = 0; x < storage.length; x++) {
			if(storage[x].equals(o)) {
				indexOfObj = x;
				break;
			}
		}
		return indexOfObj;
	}


	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return storage.length == 0;
	}


	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}


	public int lastIndexOf(E o) {
		// TODO Auto-generated method stub
		return 0;
	}


	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}


	public ListIterator listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}


	public boolean remove(E o) {
		// TODO Auto-generated method stub
		return false;
	}


	public Object remove(int index) {
		Object[] tempStorage = (E[]) new Object[storage.length - 1];
		boolean indexFound = false;
		
		for(int x = 0; x < tempStorage.length; x++) {
			if(x != index && indexFound == false) {
				tempStorage[x] = storage[x];
			}else if(x == index || indexFound == true) {
				indexFound = true;
				tempStorage[x] = storage[x+1];
			}
		}
		
		storage = (E[]) tempStorage;
		return null;
	}


	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}


	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}


	public Object set(int index, E element) {
		storage[index] = element;
		return null;
	}


	public int size() {
		return storage.length;
	}


	public MyArrayList subList(int fromIndex, int toIndex) {
		MyArrayList newSubList = new MyArrayList();
		for(int x = fromIndex; x >= fromIndex && x <= toIndex; x++) {
			newSubList.add(storage[x]);
		}
		return newSubList;
	}


	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}


	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

}
