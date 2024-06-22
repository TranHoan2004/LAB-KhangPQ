package model;

import java.util.Objects;

/**
 *
 * @author nguye
 */
public class Worker {

    private String id;
    private String name;
    private int age;
    private double salary;
    private String workLocation;
    public static final String TIL_STRING = String.format("%5s | %-15s | %5s | %20s | %30s", "id", "name", "age", "salary", "workLocation");

    public Worker() {
    }

    public Worker(String id, String name, int age, double salary, String workLocation) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.workLocation = workLocation;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }

    @Override
    public String toString() {

        return String.format("%5s | %15s | %5d | %10.1f | %10s", id, name, age, salary, workLocation);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Worker other = (Worker) obj;
        return Objects.equals(id, other.id);
    }
}
