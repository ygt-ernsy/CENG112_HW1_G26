import java.util.Random;

public class Player {
	private Tent tent;
	private TreasureBox treasureBox;
	private HazardBox hazardBox;
	private String name;
	private Random rand;

	public Player(String initialName) {
		this.tent = new Tent();
		this.treasureBox = new TreasureBox();
		this.hazardBox = new HazardBox();
		this.name = initialName;
		this.rand = new Random();
	}

	public int rollDice() {
		int randomIndex = rand.nextInt(30);
		return randomIndex;
	}

	public int calculateScore() {

	}

	public String toString() {

	}

}
