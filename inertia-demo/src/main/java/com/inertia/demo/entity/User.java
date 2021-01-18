package com.inertia.demo.entity;

/**
 * @Auther: 张钰磊
 * @Date: 2021-01-14 16:55
 * @Description:
 */
public class User {

    private String name;
    private Long id;
    private String desp;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesp() {
        return desp;
    }

    public void setDesp(String desp) {
        this.desp = desp;
    }
}
