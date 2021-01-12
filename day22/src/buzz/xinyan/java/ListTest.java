package buzz.xinyan.java;

import buzz.xinyan.exer.Person;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @descriptions: List接口的练习
 * @author: Ivan
 * @date: 2021/1/7 16:15
 * @version: 1.0
 */
public class ListTest {
    @Test
    public void test1(){
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(new Person("bavy",12));

        System.out.println(list);

        list.add(2,"baby");

        System.out.println(list);

        List strings = Arrays.asList(new String[]{"as","ss"});
        list.addAll(2,strings);

        System.out.println(list);
        System.out.println(list.size());

        System.out.println(list.get(4));

        System.out.println(list.indexOf("ss"));
    }

}
