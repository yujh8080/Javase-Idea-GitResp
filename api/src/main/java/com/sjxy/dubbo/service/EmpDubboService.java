package com.sjxy.dubbo.service;

import com.sjxy.pojo.Emp;

import java.util.List;

/**
 * @Auther: yujh
 * @Date: 2021/2/11 - 02 - 11 - 10:21
 * @Description: com.sjxy.dubbo.service
 * @version: 1.0
 */
public interface EmpDubboService {

    public int insertEmp(Emp emp);

    public List<Emp> findEmpByDepId(Integer did);
}
