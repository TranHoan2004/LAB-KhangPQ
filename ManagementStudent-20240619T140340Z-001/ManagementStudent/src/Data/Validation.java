package Data;

import DTO.Student;
import DTO.Subject;
import java.util.ArrayList;

public class Validation {
    public static boolean isExist(ArrayList<Student> t, String ID) {
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getID().equals(ID)) {
                return true;
            }
        }
        return false;
    }
    
    public static Student searchAStudent(ArrayList<Student> t,String ID) {
        if (t.isEmpty()) {
            return null;
        }
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getID().equalsIgnoreCase(ID)) {
                return t.get(i);
            }
        }
        return null;
    }
        
    public static boolean isSame(Student s1, Student s2) {
        if (!s1.getID().equals(s2.getID())) {
            return false;
        }
        if (!s1.getID().equals(s2.getID())) {
            return false;
        }
        if (!s1.getFirstName().equals(s2.getFirstName())) {
            return false;
        }
        if (!s1.getLastName().equals(s2.getLastName())) {
            return false;
        }
        if (!s1.getGender().equals(s2.getGender())) {
            return false;
        }
        if (!s1.getDOB().equals(s2.getDOB())) {
            return false;
        }
        if (!s1.getEmail().equals(s2.getEmail())) {
            return false;
        }
        if (s1.getPhoneNumber() != s2.getPhoneNumber()) {
            return false;
        }
        return true;
    }
}
