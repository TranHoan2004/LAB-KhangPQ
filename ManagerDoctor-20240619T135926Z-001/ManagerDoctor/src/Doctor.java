
public class Doctor {
    private String code;
    private String name;
    private String specialization;
    private int Availability;

    public Doctor() {
    }

    public Doctor(String code, String name, String specialization, int Availability) {
        this.code = code;
        this.name = name;
        this.specialization = specialization;
        this.Availability = Availability;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getAvailability() {
        return Availability;
    }

    public void setAvailability(int Availability) {
        this.Availability = Availability;
    }
    
    public void display() {
        System.out.printf("%-10s%-25s%-20s%-25d\n", this.code,
                this.name, this.specialization, this.Availability);
    }
}
