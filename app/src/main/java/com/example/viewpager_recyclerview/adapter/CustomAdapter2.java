package com.example.viewpager_recyclerview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.viewpager_recyclerview.R;
import com.example.viewpager_recyclerview.fragments.Page1;
import com.example.viewpager_recyclerview.fragments.Page2;
import com.example.viewpager_recyclerview.model.Contacts;
import com.example.viewpager_recyclerview.model.Users;

import java.util.List;

public class CustomAdapter2 extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    Page2 page2;
    List<Users> users;

    public CustomAdapter2(Page2 page2, List<Users> users) {
        this.page2 = page2;
        this.users = users;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_custom_users,parent,false);
        return new CustomViewHolder2(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        Users user  = users.get(position);


        if(holder instanceof  CustomViewHolder2) {
            TextView user_name = ((CustomViewHolder2) holder).tv_name;

            user_name.setText(user.getUser());
        }
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    private class CustomViewHolder2 extends RecyclerView.ViewHolder {
        View view;
        TextView tv_name,tv_phoneNumber;
        public CustomViewHolder2(View v) {
            super(v);
            view = v;
            tv_name = view.findViewById(R.id.tv_user);
        }
    }
}
