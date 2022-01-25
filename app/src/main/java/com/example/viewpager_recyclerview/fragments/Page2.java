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
import com.example.viewpager_recyclerview.adapter.CustomAdapter1;
import com.example.viewpager_recyclerview.adapter.CustomAdapter2;
import com.example.viewpager_recyclerview.model.Contacts;
import com.example.viewpager_recyclerview.model.Users;

import java.util.ArrayList;
import java.util.List;

public class Page2 extends Fragment {
RecyclerView recyclerView2;
    public Page2(){}

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_2,container,false);

        recyclerView2 = view.findViewById(R.id.recyclerView_2);
        recyclerView2.setLayoutManager(new GridLayoutManager(view.getContext(), 1));

        List<Users> users = prepareUserList();
        CustomAdapter2 adapter = new CustomAdapter2(this,users);
        recyclerView2.setAdapter(adapter);
        return view;

    }

    private List<Users> prepareUserList() {
        List<Users> users = new ArrayList<>();
        for(int i = 0; i<20; i++){
            users.add(new Users("position of user "+i));
        }
        return users;

    }
}
