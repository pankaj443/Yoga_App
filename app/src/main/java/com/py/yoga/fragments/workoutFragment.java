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

        workoutsList.add(new workout(1,R.drawable.wo_bg_1,getActivity().getString(R.string.b),"15 Minutes",getActivity().getString(R.string.n),"10 Excercises",getContext().getResources().getDrawable(R.drawable.begineer)));
        workoutsList.add(new workout(1,R.drawable.wo_bg_1,getActivity().getString(R.string.b1),"8 Minutes",getActivity().getString(R.string.n1),"11 Excercises",getContext().getResources().getDrawable(R.drawable.morning)));
        workoutsList.add(new workout(1,R.drawable.wo_bg_1,getActivity().getString(R.string.b2),"8 Minutes",getActivity().getString(R.string.n2),"13 Excercises",getContext().getResources().getDrawable(R.drawable.dynamic)));
        workoutsList.add(new workout(1,R.drawable.wo_bg_1,getActivity().getString(R.string.b3),"7 Minutes",getActivity().getString(R.string.n3),"11 Excercises",getContext().getResources().getDrawable(R.drawable.balance)));
        workoutsList.add(new workout(1,R.drawable.wo_bg_1,getActivity().getString(R.string.b4),"7 Minutes",getActivity().getString(R.string.n4),"11 Excercises",getContext().getResources().getDrawable(R.drawable.core)));
        workoutsList.add(new workout(1,R.drawable.wo_bg_1,getActivity().getString(R.string.b5),"10 Minutes",getActivity().getString(R.string.n5),"14 Excercises",getContext().getResources().getDrawable(R.drawable.sun)));
        workoutsList.add(new workout(1,R.drawable.wo_bg_1,getActivity().getString(R.string.b6),"10 Minutes",getActivity().getString(R.string.n6),"11 Excercises",getContext().getResources().getDrawable(R.drawable.power)));
        workoutsList.add(new workout(1,R.drawable.wo_bg_1,getActivity().getString(R.string.b7),"9 Minutes",getActivity().getString(R.string.n7),"12 Excercises",getContext().getResources().getDrawable(R.drawable.gentle)));
        workoutsList.add(new workout(1,R.drawable.wo_bg_1,getActivity().getString(R.string.b8),"7 Minutes",getActivity().getString(R.string.n8),"10 Excercises",getContext().getResources().getDrawable(R.drawable.twist)));
        workoutsList.add(new workout(1,R.drawable.wo_bg_1,getActivity().getString(R.string.b9),"15 Minutes",getActivity().getString(R.string.n9),"16 Excercises",getContext().getResources().getDrawable(R.drawable.back)));
        workoutsList.add(new workout(1,R.drawable.wo_bg_1,getActivity().getString(R.string.b10),"15 Minutes",getActivity().getString(R.string.n10),"10 Excercises",getContext().getResources().getDrawable(R.drawable.heart)));


        adapter = new workoutAdapter(getContext(),workoutsList);
        recyclerView.setAdapter(adapter);
    }

}
