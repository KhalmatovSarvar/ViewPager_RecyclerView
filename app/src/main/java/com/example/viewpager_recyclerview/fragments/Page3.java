package com.example.viewpager_recyclerview.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.viewpager_recyclerview.R;
import com.example.viewpager_recyclerview.adapter.CustomAdapter2;
import com.example.viewpager_recyclerview.adapter.CustomAdapter3;
import com.example.viewpager_recyclerview.model.Posts;
import com.example.viewpager_recyclerview.model.Users;

import java.util.ArrayList;
import java.util.List;

public class Page3 extends Fragment {
    RecyclerView recyclerView3;

    public Page3(){}

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_3,container,false);
        recyclerView3 = view.findViewById(R.id.recyclerView_3);
        recyclerView3.setLayoutManager(new GridLayoutManager(view.getContext(), 1));

        List<Posts> posts = preparePostList();
        CustomAdapter3 adapter = new CustomAdapter3(this,posts);
        recyclerView3.setAdapter(adapter);
        return view;
    }

    private List<Posts> preparePostList() {
        List<Posts> posts = new ArrayList<>();
        for(int i = 0; i<20; i++){
            posts.add(new Posts("Post "+i,0.1+i));
        }
        return posts;
    }
}
