package buzz.xinyan.exer;

/**
 * @descriptions: 用Runnable遍历100以内的自然数
 * @author: Ivan
 * @date: 2020/12/4 9:39
 * @version: 1.0
 */
public class exerRun {

    public static void main(String[] args) {
        myexerRun m = new myexerRun();

        Thread t1 = new Thread(m);
        Thread t2 = new Thread(m);

        t1.setName("线程1");
        t2.setName("线程2");

//        t1.start();
        t2.start();
    }
}

class myexerRun implements Runnable {
    private int ticket = 100;
    Object V = new Object();

    @Override
    public void run() {
        synchronized (V) {
            if (ticket <= 100 && ticket >0) {
                for (int i = 0; i < 100; i++) {
                    ticket--;
                    System.out.println(Thread.currentThread().getName() + ":" + ticket);
                }
            }

        }
    }
}
