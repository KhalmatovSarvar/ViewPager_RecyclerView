package com.example.viewpager_recyclerview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.viewpager_recyclerview.R;
import com.example.viewpager_recyclerview.fragments.Page1;
import com.example.viewpager_recyclerview.model.Contacts;

import java.util.List;

public class CustomAdapter1 extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    Page1 page1;
    List<Contacts> contacts;

    public CustomAdapter1(Page1 page1, List<Contacts> contacts) {
        this.page1 = page1;
        this.contacts = contacts;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_custom_contacts,parent,false);
        return new CustomViewHolder1(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        Contacts contact  = contacts.get(position);


        if(holder instanceof  CustomViewHolder1) {
            TextView name = ((CustomViewHolder1) holder).tv_name;
            TextView phone = ((CustomViewHolder1) holder).tv_phoneNumber;

            name.setText(contact.getName());
            phone.setText(contact.getPhone_num());
        }
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    private class CustomViewHolder1 extends RecyclerView.ViewHolder {
        View view;
        TextView tv_name,tv_phoneNumber;
        public CustomViewHolder1(View v) {
            super(v);
            view = v;
            tv_name = view.findViewById(R.id.tv_name);
            tv_phoneNumber = view.findViewById(R.id.tv_phone_number);
        }
    }
}
