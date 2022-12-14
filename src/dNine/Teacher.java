package dNine;

public class Teacher extends Human{
    private String subject;

    public Teacher(String name, String subject){
        super(name);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + this.getName() + " ведёт предмет " + this.getSubject());
    }
}
