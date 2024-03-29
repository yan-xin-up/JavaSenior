package buzz.xinyan.exer;

import org.junit.Test;

/**
 * @descriptions: 反转a4321dcb5
 * @author: Ivan
 * @date: 2021/5/13 9:20
 * @version: 1.0
 */
public class abcd12345 {

    @Test
    public void Testabc() {
        String s = new String("abcd12345");
        String sb = new String();
        String substring = s.substring(1, 8);
        System.out.println(substring);

        char[] chars = substring.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            sb += chars[i];
        }
        System.out.println(sb);
        System.out.println(s.substring(0, 1) + sb + s.substring(8, 9));


    }

    public static void main(String[] args) {
        bcder b = new bcder();
//        System.out.println(b.Test2("abcd12345", 1, 7));
        System.out.println(b.TestReverse("abcd12345", 1, 7));
    }


}

class bcder {

    public String TestReverse(String str, int st, int end) {

        StringBuilder Str1 = new StringBuilder(str.length());        //此处预先设置Str字符的长度 避免后期扩容
        if (str != null) {
            Str1.append(str.substring(0, st));
            for (int x = end; x >= st; x--) {
                Str1.append(str.charAt(x));
            }
            Str1.append(str.substring(end+1));
            return Str1.toString();
        }
        return null;
    }

    public String Test2(String str, int st, int end) {
        if (str != null && str.length() != 0) {
            char[] chars = str.toCharArray();

            for (; st < end; st++, end--) {
                char temp;
                temp = chars[end];
                chars[end] = chars[st];
                chars[st] = temp;
            }
            return new String(chars);
        }
        return null;
    }
}