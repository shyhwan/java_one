package Math;

public class Game {
    private String gameName;
    private String charName;
    private int charHealth = 20;
    private int villainHealth = 20;

    public Game() {};

    public Game(String gameName, String charName) {
        this.gameName = gameName;
        this.charName = charName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getGameName() {
        return this.gameName;
    }

    public String getCharName() {
        return this.charName;
    }

    public int getCharHealth() {
        return this.charHealth;
    }

    public int getVillainHealth() {
        return this.villainHealth;
    }

    public void attackChar(int damage) {
        this.villainHealth -= damage;
    }

    public void attackVillain(int damage) {
        this.charHealth -= damage;
    }    
}
