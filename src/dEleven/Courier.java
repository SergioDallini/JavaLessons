package dEleven;

public class Courier implements Worker{
    private int salary;
    private int zp = 100;
    private WareHouse wareHouse;
    public Courier(WareHouse wareHouse) {
        this.salary = 0;
        this.wareHouse = wareHouse;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setZp(int zp) {
        this.zp = zp;
    }

    @Override
    public void doWork() {
        this.setSalary(this.getSalary() + this.getZp());
        wareHouse.setBalance(wareHouse.getBalance()+1000);
        if(wareHouse.getBalance() == 1000000){
            this.bonus();
        }
    }

    @Override
    public void bonus() {
        this.setZp(this.getZp() * 2);
    }

    public int getZp() {
        return this.zp;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + this.getSalary() +
                ", zp=" + this.getZp() +
                '}';
    }
}
