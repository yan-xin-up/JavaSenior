package buzz.xinyan.java;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: JavaSenior
 * @description: 使用SimpleDateFormat对日期进行格式化和解析
 * @author: ivan
 * @create: 2020-12-20 20:49
 */
public class DateTimeTest {
    @Test
    public void SdfTest() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat();

        Date date = new Date();
        System.out.println(date);
        String format = sdf.format(date);
        System.out.println(format);

        SimpleDateFormat date1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format1 = date1.format(date);
        System.out.println(format1);
        //解析 要求字符串 符合sdf的识别格式（构造器的默认参数）
        //否则就会抛出异常
        Date parse = date1.parse(format1);
        System.out.println(parse);



        //日历类
//        calender.getInstance();

    }
}
