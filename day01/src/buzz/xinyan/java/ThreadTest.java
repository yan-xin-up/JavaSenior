package buzz.xinyan.java;

/**
 *
 */
/**
 * @descriptions 功能描述
 * @author
 * @date 2020/12/3 10:55
 * @version
 */
public class ThreadTest{
    public static void main(String[] args) {

        myThtead t = new myThtead();
        myThtead w = new myThtead();
//        t.run();
        t.start();
    }
}

class myThtead extends Thread{


    @Override
    public  void run() {
        super.run();
        for(int i = 0;i <= 100;i++){
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }

    }

}