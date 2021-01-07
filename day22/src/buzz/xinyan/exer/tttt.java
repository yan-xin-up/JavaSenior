package buzz.xinyan.exer;

import org.junit.Test;

/**
 * @program: JavaSenior
 * @description:
 * @author: ivan
 * @create: 2020-12-24 23:23
 */
class tttt1 {

    public static void main(String[] args) {
        String subStr = "abc";
        String mainStr = "abcdeabc";
        tttt1 t = new tttt1();

        System.out.println(t.Times(subStr, mainStr));
    }

    public int Times(String subStr, String mainStr) {
        int subLength = subStr.length();
        int mainLength = mainStr.length();
        int index = 0;
        int count = 0;
        if (mainLength >= subLength) {
//            while ((index = mainStr.indexOf(subStr)) != -1) {
//                mainStr = mainStr.substring(index+subLength);
////                System.out.println(mainStr);
//                count++;
//            }
//
            while ((index = mainStr.indexOf(subStr, index)) != -1) {
                count++;
                index += subLength;

            }

            }


        return count;

    }
}
public class tttt {
    @Test
    public void t(){
        String a = "b";
        String b = "aabbaaff";
        int length = b.length();
        String mainStr = b.substring(1,length);
        System.out.println(mainStr);
        System.out.println(b.indexOf(a, 4));
    }
}