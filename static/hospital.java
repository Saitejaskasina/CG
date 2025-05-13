public class hospital {
    public static void main(String[] args) {
        Patient p1 = new Patient("John", 30, "Fever");
        Patient p2 = new Patient("Alice", 25, "Cold");
 
        if (p1 instanceof Patient) {
            p1.displayDetails();
        }
        if (p2 instanceof Patient) {
            p2.displayDetails();
        }
 
        System.out.println("Total Patients: " + Patient.getTotalPatients());
    }
 }
 
 class Patient {
    private static String hospitalName = "City Hospital";
    private static int totalPatients = 0;
 
    private final int patientID;
    private String name;
    private int age;
    private String ailment;
 
    private static int idCounter = 1;
 
    public Patient(String name, int age, String ailment) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = idCounter++;
        totalPatients++;
    }
 
    public static int getTotalPatients() {
        return totalPatients;
    }
 
    public void displayDetails() {
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: "+ age);
        System.out.println("Alignments: "+ ailment);
        System.out.println("Hospital: "+ hospitalName);
    
    }
 }
 