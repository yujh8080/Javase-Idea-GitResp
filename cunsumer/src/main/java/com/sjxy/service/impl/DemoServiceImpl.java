package com.sjxy.service.impl;

import com.sjxy.service.DemoDubboService;
import com.sjxy.service.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * @Auther: yujh
 * @Date: 2020/12/8 - 12 - 08 - 20:02
 * @Description: com.sjxy.service.impl
 * @version: 1.0
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Reference(loadbalance = "roundrobin")
    private DemoDubboService demoDubboService;

    @Override
    public String demo() {

        return demoDubboService.Demo("张三");
    }
}
