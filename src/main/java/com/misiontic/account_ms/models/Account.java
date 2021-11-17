package com.misiontic.account_ms.models;

import org.springframework.data.annotation.Id;
import java.util.Date;

public class Account {
    @Id
    private String username;
    private int balance;
    private Date lastChange;

    public Account(String username, int balance, Date lastChange) {
        this.username = username;
        this.balance = balance;
        this.lastChange = lastChange;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Date getLastChange() {
        return lastChange;
    }

    public void setLastChange(Date lastChange) {
        this.lastChange = lastChange;
    }
}
