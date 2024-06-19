package ManagerAll;

import DTO.Subject;
import Data.GetInputData;
import Data.ValidationSubject;
import java.util.ArrayList;

public class SubjectManager {

    ArrayList<Subject> createSubjectList() {
        ArrayList<Subject> t = new ArrayList<>();
        return t;
    }

    public void inputSubject(ArrayList<Subject> t) {
        String subjectID;
        String subjectName;
        int credit;
        do {
            subjectID = GetInputData.inputFNLN("Enter Subject ID: ", "ID Not empty!");
        } while (ValidationSubject.isExist(t, subjectID) == true);
        subjectName = GetInputData.inputFNLN("Enter Subject name: ", "ID Not empty!");
        credit = GetInputData.inputChoice("Enter credit", 1, 24);
        t.add(new Subject(subjectID, subjectName, credit));
        System.out.println("Add new a student successfuly! ");
    }

    public void importData(ArrayList<Subject> t) {
        int n = GetInputData.inputChoice("How many subjects do you want to add: ", 1, 5);
        for (int i = 0; i < n; i++) {
            System.out.println("Subject " + (i + 1));
            inputSubject(t);
            System.out.println();
        }
        String choice;
        while (true) {
            choice = GetInputData.inputYorN("Do you want to continue (Y/N)? ", "Y", "N");
            if (choice.equalsIgnoreCase("Y")) {
                inputSubject(t);
            } else {
                break;
            }
        }
    }

    public void updateASubject(ArrayList<Subject> t, Subject xxx, String subjectID) {
        String newSubjectID;
        String newSubjectName;
        int newCredit;
        newSubjectID = GetInputData.inputFNLN("Enter New Subject ID: ", "ID Not empty!");
        xxx.setSubjectID(subjectID);
        newSubjectName = GetInputData.inputFNLN("Enter Subject name: ", "ID Not empty!");
        xxx.setSubjectName(newSubjectName);
        newCredit = GetInputData.inputChoice("Enter credit", 1, 24);
        xxx.setCredit(newCredit);
        System.out.println("Subject updating");
        xxx.toString();
        System.out.println("Update Succesfully!");
    }

    public void deleteASubject(ArrayList<Subject> t, Subject xxx, String subjectID) {
        String choice = GetInputData.inputYorN("Do you wanna delete this subject (Y) or (N)", "Y", "N");
        if (choice.equalsIgnoreCase("Y")) {
            for (int i = 0; i < t.size(); i++) {
                if (t.get(i).getSubjectID().equals(subjectID)) {
                    t.remove(i);
                    break;
                }
            }
            xxx.toString();
            System.out.println("Delete Succefully!!");
        } else {
            return;
        }
        System.out.println();
    }

    public void updateOrDelete(ArrayList<Subject> t) {
        String subjectID;
        Subject xxx;
        do {
            subjectID = GetInputData.inputFNLN("Enter New Subject ID: ", "ID Not empty!");
            xxx = ValidationSubject.searchASubject(t, subjectID);
            if (xxx == null) {
                System.out.println("this subject ID is not existed");
            }
        } while (ValidationSubject.searchASubject(t, subjectID) == null);
        xxx.toString();
        String choice = GetInputData.inputYorN("Do you wanna UPDATE (U) or DELETE (D)", "U", "D");
        if (choice.equalsIgnoreCase("U")) {
            updateASubject(t, xxx, subjectID);
        } else {
            deleteASubject(t, xxx, subjectID);
        }
    }
}
