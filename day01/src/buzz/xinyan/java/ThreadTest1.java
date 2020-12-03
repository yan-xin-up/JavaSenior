package buzz.xinyan.java;

/**
 * @author shkstart
 * @create 2020-12-03 10:13 下午
 */
public class ThreadTest1 {

    public static void main(String[] args) {
        myRunnable r1 = new myRunnable();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);
        Thread t3 = new Thread(r1);

        t1.setName("线程1");
        t2.setName("线程3");
        t3.setName("线程2");

        t1.start();
        t2.start();
        t3.start();
    }

}

class myRunnable implements Runnable {

    private  int ticket = 100;

    @Override
    public void run() {
        while (true) {

            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "卖票:票号为" + ticket);
                ticket--;
            } else {
                break;
            }
        }
    }
}
