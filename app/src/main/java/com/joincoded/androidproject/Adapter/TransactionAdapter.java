package com.joincoded.androidproject.Adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.joincoded.androidproject.Data.Transaction;
import com.joincoded.androidproject.Data.TransactionType;
import com.joincoded.androidproject.R;
import com.joincoded.androidproject.TransactionDetails;
import com.joincoded.androidproject.transactioninterface.TransactionListener;

import java.util.ArrayList;

public class TransactionAdapter extends RecyclerView.Adapter<TransactionAdapter.TransactionViewHolder> {
    ArrayList<Transaction> transactionList;
    TransactionListener transactionListener;

    public TransactionAdapter(ArrayList<Transaction> transactionList, TransactionListener transactionListener) {
        this.transactionList = transactionList;
        this.transactionListener = transactionListener;
    }

    @NonNull
    @Override
    public TransactionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.transactioncard,
                parent,
                false
        );

        return new TransactionViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TransactionAdapter.TransactionViewHolder holder, int position) {
        Transaction transaction = transactionList.get(position);
        holder.balanceTextView.setText(String.valueOf(transaction.getBalance()));
        holder.typeTextView.setText(String.valueOf(transaction.getTransactionType()));
        holder.amountTextView.setText(String.valueOf(transaction.getAmount()));
        holder.dateTextView.setText(transaction.getDate());
        holder.itemView.setOnClickListener(v -> {
                    transactionListener.onAccountItemClicker(transaction);
                }
        );

    }

    @Override
    public int getItemCount() {
       return transactionList.size();
    }


    public static class TransactionViewHolder extends RecyclerView.ViewHolder {
        TextView balanceTextView;
        TextView typeTextView;
        TextView amountTextView;
        TextView dateTextView;
        View itemView;

        public TransactionViewHolder(@NonNull View itemView) {
            super(itemView);
            this.itemView = itemView;
            balanceTextView = itemView.findViewById(R.id.balanceTextView);
            typeTextView = itemView.findViewById(R.id.typeTextView);
            amountTextView = itemView.findViewById(R.id.amountTextView);
            dateTextView = itemView.findViewById(R.id.dateTextView);


        }
    }
}



