package linkedList;

public class Vector2<E> {
	E storage1;
	E storage2;
	
	public Vector2(E element1, E element2){
		storage1 = element1;
		storage2 = element2;
	}
	
	public E getStorage1() {
		return storage1;
	}
	
	public E getStorage2() {
		return storage2;
	}
	
	public Vector2<E> returnToVector2() {
		return new Vector2<E>(storage1, storage2);
	}
	
	public void setStorage(E element1, E element2) {
		storage1 = element1;
		storage2 = element2;
	}
}
