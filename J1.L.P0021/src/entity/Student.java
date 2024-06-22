package entity;

public class Student {

    private String id;
    private String name;
    private int semester;
    private Course course;

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Student() {
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

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

   
    @Override
    public String toString() {
        return String.format("%-15s%-15s%-15d%s", id, name, semester, course);
    }

}
