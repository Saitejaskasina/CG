import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter Physics marks: ");
        int physics = sc.nextInt();
        
        System.out.print("Enter Chemistry marks: ");
        int chemistry = sc.nextInt();
        
        System.out.print("Enter Maths marks: ");
        int maths = sc.nextInt();
        
        int total = physics + chemistry + maths;
        double average = total / 3.0;

        System.out.printf("Total Marks: %d%n", total);
        System.out.printf("Average Marks: %.2f%n", average);
        
        String grade;
        String remarks;
        
        if (average >= 80) {
            grade = "A";
            remarks = "Level 4";
        } else if (average >= 70) {
            grade = "B";
            remarks = "Level 3";
        } else if (average >= 60) {
            grade = "C";
            remarks = "Level 2";
        } else if (average >= 50) {
            grade = "D";
            remarks = "Level 1";
        } else if (average >= 40) {
            grade = "E";
            remarks = "Level 1";
        } else {
            grade = "R";
            remarks = "Remidial";
        }

        System.out.printf("Grade: %s%n", grade);
        System.out.printf("Remarks: %s%n", remarks);

        sc.close();
    }
}
