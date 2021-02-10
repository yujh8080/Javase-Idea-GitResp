package com.sjxy.controller;

import com.sjxy.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: yujh
 * @Date: 2020/12/8 - 12 - 08 - 20:08
 * @Description: com.sjxy.controller
 * @version: 1.0
 */
@Controller
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/demo")
    @ResponseBody
    public String Demo(){

        return demoService.demo();
    }
}
