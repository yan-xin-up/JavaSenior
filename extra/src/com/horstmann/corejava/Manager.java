package com.horstmann.corejava;

/**
 * @className: Manager
 * @Description: 经理类
 * @version: v1.８.0
 * @author: ivan
 * @date: 2021/7/27 10:33 下午
 */
public class Manager extends Employee {
    private double bonus = 0;

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
    }

    public double getSalary(){
        double baseSalary = super.getSalary();
        double fullSalary = baseSalary + bonus;
        return fullSalary;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}