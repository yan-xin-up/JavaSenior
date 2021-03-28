package buzz.xinyan.java2;

/**
 * @descriptions: 交替打印1-100之间的数字
 * @author: Ivan
 * @date: 2021/3/26 11:02
 * @version: 1.0
 */
public class ComTest {
    public static void main(String[] args){
        Number num = new Number();
        Thread t1 = new Thread(num);
        Thread t2 = new Thread(num);
        t1.setName("线程1");
        t2.setName("线程2");
        t1.start();
        t2.start();
    }

}
class Number implements Runnable{
    private int number = 1;
    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                notify();
                if (number <= 100) {
                    System.out.println(Thread.currentThread().getName() + ":" + number);
                    number++;
                    try {
                        //调用wait方法的线程进入阻塞状态
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
