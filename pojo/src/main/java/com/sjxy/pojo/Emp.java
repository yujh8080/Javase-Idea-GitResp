package com.sjxy.pojo;

import java.io.Serializable;

/**
 * @Auther: yujh
 * @Date: 2021/2/10 - 02 - 10 - 18:34
 * @Description: com.sjxy.pojo
 * @version: 1.0
 */
public class Emp implements Serializable {
    private Integer id;
    private String name;
    private String photo;
    private Integer did;

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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", photo='" + photo + '\'' +
                ", did=" + did +
                '}';
    }
}
