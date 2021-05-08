package buzz.xinyan.exer;

import org.junit.Test;

import java.util.Date;

/**
 * @descriptions: 时间类测试
 * @author: Ivan
 * @date: 2021/5/8 11:39
 * @version: 1.0
 */
public class DateTimeTest {

    @Test
    public  void Test1(){
        long l = System.currentTimeMillis();

        System.out.println(l);

        Date date = new Date(162044525122l);

        System.out.println(date.toString());
    }
}
