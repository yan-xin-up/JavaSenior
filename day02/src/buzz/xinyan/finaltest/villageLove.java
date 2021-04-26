package buzz.xinyan.finaltest;

import java.util.concurrent.Callable;

/**
 * @descriptions: buyticket
 * @author: Ivan
 * @date: 2021/4/26 17:11
 * @version: 1.0
 */

class salesMan{
    private int buyerMoney;             //买家余额
    private int sellerMoney = 5;            //售货员零钱
    private int ticketNumber = 3;       //三张票
    private int price = 5;              //票价
    salesMan salesman = new salesMan();
    private void moneyChange(){
        buyerMoney = buyerMoney -  price;
    }
    public void sellTicket() {
        while (salesman.iFdo() ||ticketNumber > 0) {
            System.out.println(Thread.currentThread().getName()+"购票成功");
            ticketNumber--;
        }
    }

    private boolean iFdo() {
        if(sellerMoney >= buyerMoney-price){
            return true;
        }else{
            return false;
        }
    }
}

class getTicket implements Callable{
    salesMan sale = new salesMan();
    @Override
    public Object call() throws Exception {

        sale.sellTicket();
        return null;
    }
}
public class villageLove {

}
