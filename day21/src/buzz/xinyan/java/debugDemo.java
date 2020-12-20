package buzz.xinyan.java;

/**
 * @program: JavaSenior
 * @description: debug测试
 * @author: ivan
 * @create: 2020-12-20 20:07
 */
public class debugDemo {
    public static void main(String[] args) {
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        System.out.println(sb.length());
        System.out.println(sb);
        StringBuffer sb1 = new StringBuffer(str);
        System.out.println(sb1);
    }

}
