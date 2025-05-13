import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Subject {
    private int subjectId;
    private String subjectName;
    private double score;

    public Subject(int subjectId, String subjectName, double score) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.score = score;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Subject ID: " + subjectId + ", Name: " + subjectName + ", Score: " + score;
    }
}

class Student {
    private int studentId;
    private String name;
    private LocalDate dob;
    private List<Subject> subjects;

    public Student(int studentId, String name, LocalDate dob) {
        this.studentId = studentId;
        this.name = name;
        this.dob = dob;
        this.subjects = new ArrayList<>();
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void addSubject(Subject subject) {
        this.subjects.add(subject);
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Name: " + name + ", Date of Birth: " + dob;
    }
}

class GradeCalculator {
    public String calculateGrade(Student student) {
        List<Subject> subjects = student.getSubjects();
        if (subjects.isEmpty()) {
            return "No subjects enrolled for the student.";
        }

        double totalScore = 0;
        for (Subject subject : subjects) {
            totalScore += subject.getScore();
        }
        int numSubjects = subjects.size();

        if (numSubjects > 0) {
            double averageScore = totalScore / numSubjects;
            if (averageScore >= 90) {
                return "A+";
            } else if (averageScore >= 80) {
                return "A";
            } else if (averageScore >= 70) {
                return "B";
            } else if (averageScore >= 60) {
                return "C";
            } else if (averageScore >= 50) {
                return "D";
            } else {
                return "Fail";
            }
        } else {
            return "No scores available to calculate grade.";
        }
    }
}

public class SchoolResultsApp {
    public static void main(String[] args) {
        // Create a student
        Student student1 = new Student(101, "Alice Smith", LocalDate.of(2005, 8, 15));
        System.out.println(student1);

        // Create subjects and add them to the student
        Subject math = new Subject(201, "Mathematics", 92);
        Subject science = new Subject(202, "Science", 85);
        Subject english = new Subject(203, "English", 78);

        student1.addSubject(math);
        student1.addSubject(science);
        student1.addSubject(english);

        System.out.println("\nSubjects for " + student1.getName() + ":");
        for (Subject subject : student1.getSubjects()) {
            System.out.println(subject);
        }

        // Create a GradeCalculator and calculate the grade for the student
        GradeCalculator gradeCalculator = new GradeCalculator();
        String grade = gradeCalculator.calculateGrade(student1);
        System.out.println("\nGrade for " + student1.getName() + ": " + grade);

        // Create another student with different subjects
        Student student2 = new Student(102, "Bob Johnson", LocalDate.of(2006, 3, 20));
        Subject physics = new Subject(301, "Physics", 65);
        Subject chemistry = new Subject(302, "Chemistry", 55);
        student2.addSubject(physics);
        student2.addSubject(chemistry);
        System.out.println("\nSubjects for " + student2.getName() + ":");
        for (Subject subject : student2.getSubjects()) {
            System.out.println(subject);
        }
        String gradeStudent2 = gradeCalculator.calculateGrade(student2);
        System.out.println("\nGrade for " + student2.getName() + ": " + gradeStudent2);

        // Example of a student with no subjects
        Student student3 = new Student(103, "Charlie Brown", LocalDate.of(2007, 1, 10));
        String gradeStudent3 = gradeCalculator.calculateGrade(student3);
        System.out.println("\nGrade for " + student3.getName() + ": " + gradeStudent3);
    }
}