package ManagerAll;

import DTO.Grade;
import DTO.Student;
import DTO.Subject;
import Data.GetInputData;
import Data.Validation;
import Data.ValidationSubject;
import java.util.ArrayList;

public class ManagerGrade {

    public ArrayList<Grade> gradeList = new ArrayList<>();
    public ArrayList<Student> studentList = new ArrayList<>();
    public ArrayList<Subject> subjectList = new ArrayList<>();

    public void addGrade() {
        String ID;
        
        Student xxx;
        String subjectID;
        Subject yyy;
        do {
            ID = GetInputData.inputID("Enter Student ID: ", "ID must Exist in Database not Null", studentList, 2);
            xxx = Validation.searchAStudent(studentList, ID);
            if (xxx == null) {
                System.out.println("this student ID is not existed");
            }
        } while (Validation.searchAStudent(studentList, ID) == null);

        do {
            subjectID = GetInputData.inputFNLN("Enter Subject ID: ", "ID Not empty!");
            yyy = ValidationSubject.searchASubject(subjectList, subjectID);
            if (yyy == null) {
                System.out.println("this subject ID is not existed");
            }
        } while (ValidationSubject.searchASubject(subjectList, subjectID) == null);
        
    }
}
