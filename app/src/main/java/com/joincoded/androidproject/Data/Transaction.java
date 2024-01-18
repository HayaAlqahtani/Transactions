package com.joincoded.androidproject.Data;

import java.io.Serializable;

public class Transaction implements Serializable {


    private int id;
    private String Date;
    private TransactionType transactionType;
    private Double amount;
    private Double balance;
    private int account;

    public Transaction(int id, String date, TransactionType transactionType, Double amount, Double balance, int account) {
        this.id = id;
        Date = date;
        this.transactionType = transactionType;
        this.amount = amount;
        this.balance = balance;
        this.account = account;
    }

    public int getId() {

        return id;
    }

    public String getDate() {

        return Date;
    }

    public TransactionType getTransactionType() {

        return transactionType;
    }

    public Double getAmount() {
        return amount;
    }

    public Double getBalance() {

        return balance;
    }

    public int getAccount() {

        return account;
    }


}


