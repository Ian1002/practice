package com.ian.practice.mongodb.model;

import java.io.Serializable;

/**
 * User
 *
 * @author YangJing
 * @date 2018/10/30 10:08
 */
public class User implements Serializable {

    /**
     * mongodb主键
     */
    private String _id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
