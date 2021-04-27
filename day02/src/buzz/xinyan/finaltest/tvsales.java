package buzz.xinyan.finaltest;

/**
 * @descriptions: sellTv test 设有一个最大库存量为4的电视机仓库，生产10台电视机，一边生产一边销售（消费）
 * @author: Ivan
 * @date: 2021/4/27 9:20
 * @version: 1.0
 */

/**
 * 操作库存
 */
class Repository {
    private int max = 4; //最大库存量
    private int num = 0; //库存数
    private int serialNumber = 0;

    /**
     * 上货
     */
    public synchronized void getGoods() {
        if (max > num) {
            num++;
            serialNumber++;
            System.out.println(Thread.currentThread().getName() + serialNumber + "件货。" + "当前库存数为" + num);
            notify();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 出货
     */
    public synchronized void sellGoods() {
        if (num > 0) {
            num--;
            notify();
            System.out.println(Thread.currentThread().getName() + "当前库存数为" + num);
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/**
 * mai电视
 */
class Customer implements Runnable {
    Repository repository;

    public Customer(Repository repository) {
        this.repository = repository;
    }

    @Override
    public void run() {

        System.out.println("商品开始出货！");
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            repository.sellGoods();
        }

    }

}

/**
 * 上货
 */
class Manufacture implements Runnable {
    Repository repository;

    public Manufacture(Repository repository) {
        this.repository = repository;
    }

    @Override
    public void run() {
        System.out.println("商品开始上货！");
        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            repository.getGoods();
        }
    }
}

public class tvsales {
    public static void main(String[] args) {
        Repository re = new Repository();
        Customer out = new Customer(re);
        Manufacture in = new Manufacture(re);

        Thread i = new Thread(in);
        Thread o = new Thread(out);

        i.setName("上货");
        o.setName("出货");

        i.start();
        o.start();
    }
}

