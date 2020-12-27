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
        String str1 = new String("n");
        String str2 = new String("watchddncd");

        System.out.println(str2.lastIndexOf(str1));
        System.out.println(str2.lastIndexOf(str1,5));//-1
        System.out.println(str2.indexOf(str1,5));//7
        System.out.println(str2.length());

        System.out.println(str2.replace("ch", "ww"));
        System.out.println(str2.replace('d', 'c'));

    }
}
