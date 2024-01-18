package com.joincoded.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.joincoded.androidproject.Data.Transaction;

import java.util.ArrayList;

public class TransactionDetails extends AppCompatActivity {

    TextView transactionIdTextView;
    TextView transactionTypeTextView;
    TextView transactionDateTextView;
    TextView transactionAmountTextView;
    TextView currentBalanceTextView;
    TextView accountTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_details);

        transactionIdTextView = findViewById(R.id.transactionIdTextView);
        transactionTypeTextView = findViewById(R.id.transactionTypeTextView);
        transactionDateTextView = findViewById(R.id.transactionDateTextView);
        transactionAmountTextView = findViewById(R.id.transactionAmountTextView);
        currentBalanceTextView = findViewById(R.id.currentBalanceTextView);
        accountTextView = findViewById(R.id.accountTextView);
        Transaction transaction=  getIntent().getSerializableExtra("transaction_key", Transaction.class);
       if (transaction != null){
           transactionIdTextView.setText(transaction.getId());
           transactionTypeTextView.setText(String.valueOf(transaction.getTransactionType()));
           transactionDateTextView.setText(transaction.getDate());
           transactionAmountTextView.setText(String.valueOf(transaction.getAmount()));
           currentBalanceTextView.setText(String.valueOf(transaction.getBalance()));
           accountTextView.setText(transaction.getAccount());

       }
    }

}