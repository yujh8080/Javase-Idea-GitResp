package com.sjxy.dubbo.service;

import com.sjxy.pojo.Dept;

import java.util.List;

/**
 * @Auther: yujh
 * @Date: 2021/2/10 - 02 - 10 - 19:26
 * @Description: com.sjxy.dubbo.service
 * @version: 1.0
 */
public interface DeptDubboService {
    public List<Dept> findAllDept();
}
