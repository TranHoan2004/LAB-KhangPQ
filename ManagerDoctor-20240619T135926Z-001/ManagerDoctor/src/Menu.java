
public class Menu {
    public static void display() {
        System.out.println("============= Doctor Management =============");
        System.out.println("    1.Add Doctor");
        System.out.println("    2.Update Doctor");
        System.out.println("    3.Delete Doctor");
        System.out.println("    4.Search Doctor");
        System.out.println("    5.Exit");
    }

    public static int getChoice() {
        return GetInputData.inputChoice("Enter one option in above : ", 1, 5);
    }
}
