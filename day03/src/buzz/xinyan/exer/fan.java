package buzz.xinyan.exer;

import org.junit.Test;

/**
 * @program: JavaSenior
 * @description: 指定字符旋转
 * @author: ivan
 * @create: 2020-12-17 22:07
 */
public class fan {
    public String reverse(String str, int startIndex, int endIndex) {
        if (str != null && str.length() != 0) {
            char[] ch = str.toCharArray();
            for (int i = startIndex, j = endIndex; i < j; i++, j--) {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
            }
            return new String(ch);
        }
        return null;
    }
    //way02
    public String reverse1(String str,int startIndex,int endIndex){
        //1
        String TopString = str.substring(0, startIndex);
        //不成熟
//        StringBuilder MidString = new StringBuilder(str.substring(startIndex, endIndex+1));
//        StringBuilder reverse = MidString.reverse();
//        String MidDone = reverse.toString();
//        String EndString = str.substring(endIndex+1, str.length());
//        return TopString + MidDone+EndString;
        //2
        for(int i = endIndex;i >= startIndex;i-- ){
            TopString += str.charAt(i);
        }

        return TopString += str.substring(endIndex+1);

    }
    //way03  效率最高  根据多线程问题灵活切换。
    public String reverse2(String str,int startIndex,int endIndex){
        //1
        StringBuilder TopString = new StringBuilder(str.length());//创建StringBuilder的对象依据给定数组长度
        TopString.append(str.substring(0,startIndex));
        //2
        for(int i = endIndex;i >= startIndex; i--){
             TopString.append(str.charAt(i));
        }
        TopString.append(str.substring(endIndex+1));
    return  TopString.toString();
    }

    @Test
    public void Testre() {
        String str = "abcdefg";
        System.out.println(reverse(str, 2, 5));
        System.out.println(reverse1(str, 2, 5));
        System.out.println(reverse2(str, 2, 5));

    }
}

