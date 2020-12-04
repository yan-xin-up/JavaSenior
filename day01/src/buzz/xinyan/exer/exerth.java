package buzz.xinyan.exer;

/**
 * @descriptions: 用Thread遍历100以内的自然数
 * @author: Ivan
 * @date: 2020/12/4 9:20
 * @version: 1.0
 */
public class exerth {

    public static void main(String[] args) {
        myexerth m1 = new myexerth();
        myexerth m2 = new myexerth();
        m1.setName("线程1");
        m2.setName("线程2");

        m1.start();
        m2.start();
    }

}

class myexerth extends Thread{
    private  int number = 100;
    @Override
    public void run() {
        super.run();
        for (int i = 0;i < number;i++){
            System.out.println(getName()+":"+i);
        }
    }
}
