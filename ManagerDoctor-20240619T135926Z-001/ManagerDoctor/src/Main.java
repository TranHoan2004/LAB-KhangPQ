
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ManagerDoctor md = new ManagerDoctor();
        ArrayList<Doctor> t = md.createDoctors();
        for (int i = 0; i < 2; i++) {
            md.inputDoctor(t);
            
        }
//        md.updateDoctor(t);
        md.printDoctor(t);
    }
    
}
