package com.misiontic.account_ms.models;

import org.springframework.data.annotation.Id;
import java.util.Date;

public class Transaction {
    @Id
    private String id;
    private String usernameOrigin;
    private String usernameDEstiny;
    private int value;
    private Date date;


    public Transaction(String id, String usernameOrigin, String usernameDEstiny, int value, Date date) {
        this.id = id;
        this.usernameOrigin = usernameOrigin;
        this.usernameDEstiny = usernameDEstiny;
        this.value = value;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsernameOrigin() {
        return usernameOrigin;
    }

    public void setUsernameOrigin(String usernameOrigin) {
        this.usernameOrigin = usernameOrigin;
    }

    public String getUsernameDEstiny() {
        return usernameDEstiny;
    }

    public void setUsernameDEstiny(String usernameDEstiny) {
        this.usernameDEstiny = usernameDEstiny;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}