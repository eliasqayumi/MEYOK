package com.example.meyok.ServiceImpl;

import com.example.meyok.Model.StudentsTakeSubject;
import com.example.meyok.Repository.StudentTakeSubjectRepository;
import com.example.meyok.Service.StudentsTakeSubjectService;
import com.example.meyok.exceptions.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsTakeSubjectServiceImpl implements StudentsTakeSubjectService {
    private StudentTakeSubjectRepository studentTakeSubjectRepository;

    public StudentsTakeSubjectServiceImpl(StudentTakeSubjectRepository studentTakeSubjectRepository) {
        this.studentTakeSubjectRepository = studentTakeSubjectRepository;
    }

    @Override
    public void insert(StudentsTakeSubject studentsTakeSubject) {
        this.studentTakeSubjectRepository.save(studentsTakeSubject);
    }

    @Override
    public List<com.example.meyok.Model.StudentsTakeSubject> getAllStudentsTakeSubject() {
        return this.studentTakeSubjectRepository.findAll();
    }

    @Override
    public void deleteById(String studentsTakeSubjectId) {
        this.studentTakeSubjectRepository.deleteById(studentsTakeSubjectId);
    }

    @Override
    public void update(String studentsTakeSubjectId, StudentsTakeSubject studentsTakeSubject) {
        StudentsTakeSubject updateStudentsTakeSubject = this.studentTakeSubjectRepository
                .findStudentsTakeSubjectById(studentsTakeSubjectId)
                .orElseThrow(() -> new NotFoundException("Student take subject by " + studentsTakeSubjectId + " id has not found"));
        updateStudentsTakeSubject.setSubject(studentsTakeSubject.getSubject());
        updateStudentsTakeSubject.setStudentNo(studentsTakeSubject.getStudentNo());
        updateStudentsTakeSubject.setTerm(studentsTakeSubject.getTerm());
        this.studentTakeSubjectRepository.save(updateStudentsTakeSubject);
    }

    @Override
    public com.example.meyok.Model.StudentsTakeSubject getStudentsTakeSubjectById(String studentsTakeSubjectId) {
        return this.studentTakeSubjectRepository
                .findStudentsTakeSubjectById(studentsTakeSubjectId)
                .orElseThrow(() -> new NotFoundException("Student take subject by " + studentsTakeSubjectId + " id has not found"));
    }
}
