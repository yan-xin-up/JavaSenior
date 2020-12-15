package buzz.xinyan.exer;

/**
 * @program: JavaSenior
 * @description: 获取一个字符串在另一个字符串出现的次数
 * @author: ivan
 * @create: 2020-12-14 21:54
 */
public class numberOfString {
    public static void main(String[] args) {
        numberOfString s = new numberOfString();
        s.numOfT("wasertyhasbas","as");
    }

    public void numOfT(String s,String b){

        int count = 0;
        while(true){
            int index = s.indexOf(b);
            System.out.println(index);
            if(index != -1){        //注：indexOf 和 lastIndexOf 方法如果未找到都是返回-1
                count++;
                s = s.substring(index + 1);
            }else{
                break;
            }

        }
        System.out.println(count);
    }

}
