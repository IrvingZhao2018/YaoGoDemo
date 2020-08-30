package com.yaogo.demo.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Message {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long msg_id;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    private Date msg_date;

    private String msg_data;

    @ManyToOne
    @JoinColumn(name="msg_parentid")
    private Message message;

    public Long getMsg_id() {
        return msg_id;
    }

    public void setMsg_id(Long msg_id) {
        this.msg_id = msg_id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getMsg_date() {
        return msg_date;
    }

    public void setMsg_date(Date msg_date) {
        this.msg_date = msg_date;
    }

    public String getMsg_data() {
        return msg_data;
    }

    public void setMsg_data(String msg_data) {
        this.msg_data = msg_data;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
}
