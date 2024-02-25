package com.finalAssignment.finalAssignment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.finalAssignment.finalAssignment.Model.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

}
