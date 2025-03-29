public class Chest extends Bag<Treasure> {

	public Chest() {
		super(360);
	}

	public void initializeChest() {
		// Add 195 Turquoise
		for (int i = 0; i < 195; i++) {
			add(new Turquoise());
		}

		// Add 120 Obsidian
		for (int i = 0; i < 120; i++) {
			add(new Obsidian());
		}

		// Add 45 Gold
		for (int i = 0; i < 45; i++) {
			add(new Gold());
		}
	}
}
