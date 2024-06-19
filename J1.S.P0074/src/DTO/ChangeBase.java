package DTO;

public class ChangeBase {

    public int otherToDec(String other, int base) {
        int result = 0;
        String HEX = "0123456789ABCDEFF";
        other = other.toUpperCase();
        for (int i = 0; i < other.length(); i++) {
            result += HEX.indexOf(other.charAt(i)) * Math.pow(base, other.length() - 1 - i);
        }
        return result;
    }

    public String decToOther(int Dec, int base) {
        String result = "";
        String HEX = "0123456789ABCDEFF";
        while (Dec > 0) {
            result = HEX.charAt(Dec % base) + result;
            Dec /= base;
        }
        return result;
    }

    public void display() {
        
        while (true) {            
            int inBase = Data.Validation.getBase("Enter base input: ", "Base invalid");
            String value = Data.Validation.getValue("Enter value input: ", inBase, "Error Format");
            int outBase = Data.Validation.getBase("Enter base output: ", "Base invalid");
            System.out.println("After change");
            if (inBase == 10) {
                System.out.println(decToOther(Integer.valueOf(value), outBase));
            } else {
                int decTmp = otherToDec(value, inBase);
                System.out.println(decToOther(decTmp, outBase));
            }
        }
    }
}
