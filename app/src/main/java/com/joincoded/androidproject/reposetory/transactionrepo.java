package com.joincoded.androidproject.reposetory;

import com.joincoded.androidproject.Data.Transaction;
import com.joincoded.androidproject.Data.TransactionType;

import java.util.ArrayList;
import java.util.Date;

public class transactionrepo {

    private static transactionrepo instance;

    public static transactionrepo getInstance() {
        if (instance == null)
            instance = new transactionrepo();
        return instance;
    }

        public ArrayList<Transaction> generateDummyTransactions( int numberOfItems){
            ArrayList<Transaction> transactions = new ArrayList<>();
            for (int i = 0; i < numberOfItems; i++) {
                Transaction transaction = new Transaction(8065, "12-3-2023", TransactionType.DEPOSIT, 25.00, 66.77, 543
                );
                Transaction transaction1 = new Transaction(8065, "16-3-2023", TransactionType.WITHDRAW, 30.0, 100.9, 543
                );
                Transaction transaction3 = new Transaction(8065, "19-3-2023", TransactionType.TRANSFER, 40.0, 50.0, 543
                );

                transactions.add(transaction);

            }
            return transactions;
        }

    }


