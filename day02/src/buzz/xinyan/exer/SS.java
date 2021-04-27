package buzz.xinyan.exer;

/**
 * @descriptions: 实现一个由A、B、C三个窗口同时销售100张票的系统，要求打印出每个窗口打印的售票情况，并且每个窗口不得连续售票
 * @author: Ivan
 * @date: 2021/4/27 15:51
 * @version: 1.0
 */
class Sellticket implements Runnable {
    private int TicketNumber = 1;
    private Object ob = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (ob) {
                ob.notify();
                if (TicketNumber <= 100) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "卖票成功，第" + TicketNumber + "张票已售出.");
                    TicketNumber++;
                    try {
                        ob.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
            }
        }
    }
}

public class SS {
    public static void main(String[] args) {
        Sellticket number = new Sellticket();

        Thread t1 = new Thread(number);
        Thread t2 = new Thread(number);
        Thread t3 = new Thread(number);

        t1.setName("窗口A");
        t2.setName("窗口B");
        t3.setName("窗口C");

        t1.start();
        t2.start();
        t3.start();
    }
}

