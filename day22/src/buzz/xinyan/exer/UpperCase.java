package buzz.xinyan.exer;

import java.util.Scanner;

/**
 * @descriptions: 请编写一个 Application 实现如下功能：接受命令行中给出的一个字母串，先将该串原样输出，
 * 然后判断该串的第一个字母是否为大写，若是大写则统计该串中大写字母的个数，并将所有大写字母输出；
 * 否则输出信息串”第一个字母不是大写字母!”。
 * @author: Ivan
 * @date: 2020/12/28 15:19
 * @version: 1.0
 */
public class UpperCase {
    public static void main(String[] args) {
        System.out.println("请输入任意字母串：");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(str);
        UpperCase U = new UpperCase();
        U.Upper(str);
        System.out.println("*************************");
        System.out.println(str);
        U.Upper2(str);

    }

    public void Upper(String Str) {
        int count = 0;
        char[] charstr = Str.toCharArray();
        boolean upperCase = Character.isUpperCase(charstr[0]);
        if(upperCase) {
            for (int i = 0; i < charstr.length; i++) {
                if (Character.isUpperCase(charstr[i])) {
                    System.out.println(charstr[i]);
                    count++;
                }
            }
        }else{
            throw new RuntimeException("第一个字母不是大写字母!");
        }

        System.out.println("大写字母的数量为"+count);
    }

    public void Upper2 (String Str) {
        int count = 0;
        char[] charstr = Str.toCharArray();

        if((int)Str.charAt(0)>=65&&(int)Str.charAt(0)<=90){
            for (int i = 0; i < charstr.length; i++) {
                if (Character.isUpperCase(charstr[i])) {
                    System.out.print(charstr[i]);
                    count++;
                }
            }
        }else{
            throw new RuntimeException("第一个字母不是大写字母!");
        }
        System.out.println("大写字母的数量为"+count);
    }



}
