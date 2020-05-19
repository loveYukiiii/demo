package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class UserInfo {
    @Id
    private String id;
    @Column(name = "user_name")
    private String userName;
    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String toString(){
        return id;
    }
}
