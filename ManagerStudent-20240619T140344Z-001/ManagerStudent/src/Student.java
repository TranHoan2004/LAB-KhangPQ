
public class Student {

    private String ID;
    private String name;
    private int semester;
    private String courseName;

    public Student() {
    }

    public Student(String ID, String name, int semester, String courseName) {
        this.ID = ID;
        this.name = name;
        this.semester = semester;
        this.courseName = courseName;
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

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return String.format("%-15s | %-2d | %-5s", name, semester, courseName);
    }

    public String display() {
        return String.format("%-8s | %-15s | %-2d | %-5s", ID, name, semester, courseName);
    }
}
