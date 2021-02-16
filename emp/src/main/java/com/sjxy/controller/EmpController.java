package com.sjxy.controller;

import com.sjxy.pojo.Emp;
import com.sjxy.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Auther: yujh
 * @Date: 2021/2/11 - 02 - 11 - 10:04
 * @Description: com.sjxy.controller
 * @version: 1.0
 */
@Controller
public class EmpController {

    @Autowired
    private EmpService empService;

    @GetMapping("/empadd")
    public String empAdd(Model model){
        model.addAttribute("list",empService.showAll());
        return "emp-add";
    }

    @PostMapping("/add")
    public String add(Emp emp, MultipartFile file){
        empService.insert(emp,file);
        return "emp-add";
    }
}
