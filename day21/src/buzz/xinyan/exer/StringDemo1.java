package buzz.xinyan.exer;

import org.junit.Test;

/**
 * @descriptions: 返回子串在父串中出现的次数
 * @author: Ivan
 * @date: 2020/12/18 10:01
 * @version: 1.0
 */
//获取一个字符串在另一个字符串中出现的次数。
//比如：获取
//“ ab 在 abkkcadkabkebfkabkskab ” 中 出现的次数
public class StringDemo1 {

    public int getCount(String mainStr, String subStr) {

        int mainlength = mainStr.length();
        int sublength = subStr.length();
        int count = 0;
        int index = 0;
        if (mainlength >= sublength) {
            //way 01
//            while ((index = mainStr.indexOf(subStr)) != -1) {
//                mainStr = mainStr.substring(index + subStr.length());
//                count++;
//            }
            //way02
            while ((index = mainStr.indexOf(subStr,index)) != -1) {
                count++;
                index += sublength;
            }

        }

        return count;
    }

    @Test
    public void testW() {
        String mainStr = "abkkcadkabkebfkabkskab";
        String subStr = "ab";
        int count = getCount(mainStr, subStr);
        System.out.println(count);
    }
}
