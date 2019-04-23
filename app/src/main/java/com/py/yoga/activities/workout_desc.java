package com.py.yoga.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import com.py.yoga.R;
import com.py.yoga.adapters.wo_exe_Adapter;
import com.py.yoga.adapters.workoutAdapter;
import com.py.yoga.object.wo_exe;
import com.py.yoga.object.workout;

import java.util.ArrayList;
import java.util.List;

import static java.security.AccessController.getContext;

public class workout_desc extends AppCompatActivity {

    RecyclerView recyclerView;
    public static List<wo_exe> List;
    wo_exe_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_desc);

        Intent i=getIntent();

        TextView title=findViewById(R.id.wo_d_name);
        title.setText(i.getStringExtra("title"));

        TextView total=findViewById(R.id.wo_d_totalexe);
        total.setText(i.getStringExtra("total"));

        TextView dur=findViewById(R.id.wo_d_dur);
        dur.setText(i.getStringExtra("dur"));

        TextView desc=findViewById(R.id.wo_d_desc);
        desc.setText(i.getStringExtra("desc"));




        List = new ArrayList<>();
        recyclerView = (RecyclerView)findViewById((R.id.wo_desc_recyclerView));;
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        List.add(new wo_exe(1,"Stand up"));
        List.add(new wo_exe(2,"Wake up"));

        adapter = new wo_exe_Adapter(getApplicationContext(),List);
        recyclerView.setAdapter(adapter);
    }
}


