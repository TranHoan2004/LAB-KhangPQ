
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class ManagerDoctor {
    ArrayList<Doctor> createDoctors() {
        ArrayList<Doctor> t = new ArrayList<>();
        return t;
    }
    
    public static void inputDoctor(ArrayList<Doctor> t){
        String code;
        String name;
        String specialization;
        int availability;
        while (true) {            
            try {
                code = GetInputData.inputString("Enter Code");
                if (Validation.isExist(t, code)== true) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.err.println("Country exist.");
            }
        }
        name = GetInputData.inputString("Enter Name");       
        specialization = GetInputData.inputString("Enter Specialization");
        availability = GetInputData.inputInt("Enter Availability");
        if (!Validation.isExistDoctor(t,code, name, specialization, availability)) {
            System.err.println("Duplicate.");
            return;
        }
        
        t.add(new Doctor(code, name, specialization, availability));
        System.out.println("Add Succesfully!");
    }
    public void printDoctor(ArrayList<Doctor> t) {
        System.out.printf("%-10s%-25s%-20s%-25s\n", "Code", "Name", "Specialization",
                "Availability");
        for (Doctor doctor : t) {
            doctor.display();
        }
    }
    
    public static void updateDoctor(ArrayList<Doctor> t) {
        
        String choice;
        while (true) {
            String code = GetInputData.inputString("Enter code doctor wanna update");
            if (Validation.isExist(t, code) == false) {
                System.out.println("NOT FOUND!");
            }
            choice = GetInputData.inputYorN("Do you want to continue (Y/N)? ", "Y", "N");
            if (choice.equalsIgnoreCase("Y")) {
                System.out.println("Enter code doctor wanna update ");
                System.out.println("FOUND");
                String codeUpdate = GetInputData.inputString("Enter code update");
                Doctor doctor = getDoctorByCode(t, code);
                String name = GetInputData.inputString("Enter name update");
                String specialization = GetInputData.inputString("Enter specialization update");
                int availability = GetInputData.inputInt("Enter availability update");
                //check user change infomation or not
                if (!Validation.checkChangeInfo(doctor, code, name, specialization, availability)) {
                    System.err.println("No change");
                    return;
                }
                doctor.setCode(codeUpdate);
                doctor.setName(name);
                doctor.setSpecialization(specialization);
                doctor.setAvailability(availability);
                System.err.println("Update successful");
            } else {
                break;
            }
        }
    }
    public static Doctor getDoctorByCode(ArrayList<Doctor> t, String code) {
        for (Doctor doctor : t) {
            if (doctor.getCode().equalsIgnoreCase(code)) {
                return doctor;
            }
        }
        return null;
    }

}
