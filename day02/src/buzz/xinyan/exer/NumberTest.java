package buzz.xinyan.exer;

/**
 * @descriptions: Alternate Print Number两个线程交替打印1-100
 * @author: Ivan
 * @date: 2021/4/16 13:36
 * @version: 1.0
 */
class printN implements Runnable {

    private int number;//begin

    public printN(int number) {
        this.number = number;
    }

    @Override
    public void run() {

        while (true) {
            synchronized (this) {
                notify();
                if (number <= 100) {
                    System.out.println(Thread.currentThread().getName() + ":" + number);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    number++;
                    try {
                        wait();
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

public class NumberTest {

    public static void main(String[] args) {
        printN print = new printN(1);
        Thread c1 = new Thread(print);
        Thread c2 = new Thread(print);

        c1.setName("satomi");
        c2.setName("yui");

        c1.start();
        c2.start();
    }
}
