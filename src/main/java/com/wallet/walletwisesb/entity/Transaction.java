package com.wallet.walletwisesb.entity;

import java.time.LocalDateTime;

public class Transaction {
    private int id;
    private String label;
    private Double amount;
    private LocalDateTime date_time;
    private int account_id;
    private String type;
    private int category_id;

    public Transaction(int id, String label, Double amount, LocalDateTime date_time, int account_id, String type, int category_id) {
        this.id = id;
        this.label = label;
        this.amount = amount;
        this.date_time = date_time;
        this.account_id = account_id;
        this.type = type;
        this.category_id = category_id;
    }
    public Transaction(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDateTime getDateTime() {
        return date_time;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.date_time = dateTime;
    }

    public int getAccountId() {
        return account_id;
    }

    public void setAccountID(int accountID) {
        this.account_id = account_id;
    }

    public String getType() {
        return type;
    }

    public String setType(String type) {
        return type;
    }

    public void setAccountId(int accountId) {
        this.account_id = accountId;
    }

    public int getCategoryId() {
        return category_id;
    }

    public void setCategoryId(TransactionCategory categoryId) {
        this.category_id = categoryId.getId();
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", label='" + label + '\'' +
                ", amount=" + amount +
                ", dateTime=" + date_time +
                ", accountId=" + account_id +
                ", type='" + type + '\'' +
                ", categoryId=" + category_id +
                '}';
    }
}

