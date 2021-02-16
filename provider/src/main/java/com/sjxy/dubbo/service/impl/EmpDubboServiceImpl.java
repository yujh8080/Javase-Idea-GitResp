package com.sjxy.dubbo.service.impl;

import com.sjxy.dubbo.service.EmpDubboService;
import com.sjxy.mapper.EmpMapper;
import com.sjxy.pojo.Emp;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Auther: yujh
 * @Date: 2021/2/11 - 02 - 11 - 10:22
 * @Description: com.sjxy.dubbo.service.impl
 * @version: 1.0
 */
@Service
public class EmpDubboServiceImpl implements EmpDubboService {

    @Autowired
    private EmpMapper empMapper;

    public int insertEmp(Emp emp) {
        return empMapper.insertEmp(emp);
    }

    public List<Emp> findEmpByDepId(Integer did) {
        return empMapper.findEmpByDeptId(did);
    }
}
