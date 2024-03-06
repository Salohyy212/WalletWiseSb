package com.wallet.walletwisesb.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Account {
    private int id;
    private String name;
    private Double balance;
    private int currency_id;
    private LocalDateTime last_update;
    private String type;
    //private List<Transaction> transactions;

    public Account(int id, String name, Double balance, int currencyId, LocalDateTime lastUpdate, String type) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.currency_id = currencyId;
        this.last_update = lastUpdate;
        this.type = type;

    }
    public Account() {
        //this.transactions = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public int getCurrencyId() {
        return currency_id;
    }

    public void setCurrencyId(int currency_id) {
        this.currency_id = currency_id;
    }

    public LocalDateTime getLastUpdate() {
        return last_update;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.last_update = last_update;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /*public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }*/

    /*public Account performTransaction(Transaction transaction) {

        if ("debit".equals(transaction.getType()) && !("Bank".equals(type) || ("Cash".equals(type) && transaction.getAmount() <= balance))) {
            System.out.println("Unauthorized debit transaction on a non-bank account.");
            return null;
        }
        if ("credit".equals(transaction.getType())) {
            balance += transaction.getAmount();
        } else if("debit".equals(transaction.getType())) {
            balance -= transaction.getAmount();
        }
        if (transactions == null) {
            transactions = new ArrayList<>();
        }
        transactions.add(transaction);
        last_update = LocalDateTime.now();

        return this;
    }*/

    @Override
    public String toString() {
        return "Account{" +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", currencyId=" + currency_id +
                ", lastUpdate=" + last_update +
                ", type='" + type + '\'' +
                '}';
    }
}




