package com.sjxy.service.impl;

import com.sjxy.service.DemoDubboService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @Auther: yujh
 * @Date: 2020/12/8 - 12 - 08 - 19:44
 * @Description: com.sjxy.service.impl
 * @version: 1.0
 */
@Service//注解为apache的service
         //区分项目是provider(@Service是apache的注解)还是consumer项目
public class DemoDubboServiceImpl implements DemoDubboService {
    @Override
    public String Demo(String param) {
        System.out.println("执行demo");
        return param+"123";
    }
}
