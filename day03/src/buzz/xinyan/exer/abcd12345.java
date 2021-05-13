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
    public void Testabc(){
        String s = new String("abcd12345");
        String sb = new String();
        String substring = s.substring(1, 8);
        System.out.println(substring);

        char[] chars = substring.toCharArray();
        for(int i = chars.length-1; i >= 0; i--){
            sb +=chars[i];
        }
        System.out.println(sb);
        System.out.println(s.substring(0, 1)+ sb + s.substring(8, 9));


    }
}