package com.example.actividad1_4;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MyActivity extends Activity {
    private RecyclerView mRecyclerView;
    private MyAdapter mAdapter;

    private static final String[] myDataSet = {
            "PHP",
            "JavaScript",
            "Go",
            "Python"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_activity);

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(layoutManager);

        mAdapter = new MyAdapter(myDataSet);
        mRecyclerView.setAdapter(mAdapter);
    }


}
