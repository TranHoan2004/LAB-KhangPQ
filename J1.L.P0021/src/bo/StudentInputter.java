package bo;

import entity.Course;
import entity.Student;
import utils.ValidationAndNormalizingTextUtil;

public class StudentInputter {

    private Student s;

    public StudentInputter() {
        s = new Student();
    }

    public Student getStudent() {
        return s;
    }

    public Student getInformation() {
        s.setId(ValidationAndNormalizingTextUtil.getStringByRegex("Enter ID: ", "ID must be in format SE[0-9]{6}", "SE[0-9]{6}"));
        s.setName(ValidationAndNormalizingTextUtil.normalFormName(ValidationAndNormalizingTextUtil.getNonEmptyString("Enter name: ")));
        s.setSemester(ValidationAndNormalizingTextUtil.getInt("Enter semester: ", "Must be a number", "Must in range [1,9]", 1, 9));
        int course = ValidationAndNormalizingTextUtil.getInt("1. Java\n"
                + "2. C/C++\n"
                + "3. .Net\n"
                + "Enter course: ", "Must be a number", "Must in range [1,3]", 1, 3);
        Course c = Course.C_Cpp;
        if (course == 1) {
            c = Course.Java;
        } else if (course == 3) {
            c = Course.Net;
        }
        s.setCourse(c);
        return s;
    }

}
