import java.util.Scanner;

public class StudentRecordsProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students:");
        int numStudents = scanner.nextInt();
        Student[] students = new Student[numStudents];
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details for student" + (i + 1) + ":");
            System.out.print("Name:");
            String name = scanner.next();
            System.out.print("Roll Number:");
            int rollNumber = scanner.nextInt();
            System.out.print("Age:");
            int age = scanner.nextInt();
            System.out.print("Marks:");
            double marks = scanner.nextDouble();
            students[i] = new Student(name, rollNumber, age, marks);
        }
        System.out.println("\nStudent Records:");
        for (Student student : students) {
            System.out.println("Name:" + student.getName());
            System.out.println("RollNumber:" + student.getRollNumber());
            System.out.println("Age:" + student.getAge());
            System.out.println("Marks:" + student.getMarks());
        }
        scanner.close();
    }

}