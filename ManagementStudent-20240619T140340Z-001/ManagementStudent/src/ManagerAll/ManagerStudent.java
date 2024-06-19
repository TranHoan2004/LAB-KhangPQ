package ManagerAll;

import DTO.Student;
import Data.GetInputData;
import Data.Validation;
import java.util.ArrayList;

public class ManagerStudent {

    public ArrayList<Student> createStudentList() {
        ArrayList<Student> t = new ArrayList<>();
        return t;
    }

    Student getDuplicate(ArrayList<Student> t, Student s) {
        for (Student x : t) {
            if (Validation.isSame(x, s)) {
                return x;
            }
        }
        return null;
    }

    public void inputStudent(ArrayList<Student> t) {
        String ID;
        String firstName, lastName;
        String gender;
        String DOB;
        String email;
        int phoneNumber;

        ID = GetInputData.inputID("Enter ID: ", "ID is Exist",t, 1);
        firstName = GetInputData.inputFNLN("Enter First Name: ","Input not empty");
        lastName = GetInputData.inputFNLN("Enter Last Name: ","Input not empty");
        gender = GetInputData.inputGender("What is your gender?");
        DOB = GetInputData.inputDOB("Enter Date of Birth: ");
        email = GetInputData.inputEmail("Enter email: ");
        phoneNumber = GetInputData.inputNumberPhone("Enter phone number: ");
        t.add(new Student(ID, firstName, lastName, gender, DOB, email, phoneNumber));
        System.out.println("Add new a student successfuly! ");
    }

    public void addStudent(ArrayList<Student> t) {
        int n = GetInputData.inputChoice("Enter the number of students you want to add: ", 1, 5);
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            inputStudent(t);
            System.out.println();
        }
        String choice;
        while (true) {
            choice = GetInputData.inputYorN("Do you want to continue (Y/N)? ", "Y", "N");
            if (choice.equalsIgnoreCase("Y")) {
                inputStudent(t);
            } else {
                break;
            }
        }
    }
//    public  void getInformation(){
//        display(t);
//    }
    
    
//    public  void display(ArrayList list){
////        System.out.printf("%s | %-8s | %2s | %7s | %-4s | %-10s\n", "ID", "Name", "Age","Salary","Status","Date");
//        for (Object o : list) {
//            System.out.println(o);
//        }
//    }
    public  void printStudent(ArrayList<Student> t ){
        System.out.printf("%-8s   %-15s%s   %-15s   %-15s   %-15s   %-2s\n", "ID", "First Name", "Last Name",
                "Date of Birth","Gender","Email","Phone number");
        for (Student x : t) {
            System.out.println(x);
        }
//        for (Student student : t) {
//            System.out.println(t.get(i));
//        }
    }
//    public  void printStudent1(ArrayList<Student> t ){
//        System.out.printf("%-8s   %-15s%s   %-15s   %-15s   %-15s   %-15s   %-15s %-15s %-15s\n", "ID", "First Name", "Last Name",
//                "Date of Birth","Gender","Email","Phone number","LAB","PT","FE");
//        for (Student student : t) {
//            student.display();
//        }
//    }
    public void updateAStudent(ArrayList<Student> t, Student xxx, String ID) {
        String newID;
        String newFirstName, newLastName;
        String newGender;
        String newDOB;
        String newEmail;
        int newPhoneNumber;
        newID = GetInputData.inputID("Enter new ID: ", "ID is Exist", t, 1);
        xxx.setID(newID);
        newFirstName = GetInputData.inputFNLN("Enter new first name: ","Input not empty");
        xxx.setFirstName(newFirstName);
        newLastName = GetInputData.inputFNLN("Enter new last name: ","Input not empty");
        xxx.setLastName(newLastName);
        newGender = GetInputData.inputGender("Enter new gender: ");
        xxx.setGender(newGender);
        newDOB = GetInputData.inputDOB("Enter new Date of Birth: ");
        xxx.setDOB(newDOB);
        newEmail = GetInputData.inputEmail("Enter new Mail: ");
        xxx.setEmail(newEmail);
        newPhoneNumber = GetInputData.inputNumberPhone("Enter new Phone Number: ");
        xxx.setPhoneNumber(newPhoneNumber);
        System.out.println("Here he/is updating");
        System.out.println("Update Succesfully!");
    }

    public void deleteAStudent(ArrayList<Student> t, Student xxx, String ID) {
        String choice = GetInputData.inputYorN("Do you wanna delete this student (Y) or (N)", "Y", "N");
        if (choice.equalsIgnoreCase("Y")) {
            for (int i = 0; i < t.size(); i++) {
                if (t.get(i).getID().equals(ID)) {
                    t.remove(i);
                    break;
                }
            }
            System.out.println("Delete Succefully!!");
        } else {
            return;
        }
        System.out.println();
    }

    public void updateOrDeleteStudent(ArrayList<Student> t) {
        String ID;
        Student xxx;
        do {
            ID = GetInputData.inputID("Enter ID Wanna update: ", "ID must Exist in Database not Null" ,t, 2);
            xxx = Validation.searchAStudent(t, ID);
            if (xxx == null) {
                System.out.println("this student ID is not existed");
            }
        } while (Validation.searchAStudent(t, ID) == null);
        String choice = GetInputData.inputYorN("Do you wanna UPDATE (U) or DELETE (D)", "U", "D");
        if (choice.equalsIgnoreCase("U")) {
            updateAStudent(t, xxx, ID);
        } else {
            deleteAStudent(t, xxx, ID);
        }
    }

}
