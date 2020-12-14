package buzz.xinyan.exer;

/**
 * @program: JavaSenior
 * @description: 一道面试题
 * @author: ivan
 * @create: 2020-12-10 22:14
 */
public class StringTest {

    String str = new String("good");
    char[] ch = {'t','e','s','t'};

    public void change(String str,char ch[]){
        str = "test ok";
        ch[0] = 'b';
    }
    public static void main(String[] args) {
        StringTest ts = new StringTest();
        ts.change(ts.str, ts.ch);
        System.out.println(ts.str);
        System.out.println(ts.ch);


    }
}
