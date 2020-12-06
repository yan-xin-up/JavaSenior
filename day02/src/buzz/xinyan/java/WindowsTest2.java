package buzz.xinyan.java;

/**
 * @program: JavaSenior
 * @description: 解决继承方式d的线程安全问题
 * @author: ivan
 * @create: 2020-12-06 15:03
 */
public class WindowsTest2 {

        public static void main(String[] args) {

            myRunnable2 t3 = new myRunnable2();
            myRunnable2 t2 = new myRunnable2();
            myRunnable2 t1 = new myRunnable2();

            t1.setName("线程1");
            t2.setName("线程3");
            t3.setName("线程2");

            t1.start();
            t2.start();
            t3.start();
        }

    }

    class myRunnable2 extends Thread {

        private static int ticket = 100;
        private static Object obj = new Object();

        @Override
        public void run() {
            while (true) {
                synchronized (obj) {
                    if (ticket > 0) {
                        System.out.println(Thread.currentThread().getName() + "卖票:票号为" + ticket);
                        ticket--;
                    } else {
                        break;
                    }
                }
            }
        }
    }


