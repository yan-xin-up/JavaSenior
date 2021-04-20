package buzz.xinyan.java2;

/**
 * @descriptions: Producer and Customer
 * @author: Ivan
 * @date: 2021/4/20 10:30
 * @version: 1.0
 */
class Clerk1 {
    private int productNumber = 0;



    /**
     * 生产
     */
    public synchronized void addProduct() {
//        System.out.println(productNumber);

        if(productNumber < 20){
            productNumber++;
            System.out.println(Thread.currentThread().getName()+"当前线程共生产了" + productNumber + "个产品");
            notify();
        }else{
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void getProduct() {

        if (productNumber > 0) {
            productNumber--;
            System.out.println(Thread.currentThread().getName()+"当前线程共消耗了" + productNumber + "个产品");
            notify();
        } else {

            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/**
 * xiaofei
 */
class Customer1 extends Thread {
    private Clerk1 clerk;

    public Customer1(Clerk1 clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(currentThread().getName()+"开始消费产品！");
        while (true) {

            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.getProduct();
        }
    }
}

/**
 * shengchan
 */
class Producer1 extends Thread {
    private Clerk1 clerk;

    public Producer1(Clerk1 clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(currentThread().getName()+"开始生产产品！");
        while (true) {

            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.addProduct();
        }
    }
}

public class ProducerTest {
    public static void main(String[] args) {
        Clerk1 clerk = new Clerk1();
        Customer1 c1 = new Customer1(clerk);
        Customer1 c2 = new Customer1(clerk);
        Producer1 p1 = new Producer1(clerk);

        c1.setName("customer");
        c2.setName("customer二号");
        p1.setName("Producer");
        c2.start();
        c1.start();
        p1.start();

    }


}
