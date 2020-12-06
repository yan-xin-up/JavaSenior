package buzz.xinyan.java;

/**
 * @program: JavaSenior
 * @description: 使用同步方法解决Thread线程安全问题
 * @author: ivan
 * @create: 2020-12-06 17:00
 */
public class SynMethodThea {
    public static void main(String[] args) {

        myRunnable4 t3 = new myRunnable4();
        myRunnable4 t2 = new myRunnable4();
        myRunnable4 t1 = new myRunnable4();

        t1.setName("线程1");
        t2.setName("线程3");
        t3.setName("线程2");

        t1.start();
        t2.start();
        t3.start();
    }

}

class myRunnable4 extends Thread {

    private static int ticket = 100;

    @Override
    public void run() {
        while (true) {
            show();
        }
    }

    private static synchronized void show() {

        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + "卖票:票号为" + ticket);
            ticket--;
        }

    }
}
