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
import com.py.yoga.adapters.tipsAdapter;
import com.py.yoga.object.tips;

import java.util.ArrayList;
import java.util.List;

public class tipsFragment extends Fragment {

    RecyclerView recyclerView;
    List<tips> tipsList;
    tipsAdapter  adapter;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_tips,container,false);
        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        tipsList = new ArrayList<>();
        recyclerView = (RecyclerView)view.findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        tipsList.add(new tips(1,R.string.q,R.mipmap.icon1));
        tipsList.add(new tips(2,R.string.w,R.mipmap.icon2));
        tipsList.add(new tips(3,R.string.e,R.mipmap.icon3));
        tipsList.add(new tips(4,R.string.r,R.mipmap.icon4));
        tipsList.add(new tips(5,R.string.t,R.mipmap.icon5));
        tipsList.add(new tips(6,R.string.y,R.mipmap.icon6));
        tipsList.add(new tips(7,R.string.u,R.mipmap.icon7));
        tipsList.add(new tips(8,R.string.i,R.mipmap.icon8));
        tipsList.add(new tips(9,R.string.o,R.mipmap.icon9));
        tipsList.add(new tips(10,R.string.p,R.mipmap.icon10));
        tipsList.add(new tips(11,R.string.a,R.mipmap.icon11));
        tipsList.add(new tips(12,R.string.s,R.mipmap.icon12));
        tipsList.add(new tips(13,R.string.d,R.mipmap.icon13));
        tipsList.add(new tips(14,R.string.f,R.mipmap.icon14));
        tipsList.add(new tips(15,R.string.g,R.mipmap.icon15));



        adapter = new tipsAdapter(getContext(),tipsList);
        recyclerView.setAdapter(adapter);
    }
}
