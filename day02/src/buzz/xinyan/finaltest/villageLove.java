package buzz.xinyan.finaltest;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @descriptions: buyticket
 * @author: Ivan
 * @date: 2021/4/26 17:11
 * @version: 1.0
 */

class salesMan {
    private int money = 5;            //售货员零钱
    private int price = 5;              //票价

    /**
     * 每卖一张票零钱加5元
     */
    public void changeMoney() {
        money += price;
    }

    public boolean iFdo(int money) {
        if (this.money >= money - price) {
            return true;
        } else {
            return false;
        }
    }
}

class getTicket implements Runnable {
    private int money;             //买家余额
    private salesMan sale;
    int ticket = 0;

    public getTicket(salesMan sale, int money) {
        this.money = money;
        this.sale = sale;
    }


    @Override
    public void run() {
        while (ticket == 0) {
            synchronized (sale) {
                if (sale.iFdo(money)) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    sale.changeMoney();
                    ticket++;
                    System.out.println(Thread.currentThread().getName()
                            + ":买到一张票！");
                }

            }

        }
    }
}

public class villageLove {
    public static void main(String[] args) {
        salesMan sale = new salesMan();
        getTicket b1 = new getTicket(sale, 20);         //dana
        getTicket b2 = new getTicket(sale, 10);         //dajiao
        getTicket b3 = new getTicket(sale, 5);         //sishu
        Thread t1 = new Thread(b1);
        Thread t2 = new Thread(b2);
        Thread t3 = new Thread(b3);

        t1.setName("大拿");
        t2.setName("大脚");
        t3.setName("赵老四");

        t1.start();
        t2.start();
        t3.start();


    }
}
