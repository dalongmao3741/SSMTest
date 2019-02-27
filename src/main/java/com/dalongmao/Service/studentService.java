package com.dalongmao.Service;

import com.dalongmao.dao.studentDAO;
import com.dalongmao.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentService {

    @Autowired
    private studentDAO studentDao;

    public void insert(Student student) {
        studentDao.insert(student);
    }

    public void delete(Integer id) {
        studentDao.delete(id);
    }

    ;

    public void update(Student student) {
        studentDao.update(student);
    }

    public Student selectById(Integer id) {
        return studentDao.selectById(id);
    }

    public List<Student> getAll() {
        return studentDao.getAll();
    }

}
