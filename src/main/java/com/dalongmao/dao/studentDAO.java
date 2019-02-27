package com.dalongmao.dao;
import com.dalongmao.entity.Student;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface studentDAO {
    void insert(Student student);
    void delete(Integer id);
    void update(Student student);
    Student selectById(Integer id);
    List<Student> getAll();
}
