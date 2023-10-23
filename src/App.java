import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner sc = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<User>();
        for(int i = 0; i < 3; i++) {
            User user = new User();
            
            String name = "";
            int age = 0;
            
            System.out.println("이름을 입력해 주세요. ");
            System.out.print("> ");
            name = sc.nextLine();
            // user.setName(name);
            
            System.out.println("나이를 입력해 주세요. ");
            System.out.print("> ");
            age = sc.nextInt();sc.nextLine();
            // user.setAge(age);
            
            // users.add(user)
            users.add(new User(name, age));   
        }
           
        System.out.println("사용자는 " + users.size() + "명 입니다.");
        System.out.println(users);

        for(User user: users) {
            System.out.println("----------------\n" + "이름 : " + user.getName() + "\t나이 : " + user.getAge());
        }
        System.out.println("----------------");
    }
}
