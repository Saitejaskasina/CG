
import java.util.Scanner;
public class compare3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.next();
        char[] arr = str.toCharArray();
        char[] arr1 = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr1[i] = str.charAt(i);
        }
        boolean result = compare(arr, arr1);
        System.out.println(result);
    }
    public static boolean compare(char[] arr, char[] arr1) {
        if (arr.length != arr1.length) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr1[i]) {
                return false;
            }
        }
        return true;
    }
}