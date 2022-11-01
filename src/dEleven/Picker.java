package dEleven;

public class Picker implements Worker{
    private int salary;
    private int zp = 80;

    private WareHouse wareHouse;

    public Picker(WareHouse wareHouse) {
        this.salary = 0;
        this.wareHouse = wareHouse;
    }

    public void setZp(int zp) {
        this.zp = zp;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void doWork() {
        this.setSalary(this.getSalary() + this.getZp());
        wareHouse.setCountOrder(wareHouse.getCountOrder()+1);
        if(wareHouse.getCountOrder() == 1500){
            this.bonus();
        }
    }

    @Override
    public void bonus() {
        this.setZp(this.getZp() * 3);
    }

    public int getZp() {
        return this.zp;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + this.getSalary() +
                ", zp=" + this.getZp() +
                '}';
    }
}
