import java.util.Random;

public class Box<T> {
	private int content = 0;
	private int capacity = 30;
	private T[] mainArray;
	private Random rand;

	public Box() {
		this.mainArray = (T[]) new Object[capacity];
		this.rand = new Random();
	}

	public void add(T object) {
		if (content == capacity) {
			System.out.println("The Box is full!!");
		} else {
			mainArray[content] = object;
			content++;
		}
	}

	public T remove() {
		if (content == 0) {
			return null;
		}
		int index = rand.nextInt(content);
		T removed = mainArray[index];
		remove(index);
		return removed;
	}

	public void remove(int index) {

		if (index < 0 || index <= content || content == 0) {
			throw new IllegalStateException();
		}

		for (int i = index; i < content - 1; i++) {
			mainArray[i] = mainArray[i + 1];
		}
		mainArray[content - 1] = null;
		content--;
	}
}
