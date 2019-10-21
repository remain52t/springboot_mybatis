package cn.test.springboot_mybatis;

import cn.test.springboot_mybatis.dao.DepartmentMapper;
import cn.test.springboot_mybatis.dao.EmployeeMapper;
import cn.test.springboot_mybatis.entity.Department;
import cn.test.springboot_mybatis.entity.Employee;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisApplicationTests {
    @Autowired
    private DepartmentMapper departmentMapper;

    @Autowired
    private EmployeeMapper employeeMapper;

    @Test
    @Ignore
    public void contextLoads() {
        Department department = new Department();
        department.setDepartmentName("人事部");
        departmentMapper.save(department);
    }
    @Test
    @Ignore
    public void testUpdate(){
        Department department = new Department();
        department.setId(1);
        department.setDepartmentName("财务部");
        departmentMapper.update(department);

    }
    @Test
    @Ignore
    public void testSelect(){
        List<Department> departmentList = departmentMapper.findAll();
        System.out.println(departmentList);

    }
    @Test
    public void testEmpSave(){
        Employee employee = new Employee();
        employee.setLastName("李四");
        employee.setEmail("aaa@qq.com");
        employee.setGender(1);
        employee.setD_id(1);
        employeeMapper.save(employee);
    }

}
