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
import com.example.viewpager_recyclerview.model.Contacts;

import java.util.ArrayList;
import java.util.List;

public class Page1 extends Fragment {
    RecyclerView recyclerView1;
    public Page1(){}

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1,container,false);

        recyclerView1 = view.findViewById(R.id.recyclerView_1);
        recyclerView1.setLayoutManager(new GridLayoutManager(view.getContext(), 1));

        List<Contacts> contacts = prepareContactList();
        CustomAdapter1 adapter = new CustomAdapter1(this,contacts);
        recyclerView1.setAdapter(adapter);
        return view;

    }

    private List<Contacts> prepareContactList() {
        List<Contacts> contacts = new ArrayList<>();
        for(int i = 0; i<20; i++){
            contacts.add(new Contacts("Sarvar "+i,"9375957"+i));
        }
        return contacts;

    }
}
