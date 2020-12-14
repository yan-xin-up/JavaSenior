package buzz.xinyan.java;

import org.junit.Test;

/**
 * @program: JavaSenior
 * @description: String类测试
 * @author: ivan
 * @create: 2020-12-10 20:29
 */
public class StringTest {
    @Test
    public void  test1(){
        String a1 = "javaEE";
        String a2 = "javaEE";

        String a3 = new String("javaEE");
        String a4 = new String("javaEE");
        String a5 = a1.toLowerCase();
        System.out.println(a1);
        System.out.println(a5);

        System.out.println(a1 == a2);
        System.out.println(a2 == a3);
        System.out.println(a3 == a4);


    }


    @Test
    public void Test2(){
        String a1 = "全中国最帅";

        String a2 = new String("东京第一帅逼");

        String replace = a1.replace('帅','美');

        System.out.println(replace);
        System.out.println(a1);

        String replace1 = a2.replace("东京", "关西");

        System.out.println(a2);
        System.out.println(replace1);

    }
}
