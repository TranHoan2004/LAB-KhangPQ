package GUI;

import DTO.Student;
import ManagerAll.ManagerStudent;
import java.util.ArrayList;




public class Main {

    public static void main(String[] args) {
        ManagerStudent ms = new ManagerStudent();
        ArrayList<Student> t = ms.createStudentList();
        ms.addStudent(t);
        ms.updateOrDeleteStudent(t);
        ms.printStudent(t);
    }
}
