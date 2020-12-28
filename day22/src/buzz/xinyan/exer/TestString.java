package buzz.xinyan.exer;

import org.junit.Test;

/**
 * @descriptions: 测试
 * @author: Ivan
 * @date: 2020/12/25 16:30
 * @version: 1.0
 */
public class TestString {
    @Test
    public void Test22() {
//        String str1 = new String("n");
//        String str2 = new String("watchddncd");
//
//        System.out.println(str2.lastIndexOf(str1));
//        System.out.println(str2.lastIndexOf(str1,5));//-1
//        System.out.println(str2.indexOf(str1,5));//7
//        System.out.println(str2.length());
//
//        System.out.println(str2.replace("ch", "ww"));
//        System.out.println(str2.replace('d', 'c'));

//        String sb = "good";
//        s +="student";
//        char c = s[1];
//       int len = s .length;
//        String t = s.toLowerCase( );
//        System.out.println(t);
        String s1[] = new String[5];
//        String s[ ]={" ", " ", " ", " ", " "};
        String s[] = new String[5];
        for (int i = 0; i < 5; s[i++] = "") ;
//        for(int i=0;i<5;s[i++]=" "){
//            System.out.println(s.toString());
//        };
        System.out.println(s[1]);
        System.out.println(s1[1]);


    }


    @Test

    public void Te1r(){
        ////如何将String类型转化Number类型？举例说明String str = “123”;
        String str = "123";
        int i = Integer.parseInt(str);
        StringBuilder str1 = new StringBuilder("ab2ccde");
        System.out.println(str1.delete(2, 4));
    }
}

