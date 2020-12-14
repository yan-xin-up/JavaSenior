package buzz.xinyan.exer;

import java.util.Scanner;

/**
 * @descriptions: 模拟一个trim 方法，去除字符串两端的空格
 * @author: Ivan
 * @date: 2020/12/14 10:20
 * @version: 1.0
 */
public class trimexer {


    Scanner scan = new Scanner(System.in);
    String a =scan.next();

    public static void main(String[] args) {
        System.out.println("plesae enter");
        trimexer t = new trimexer();


        String w = t.a.trim();

        System.out.println(w);
    }

}
