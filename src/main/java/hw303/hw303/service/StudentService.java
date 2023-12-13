package hw303.hw303.service;

import hw303.hw303.Student;

public interface StudentService {
    Student addStudent(Student student);
    Student findStudent(Long id);
    Student editStudent(Long id, Student student);
    void deleteStudent(Long id);
}