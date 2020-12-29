package buzz.xinyan.exer;

import java.util.Scanner;

/**
 * @descriptions: 模拟一个trim方法，去除字符串两端的空格。
 * @author: Ivan
 * @date: 2020/12/29 9:02
 * @version: 1.0
 */
public class exer5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入字符序列:");
        String next = scan.next();
        exer5 R = new exer5();
        System.out.println(R.myTrim(next));
    }

    public String myTrim(String str){
        int start = 0 ;// 用于记录从前往后首次索引位置不是空格的位置的索引
        int end = str.length()-1;// 用于记录从后往前首次索引位置不是空格的位置的索引

        if(str != null){
            while(start < end&&str.charAt(0)==' '){
                start++;
            }
            while (start < end&&str.charAt(end)==' '){
                end--;
            }
            return str.substring(start,end+1);
        }
        return null;
    }
}
