package com.wenpingao.qe.pojo;

/**
 * Created by WenPinGao on 2015/11/7.
 */
public class User {
    private String id;
    private String name;
    private String pwd;
    private String email;
    private String tel;

    public User() {
    }

    public User(String id, String name, String pwd, String email, String tel) {

        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.email = email;
        this.tel = tel;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }


    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", email='" + email + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
