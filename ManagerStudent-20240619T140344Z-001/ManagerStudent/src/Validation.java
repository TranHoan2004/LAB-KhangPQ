
import java.util.List;

public class Validation {

    public static boolean isExist(List<Student> t, String ID) {
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getID().equals(ID)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isConsistency(List<Student> t, String code, String name) {
        for (Student x : t) {
            if (code.equals(x.getID())) {
                if (!name.equals(x.getName())) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isSame(Student s1, Student s2) {
        if (!s1.getID().equals(s2.getID())) {
            return false;
        }
        if (!s1.getName().equals(s2.getName())) {
            return false;
        }
        if (s1.getSemester() != s2.getSemester()) {
            return false;
        }
        if (!s1.getCourseName().equals(s2.getCourseName())) {
            return false;
        }
        return true;
    }

    public static boolean isSameIDAndCourse(Student t, Student t1) {
        if (t.getID().equals(t1.getID()) && t.getCourseName().equals(t1.getCourseName())) {
            return true;
        }
        return false;
    }

}
