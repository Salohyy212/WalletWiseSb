package com.wallet.walletwisesb.entity;

import java.time.LocalDateTime;

public class Balance {
    private int id;
    private int account_id;
    private double balance;
    private LocalDateTime last_update;

    public Balance(int id, int account_id, double balance, LocalDateTime last_update) {
        this.id = id;
        this.account_id = account_id;
        this.balance = balance;
        this.last_update = last_update;
    }
    public Balance(){}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public LocalDateTime getLastUpdate() {
        return last_update;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.last_update = lastUpdate;
    }

    @Override
    public String toString() {
        return "BalanceRecord{" +
                "id=" + id +
                ", accountId=" + account_id +
                ", balance=" + balance +
                ", lastUpdate=" + last_update +
                '}';
    }
}

