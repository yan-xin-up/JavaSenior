package buzz.xinyan.exer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: JavaSenior
 * @description: SimpleDateFormat练习 将字符串转换为sql下的date
 * @author: ivan
 * @create: 2020-12-20 21:23
 */
public class DatTestSdf {


    public static void main(String[] args) throws ParseException {
        String bir = "2020--09-08";
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = date.parse(bir);
        System.out.println(parse);
        java.sql.Date BitrhDate = new java.sql.Date(parse.getTime());

        System.out.println(BitrhDate);
    }


}
