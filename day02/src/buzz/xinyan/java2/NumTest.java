package buzz.xinyan.java2;

/**
 * @program: JavaSenior
 * @description: 两个线程交替打印1-100
 * @author: ivan
 * @create: 2020-12-06 21:10
 */
class Num<Ob> implements Runnable {
    private int number = 1;
    private Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                obj.notify();
                if (number <= 100) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + number);
                    number++;
                    try {
                        //使得调用wait（）方法进入线程阻塞状态
                        obj.wait();
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

public class NumTest {
    public static void main(String[] args) {
        Num n = new Num();
        Thread r1 = new Thread(n);
        Thread r2 = new Thread(n);

        r1.setName("线程1");
        r2.setName("线程2");

        r1.start();
        r2.start();
    }
}
