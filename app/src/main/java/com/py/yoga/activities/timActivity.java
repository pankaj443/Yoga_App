package com.py.yoga.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.py.yoga.R;
import com.py.yoga.adapters.adrineAdapter;
import com.py.yoga.object.adrine;

import java.util.ArrayList;
import java.util.List;

public class timActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    public static List<adrine> adrineList;
    adrineAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tim);

        adrineList = new ArrayList<>();
        recyclerView = (RecyclerView)findViewById(R.id.adrineview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        adrineList.add(new adrine("bSMZknDI6bg","Pikachu",R.mipmap.icon1));





        adapter = new adrineAdapter(getApplicationContext(),adrineList);
        recyclerView.setAdapter(adapter);
    }
}
