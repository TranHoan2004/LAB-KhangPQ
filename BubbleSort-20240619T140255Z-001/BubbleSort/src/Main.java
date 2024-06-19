
public class Main {
    public static void main(String[] args) {
        Sort bs = new Sort();
        int n = Validation.inputInt("Enter Size of Array: ", 0, Integer.MAX_VALUE);
        int arr[] = new int[n];
        bs.inputOfArray(arr);
        bs.display(arr);
    }
}
