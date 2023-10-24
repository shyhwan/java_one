package Math;

public class GameServiceImpl implements GameService {
    Game game =  new Game();;

    @Override
    public void playGame(String gameName, String charName) {
        game = new Game(gameName, charName);
        System.err.println(game.getGameName() + "을 시작합니다.");
    }

    @Override
    public void moveChar(int moveCnt) {
        System.out.println("캐릭터가" + moveCnt +  "칸 이동합니다.");
        System.out.println("적이 나타났습니다.");
    }

    @Override
    public int attackChar(int damage) {
        System.out.println("악당을 공격을 합니다.");

        int villainDefence = (int)Math.floor(Math.random() * 10);
        System.out.println("공격력 - " + damage + " | " + "방어력 - " + villainDefence);

        if(damage > villainDefence && damage >= 5) {
            System.out.println("공격을 성공했습니다.");
            System.out.println("악당: 어디서.. 이런 녀석이!!");
            game.attackChar(damage);
        } else if(damage > villainDefence) {
            int remainDamage = 0;
            System.out.println("공격을 성공했습니다.");
            System.out.println("악당: 역시 이름값 하는구나");
            remainDamage = damage - villainDefence;
            game.attackChar(remainDamage);
        } else if(damage <= villainDefence) {
            System.out.println("악당이 회피했다.");
            System.out.println("악당: 그정도론 상처하나 나지 않는다!");
        }

        return game.getVillainHealth();
    }

    @Override
    public int attackVillain(int damage) {
        System.out.println("악당이 공격 합니다.");

        int charDefence = (int)Math.floor(Math.random() * 10);
        System.out.println("공격력 - " + damage + " | " + "방어력 - " + charDefence);

        if(damage > charDefence && damage >= 5) {
            System.out.println("방어에 실패했습니다.");
            System.out.println(game.getCharName() + ": 너무 강려크 하다..");
            game.attackVillain(damage);
        } else if(damage > charDefence) {
            int remainDamage = 0;
            System.out.println("방어에 실패했습니다.");
            System.out.println(game.getCharName() + ": 만만치 않군..");
            remainDamage = damage - charDefence;
            game.attackVillain(remainDamage);
        } else if(damage <= charDefence) {
            System.out.println("방어에 성공했다.");
            System.out.println(game.getCharName() + ": 흠..가렵구나");
        }

         return game.getCharHealth();
    }    
}
