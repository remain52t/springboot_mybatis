package cn.test.springboot_mybatis.dao;

import cn.test.springboot_mybatis.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmployeeMapper {
    //1.添加
    public  void save(Employee employee);

    //2.修改
    public  void update(Employee employee);

    //3.查询
    public List<Employee> findAll();
}
