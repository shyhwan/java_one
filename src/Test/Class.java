package Test;
public class Class {
    private String className;
    private String teacher;
    
    public Class() {}

    public Class(String className, String teacher) {
        this.className = className;
        this.teacher = teacher;
    }

    public String toString() {
       return String.format("수업은 %s 선생님은 %s입니다.", className, teacher); 
    }    
}