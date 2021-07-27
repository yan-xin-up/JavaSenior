package com.horstmann.corejava;

/**
 * @className: ManagerTest
 * @Description: TODO
 * @version: v1.８.0
 * @author: ivan
 * @date: 2021/7/27 10:55 下午
 */
public class ManagerTest {

    public static void main(String[] args) {

        Manager boss = new Manager("mikami_yua",90000,1993,9,12);
        boss.setBonus(9000);

        Employee[] staff =new Employee[3];
         staff[0] = boss;
         staff[1] = new Employee("moe",50000,1999,5,4);
         staff[2] = new Employee("aragaki",30000,1993,5,4);

        for(Employee e : staff)
            System.out.println("Name = "+e.getName()+ ",salary = "+e.getSalary()+".");
    }
}