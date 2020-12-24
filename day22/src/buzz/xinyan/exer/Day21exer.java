package buzz.xinyan.exer;

import org.junit.Test;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @program: JavaSenior
 * @description: 21每日練習
 * @author: ivan
 * @create: 2020-12-22 21:57
 */
public class Day21exer {
    @Test
    public void Test21() {
//        String bir = "2017-08-06";
//        DateTimeFormatter Formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        TemporalAccessor parse = Formatter.parse(bir);
//        LocalDate localDate = LocalDate.parse(bir, Formatter);
//        Date date = Date.valueOf(localDate);
//        System.out.println(date);
//        String format = Formatter.format(parse);
//        System.out.println(format);

        Person[] s = new Person[5];
        s[0] = new Person("aa", 12);
        s[1] = new Person("ff", 12);
        s[2] = new Person("ff", 13);
        s[3] = new Person("ff", 14);
        s[4] = new Person("ff", 15);
//        Arrays.sort(s);
//        int [] a = new int[]{1,2,3};
//        System.out.println(a);
//        System.out.println(Arrays.toString(s));

        Comparator com = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Person && o2 instanceof Person) {
                    Person p1 = (Person) o1;
                    Person p2 = (Person) o2;
                    return -Double.compare(p1.getAge(), p2.getAge());

                }
                throw new RuntimeException("hhww");
            }
        };
        Arrays.sort(s, com);
        System.out.println(Arrays.toString(s));
        
    }
}
