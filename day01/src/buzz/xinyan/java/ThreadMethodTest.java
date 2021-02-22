package buzz.xinyan.java;
/**
 * @descriptions: Thread类中的方法测试
 * @author Ivan
 * @create 2020-12-03 13:50
 * @version: 1.0
 */

public class ThreadMethodTest {
    public static void main(String[] args) {
        aubThread p = new aubThread();
        aubThread z = new aubThread();
        z.start();
        p.start();
        System.out.println("hello");


        for(int i = 0;i <= 100;i++){
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}
class aubThread extends Thread{
    @Override
    public void run() {
        super.run();
        for(int i = 0;i <= 100;i++){
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}