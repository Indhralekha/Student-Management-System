
package com.student.management;

public class StudentManagementApplication {

    public static void main(String[] args) {

        studentcontroller controller = new studentcontroller();

        // Add first student
        student student1 = new student(
            101,
            "Indhralekha",
            "indhra@gmail.com",
            "ECE"
        );

        controller.addStudent(student1);

        // Add second student
        student student2 = new student(
            102,
            "Priya",
            "priya@gmail.com",
            "CSE"
        );

        controller.addStudent(student2);

        // Get all students
        System.out.println("\n===== ALL STUDENTS =====");

        for (student student : controller.getAllStudents()) {
            student.displayDetails();
        }

        // Get student by ID
        System.out.println("\n===== SEARCH STUDENT =====");

        student result = controller.getStudentById(101);

        if (result != null) {
            result.displayDetails();
        } else {
            System.out.println("Student not found!");
        }

        // Update student
        System.out.println("\n===== UPDATE STUDENT =====");

        boolean updated = controller.updateStudent(
            101,
            "Indhralekha M",
            "indhralekha@gmail.com",
            "ECE"
        );

        System.out.println(
            updated ? "Student updated successfully!" : "Student not found!"
        );

        // Delete student
        System.out.println("\n===== DELETE STUDENT =====");

        boolean deleted = controller.deleteStudent(102);

        System.out.println(
            deleted ? "Student deleted successfully!" : "Student not found!"
        );

        // Display final student list
        System.out.println("\n===== FINAL STUDENT LIST =====");

        for (student student : controller.getAllStudents()) {
            student.displayDetails();
        }
    }
}


