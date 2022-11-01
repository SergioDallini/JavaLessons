package dNine;

public class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    void printInfo(){
        System.out.println("Этот человек с именем " + this.getName());
    }
}
