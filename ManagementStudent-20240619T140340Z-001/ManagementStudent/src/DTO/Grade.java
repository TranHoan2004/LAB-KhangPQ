
package DTO;


public class Grade {
    private String ID;
    private String name;
    private String subjectName;
    //Labs, Progress tests, Final exam
    private double Lab;
    private double PT;
    private double FE;

    public Grade(String ID, String name, String subjectName, double Lab, double PT, double FE) {
        this.ID = ID;
        this.name = name;
        this.subjectName = subjectName;
        this.Lab = Lab;
        this.PT = PT;
        this.FE = FE;
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

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public double getLab() {
        return Lab;
    }

    public void setLab(double Lab) {
        this.Lab = Lab;
    }

    public double getPT() {
        return PT;
    }

    public void setPT(double PT) {
        this.PT = PT;
    }

    public double getFE() {
        return FE;
    }

    public void setFE(double FE) {
        this.FE = FE;
    }
    
    
}
