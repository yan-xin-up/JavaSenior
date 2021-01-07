package buzz.xinyan.java;

import buzz.xinyan.exer.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * @program: JavaSenior
 * @description: iterator练习  增强for training
 * @author: ivan
 * @create: 2021-01-04 22:51
 */
public class IteratorTest {
    @Test
    public void Test1(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add("as");
        coll.add(new Person("tom",12));

        Iterator iterator = coll.iterator();
        //如果还未调用next()或在上一次调用 next 方法之后已经调用了 remove 方法，再调用remove都会报IllegalStateException。不可以删除两次）
        while (iterator.hasNext()){

            Object next = iterator.next();
            if("as".equals(next))
            iterator.remove();          //迭代时删除
//            iterator.remove();
        }
        iterator = coll.iterator();//再次调用迭代器
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for(Object o:coll){
            System.out.println(o);
        }

        String s[]=new String[]{"AA","AA"};
        for (String c:s){
            System.out.println(c);
        }
        int i[] = new int[]{1,2,3,4};
        for (int w:i){
            System.out.println(w);
        }
    }
}
