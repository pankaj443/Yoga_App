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

public class youtubeListActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    public static List<adrine> adrineList;
    adrineAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube_list);

        adrineList = new ArrayList<>();
        recyclerView = (RecyclerView)findViewById(R.id.adrineview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        adrineList.add(new adrine("oBu-pQG6sTY","Day 1 - Ease Into It"));
        adrineList.add(new adrine("TB2ISQZ5Mb0","Day 2 - Stretch & Soothe"));
        adrineList.add(new adrine("FqGHWXjgn-M","Day 3 - Forget What You Know "));
        adrineList.add(new adrine("gLQsM6geGzs","Day 4 - Yoga For Your Back "));
        adrineList.add(new adrine("mHb71QonmXo","Day 5 - FEEL ALIVE FLOW"));
        adrineList.add(new adrine("tWPpdP4IhEY","Day 6 - SIX PACK ABS "));
        adrineList.add(new adrine("P1SvHXqenPs","Day 7 - Total Body Yoga"));
        adrineList.add(new adrine("UlW77conmAc","Day 8 - Yoga For Healing & Meditation"));
        adrineList.add(new adrine("1erFYeJo_r4","Day 9 - Full Potential Detox Practice"));
        adrineList.add(new adrine("8AakYeM23sI","Day 10 - 10 min Sun Salutation Practice"));
        adrineList.add(new adrine("6mDyGogsMtQ","Day 11 - Shakti Yoga Practice"));
        adrineList.add(new adrine("PZwc6gWmOyQ","Day 12 - Yoga For Spinal Health"));
        adrineList.add(new adrine("yM3SzM2NPj0","Day 13 - Endurance & Ease"));
        adrineList.add(new adrine("4nbfvTXGSmA","Day 14 - Mindful Hatha Yoga Workout"));
        adrineList.add(new adrine("q17VxeBtKeY","Day 15 - Half Hour Half Moon Practice"));
        adrineList.add(new adrine("oifIkMgm40o","Day 16 - Easy Breezy Beautiful Yoga"));
        adrineList.add(new adrine("kYkWDrKlCfE","Day 17 - Happiness Boost Yoga"));
        adrineList.add(new adrine("jMvX8EV_OlU","Day 18 - Wonder Yoga!"));
        adrineList.add(new adrine("D-46IdZwYjE","Day 19 - Breath & Body Practice"));
        adrineList.add(new adrine("0I8w5iAogaM","Day 20 - Heart Practice "));
        adrineList.add(new adrine("LP64pPFx8Mc","Day 21 - Joyful Home Practice"));
        adrineList.add(new adrine("k-A6uxFleL0","Day 22 - Full Body Awareness"));
        adrineList.add(new adrine("7fR9Lamq0ms","Day 23 - Freedom & Forgiveness"));
        adrineList.add(new adrine("pJUKw4LwkXM","Day 24 - Gentle Yummy Yoga"));
        adrineList.add(new adrine("FMZtaaGxzsc","Day 25 - Dancing Warrior Sequence"));
        adrineList.add(new adrine("cd46opJN00s","Day 26 - Earth Practice, Total Body Yoga"));
        adrineList.add(new adrine("j5cE7h51nLQ","Day 27 - Flexible, Fearless and FUN YOGA"));
        adrineList.add(new adrine("vljYUYebZtY","Day 28 - Playful Yoga Practice"));
        adrineList.add(new adrine("VIAM_cjkLyo","Day 29 - Sweet Surrender"));
        adrineList.add(new adrine("3clA1GUh-0Q","Day 30 - Find What Feels Good"));
        




        adapter = new adrineAdapter(getApplicationContext(),adrineList);
        recyclerView.setAdapter(adapter);
    }
}
