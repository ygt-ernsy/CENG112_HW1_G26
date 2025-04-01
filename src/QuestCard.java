public class QuestCard {
	private String name;

	public QuestCard() {

	}

	public String toString() {
		return "This card's is: " + name;
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else {
			return false;
		}
	}
}
