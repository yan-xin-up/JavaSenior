package buzz.xinyan.java2;

/**
 * @descriptions: 经典例题：生产者 消费者问题
 * @author: Ivan
 * @date: 2020/12/7 14:21
 * @version: 1.0
 */

class Cherk {

    public int product = 0;

    /**
     * 生产产品
     */
    public synchronized void addProduct() {
        if (product < 20) {
            product++;
            System.out.println("当前线程共生产了" + product + "个产品");
            notify();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 消费产品
     */

    public synchronized void getProduct() {

        if (product <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("当前线程共消耗了" + product + "个产品");
            product--;
            notify();
        }

    }

}

/**
 * @author ivan
 * @version 1.0
 * @descriptions 生产者线程
 * @date 2020/12/7 16:56
 */
class Producter implements Runnable {
    private Cherk cherk;

    public Producter(Cherk cherk) {

        this.cherk = cherk;
    }

    @Override
    public void run() {
        System.out.println("生产这开始生产产品！");

        while (true) {

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cherk.addProduct();
        }
    }
}

class Customer implements Runnable {

    private Cherk cherk;

    public Customer(Cherk cherk) {
        this.cherk = cherk;
    }

    @Override
    public void run() {
        System.out.println("顾客这开始取走产品！");
        while (true) {
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            cherk.getProduct();
        }
    }
}

public class ProductTest {
    public static void main(String[] args) {
        Cherk check = new Cherk();
        Producter p1 = new Producter(check);
        Customer c1 = new Customer(check);

        Thread product = new Thread(p1);
        Thread customer = new Thread(c1);
        Thread customer1 = new Thread(c1);
        product.start();
        customer.start();
        customer1.start();
    }
}
