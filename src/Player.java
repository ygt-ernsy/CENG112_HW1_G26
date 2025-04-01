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
        Gold gold =new Gold();
        Obsidian obsidian =new Obsidian();
        Turquoise turquoise =new Turquoise();
        int pointGold=tent.getFrequencyOf(gold)*10;
        int pointObsidian=tent.getFrequencyOf(obsidian)*5;
        int pointTurquoise=tent.getFrequencyOf(turquoise);
        int totalpoint = pointGold + pointObsidian + pointTurquoise;
        return  totalpoint;
    }

    public String toString() {
        return "The username of the player: "+this.name+" and the total point of this player is " + calculateScore();
    }

}
