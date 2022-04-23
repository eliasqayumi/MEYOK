package com.example.meyok.ServiceImpl;

import com.example.meyok.Model.Student;
import com.example.meyok.Repository.StudentRepository;
import com.example.meyok.Service.StudentService;
import com.example.meyok.exceptions.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void insert(Student student) {
        this.studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return this.studentRepository.findAll();
    }

    @Override
    public void deleteById(String studentId) {
        this.studentRepository.deleteById(studentId);
    }

    @Override
    public void update(String studentId, Student student) {
        Student updateStudent = this.studentRepository.findStudentById(studentId)
                .orElseThrow(() -> new NotFoundException("Student by " + studentId + " id has not found"));
        updateStudent.setName(student.getName());
        updateStudent.setSurname(student.getSurname());
        updateStudent.setDateOfBirth(student.getDateOfBirth());
        updateStudent.setEmail(student.getEmail());
        updateStudent.setAddress(student.getAddress());
        updateStudent.setContactNo(student.getContactNo());
        this.studentRepository.save(updateStudent);
    }

    @Override
    public Student getStudentById(String studentId) {
        return this.studentRepository.findStudentById(studentId)
                .orElseThrow(() -> new NotFoundException("Student by " + studentId + " id has not found"));
    }
}
