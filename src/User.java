public class User {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User getUser() {
        User user = new User();
        return user;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
       return String.format("이름은 %s 나이는 %d입니다.", name, age); 
    }
}
