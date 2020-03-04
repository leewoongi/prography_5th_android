package com.woon.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.woon.myapplication.RecyclerView.Data;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {

    private TextView dTitle;
    private TextView dScore;
    private TextView dDescription;
    private ArrayList<Data> dataList = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        Data d = intent.getParcelableExtra("DATA");

        initialize();
        printUi(d);

    }


    private void initialize() {
        dTitle = findViewById(R.id.detailTitle);
        dScore = findViewById(R.id.detailScore);
        dDescription = findViewById(R.id.detailDescription);
    }

    private void printUi(Data d) {
        dTitle.setText(d.getTitle() + "\n" + ("" + d.getReleaseDate()));
        dScore.setText("평점 : " + "" + d.getRtScore());
        dDescription.setText("감독 : " +d.getDirector() + "\n"+ "\n" + "제작 : " + d.getProducer() + "\n" + "\n" + "내용 : " + d.getDescription());
    }
}
