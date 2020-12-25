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
    public void Test22(){
        String str1 = new String("d");
        String str2 = new String("watchddd");

        System.out.println(str2.lastIndexOf(str1));
        System.out.println(str2.lastIndexOf(str1,8));
        System.out.println(str2.length());

        System.out.println(str2.replace("ch", "ww"));
        System.out.println(str2.replace('d', 'c'));

    }
}
