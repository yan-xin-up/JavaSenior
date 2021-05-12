package buzz.xinyan.exer;

import org.junit.Test;

/**
 * @descriptions: 模仿Trim方法去除字符串两端空格
 * @author: Ivan
 * @date: 2021/5/7 11:01
 * @version: 1.0
 */

public class Trimcopy {

    public static void main(String[] args) {
//        String str = new String(" "+"AS");
////        System.out.println(str.trim());
//        System.out.println(str.charAt(0));
////        System.out.println(str.charAt(1));
        ae a = new ae("nmb",12);
        System.out.println(a);
    }

    @Test
    public void Trim1() {
        String str = new String(" abv123");
        if (str!= null) {
            int st = 0;                 //首位
            int len = str.length();
            char[] chars = str.toCharArray();
            while ((st < len) && (chars[st] == ' ')) {
                st++;
            }
            while ((st < len) && (chars[len-1] == ' ')) {
                len--;
            }
            System.out.println(st);
            System.out.println(len);

            System.out.println(str.substring(st, len));
        }
    }

    @Test
    public void test11(){

    }
}

class ae{
    String a;
    int age;

    public ae(String a, int age) {
        this.a = a;
        this.age = age;
    }


    public String toString() {
        return "ae{" +
                "a='" + a + '\'' +
                ", age=" + age +
                '}';
    }

//    public String show() {
//        return  a+age;
//    }
}
