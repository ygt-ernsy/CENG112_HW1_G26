public class TreasureCard extends QuestCard {
	private Treasure treasure;
	private int value;

	public TreasureCard(Treasure initialTreasure, int initialValue, String initialName) {
		super(initialName);
		this.treasure = initialTreasure;
		this.value = initialValue;
	}

	public Treasure getTreasure() {
		return treasure;
	}

	public int getValue() {
		return value;
	}

	public String toString() {
		return "You got lucky. You found "+ value +" "+ this.getName();
	}
}
