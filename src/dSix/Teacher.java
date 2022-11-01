package dSix;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    void evaluate (Student student){
        String a = switch ((int)(Math.random()*4+2)){
            case 2 -> "неудовл";
            case 3 -> "удовл";
            case 4 -> "хорошо";
            case 5 -> "отлично";
            default -> throw new IllegalStateException("Unexpected value: ");
        };
        System.out.println("Преподаватель " + this.name + " оценил студента " + student.getName() + " по " +
                "предмету " + Teacher.this.getSubject() + " на оценку " + a);
    }
}
