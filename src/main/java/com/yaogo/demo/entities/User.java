package com.yaogo.demo.entities;

import javax.persistence.*;

@Entity
@NamedQuery(name = "find_all_users", query = "SELECT u from User u")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long user_id;

    private String user_name;

    private String user_password;

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
}
