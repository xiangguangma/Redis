package com.baidu.mapper;

import com.baidu.bean.Student;

import java.util.List;

/**
 * Created by dllo on 17/11/27.
 */
public interface StudentMapper {

    List<Student> findAll();

}
