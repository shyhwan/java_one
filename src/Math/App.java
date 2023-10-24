package Math;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        GameServiceImpl g = new GameServiceImpl();
        Scanner sc = new Scanner(System.in);        
        String gameName = "";
        String charName = "";
        int goMove = 0;

        System.out.println("게임 이름을 입력해 주세요. ");
        System.out.print("> ");
        gameName = sc.nextLine();

        System.out.println("케릭터 이름을 입력해 주세요. ");
        System.out.print("> ");
        charName = sc.nextLine();

        Game game = new Game(gameName, charName);
        g.playGame(game.getGameName(), game.getCharName());
        
        System.out.println("몇칸 이동 할까요?");
        System.out.print("> ");
        goMove = sc.nextInt(); sc.nextLine();
        g.moveChar(goMove);

        System.out.println("1. 싸운다   2. 도망친다.");
        System.out.print("> ");
        int choice = sc.nextInt(); sc.nextLine();
        
        if(choice == 1) {
            int charHealth = 0;
            int villHealth = 0;
            do {
                int attackDamage = 0;
                
                attackDamage = (int)Math.round(Math.random() * 10);
                villHealth = g.attackChar(attackDamage);
                System.out.println("악당 채력이 " + villHealth + " 남았습니다.");
                System.out.println();

                if(villHealth <= 0) { break; }
                
                attackDamage = (int)Math.round(Math.random() * 10);
                charHealth = g.attackVillain(attackDamage);
                System.out.println("캐릭터 채력이 " + charHealth + " 남았습니다.");
                System.out.println();
                
                if(charHealth <= 0) { break; }
                
                System.out.println("1. 계속한다.   2. 도망친다.");
                System.out.print("> ");
                choice = sc.nextInt(); sc.nextLine();
                
            } while (choice == 1);
            
            
            if(charHealth <= 0) {
                System.out.println("::::DIED::::");
            } else if(villHealth <= 0) {
                System.out.println(":::SUCCESS:::");
            } else {
                System.out.println("::THE END::");
            }
        } else {
                System.out.println("::THE END::");
        }

    }    
}
