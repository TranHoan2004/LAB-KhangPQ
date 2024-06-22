package controller;

import bo.Input;
import bo.Manager;
import entity.Student;
import java.util.ArrayList;
import utils.Validation;

public class Controller {

    private Input studentInputter;
    private Manager studentManager;

    public Controller() {
        studentManager = new Manager();
    }

    public Student inputStudent() throws Exception {
        studentInputter = new Input();
        Student s = studentInputter.getInformation();
        studentManager.addStudent(s);
        return s;
    }

    public ArrayList<Student> findAndSort() throws Exception {
        String name = Validation.normalFormName(Validation.getNonEmptyString("Enter name wanna search: "));
        ArrayList<Student> find = studentManager.searchByName(name);
        if (!find.isEmpty()) {
            return find;
        }
        throw new Exception("List is empty");
    }

    public void updateOrDelete() throws Exception {
        String iD = Validation.getStringByRegex("Enter ID: ", "ID must be in format SE[0-9]{6}", "SE[0-9]{6}");
        Student s = studentManager.getSearchStudentById(iD);
        int count = studentManager.countStudent(iD);
        if (Validation.pressUDtoContinue("Do you want to update (U) or Delete (D) student: ")) {
            int choice = Validation.getInt("Choose one of above record: ",
                    "Must input an integer number!",
                    "Must input an integer in range [" + 1 + "," + count + "]", 1, count);
            studentInputter = new Input();
            s = studentInputter.getInformation();
            if (studentManager.isConsistency(s.getId(), s.getName())) {
                if (!studentManager.getDuplicate(s)) {
                    studentManager.update(s, iD, count, choice);
                    System.out.println("Update Successfully!");
                    return;
                }
            }
            throw new Exception("this name is not consistency with code");
        } else {
            int choice = Validation.getInt("Choose one of above record: ",
                    "Must input an integer number!",
                    "Must input an integer in range [" + 1 + "," + count + "]", 1, count);
            studentManager.delete(iD, count, choice);
            System.out.println("Delete Successfully!");
        }
    }

    public void getReport() throws Exception {
        studentManager.report();
    }

    public ArrayList<Student> getList() {
        return studentManager.getAllList();
    }
}
