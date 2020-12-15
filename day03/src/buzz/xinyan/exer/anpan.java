package buzz.xinyan.exer;

import org.junit.Test;

import java.util.Date;

/**
 * @program: JavaSenior
 * @description: append
 * @author: ivan
 * @create: 2020-12-15 21:28
 */
public class anpan{

    @Test
    public void get(){
        StringBuffer q1 = new StringBuffer("abc12345");
        q1.append('w').append('e').append('r');

        System.out.println(q1);

        Date date = new Date(13333333l);

        System.out.println(date);
    }

}
