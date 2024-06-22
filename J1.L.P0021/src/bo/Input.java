package bo;

import entity.Course;
import entity.Student;
import utils.Validation;

public class Input {

    private final Student s;

    public Input() {
        s = new Student();
    }

    public Student getInformation() {
        s.setId(Validation.getStringByRegex("Enter ID: ", "ID must be in format SE[0-9]{6}", "SE[0-9]{6}"));
        s.setName(Validation.normalFormName(Validation.getNonEmptyString("Enter name: ")));
        s.setSemester(Validation.getInt("Enter semester: ", "Must be a number", "Must in range [1,9]", 1, 9));
        int course = Validation.getInt("1. Java\n"
                + "2. C/C++\n"
                + "3. .Net\n"
                + "Enter course: ", "Must be a number", "Must in range [1,3]", 1, 3);
        Course c = Course.C_Cpp;
        s.setCourse(c.getCourse(course)); 
        return s;
    }

}
