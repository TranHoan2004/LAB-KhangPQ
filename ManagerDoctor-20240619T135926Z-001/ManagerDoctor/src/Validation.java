
import java.lang.reflect.Array;
import java.util.ArrayList;


public class Validation {
    public static boolean isExist(ArrayList<Doctor> t, String code) {
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getCode().equalsIgnoreCase(code)) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean isExistDoctor(ArrayList<Doctor> t, String code,
            String name, String specialization, int availability) {
        for (Doctor doctor : t) {
            if (code.equalsIgnoreCase(doctor.getCode())
                    && name.equalsIgnoreCase(doctor.getName())
                    && specialization.equalsIgnoreCase(doctor.getSpecialization())
                    && availability == doctor.getAvailability()) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean checkChangeInfo(Doctor doctor, String code,
            String name, String specialization, int availability) {
        if (doctor.getCode().equalsIgnoreCase(code)
                && doctor.getName().equalsIgnoreCase(name)
                && doctor.getSpecialization().equalsIgnoreCase(specialization)
                && doctor.getAvailability() == availability) {
            return false;
        }
        return true;
    }
}
