
package com.example.student.service;

import com.example.student.entity.Student;
import com.example.student.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {

private final StudentRepository studentRepository;

public StudentService(StudentRepository studentRepository) {
this.studentRepository = studentRepository;
}

public Student getStudentById(Long id) {

Optional<Student> student =
studentRepository.findById(id);

if (student.isPresent()) {
return student.get();
}

throw new RuntimeException("Student not found");
}

public Student saveStudent(Student student) {

return studentRepository.save(student);
}
}

 