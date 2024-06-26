package entity;

public class Worker {

    private String ID;
    private String name;
    private int age;
    private double salary;
    private String workLocation;
    public static final String TI_STRING = String.format("%-5s%-15s%-5s%-10s%-10s%-20s\n", "Code", "Name", "Age",
                "Salary", "Status", "Date");

    public Worker() {
    }

    public Worker(String ID, String name, int age, double salary, String workLocation) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.workLocation = workLocation;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
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
        return String.format("%-5s%-15s%-5d%10.1f%15s", ID, name, age, salary, workLocation);
    }

}
