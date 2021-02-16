package com.sjxy.mapper;

import com.sjxy.pojo.Emp;

import java.util.List;

/**
 * @Auther: yujh
 * @Date: 2021/2/10 - 02 - 10 - 18:40
 * @Description: com.sjxy.mapper
 * @version: 1.0
 */
public interface EmpMapper {
    public int insertEmp(Emp emp);
    public List<Emp> findEmpByDeptId(Integer did);
}
