
package DTO;

import java.time.LocalDate;

public class SalaryHistory {
    private String ID;
    private String name;
    private int age;
    private double updateSalary;
    private String Status;
    private LocalDate DATE;

    public SalaryHistory() {
    }

    
    public SalaryHistory(String ID, String name, int age, double updateSalary, String Status, LocalDate DATE) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.updateSalary = updateSalary;
        this.Status = Status;
        this.DATE = DATE;
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

    public double getUpdateSalary() {
        return updateSalary;
    }

    public void setUpdateSalary(double updateSalary) {
        this.updateSalary = updateSalary;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public LocalDate getDATE() {
        return DATE;
    }

    public void setDATE(LocalDate DATE) {
        this.DATE = DATE;
    }
    
    @Override
    public String toString() {
        return String.format("%s  | %8s | %2d  | %-7.1f | %-4s  | %-10s", ID, name, age,updateSalary ,Status,DATE);
    }
}
