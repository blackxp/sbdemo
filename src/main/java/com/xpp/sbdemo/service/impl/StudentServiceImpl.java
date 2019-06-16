package com.xpp.sbdemo.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xpp.sbdemo.dao.StudentMapper;
import com.xpp.sbdemo.domain.Student;
import com.xpp.sbdemo.druidMybatisConfig.DataSource;
import com.xpp.sbdemo.druidMybatisConfig.DataSourceEnum;
import com.xpp.sbdemo.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {
    @Override
    @DataSource(DataSourceEnum.DB1)
    public boolean insert(Student entity) {
        return super.insert(entity);
    }
}