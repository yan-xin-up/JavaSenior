package buzz.xinyan.exer;

/**
 * @descriptions: 将一个字符串进行反转.将字符串中指定部分进行反转 。比如 abcdefg 反 转为 abfedcg
 * @author: Ivan
 * @date: 2020/12/14 13:36
 * @version: 1.0
 */


public class fanTest {


    public static void main(String[] args) {
////        System.out.println("请输入需要反转的字符");
            fanTest f = new fanTest();
////        System.out.println("请输入从第几个字符串开始反转：");
//        Scanner sc = new Scanner(System.in);
//        int startIndex =sc.nextInt();
////        i=i-1;
////        System.out.println("请输入从第几个字符串开始反转：");
//        int endIndex = sc.nextInt();
//        String s = "abcdefg";
//        char[] chars = s.toCharArray();
//        for(int i = 0;i < chars.length;i++){
//            if(i>=startIndex && i <= endIndex){
//                for(int j = startIndex;j;)
//            }
//            System.out.println(chars[i]);
//        }
//        System.out.println(s);
        String ss = f.res("abcdefg", 2, 6);
        System.out.println(ss);

    }


    public String res(String s,int startIndex,int endIndex) {
        endIndex = endIndex-1;
        if(s != null && s.length()!=0){
            char[] sw = s.toCharArray();
            for(int i = startIndex,j = endIndex;i<j;i++,j--){
                char temp = sw[i];
                sw[i]=sw[j];
                sw[j]=temp;
            }
          return new String(sw);
        }
        return null;
    }
}
