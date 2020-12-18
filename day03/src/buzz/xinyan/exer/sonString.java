package buzz.xinyan.exer;

import org.junit.Test;

/**
 * @descriptions: 返回两字符串的最大相同字串
 * @author: Ivan
 * @date: 2020/12/15 10:45
 * @version: 1.0
 */
public class sonString {

    public static void main(String[] args) {
        sonString s = new  sonString();
        String maxSameString = s.getMaxSameString("Ahello12", "werthelloyhasb");
        System.out.println(maxSameString);
    }
    private String getMaxSameString(String a,String b){
        String maxString = (a.length() >= b.length()) ? a : b;  //b
        String minString = (a.length() < b.length()) ? a : b;   //a

        for(int i = 0;i < minString.length();i++){
            for(int x= 0,y=minString.length()-i;y <= minString.length();x++,y++){
                String substring = minString.substring(x, y);
                if (maxString.contains(substring)){
                    return substring;
                }
            }
        }

        return null;
    }


    @Test
    public void textSubstring(){
        String a= "asas";
        String b= "qweqeasasdddda";

        String substring = a.substring(0, 4);

        System.out.println(substring);

    }
}
