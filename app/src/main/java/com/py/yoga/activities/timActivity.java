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

        adrineList.add(new adrine("kJjfle7CEwI","Day 1 - Workout"));
        adrineList.add(new adrine("8KzS9SGu-1Q","DAY 2 - The  Workout Challenge"));
        adrineList.add(new adrine("PMBCcfQLz4M","Day 3 : Morning Yoga Flow Workout"));
        adrineList.add(new adrine("EPct1l3-PqQ","DAY 4 - The  Workout Challenge"));
        adrineList.add(new adrine("gBPdcEYafic","DAY 5 - Strength and Balance Vinyasa Yoga Workout"));
        adrineList.add(new adrine("j_k_ashA7Dk","DAY 6 - Strength Balance and Flexibility Vinyasa Yoga Workout "));
        adrineList.add(new adrine("By3EOl-6Prw","Day 7 - Restore and Balance "));
        adrineList.add(new adrine("qmT7xCTTdAY","Day 8 - Morning Yoga Vinyasa Flow Workout"));
        adrineList.add(new adrine("SNl5l9QJuFQ","Day 9 - Total Body Yoga Burn Workout Workout Challenge"));
        adrineList.add(new adrine("4_bgWxT0Z4o","Day 10 : Morning Yoga Vinyasa Flow Workout"));
        adrineList.add(new adrine("CDfKySrerQc","Day 11  Challenge - Restorative Day or Bedtime Yoga "));
        adrineList.add(new adrine("WlHyUX-_sRg","Day 12 : 15 minute Strength and Flexibility Morning"));
        adrineList.add(new adrine("bSAELy2EbeQ","Day 13 - Burn Workout Vinyasa Flow "));
        adrineList.add(new adrine("n7cqm061k_o","Day 14 - Workout Challenge - Restore and Balance"));
        adrineList.add(new adrine("3fkbmGy7LTA","DAY 15 - Strength and Flexibility Vinyasa Yoga Workout"));
        adrineList.add(new adrine("7QJsmX6Dbcs","Day 16 - Burn Vinyasa Flow Workout"));
        adrineList.add(new adrine("f9IxhO0361o","Day 17 - Vinyasa Flow Workout Strength Balance and Flexibility "));
        adrineList.add(new adrine("71cOh0Gbc-A","Day 18 - Challenge - Yoga for Bedtime Relax and Restore"));
        adrineList.add(new adrine("d5DsJPm1OtI","Day 19 - 20 minute Strength and Flexibility Morning "));
        adrineList.add(new adrine("lmQwE9IygYc","Day 20 - Workout: 10 minute Flexibility Mobility Training"));
        adrineList.add(new adrine("Kp7zq-4-ws0","Day 21 - Pranayama and Meditation Day"));
        adrineList.add(new adrine("ASmjQsZUm1Q","DAY 22 - The Warm Up - Strength and Flexibility "));
        adrineList.add(new adrine("9wZqt05uv8E","DAY 23 - Challenge Strength and Flexibility Detox "));
        adrineList.add(new adrine("swqfJG4wgNU","Day 24 - Burn Detox Vinyasa Flow Workout Arm Balance Challenge"));
        adrineList.add(new adrine("7Hy1knkKQdg","DAY 25 - Arm Balance and Inversion - Detox Vinyasa Flow "));
        adrineList.add(new adrine("dMxqKaejsDg","DAY 26 - Stretch and Restore Hip & Shoulder Openers "));
        adrineList.add(new adrine("zF__S7M8ptI","DAY 27 - Arm Balance and Inversion  "));
        adrineList.add(new adrine("ZKMmRiA3R1s","DAY 28 - Stretch - Restorative Hip & Psoas Openers "));
        adrineList.add(new adrine("mGTQ_rOW8c0","Day 29 - Total Body Warm Up for Sports & Exercise"));
        adrineList.add(new adrine("ewCYwqH36v0","Day 30 - Challenge "));





        adapter = new adrineAdapter(getApplicationContext(),adrineList);
        recyclerView.setAdapter(adapter);
    }
}
