package dSix;

public class Task3 {
    public static void main(String[] args) {
        Student student = new Student("Ivan");
        Teacher teacher = new Teacher("Sandra", "History");
        teacher.evaluate(student);
    }
}
