package buzz.xinyan.java2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: JavaSenior
 * @description: 线程池建造多线程
 * @author: ivan
 * @create: 2020-12-08 22:38
 */
public class ExecutorTest {

    public static void main(String[] args) {

        ExecutorService service= Executors.newFixedThreadPool(10);



        service.execute(new imRunnable());

        service.shutdown();


    }
}

class  imRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0;i < 100;i++){
             if (i % 2 ==0){
                 System.out.println(Thread.currentThread().getName()+":"+i);
             }
        }
    }
}
