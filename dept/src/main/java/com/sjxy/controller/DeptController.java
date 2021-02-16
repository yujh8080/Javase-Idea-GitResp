package com.sjxy.controller;

import com.sjxy.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: yujh
 * @Date: 2021/2/10 - 02 - 10 - 19:33
 * @Description: com.sjxy.controller
 * @version: 1.0
 */
@Controller
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping("/dept")
    public String showDept(Model model){
        model.addAttribute("list",deptService.findAll());
        return "dept";
    }

    @GetMapping("/showEmp")
    public String showEmp(Integer did,Model model){
        model.addAttribute("list",deptService.findEmpByDeptId(did));

        return "showEmp";
    }
}
