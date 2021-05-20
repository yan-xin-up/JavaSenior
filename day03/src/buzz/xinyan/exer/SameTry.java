package buzz.xinyan.exer;

import java.sql.SQLOutput;

/**
 * @descriptions: str1 = 获取两个字符串中最大相同子串。比如："abcwerthelloyuiodef“;str2 = " cvhellobnm
 * @author: Ivan
 * @date: 2021/5/20 9:41
 * @version: 1.0
 */
public class SameTry<i> {

        public String getSameString(String str1, String str2) {
        String maxStr = (str1.length() > str2.length()) ? str1 : str2;
        String minStr = (str1.length() <= str2.length()) ? str1 : str2;
        int length = minStr.length();
        for (int i = 0; i < length; i++) {
            for (int x = 0, y = length-i ;  y <=length; x++, y++) {
                String subStr = minStr.substring(x, y);
                System.out.println(subStr);
                if (maxStr.contains(subStr)) {
                    return subStr;
                }
            }
        }
        return null;
    }
//    public void getSameString() {
//        StringBuilder stb1 = new StringBuilder("abcwerthelloyuiodef");
//
//        StringBuilder stb2 = new StringBuilder("cvhelloyubnm");
//
//        StringBuilder stb3 = new StringBuilder("");
//        //i为截取的第一个下标，j为截取的最后下标
//        for (int i = 0; i < stb2.length(); i++) {
//            //java中是左闭右开的，所有截取的最后下标要加1
//            for (int j = i + 1; j < stb2.length() + 1; j++) {
//                String stb4 = stb2.substring(i, j);
//                System.out.println(stb4);
//                //使用indexOf获取子串在字符串中的下标，
//                //下标不等于-1，说明子串存在，等于-1，说明字符串中没有该子串
//                if (stb1.indexOf(stb4) != -1) {
//                    //定义第三空字符串，当子串的长度大于空串，
//                    if (stb4.length() > stb3.length()) {
//                        stb3.replace(0, stb3.length(), stb4);
//                    } else {
//                        System.out.println(stb3);
//                    }
//                    System.out.println("两个字符串中，最大的子串为：" + stb3);
//
//                }
//
//            }
//        }
//    }

    public static void main(String[] args) {
        SameTry sameTry = new SameTry();
        String sameString = sameTry.getSameString("abcwerthelloyuiodef", "cvhellobnm");
        System.out.println(sameString);
    }
}