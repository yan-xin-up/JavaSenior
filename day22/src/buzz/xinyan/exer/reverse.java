package buzz.xinyan.exer;

/**
 * @descriptions: 将一个字符串进行反转。将字符串中指定部分进行反转。比如将“abcdefg”反转为”abfedcg
 * @author: Ivan
 * @date: 2020/12/30 9:30
 * @version: 1.0
 */
public class reverse {
    public static void main(String[] args) {
        reverse reverse = new reverse();
        String ii ="abcdefg";
        int i = 2;
        int j = 5;
        reverse.Rev(ii,i,j);
    }
    /**
     * @descriptions 功能描述 
     * @author 
     * @date 2020/12/30 9:35
     
     * @return 
     */
    public void Rev(String str,int i,int j){
        String substring = str.substring(i, j + 1);
        StringBuffer stringBuffer = new StringBuffer(str.substring(0, i));
        stringBuffer.append(new StringBuffer(str.substring(i, j + 1)).reverse());
        stringBuffer.append(str.substring(j + 1, str.length()));

        System.out.println(stringBuffer.toString());

    }
}
