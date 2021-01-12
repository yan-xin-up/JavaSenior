package buzz.xinyan.exer;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @program: JavaSenior
 * @description: List接口面试题
 * @author: ivan
 * @create: 2021-01-12 21:38
 */
public class ListExer {
    /*
    区分list中的remove(int index)和 remove(Object obj)
    * */
     @Test
    public void testListRemove(){
         ArrayList list = new ArrayList();
         list.add(1);
         list.add(2);
         list.add(3);
         updateList(list);
         System.out.println(list);

     }

    private void updateList(ArrayList list) {
//         list.remove(new Integer(2));    if dele the number need make a new Integer object
         list.remove(2);       //this dele index number
    }
}
