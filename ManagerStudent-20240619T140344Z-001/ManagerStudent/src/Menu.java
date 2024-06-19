
public class Menu {

    public static void display() {
        System.out.println("WELCOME TO STUDENT MANAGEMENT");
        System.out.println("    1.Create");
        System.out.println("    2.Find and Sort");
        System.out.println("    3.Update/Delete");
        System.out.println("    4.Report");
        System.out.println("    5.Exit");
    }

    public static int getChoice() {
        return GetInputData.inputChoice("Enter one option in above : ", 1, 5);
    }
}
