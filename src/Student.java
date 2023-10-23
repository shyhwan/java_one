public class Student {
    private String name;
    private int age;

    public Student() {}

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
       return String.format("학생이름은 %s 나이는 %d입니다.", name, age); 
    }
}
