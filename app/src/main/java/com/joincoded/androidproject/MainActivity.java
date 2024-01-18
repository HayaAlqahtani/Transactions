package com.joincoded.androidproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.joincoded.androidproject.Adapter.TransactionAdapter;
import com.joincoded.androidproject.Data.Transaction;
import com.joincoded.androidproject.reposetory.transactionrepo;
import com.joincoded.androidproject.transactioninterface.TransactionListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements TransactionListener {
    RecyclerView transactionRecyclerView;
    ArrayList<Transaction> transactions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        transactionRecyclerView = findViewById(R.id.transactionRecyclerView);
        transactionRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        transactions = transactionrepo.getInstance().generateDummyTransactions( 4);
        TransactionAdapter transactionAdapter = new TransactionAdapter(transactions, this);

        transactionRecyclerView.setAdapter(transactionAdapter);

    }

    @Override
    public void onAccountItemClicker(Transaction transaction) {
        Intent intent = new Intent(MainActivity.this, TransactionDetails.class);
        intent.putExtra("transaction_key", transaction);
        startActivity(intent);
    }
}
