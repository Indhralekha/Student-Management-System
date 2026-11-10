
package com.student.management;

import java.util.List;

public class studentservice {

    private StudentRepository repository;

    // Constructor
    public studentservice() {
        repository = new StudentRepository();
    }

    // Add student
    public void addStudent(student student) {
        repository.addStudent(student);
    }

    // Get all students
    public List<student> getAllStudents() {
        return repository.getAllStudents();
    }

    // Get student by ID
    public student getStudentById(int id) {
        return repository.getStudentById(id);
    }

    // Update student
    public boolean updateStudent(int id, String name,
                                 String email, String department) {
        return repository.updateStudent(id, name, email, department);
    }

    // Delete student
    public boolean deleteStudent(int id) {
        return repository.deleteStudent(id);
    }
}

