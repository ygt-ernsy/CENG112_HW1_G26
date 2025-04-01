public class Box extends Bag<QuestCard> {

	public Box() {
		super(30);
	}

	public void initializeBox() {
		for (int i = 0; i < 3; i++) {
			add(new Spider());
			add(new Mummy());
			add(new Fire());
			add(new Goblin());
			add(new Snake());
		}
		// Add 15 TreasureCards
		// Turquoise: 33, 36, 39, 42, 45
		add(new TreasureCard(new Turquoise(), 33));
		add(new TreasureCard(new Turquoise(), 36));
		add(new TreasureCard(new Turquoise(), 39));
		add(new TreasureCard(new Turquoise(), 42));
		add(new TreasureCard(new Turquoise(), 45));

		// Obsidian: 18 21, 24, 27, 30
		add(new TreasureCard(new Obsidian(), 18));
		add(new TreasureCard(new Obsidian(), 21));
		add(new TreasureCard(new Obsidian(), 24));
		add(new TreasureCard(new Obsidian(), 27));
		add(new TreasureCard(new Obsidian(), 30));

		// Gold: 3 6, 9, 12, 15
		add(new TreasureCard(new Gold(), 3));
		add(new TreasureCard(new Gold(), 6));
		add(new TreasureCard(new Gold(), 9));
		add(new TreasureCard(new Gold(), 12));
		add(new TreasureCard(new Gold(), 15));
	}
}
