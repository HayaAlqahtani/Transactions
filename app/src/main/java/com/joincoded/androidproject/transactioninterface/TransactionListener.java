package com.joincoded.androidproject.transactioninterface;

import com.joincoded.androidproject.Data.Transaction;

public interface TransactionListener {
    void onAccountItemClicker(Transaction transaction);
}
