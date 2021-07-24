package com.horstmann.corejava;
import static java.lang.System.*;
/**
 * @author ivan
 * @create 2021-07-25 12:51 上午
 */
public class PackageTest {
    public static void main(String[] args) {
        Employee harry = new Employee("harry", 50000, 1999, 9, 28);

        harry.raiseSalary(10);
        out.println("name: "+ harry.getName()+"salary: "+harry.getSalary());
    }
}
