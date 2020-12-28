package buzz.xinyan.exer;

import java.util.Scanner;

/**
 * @program: JavaSenior
 * @description: 字符串前后反转
 * @author: ivan
 * @create: 2020-12-28 21:02
 */
public class reverseTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入字符序列:");
        String next = scan.next();
        reverseTest R = new reverseTest();
        R.Reverse(next);
        System.out.println("*******");
        R.Reverse1(next);

    }
    public void Reverse(String s){
        int count = 0;
        char[] cha = s.toCharArray();
        for(int i = cha.length - 1;i >= 0;i--){
            count++;
            System.out.print(cha[i]);
        }
        System.out.println();
        System.out.println(count);
    }

    /**
    *@Description:
    *@Param:
    *@return:
    *@Author: your name
    *@date: 28/12/2020
    */
    public void Reverse1(String s){
        StringBuilder sb = new StringBuilder(s);
        StringBuffer sb1 = new StringBuffer(s);

        StringBuffer reverse = sb1.reverse();
        System.out.println(reverse);
    }

}
