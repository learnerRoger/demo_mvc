package com.example.domain;

import java.util.List;

public class VI {
    private List<User> userList;

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return "VI{" +
                "userList=" + userList +
                '}';
    }
}
