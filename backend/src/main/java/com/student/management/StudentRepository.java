
package com.student.management;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

    private List<student> students = new ArrayList<>();

    // Add student
    public void addStudent(student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    // Get all students
    public List<student> getAllStudents() {
        return students;
    }

    // Get student by ID
    public student getStudentById(int id) {
        for (student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    // Update student
    public boolean updateStudent(int id, String name,
                                 String email, String department) {

        student student = getStudentById(id);

        if (student != null) {
            student.setName(name);
            student.setEmail(email);
            student.setDepartment(department);
            return true;
        }

        return false;
    }

    // Delete student
    public boolean deleteStudent(int id) {
        return students.removeIf(student -> student.getId() == id);
    }
}


