package Data;


import DTO.Subject;
import java.util.ArrayList;

public class ValidationSubject {
    public static boolean isExist(ArrayList<Subject> t, String subjectID) {
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getSubjectID().equalsIgnoreCase(subjectID)) {
                return true;
            }
        }
        return false;
    }
    
    public static Subject searchASubject(ArrayList<Subject> t,String subjectID) {
        if (t.isEmpty()) {
            return null;
        }
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getSubjectID().equalsIgnoreCase(subjectID)) {
                return t.get(i);
            }
        }
        return null;
    }
    

    
    public static boolean isExistSubject(ArrayList<Subject> t, String subjectID) {
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getSubjectID().equals(subjectID)) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean isSame(Subject s1, Subject s2) {
        if (!s1.getSubjectID().equals(s2.getSubjectName())) {
            return false;
        }
        if (!s1.getSubjectName().equals(s2.getSubjectName())) {
            return false;
        }

        if (s1.getCredit() != s2.getCredit()) {
            return false;
        }
        return true;
    }
}
