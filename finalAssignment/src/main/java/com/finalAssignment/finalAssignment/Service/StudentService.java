package com.finalAssignment.finalAssignment.Service;

import com.finalAssignment.finalAssignment.Model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();

}
