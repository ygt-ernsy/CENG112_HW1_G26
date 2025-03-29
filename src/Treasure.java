public class Treasure {
	private int value;

	public Treasure() {
		this.value = 0;
	}

	public Treasure(int initialValue) {
		this.value = initialValue;
	}

	public String toString() {
		return "The value of this tresure is: " + value;
	}
}
