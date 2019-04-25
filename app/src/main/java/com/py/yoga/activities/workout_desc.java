package com.py.yoga.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.py.yoga.R;
import com.py.yoga.adapters.wo_exe_Adapter;
import com.py.yoga.adapters.workoutAdapter;
import com.py.yoga.object.wo_exe;
import com.py.yoga.object.workout;

import java.util.ArrayList;
import java.util.List;

import static java.security.AccessController.getContext;

import com.py.yoga.R;

public class workout_desc extends AppCompatActivity {

    RecyclerView recyclerView;
    public static List<wo_exe> List,List1,List2,List3,List4,List5,List6,List7,List8,List9,List10;
    wo_exe_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_desc);

        Intent i=getIntent();

        TextView title=findViewById(R.id.wo_d_name);
        title.setText(i.getStringExtra("title"));

        String temp = title.getText().toString();

        TextView total=findViewById(R.id.wo_d_totalexe);
        total.setText(i.getStringExtra("total"));

        TextView dur=findViewById(R.id.wo_d_dur);
        dur.setText(i.getStringExtra("dur"));

        TextView desc=findViewById(R.id.wo_d_desc);
        desc.setText(i.getStringExtra("desc"));




        List = new ArrayList<>();
        List1 = new ArrayList<>();
        List2 = new ArrayList<>();
        List3 = new ArrayList<>();
        List4 = new ArrayList<>();
        List5 = new ArrayList<>();
        List6 = new ArrayList<>();
        List7 = new ArrayList<>();
        List8 = new ArrayList<>();
        List9 = new ArrayList<>();
        List10 = new ArrayList<>();

        recyclerView = (RecyclerView)findViewById((R.id.wo_desc_recyclerView));;
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));


        List.add(new wo_exe(2,"Pankaj"));
        List.add(new wo_exe(2,"Pankaj"));
        List.add(new wo_exe(2,"Pankaj"));
        List.add(new wo_exe(2,"Pankaj"));
        List.add(new wo_exe(2,"Pankaj"));
        List.add(new wo_exe(2,"Pankaj"));
        List.add(new wo_exe(2,"Pankaj"));
        List.add(new wo_exe(2,"Pankaj"));
        List.add(new wo_exe(2,"Pankaj"));
        List.add(new wo_exe(2,"Pankaj"));


        List1.add(new wo_exe(1,"Shailesh"));
        List1.add(new wo_exe(1,"Shailesh"));
        List1.add(new wo_exe(1,"Shailesh"));
        List1.add(new wo_exe(1,"Shailesh"));
        List1.add(new wo_exe(1,"Shailesh"));
        List1.add(new wo_exe(1,"Shailesh"));
        List1.add(new wo_exe(1,"Shailesh"));
        List1.add(new wo_exe(1,"Shailesh"));
        List1.add(new wo_exe(1,"Shailesh"));
        List1.add(new wo_exe(1,"Shailesh"));
        List1.add(new wo_exe(1,"Shailesh"));



        List2.add(new wo_exe(1,"Shailesh"));
        List2.add(new wo_exe(1,"Shailesh"));
        List2.add(new wo_exe(1,"Shailesh"));
        List2.add(new wo_exe(1,"Shailesh"));
        List2.add(new wo_exe(1,"Shailesh"));
        List2.add(new wo_exe(1,"Shailesh"));
        List2.add(new wo_exe(1,"Shailesh"));
        List2.add(new wo_exe(1,"Shailesh"));
        List2.add(new wo_exe(1,"Shailesh"));
        List2.add(new wo_exe(1,"Shailesh"));
        List2.add(new wo_exe(1,"Shailesh"));
        List2.add(new wo_exe(1,"Shailesh"));
        List2.add(new wo_exe(1,"Shailesh"));




        List3.add(new wo_exe(1,"Shailesh"));
        List3.add(new wo_exe(1,"Shailesh"));
        List3.add(new wo_exe(1,"Shailesh"));
        List3.add(new wo_exe(1,"Shailesh"));
        List3.add(new wo_exe(1,"Shailesh"));
        List3.add(new wo_exe(1,"Shailesh"));
        List3.add(new wo_exe(1,"Shailesh"));
        List3.add(new wo_exe(1,"Shailesh"));
        List3.add(new wo_exe(1,"Shailesh"));
        List3.add(new wo_exe(1,"Shailesh"));
        List3.add(new wo_exe(1,"Shailesh"));




        List4.add(new wo_exe(1,"Shailesh"));
        List4.add(new wo_exe(1,"Shailesh"));
        List4.add(new wo_exe(1,"Shailesh"));
        List4.add(new wo_exe(1,"Shailesh"));
        List4.add(new wo_exe(1,"Shailesh"));
        List4.add(new wo_exe(1,"Shailesh"));
        List4.add(new wo_exe(1,"Shailesh"));
        List4.add(new wo_exe(1,"Shailesh"));
        List4.add(new wo_exe(1,"Shailesh"));
        List4.add(new wo_exe(1,"Shailesh"));
        List4.add(new wo_exe(1,"Shailesh"));





        List5.add(new wo_exe(1,"Shailesh"));
        List5.add(new wo_exe(1,"Shailesh"));
        List5.add(new wo_exe(1,"Shailesh"));
        List5.add(new wo_exe(1,"Shailesh"));
        List5.add(new wo_exe(1,"Shailesh"));
        List5.add(new wo_exe(1,"Shailesh"));
        List5.add(new wo_exe(1,"Shailesh"));
        List5.add(new wo_exe(1,"Shailesh"));
        List5.add(new wo_exe(1,"Shailesh"));
        List5.add(new wo_exe(1,"Shailesh"));
        List5.add(new wo_exe(1,"Shailesh"));
        List5.add(new wo_exe(1,"Shailesh"));
        List5.add(new wo_exe(1,"Shailesh"));
        List5.add(new wo_exe(1,"Shailesh"));




        List6.add(new wo_exe(1,"Shailesh"));
        List6.add(new wo_exe(1,"Shailesh"));
        List6.add(new wo_exe(1,"Shailesh"));
        List6.add(new wo_exe(1,"Shailesh"));
        List6.add(new wo_exe(1,"Shailesh"));
        List6.add(new wo_exe(1,"Shailesh"));
        List6.add(new wo_exe(1,"Shailesh"));
        List6.add(new wo_exe(1,"Shailesh"));
        List6.add(new wo_exe(1,"Shailesh"));
        List6.add(new wo_exe(1,"Shailesh"));
        List6.add(new wo_exe(1,"Shailesh"));




        List7.add(new wo_exe(1,"Shailesh"));
        List7.add(new wo_exe(1,"Shailesh"));
        List7.add(new wo_exe(1,"Shailesh"));
        List7.add(new wo_exe(1,"Shailesh"));
        List7.add(new wo_exe(1,"Shailesh"));
        List7.add(new wo_exe(1,"Shailesh"));
        List7.add(new wo_exe(1,"Shailesh"));
        List7.add(new wo_exe(1,"Shailesh"));
        List7.add(new wo_exe(1,"Shailesh"));
        List7.add(new wo_exe(1,"Shailesh"));
        List7.add(new wo_exe(1,"Shailesh"));
        List7.add(new wo_exe(1,"Shailesh"));






        List8.add(new wo_exe(1,"Shailesh"));
        List8.add(new wo_exe(1,"Shailesh"));
        List8.add(new wo_exe(1,"Shailesh"));
        List8.add(new wo_exe(1,"Shailesh"));
        List8.add(new wo_exe(1,"Shailesh"));
        List8.add(new wo_exe(1,"Shailesh"));
        List8.add(new wo_exe(1,"Shailesh"));
        List8.add(new wo_exe(1,"Shailesh"));
        List8.add(new wo_exe(1,"Shailesh"));
        List8.add(new wo_exe(1,"Shailesh"));





        List9.add(new wo_exe(1,"Shailesh"));
        List9.add(new wo_exe(1,"Shailesh"));
        List9.add(new wo_exe(1,"Shailesh"));
        List9.add(new wo_exe(1,"Shailesh"));
        List9.add(new wo_exe(1,"Shailesh"));
        List9.add(new wo_exe(1,"Shailesh"));
        List9.add(new wo_exe(1,"Shailesh"));
        List9.add(new wo_exe(1,"Shailesh"));
        List9.add(new wo_exe(1,"Shailesh"));
        List9.add(new wo_exe(1,"Shailesh"));
        List9.add(new wo_exe(1,"Shailesh"));
        List9.add(new wo_exe(1,"Shailesh"));
        List9.add(new wo_exe(1,"Shailesh"));
        List9.add(new wo_exe(1,"Shailesh"));
        List9.add(new wo_exe(1,"Shailesh"));
        List9.add(new wo_exe(1,"Shailesh"));


        List10.add(new wo_exe(1,"Shailesh"));
        List10.add(new wo_exe(1,"Shailesh"));
        List10.add(new wo_exe(1,"Shailesh"));
        List10.add(new wo_exe(1,"Shailesh"));
        List10.add(new wo_exe(1,"Shailesh"));
        List10.add(new wo_exe(1,"Shailesh"));
        List10.add(new wo_exe(1,"Shailesh"));
        List10.add(new wo_exe(1,"Shailesh"));
        List10.add(new wo_exe(1,"Shailesh"));
        List10.add(new wo_exe(1,"Shailesh"));






        Log.i("MSG",temp.substring(0,2));
        if (temp.substring(0,2).equals("Be"))
        adapter = new wo_exe_Adapter(getApplicationContext(),List);

        else if (temp.substring(0,2).equals("Mo"))
            adapter = new wo_exe_Adapter(getApplicationContext(),List1);

        else if (temp.substring(0,2).equals("Dy"))
            adapter = new wo_exe_Adapter(getApplicationContext(),List2);
        else if (temp.substring(0,2).equals("Yo"))
            adapter = new wo_exe_Adapter(getApplicationContext(),List3);
        else if (temp.substring(0,2).equals("Co"))
            adapter = new wo_exe_Adapter(getApplicationContext(),List4);
        else if (temp.substring(0,2).equals("Su"))
            adapter = new wo_exe_Adapter(getApplicationContext(),List5);
        else if (temp.substring(0,2).equals("Po"))
            adapter = new wo_exe_Adapter(getApplicationContext(),List6);
        else if (temp.substring(0,2).equals("Ge"))
            adapter = new wo_exe_Adapter(getApplicationContext(),List7);
        else if (temp.substring(0,2).equals("Tw"))
            adapter = new wo_exe_Adapter(getApplicationContext(),List8);
        else if (temp.substring(0,2).equals("Ba"))
            adapter = new wo_exe_Adapter(getApplicationContext(),List9);
        else if (temp.substring(0,2).equals("He"))
            adapter = new wo_exe_Adapter(getApplicationContext(),List10);



        recyclerView.setAdapter(adapter);
    }
}


