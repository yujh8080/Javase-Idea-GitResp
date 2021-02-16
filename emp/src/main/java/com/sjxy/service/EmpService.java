package com.sjxy.service;

import com.sjxy.pojo.Dept;
import com.sjxy.pojo.Emp;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @Auther: yujh
 * @Date: 2021/2/11 - 02 - 11 - 9:58
 * @Description: com.sjxy.service
 * @version: 1.0
 */
public interface EmpService {

    public List<Dept> showAll();
    public int insert(Emp emp, MultipartFile file);
}
