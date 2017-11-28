package com.baidu.service.impl;

import com.baidu.bean.Student;
import com.baidu.mapper.StudentMapper;
import com.baidu.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dllo on 17/11/27.
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {


    @Resource
    private StudentMapper studentMapper;

    @Override
    public List<Student> findAll() {
        return studentMapper.findAll();
    }
}
