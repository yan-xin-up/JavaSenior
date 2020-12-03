package buzz.xinyan.exer;

/**
 * @descriptions: 分别创建两个线程来遍历100以内的奇数与偶数
 * @author:
 * @date: 2020/12/3 13:04
 * @version: 1.0
 */
public class ThreadDemo {
    public static void main(String[] args) {
//        Demotest1 d1 = new Demotest1();
//        Demotest2 d2 = new Demotest2();
//        d1.start();
//        d2.start();
        //another way  匿名子类
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() + i);
                    }
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + "**************" + i);
                    }
                }
            }
        }.start();
    }
}

class Demotest1 extends Thread {

    /**
     * @return
     * @descriptions 遍历奇数
     * @author
     * @date 2020/12/3 13:07
     */
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + i);
            }
        }
    }


}

class Demotest2 extends Thread {
    /**
     * @return
     * @descriptions 遍历偶数
     * @author
     * @date 2020/12/3 13:07
     */
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + "**************" + i);
            }
        }
    }
}
