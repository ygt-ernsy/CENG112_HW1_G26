public class Game {
	private int numberOfRounds = 5;
	private Player player;
	private Box box;
	private Chest chest;

	public Game(String initialName) {
		this.player = new Player(initialName);
		this.box = new Box();
		this.chest = new Chest();
	}

	public void initializeGameComponents() {
		box.initializeBox();
		chest.initializeChest();

	}

	public void claimTreasures(TreasureBox treasureBox) {

		Object[] objArray = treasureBox.toArray();

		TreasureCard[] treasureBoxArray = new TreasureCard[objArray.length];

		int index = 0;
		for (int i = 0; i < objArray.length; i++) {
			if (objArray[i] != null) {
				treasureBoxArray[index] = (TreasureCard) objArray[i]; // Cast each element
				index++;
			}
		}

		for (int i = 0; i < treasureBoxArray.length; i++) {
			Treasure treasureType = treasureBoxArray[i].getTreasure();
			int value = treasureBoxArray[i].getValue();
			for (int j = 0; j < value; j++) {
				player.addTent(treasureType);
				chest.remove(treasureType);
			}
		}
		treasureBox.clear();
	}

	public void play() {
		for (int i = 0; i < numberOfRounds; i++) {
			for (int j = 0; j < 3; j++) {
				int dice_roll = 0;
				do {
					dice_roll = player.rollDice();
				} while (dice_roll >= box.getCurrentSize());

				QuestCard round_card = box.removeByIndex(dice_roll);
				if (round_card instanceof HazardCard) {
					player.addHazardBox((HazardCard) round_card);

				} else {
					player.addTreasureBox((TreasureCard) round_card);
				}
			}
		}
		if (player.getHazardSize() > player.getTreasureSize()) {
			System.out.println(" :( You have more hazard cards than treasure cards. You Lost. ):");
		} else {
			System.out.println(
					" (: You have more treasure cards than hazard cards.You Won!! Your treasure added to tent. :)");
			claimTreasures(player.getTreasureBox());
			System.out.println("Your total point is: " + player.calculateScore());
		}

	}
}
