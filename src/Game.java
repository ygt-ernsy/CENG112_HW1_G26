public class Game {
	private int numberOfRounds = 0;
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

	}

	public void Play() {

	}
}
