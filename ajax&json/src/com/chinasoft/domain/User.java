package com.chinasoft.domain;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class User {

    private Integer id;
    private String name;
    private Integer age;
    private Boolean isChecked;
    @JSONField(format = "yyyy-MM-dd")
    private Date birthday;

    public User() {
    }

    public User(Integer id, String name, Integer age, Boolean isChecked, Date birthday) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.isChecked = isChecked;
        this.birthday = birthday;
    }

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getChecked() {
        return isChecked;
    }

    public void setChecked(Boolean checked) {
        isChecked = checked;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isChecked=" + isChecked +
                ", birthday=" + birthday +
                '}';
    }
}
