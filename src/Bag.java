import java.util.Random;

public class Bag<T> implements IBag<T> {
	private int content = 0;
	private int capacity;
	private T[] array;
	private Random rand;

	public Bag(int initialCapacity) {
		this.capacity = initialCapacity;
		this.array = (T[]) new Object[capacity];
		this.rand = new Random();
	}

	public boolean add(T newEntry) {
		if (isFull()) {
			return false;
		}
		array[content] = newEntry;
		content++;
		return true;
	}

	public boolean isEmpty() {
		if (content == 0) {
			return true;
		}
		return false;
	}

	public boolean isFull() {
		if (content == capacity) {
			return true;
		}
		return false;
	}

	public T removeByIndex(int index) {

		if (index < 0 || index >= content) {
			return null;
		} else if (content == 1) {
			T removed = array[0];
			array[0] = null;
			content--;
			return removed;
		}

		T removed = array[index];
		for (int i = index; i < content - 1; i++) {
			array[i] = array[i + 1];
		}

		array[content - 1] = null;
		content--;
		return removed;
	}

	public boolean remove(T anEntry) {
		int indexOfEntry = getIndexOf(anEntry);
		if (indexOfEntry == -1) {
			return false;
		}
		removeByIndex(indexOfEntry);
		return true;
	}

	public T remove() {
		int randomIndex = rand.nextInt(content);
		T removed = array[randomIndex];
		removeByIndex(randomIndex);
		return removed;
	}

	public int getFrequencyOf(T anEntry) {
		int frequency = 0;

		for (int i = 0; i < content; i++) {
			if (array[i].equals(anEntry)) {
				frequency++;
			}
		}

		return frequency;
	}

	public int getIndexOf(T anEntry) {
		for (int i = 0; i < content; i++) {
			if (array[i].equals(anEntry)) {
				return i;
			}
		}
		return -1;
	}

	public boolean contains(T anEntry) {
		for (int i = 0; i < content; i++) {
			if (array[i].equals(anEntry)) {
				return true;
			}
		}
		return false;
	}

	public void clear() {
		for (int i = 0; i < content; i++) {
			array[i] = null;
		}
	}

	public void displayItems() {
		for (int i = 0; i < content; i++) {
			System.out.println(array[i]);
		}
	}

	public int getCurrentSize() {
		return content;
	}

	public T[] toArray() {
		return array;
	}
}
