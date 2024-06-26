
package model;

import java.time.LocalDate;


public class SalaryHistory {

    private String id;
    private String name;
    private int age;
    private double updatesalary;
    private String status;
    private LocalDate date;
    public static final String TIL_UpDate = String.format("%5s | %-15s | %5s | %20s | %30s | %40s", "id", "name", "age", "salary", "status", "Date");

    public SalaryHistory() {
    }

    public SalaryHistory(String id, String name, int age, double updatesalary, String status, LocalDate date) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.updatesalary = updatesalary;
        this.status = status;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getUpdatesalary() {
        return updatesalary;
    }

    public void setUpdatesalary(double updatesalary) {
        this.updatesalary = updatesalary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return String.format("%s | %-8s | %2d | %-7.1f | %-4s | %-10s", id, name, age, updatesalary, status, date);
    }

}
