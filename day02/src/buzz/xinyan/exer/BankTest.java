package buzz.xinyan.exer;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: JavaSenior
 * @description: 银行账户存钱操作
 * @author: ivan
 * @create: 2020-12-06 19:53
 */
public class BankTest {
    public static void main(String[] args) {
        Account acct = new Account();
        Thread r1 = new Thread(acct);
        Thread r2 = new Thread(acct);
        r1.setName("账户1");
        r2.setName("账户2");
        r2.start();
        r1.start();
    }
}

class Account implements Runnable {
    private double balance = 0;
    private final ReentrantLock lock = new ReentrantLock();
    private static final int MONEY = 1000;
    @Override
    public void run() {
        lock.lock();
        try {

            for (int i = 0; i < 3; i++) {
                balance += MONEY;
                System.out.println("存入"+MONEY+"成功");
                System.out.println("谢谢您"+Thread.currentThread().getName()+"，存钱成功您的余额为"+balance);
            }
        } finally {
            lock.unlock();
        }

    }
}
