package dEleven;

public class WareHouse {

    private int countOrder;
    private int balance;

    public WareHouse() {
        this.countOrder = 0;
        this.balance = 0;
    }

    public int getCountOrder() {
        return this.countOrder;
    }

    public void setCountOrder(int countOrder) {
        this.countOrder += countOrder;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance += balance;
    }

    @Override
    public String toString() {
        return "Склад :\n" +
                "Кол-во собранных заказов : " + this.getCountOrder() +
                ", доход от доставленных заказов : " + this.getBalance();
    }
}
