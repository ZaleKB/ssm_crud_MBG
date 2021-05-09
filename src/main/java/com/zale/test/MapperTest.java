package com.zale.test;

import com.zale.bean.Department;
import com.zale.bean.Employee;
import com.zale.dao.DepartmentMapper;
import com.zale.dao.EmployeeMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

/**
 * 测试dao层的工作
 * 推荐Spring的项目可以使用Spring的单元测试，可以自动注入我们需要的组件
 *
 * 1、导入SpringTest模块
 * 2、@ContextConfiguration指定Spring配置文件的位置
 *  ，@RunWith(SpringJUnit4ClassRunner.class)让测试运行于Spring测试环境
 * 3、直接autowired要使用的组件即可
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MapperTest {

    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    EmployeeMapper employeeMapper;

    @Autowired
    SqlSession sqlSession;

    @Test
    public void testCRUD() {
        System.out.println(departmentMapper);

        //departmentMapper.insertSelective(new Department(null,"开发部"));
        //departmentMapper.insertSelective(new Department(null,"测试部"));

        //employeeMapper.insertSelective(new Employee(null, "Jerry", "M", "Jerry@123.com", 1));

        // EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        // for(int i = 0; i < 1000; i++) {
        //     String uuid = UUID.randomUUID().toString().substring(0, 5) + 1;
        //     mapper.insertSelective(new Employee(null, uuid, "M", uuid + "@gmail.com", 1));
        // }
        // System.out.println("success");
    }
}
