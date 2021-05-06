package buzz.xinyan.exer;

/**
 * @author shkstart abc123反转 a21cb3
 * @create 2021-05-06 11:26 下午
 */
public class abc123 {
    public static void main(String[] args) {
        int i;
        String s ="";
        String src = new String("abc123");
        String src1 = src.substring(1, 5);
        char[] chars = src1.toCharArray();
        for (i = chars.length-1;i >= 0;i--){
            s += chars[i];
        }
        String s1 = new String(src.substring(0, 1) + s + src.substring(5, 6));
        System.out.println(s);
        System.out.println(s1);
    }
}
