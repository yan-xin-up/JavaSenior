package buzz.xinyan.exer;

/**
 * @descriptions: 多窗口卖票 创建三个窗口卖票，总票数为100张  线程不同步
 * @author: Ivan
 * @date: 2021/2/24 15:36
 * @version: 1.0
 */
//
public class sellTicket {
    public static void main(String[] args) {
        ticketSell w1 = new ticketSell("窗口一：");
        ticketSell w2 = new ticketSell("窗口二：");
        ticketSell w3 = new ticketSell("窗口三：");

        w1.start();
        w2.start();
        w3.start();
    }


}

class ticketSell extends  Thread{

    public ticketSell(String name){
        super(name);
    }

    private static int ticket = 100;
    @Override
    public void run() {
        super.run();
        while(true){
            if(ticket > 0){
                System.out.println(Thread.currentThread().getName()+"卖票，票号为："+ticket);
                ticket--;
            }else{
                break;
            }
        }
        System.out.println("票已售完");
    }
}
