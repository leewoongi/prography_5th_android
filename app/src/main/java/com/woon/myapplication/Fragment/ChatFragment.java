package com.woon.myapplication.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.woon.myapplication.R;
import com.woon.myapplication.RecyclerView.Data;
import com.woon.myapplication.RecyclerView.RecyclerAdapter;

public class ChatFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragmentchat, container, false);
        return rootView;
    }

    @Override
    //view = rootView
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initialize(view);
    }

    private void initialize(View view) {
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerAdapter adapter = new RecyclerAdapter();

        adapter.addItems(new Data("제목","감독", "설명","경무","2020","100"));
        adapter.addItems(new Data("제목","감독", "설명","경무","2020","100"));
        adapter.addItems(new Data("제목","감독", "설명","경무","2020","100"));
        adapter.addItems(new Data("제목","감독", "설명","경무","2020","100"));
        adapter.addItems(new Data("제목","감독", "설명","경무","2020","100"));
        adapter.addItems(new Data("제목","감독", "설명","경무","2020","100"));
        adapter.addItems(new Data("제목","감독", "설명","경무","2020","100"));
        adapter.addItems(new Data("제목","감독", "설명","경무","2020","100"));
        adapter.addItems(new Data("제목","감독", "설명","경무","2020","100"));
        adapter.addItems(new Data("제목","감독", "설명","경무","2020","100"));

        recyclerView.setAdapter(adapter);
    }
}
