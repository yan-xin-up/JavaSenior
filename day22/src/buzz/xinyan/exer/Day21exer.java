package buzz.xinyan.exer;

import org.junit.Test;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Arrays;

/**
 * @program: JavaSenior
 * @description: 21每日練習
 * @author: ivan
 * @create: 2020-12-22 21:57
 */
public class Day21exer {
    @Test
    public void Test21(){
        String bir = "2017-08-06";
        DateTimeFormatter Formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        TemporalAccessor parse = Formatter.parse(bir);
        LocalDate localDate = LocalDate.parse(bir, Formatter);
        Date date = Date.valueOf(localDate);
        System.out.println(date);
        String format = Formatter.format(parse);
        System.out.println(format);

        Person [] s =new Person[2];
        s[0] = new Person("aa",12);
        s[1] = new Person("ff",12);
        Arrays.sort(s);
        int [] a = new int[]{1,2,3};
        System.out.println(a);
        System.out.println(Arrays.toString(s));
    }
}
