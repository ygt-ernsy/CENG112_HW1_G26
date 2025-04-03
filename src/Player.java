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
        int randomIndex = rand.nextInt(30) + 1;

        return randomIndex;
    }

    public int calculateScore() {
        Gold gold = new Gold();
        Obsidian obsidian = new Obsidian();
        Turquoise turquoise = new Turquoise();
        int pointGold = tent.getFrequencyOf(gold) * 10;
        int pointObsidian = tent.getFrequencyOf(obsidian) * 5;
        int pointTurquoise = tent.getFrequencyOf(turquoise);
        return pointTurquoise + pointObsidian + pointGold;
    }

    public String toString() {
        return "The username of the player: " + this.name + " and the total point of this player is "
                + calculateScore();
    }

    public void addTent(Treasure treasure) {
        this.tent.add(treasure);
    }

    public void addHazardBox(HazardCard hazardCard) {
        this.hazardBox.add(hazardCard);
    }

    public void addTreasureBox(TreasureCard treasureCard) {
        this.treasureBox.add(treasureCard);
    }

    public int getHazardSize() {
        return hazardBox.getCurrentSize();
    }

    public int getTreasureSize() {
        return treasureBox.getCurrentSize();
    }

    public TreasureBox getTreasureBox() {
        return treasureBox;
    }
}
