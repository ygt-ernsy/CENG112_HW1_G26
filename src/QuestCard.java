public class QuestCard {
	private String name;

	public QuestCard(String initialName) {
		this.name = initialName;
	}

	public String toString() {
		return "Oh No!! You came across a " + name;
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else {
			return false;
		}
	}
	public String getName() {
		return name;
	}
}
