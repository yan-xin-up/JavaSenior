package buzz.xinyan.java2;

/**
 * @descriptions: 经典例题：生产者 消费者问题
 * @author: Ivan
 * @date: 2020/12/7 14:21
 * @version: 1.0
 */

class Cherk {
    public void addProduct() {

    }

}

/**
 * @author ivan
 * @version 1.0
 * @descriptions 生产者线程
 * @date 2020/12/7 16:56
 */
class Producter implements Runnable {
    Cherk cherk;

    public Producter(Cherk cherk) {
        this.cherk = cherk;
    }

    @Override
    public void run() {

    }
}

class Customer {

}

public class ProductTest {
}
