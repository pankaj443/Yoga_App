package com.py.yoga.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.py.yoga.R;
import com.py.yoga.adapters.workoutAdapter;
import com.py.yoga.object.workout;


import java.util.ArrayList;
import java.util.List;

public class workoutFragment extends Fragment {

    RecyclerView recyclerView;
    public static List<workout> workoutsList;
    workoutAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_workout,container,false);
        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        workoutsList = new ArrayList<>();
        recyclerView = (RecyclerView)view.findViewById(R.id.workout_recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        workoutsList.add(new workout(1,R.drawable.wo_bg_1,"Morning Yoga","7 Minutes","A 7 minutes morning workout to start a wonderful day","11 Excercises"));
        workoutsList.add(new workout(1,R.drawable.wo_bg_1,"Morning Yoga","7 Minutes","A 7 minutes morning workout to start a wonderful day","13 Excercises"));

        adapter = new workoutAdapter(getContext(),workoutsList);
        recyclerView.setAdapter(adapter);
    }

}
