import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList implements List {

	private Object[] storage;

	public MyArrayList() {
		storage = new Object[0];
	}

	@Override
	public boolean add(Object e) {
		Object[] tempStorage = new Object[storage.length + 1];
		for (int x = 0; x < storage.length; x++) {
			tempStorage[x] = storage[x];
		}
		tempStorage[storage.length] = e;
		storage = tempStorage;
		return true;
	}

	@Override
	public void add(int index, Object element) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object get(int index) {
		return storage[index];
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object remove(int index) {
		// TODO Auto-generated method stub
		Object[] tempStorage = new Object[storage.length - 1];
		boolean indexFound = false;
		
		for(int x = 0; x < tempStorage.length; x++) {
			if(x != index && indexFound == false) {
				tempStorage[x] = storage[x];
			}else if(x == index || indexFound == true) {
				indexFound = true;
				tempStorage[x] = storage[x+1];
			}
		}
		
		storage = tempStorage;
		return null;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object set(int index, Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		return storage.length;
	}

	@Override
	public List subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

}
