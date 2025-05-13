import java.util.Scanner;

public class substings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
       

        String str2 =  compareUsingCharAt(str1);
		String str3 = str1.substring(2,5);
        boolean subresult = str1.contains(str2);

        System.out.println("CharAt comparison result: " + str2);
		System.out.println("CharAt comparison result: " + str3);
        System.out.println("is substing present result: " + subresult);

        sc.close();
    }

    public static String compareUsingCharAt(String str1) {
       String str2 = "";
        for (int i = 2; i < 5 && i < str1.length(); i++) {
			str2 += str1.charAt(i);
            
            }
			return str2;
        }
     
    }

