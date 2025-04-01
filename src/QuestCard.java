public class QuestCard {
	private String name;

	public QuestCard(String initialName) {
		this.name = initialName;
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
