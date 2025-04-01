public class TreasureCard extends QuestCard {
	private Treasure treasure;
	private int value;

	public TreasureCard(Treasure initialTreasure, int initialValue, String initialName) {
		this.treasure = initialTreasure;
		this.value = initialValue;
		super(initialName);
	}

	public String toString() {
		return "This is: " + treasure + " and it's value is " + value;
	}
}
