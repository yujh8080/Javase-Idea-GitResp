package com.sjxy.service.impl;

import com.sjxy.dubbo.service.DeptDubboService;
import com.sjxy.dubbo.service.EmpDubboService;
import com.sjxy.pojo.Dept;
import com.sjxy.pojo.Emp;
import com.sjxy.service.DeptService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: yujh
 * @Date: 2021/2/10 - 02 - 10 - 19:32
 * @Description: com.sjxy.service.impl
 * @version: 1.0
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Reference
    private DeptDubboService deptDubboService;

    @Reference
    private EmpDubboService empDubboService;

    public List<Dept> findAll() {
        return deptDubboService.findAllDept();
    }

    public List<Emp> findEmpByDeptId(Integer did) {
        return empDubboService.findEmpByDepId(did);
    }
}
