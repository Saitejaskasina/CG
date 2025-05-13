
import java.util.Scanner;
public class split3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        
        String[] words = customSplit(str);
        String[][] result = getWordsAndLengths(words);
        
        System.out.printf("%-15s %-10s%n", "Word", "Length");
        for (String[] row : result) {
            System.out.printf("%-15s %-10s%n", row[0], row[1]);
        }
    }
    
    public static String[] customSplit(String str) {
        int wordCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }
        wordCount++; 
        
        String[] words = new String[wordCount];
        int index = 0;
        int startIndex = 0;
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                words[index++] = str.substring(startIndex, i);
                startIndex = i + 1;
            }
        }
        words[index] = str.substring(startIndex); 
        
        return words;
    }
}