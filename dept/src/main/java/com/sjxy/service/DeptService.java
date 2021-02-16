package com.sjxy.service;

import com.sjxy.pojo.Dept;
import com.sjxy.pojo.Emp;

import java.util.List;

/**
 * @Auther: yujh
 * @Date: 2021/2/10 - 02 - 10 - 19:31
 * @Description: com.sjxy.service
 * @version: 1.0
 */
public interface DeptService {

    public List<Dept> findAll();
    public List<Emp> findEmpByDeptId(Integer did);
}
