package buzz.xinyan.exer;

/**
 * 银行有一个账户。
 * 有两个储户分别向同一个账户存3000元，每次存1000，存3次。每次存完打印账户余额。
 * <p>
 * 分析：
 * 1.是否是多线程问题？ 是，两个储户线程
 * 2.是否有共享数据？ 有，账户（或账户余额）
 * 3.是否有线程安全问题？有
 * 4.需要考虑如何解决线程安全问题？同步机制：有三种方式。
 *
 * @author shkstart
 * @create 2019-02-15 下午 3:54
 */
//Account
class Account1 {
    private double amt;     //balance

    public Account1(double amt) {
        this.amt = amt;
    }

    public synchronized void  deposit1(double mo) {
        if(mo > 0){
            amt += mo;
            System.out.println(Thread.currentThread().getName() + ":存钱成功。余额为：" + amt);
        }
    }
}

class User implements Runnable {            //uesr
    private Account1 acc;

    public User(Account1 acc) {
        this.acc = acc;
    }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            acc.deposit1(1000);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class AccountTest1 {
    public static void main(String[] args) {
        Account1 account1 = new Account1(0);        //初始余额
        User u = new User(account1);
        Thread c1 = new Thread(u);
        Thread c2 = new Thread(u);
        c1.setName("a");
        c2.setName("b");
        c1.start();
        c2.start();
    }

}
