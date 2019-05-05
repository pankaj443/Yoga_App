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

public class chActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    public static List<adrine> adrineList;
    adrineAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch);


        adrineList = new ArrayList<>();
        recyclerView = (RecyclerView)findViewById(R.id.adrineview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        adrineList.add(new adrine("npZhY4fQWAY","Day 1 - Downward Facing Dog"));
        adrineList.add(new adrine("aowyw36KJfw","Day 2 - Plank"));
        adrineList.add(new adrine("phPxIeAloOk","Day 3 - Chaturanga Dandasana"));
        adrineList.add(new adrine("PMFkUfl8BtQ","Day 4 - Upward Facing Dog"));
        adrineList.add(new adrine("wxo0LL_zJqg","Day 5 - Warrior One"));
        adrineList.add(new adrine("s_-Vf9CFhwY","Day 6 - Warrior Two"));
        adrineList.add(new adrine("yLVDgypT5VU","Day 7 - Calm and Equanimous Mind"));
        adrineList.add(new adrine("co9tO1exHvM","Day 8 - Find Your Balance"));
        adrineList.add(new adrine("aulLVsiN0RQ","Day 9 - Grow Your Roots in Tree Pose"));
        adrineList.add(new adrine("vI7uJ1TWXOQ","Day 10 - Inner Thighs in Trikonasana"));
        adrineList.add(new adrine("Udse7R51_eY","Day 11 - Flow & Power in Utkatasana"));
        adrineList.add(new adrine("fWHSXCdVczs","Day 12 - Folding Deeply Forward"));
        adrineList.add(new adrine("mkpZBAbJYjQ","Day 13  - The Secrets of Core Strength"));
        adrineList.add(new adrine("Q8yG7fd1EdQ","Day 14  - Learn to Fly in Arm Balances"));
        adrineList.add(new adrine("-1jBgVnTxzc","Day 15  - Detox and Cleanse"));
        adrineList.add(new adrine("hAhJhlicJXM","Day 16  - Love Your Hips!"));
        adrineList.add(new adrine("3hBpMW_Obl8","Day 17  - Power and Flow in Parsvakonasana"));
        adrineList.add(new adrine("aMcbHhNNe-Y","Day 18  - Yoga for Inner Peace"));
        adrineList.add(new adrine("LBgRLHi-EBo","Day 19  - Open Your Heart"));
        adrineList.add(new adrine("UV9O7IeTcu0","Day 20  - Yoga for Patience and Kindness"));
        adrineList.add(new adrine("45vM2MHwOmQ","Day 21  - Plank it Out for Strong Shoulders!"));
        adrineList.add(new adrine("YU-p5MdS6_E","Day 22  - Strong Spirit, Quiet Mind"));
        adrineList.add(new adrine("2t_veZk2k-Q","Day 23  - Love Your Body"));
        adrineList.add(new adrine("EU4RT9r9Mz4","Day 24  - Be Brave in Backbends!"));
        adrineList.add(new adrine("GRzGKDZnkrI","Day 25  - Backbend Madness"));
        adrineList.add(new adrine("LvxBTGUnXWY","Day 26  - Reverse Plank"));
        adrineList.add(new adrine("sGA6L5f-Zo0","Day 27  - Unlock Forward Folds"));
        adrineList.add(new adrine("nZmJ9cb6WfM","Day 28  - Conquer Headstand and Be Strong"));
        adrineList.add(new adrine("C5SzVtZ6lfo","Day 29  - The Playful Dolphin for Strong Shoulders and Core"));
        adrineList.add(new adrine("ow8CgMAjaOQ","Day 30  - Beginner Ashtanga Yoga"));
        adrineList.add(new adrine("jzV2MIpy2iw","Bonus! Day 31  : Let It All Go, Just Relax"));





        adapter = new adrineAdapter(getApplicationContext(),adrineList);
        recyclerView.setAdapter(adapter);
    }
}
