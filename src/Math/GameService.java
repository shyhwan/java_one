package Math;

public interface GameService {
    
    public void playGame(String gameName, String charName);

    public void moveChar(int moveCnt);

    public int attackChar(int damage);

    public int attackVillain(int damage);
}
