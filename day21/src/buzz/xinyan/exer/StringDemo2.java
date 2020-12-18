package buzz.xinyan.exer;

import org.junit.Test;

/**
 * @descriptions: 两字符串的最大相同子串
 * @author: Ivan
 * @date: 2020/12/18 11:17
 * @version: 1.0
 */
//获取两个字符串中最大相同子串。比如：str1 = "abcwerthelloyuiodef“;str2="cvhellobnm"
// 提示：将短的那个串进行长度依次递减的子串与较长的串比较。//考虑单独数组
public class StringDemo2 {

    //适用于只有一个最大相同子串
    public String getMaxSameString(String mainStr, String subStr) {
        if (mainStr != null && subStr != null) {
            String max = (mainStr.length() >= subStr.length()) ? mainStr : subStr;//此处处理为谁先谁后无所谓
            String min = (mainStr.length() < subStr.length()) ? mainStr : subStr;
            int length = min.length();
            for (int i = 0; i < length; i++) {
                for (int x = 0, y = length - i; y <= length; x++, y++) {
                    String substring = min.substring(x, y);
                    if (max.contains(substring)) {
                        return substring;
                    }
                }
            }
        }

        return null;
    }

    //way-02
    public String[] getMaxSameSubString1(String str1, String str2) {
        if (str1 != null && str2 != null) {
            StringBuffer sBuffer = new StringBuffer();
            String maxString = (str1.length() > str2.length()) ? str1 : str2;
            String minString = (str1.length() > str2.length()) ? str2 : str1;

            int len = minString.length();
            for (int i = 0; i < len; i++) {
                for (int x = 0, y = len - i; y <= len; x++, y++) {
                    String subString = minString.substring(x, y);
                    if (maxString.contains(subString)) {
                        sBuffer.append(subString + ",");
                    }
                }
                System.out.println(sBuffer);
                if (sBuffer.length() != 0) {
                    break;
                }
            }
            String[] split = sBuffer.toString().replaceAll(",$", "").split("\\,");
            return split;
        }

        return null;
    }
    @Test
    public void DemoTest() {
        String mainStr = "abcwerthelloyuiodef";
        String subStr = "cvhellobnm";

        String maxSameString = getMaxSameString(mainStr, subStr);
        System.out.println(maxSameString);
    }
}
