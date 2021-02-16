package com.sjxy.dubbo.service.impl;

import com.sjxy.dubbo.service.DeptDubboService;
import com.sjxy.mapper.DeptMapper;
import com.sjxy.pojo.Dept;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Auther: yujh
 * @Date: 2021/2/10 - 02 - 10 - 19:29
 * @Description: com.sjxy.dubbo.service.impl
 * @version: 1.0
 */
@Service
public class DeptDubboServiceImpl implements DeptDubboService {

    @Autowired
    private DeptMapper deptMapper;

    public List<Dept> findAllDept() {

        return deptMapper.findAll();
    }
}
