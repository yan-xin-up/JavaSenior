package buzz.xinyan.java2;

/**
 * 模拟3个人排除买票，每人买1张票。 售货员只有1张五元的钱，电影票5元一张， 王大拿拿一张二十元的人民币排在谢大脚前面买票，谢大脚拿1张十元的人民币排在在赵四的前面买票， 赵四拿1张五元的人民币排在最后。 即最终的卖票次序是：谢大脚、赵四、王大拿
 * @author Zeuskk
 */
class salesMan {
    private int money = 5;
    private int price = 5;
    public void addMoney(){
        money += price;
    }
    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public boolean canBuyTicket(int money){
        if (this.money >= money - price){
            return true;
        }else{
            return false;
        }
    }
}
class BuyTicket implements Runnable{
    private int money;
    private int ticket = 0;
    private salesMan salesMan;
    public BuyTicket(int money,salesMan salesMan){
        this.money = money;
        this.salesMan = salesMan;
    }
    @Override
    public void run() {
        while (ticket == 0){
            synchronized (salesMan){
                if (salesMan.canBuyTicket(money)){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    salesMan.addMoney();
                    ticket++;
                    System.out.println(Thread.currentThread().getName()
                            + ":买到一张票！");
                }
            }
        }
    }
}
public class ProTest{
    public static void main(String[] args) {
        salesMan salesMan = new salesMan();
        BuyTicket b1 = new BuyTicket(20,salesMan);
        BuyTicket b2 = new BuyTicket(10,salesMan);
        BuyTicket b3 = new BuyTicket(5,salesMan);
        Thread t1 = new Thread(b1);
        Thread t2 = new Thread(b2);
        Thread t3 = new Thread(b3);
        t1.setName("王大拿");
        t2.setName("谢大脚");
        t3.setName("赵四");
        t1.start();
        t2.start();
        t3.start();
    }

}

