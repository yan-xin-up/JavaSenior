package buzz.xinyan.java;

/**
 * @program: JavaSenior
 * @description: 使用同步的方法解决Runnable线程安全问题
 * @author: ivan
 * @create: 2020-12-06 16:41
 */
public class SynMethodRun {

    public static void main(String[] args) {
        myRunnable3 r1 = new myRunnable3();

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

class myRunnable3 implements Runnable {

    private  int ticket = 100;
    @Override
    public void run() {
        while (true) {
           show();
        }
    }
    private synchronized void  show(){

            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "卖票:票号为" + ticket);
                ticket--;
            }

    }
}
