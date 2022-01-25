package com.example.viewpager_recyclerview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.viewpager_recyclerview.R;
import com.example.viewpager_recyclerview.fragments.Page3;
import com.example.viewpager_recyclerview.model.Posts;

import java.util.List;

public class CustomAdapter3 extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    Page3 page3;
    List<Posts> posts;

    public CustomAdapter3(Page3 page3, List<Posts> posts) {
        this.page3 = page3;
        this.posts = posts;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_custom_posts,parent,false);
        return new CustomViewHolder3(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        Posts post  = posts.get(position);


        if(holder instanceof  CustomViewHolder3) {
            TextView post_name = ((CustomViewHolder3) holder).tv_postName;
            TextView post_rate = ((CustomViewHolder3) holder).tv_post_rate;

            post_name.setText(post.getPstName());
            post_rate.setText(post.getRating().toString());
        }
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    private class CustomViewHolder3 extends RecyclerView.ViewHolder {
        View view;
        TextView tv_postName,tv_post_rate;
        public CustomViewHolder3(View v) {
            super(v);
            view = v;
            tv_postName = view.findViewById(R.id.tv_post_name);
            tv_post_rate = view.findViewById(R.id.tv_post_rate);
        }
    }
}
