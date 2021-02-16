package com.sjxy.pojo;

import java.io.Serializable;

/**
 * @Auther: yujh
 * @Date: 2021/2/10 - 02 - 10 - 18:33
 * @Description: com.sjxy.pojo
 * @version: 1.0
 */
public class Dept implements Serializable {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
