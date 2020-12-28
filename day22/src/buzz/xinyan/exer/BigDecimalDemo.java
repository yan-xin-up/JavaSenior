package buzz.xinyan.exer;

import java.math.BigDecimal;

/**
 * @program: JavaSenior
 * @description: 浮点型大数值
 * @author: ivan
 * @create: 2020-12-28 22:46
 */
public class BigDecimalDemo {
    public final int location = 9; //保留九位小数
    public static void main(String[] args) {
        BigDecimalDemo c = new BigDecimalDemo();
        System.out.println("加法 "+ c.add(-7.5,8.9));
        System.out.println("减 "+ c.sub(-7.5,8.9));
        System.out.println("乘法"+ c.mul(-7.5,8.9));
        System.out.println("除法，保留九位小数"+ c.div(-7.5,8.9));//ba保留九位小数
        System.out.println("除法。保留b位小数，并且四舍五入"+ c.div(-7.5,8.9,5));//保留b位小数，并且四舍五入

    }

    /**
    *@Description: 加法
    *@Param:
    *@return:
    *@Author: Ivan Xin
    *@date: 28/12/2020
    */
    public BigDecimal add(double v1,double v2){
        BigDecimal v11 = new BigDecimal(v1);
        BigDecimal v22 = new BigDecimal(v2);

        return v11.add(v22);
    }
    /**
    *@Description: 减
    *@Param:
    *@return:
    *@Author: Ivan Xin
    *@date: 28/12/2020
    */
    public  BigDecimal sub(double v1,double v2) {
        BigDecimal v11 = new BigDecimal(v1);
        BigDecimal v22 = new BigDecimal(v2);
        return v11.subtract(v22);
    }
    /**
    *@Description: 乘法
    *@Param:
    *@return:
    *@Author: Ivan Xin
    *@date: 28/12/2020
    */
    public BigDecimal mul(double v1,double v2){
        BigDecimal v11 = new BigDecimal(v1);
        BigDecimal v22 = new BigDecimal(v2);
        return v11.subtract(v22);
    }

    /**
    *@Description: 除法
    *@Param:
    *@return:
    *@Author: Ivan Xin
    *@date: 28/12/2020
    */
    public BigDecimal div(double v1,double v2){
        return div(v1,v2,location);
    }
    public BigDecimal div(double v1,double v2,int b){
        BigDecimal v11 = new BigDecimal(v1);
        BigDecimal v22 = new BigDecimal(v2);
        return v11.divide(v22,b,BigDecimal.ROUND_HALF_UP);
    }
}
