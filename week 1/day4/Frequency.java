
import java.util.Scanner;
public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int count = 0;
        int temp = num;
        while(temp>0){
            temp = temp/10;
            count++;
        }
        int[] arr = new int[count];
        temp = num;
        for(int i = count-1; i>=0; i--){
            arr[i] = temp%10;
            temp = temp/10;
        }
        int[] freq = new int[10];
        for(int i = 0; i<count; i++){
            freq[arr[i]]++;
        }
        for(int i = 0; i<10; i++){
            if(freq[i]>0){
                System.out.println("Frequency of "+i+" is: "+freq[i]);
            }
        }
    }
}