package controller;

import bo.StudentInputter;
import bo.StudentManager;
import entity.Student;
import java.util.ArrayList;
import utils.ValidationAndNormalizingTextUtil;

public class StudentManagerController {

    private StudentInputter studentInputter;
    private StudentManager studentManager;

    public StudentManagerController() {
        studentManager = new StudentManager();
    }

    public Student inputStudent() throws Exception {
        studentInputter = new StudentInputter();
        Student s = studentInputter.getInformation();
        studentManager.addStudent(s);
        return s;
    }

    public void findAndSort() {
        String name = ValidationAndNormalizingTextUtil.normalFormName(ValidationAndNormalizingTextUtil.getNonEmptyString("Enter name wanna search: "));
        ArrayList<Student> find = studentManager.searchByName(name);
        if (find.isEmpty()) {
            System.err.println("List is empty");
        } else {
            for (Student student : find) {
                System.out.println(student);
            }
        }
    }

    public void updateOrDelete() throws Exception {
        String iD = ValidationAndNormalizingTextUtil.getStringByRegex("Enter ID: ", "ID must be in format SE[0-9]{6}", "SE[0-9]{6}");
        Student s = studentManager.getSearchStudentById(iD);
        int count = studentManager.countStudent(iD);
        if (ValidationAndNormalizingTextUtil.pressUDtoContinue("Do you want to update (U) or Delete (D) student: ")) {
            int choice = ValidationAndNormalizingTextUtil.getInt("Choose one of above record: ",
                    "Must input an integer number!",
                    "Must input an integer in range [" + 1 + "," + count + "]", 1, count);
            studentInputter = new StudentInputter();
            s = studentInputter.getInformation();
            if (studentManager.isConsistency(s.getId(), s.getName())) {
                if (!studentManager.getDuplicate(s)) {
                    studentManager.update(s, iD, count, choice);
                    System.out.println("Update Successfully!");
                    return;
                }
                throw new Exception("this record has been existed");
            }
            throw new Exception("this name is not consistency with code");
        } else {
            int choice = ValidationAndNormalizingTextUtil.getInt("Choose one of above record: ",
                    "Must input an integer number!",
                    "Must input an integer in range [" + 1 + "," + count + "]", 1, count);
            studentManager.delete(iD, count, choice);
            System.out.println("Delete Successfully!");
        }
    }

    public void getReport() {
        studentManager.report();
    }
}
