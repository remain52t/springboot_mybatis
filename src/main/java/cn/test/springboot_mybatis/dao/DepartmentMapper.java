package cn.test.springboot_mybatis.dao;

import cn.test.springboot_mybatis.entity.Department;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

//声明当前类是一个数据库操作的映射接口
@Mapper
public interface DepartmentMapper {
    //1.添加
    @Insert("insert into department values(null,#{departmentName})")
    public void save(Department department);
    //2.修改
    @Update({"update department set departmentName = #{departmentName} where id = #{id}"})
    public void update(Department department);
    //3.查询
    @Select("select * from department")
    public List<Department> findAll();
}
