package buzz.xinyan.exer;

/**
 * @descriptions: 获取一个字符串在另一个字符串中出现的次数
 * @author: Ivan
 * @date: 2021/5/19 12:57
 * @version: 1.0
 */
public class StringDemo2 {
    /**
     * 比如：获取
     * “ ab 在 abkkcadkabkebfkabkskab ” 中 出现的次数
     *
     * @param main
     * @param str
     * @return
     */
    public int getTimes(String main, String str) {
        int mainlength = main.length();
        int strlength = str.length();
        int count = 0;                          //字符出现的次数
        int index = 0;
        if (mainlength >= strlength) {         //前提条件 长字符串长度大于短字符串
            while ((index = main.indexOf(str)) != -1) {             //循环操作，计算字符出现的次数。
                count++;
                main = main.substring(index + strlength);
            }
            return count;
        }
        return 0;

    }

    public static void main(String args[]) {
        String main = new String("abkkcadkabkebfkabkskab");
        String str = new String("ab");
        StringDemo2 stringDemo2 = new StringDemo2();
        System.out.println(stringDemo2.getTimes(main, str));
    }
}
