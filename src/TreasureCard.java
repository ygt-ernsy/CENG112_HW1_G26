public class TreasureCard extends QuestCard {
	private Treasure treasure;
	private int value;

	public TreasureCard(Treasure initialTreasure, int initialValue) {
		this.treasure = initialTreasure;
		this.value = initialValue;
	}

	public String toString() {
		return "This is: " + treasure + " and it's value is " + value;
	}
}
