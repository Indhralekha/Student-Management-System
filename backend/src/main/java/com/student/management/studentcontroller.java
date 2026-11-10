
package com.student.management;

import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class studentcontroller {

    private studentservice service;

    public studentcontroller() {
        service = new studentservice();
    }

    // Add student
    @PostMapping
    public void addStudent(@RequestBody student student) {
        service.addStudent(student);
    }

    // Get all students
    @GetMapping
    public List<student> getAllStudents() {
        return service.getAllStudents();
    }

    // Get student by ID
    @GetMapping("/{id}")
    public student getStudentById(@PathVariable int id) {
        return service.getStudentById(id);
    }

    // Update student
    @PutMapping("/{id}")
    public boolean updateStudent(
            @PathVariable int id,
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String department) {

        return service.updateStudent(id, name, email, department);
    }

    // Delete student
    @DeleteMapping("/{id}")
    public boolean deleteStudent(@PathVariable int id) {
        return service.deleteStudent(id);
    }
}

