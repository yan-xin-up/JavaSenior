package hexinjishu;

import com.sun.java.swing.action.NextAction;

/**
 * @author ivan
 * @create 2021-07-12 10:02 下午
 */
public class StaticTest4_3 {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("mikami", 8);
        staff[1] = new Employee("moe", 9);
        staff[2] = new Employee("yua", 6);

        for (Employee e : staff) {
            e.setId();
            System.out.println("name " + e.getName() + " id:" + e.getId() + "salary:" + e.getSalary());
        }
        int n = Employee.getNextId();
        System.out.println(("next available id= " + n));
    }
}

/**
 * 雇佣类
 */

class Employee {
    private static int nextId = 1;
    private String name;
    private double salary;
    private int id;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.id = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = nextId;
        nextId++;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void main(String[] args) {
        Employee e = new Employee("yui", 5.0);
        System.out.println(e.getName() + " " + e.getSalary() + "billion");
    }
}
