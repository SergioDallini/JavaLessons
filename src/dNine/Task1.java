package dNine;

public class Task1 {
    public static void main(String[] args) {
    Human human = new Human("Ivan");
    Student student = new Student("John", "Programming");
    Teacher teacher = new Teacher("Sandra", "OOP");
    human.printInfo();
    student.printInfo();
    teacher.printInfo();
        System.out.println(teacher.getName());
    }
}
