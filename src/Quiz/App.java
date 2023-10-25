package Quiz;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        /* 문제 1
        한 개의 문장이 주어지면 그 문장 속에서 
        가장 긴 단어를 출력하는 프로그램을 작성하세요.
        */

        String str = "마음만을 가지고 있어서는 안된다. 반드시 실천하여야 한다.";
        String[] list = str.split(" ");

        str = "";    
        for(String word: list) {
            if(str.length() < word.length()) {
                str = word;
            }
        }

        System.out.println("long word :: " + str);

        /* 문제 2
        앞에서 읽을 때나 뒤에서 읽을 떄나 같은 문자열을 팰린드롬이라고한다.
        문자열이 입력되면 해당 문자열이 팰린드롬이면 YES 아니면 NO를 출락하는 프로그램을 작성해라
        단 화문을 검사할 떄 알파벳만 가지고 화문을 검사하며, 대소문자를 구분하지 않는다.
        알파벳 이외의 문자들은 무시한다.
        */        

        StringBuilder text = new StringBuilder("Hannadh");
        
        String t1 = text.toString();
        String t2 = text.reverse().toString();

        if(!t1.equalsIgnoreCase(t2)) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
        
    }
}
