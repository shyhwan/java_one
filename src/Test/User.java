package Test;

public class User {
    private String name;
    private int age;

    public User() {

    }

    public User(String name) {
        this.name = name;
    }

    public User(String name, int age) {
        this(name);
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static int test() {
        int i = 1;
        return i;
    }

    public String toString() {
       return String.format("이름은 %s 나이는 %d입니다.", name, age); 
    }
}
