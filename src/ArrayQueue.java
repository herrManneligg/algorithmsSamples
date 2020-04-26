import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

public class ArrayQueue implements Queue {
	
	private Object[] elems;
	private int length, front, rear;
	
	public ArrayQueue (int maxlength) {
		elems = new Object[maxlength];
		length = front = rear = 0;
	}
	
//	Accessors
	@Override
	public int size() {
		return length;
	}
	
	@Override
	public boolean isEmpty() {
		return (length == 0);
	}
	
	
	@Override
	public Object peek() {
		if (length == 0) {
			throw new NoSuchElementException();
		}
		return elems[front];
	}
	
//	Transformers
	@Override
	public void clear() {
		
		for (int i = 0; i < elems.length; i++) {
			elems[i] = null;
		}
		
		length = front = rear = 0;
	}
	
	public void addLast(Object elem) {
		
		if (length == elems.length) { expand(); }
		
		elems[rear++] = elem;
		
		if(rear == elems.length) { rear = 0; }
		
		length++;
	}
	
	public Object removeFirst() {
		
		if(length == 0) { throw new NoSuchElementException(); }
		Object frontElem = elems[front];
		elems[front++] = null;
		
		if (front == elems.length) { front = 0; }
		length--;
		
		return frontElem;
	}
	
	
	@Override
	public boolean add(Object elem) {
		// TODO Auto-generated method stub
		return false;
	}
	
	private void expand() {
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public Iterator iterator() {
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
	
	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
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
	public boolean offer(Object e) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public Object remove() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Object poll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Object element() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String[] args) {
		
		ArrayQueue queue = new ArrayQueue(10);
		
		String randomVar = "Test";
		String ramdomV = "Prueba";
		String rv = "Name";
		
		Integer randomInt = 10;
		Integer random = 5;
		Integer r = 1;
		
		queue.addLast(randomVar);
//		queue.addLast(randomInt);
//		
//		queue.addLast(ramdomV);
//		queue.addLast(random);
//		
//		queue.addLast(rv);
//		queue.addLast(r);
		
	}
	
}
