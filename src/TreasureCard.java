public class TreasureCard extends QuestCard {
	private Treasure treasure;
	private int value;

	public TreasureCard() {

	}

	public String toString() {
		return "This is: " + treasure + " and it's value is " + value;
	}
}
