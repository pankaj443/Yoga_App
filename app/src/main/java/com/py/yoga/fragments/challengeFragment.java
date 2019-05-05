package com.py.yoga.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.py.yoga.R;
import com.py.yoga.activities.chActivity;
import com.py.yoga.activities.timActivity;
import com.py.yoga.activities.youtubeListActivity;

public class challengeFragment extends Fragment {

    ImageView adrine,challenfe,tim;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_challenge,container,false);
        return v;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        adrine = view.findViewById(R.id.adrine);
        tim = view.findViewById(R.id.tim);
        challenfe = view.findViewById(R.id.challenge);

        adrine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), youtubeListActivity.class);
                startActivity(intent);
            }
        });
        tim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), timActivity.class);
                startActivity(intent);
            }
        });

        challenfe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), chActivity.class);
                startActivity(intent);
            }
        });


    }
}
