package com.horstmann.corejava;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @className: ManagerTestErrorExample
 * @Description: TODO
 * @version: v1.８.0
 * @author: ivan
 * @date: 2021/7/29 11:11 下午
 */
public class ManagerTestErrorExample {
    public static void main(String[] args) {

        Manager[] managers = new Manager[2];
        Employee[] staff =managers;//多态   创建数组的元素类型为Employee
        staff[0] = new Employee("w",1,1898,2,1);
        managers[0].setBonus(9);                    //managers[]是employee[0]为同一个对象，
                                                // 此时staff对象无法调用奖金方法会报ArrayStoreException错误
//所有数组要牢记创建他们的元素类型并且将类型兼容的引用存储到数组中
        for(Employee e : managers)
            System.out.println("Name = "+e.getName()+ ",salary = "+e.getSalary()+".");
    }
}