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
    public static List<tips> tipsList;
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

        tipsList.add(new tips(1,getActivity().getString(R.string.q),getActivity().getString(R.string.q1),R.mipmap.icon1));
        tipsList.add(new tips(2,getActivity().getString(R.string.w),getActivity().getString(R.string.w1),R.mipmap.icon2));
        tipsList.add(new tips(3,getActivity().getString(R.string.e),getActivity().getString(R.string.e1),R.mipmap.icon3));
        tipsList.add(new tips(4,getActivity().getString(R.string.r),getActivity().getString(R.string.r1),R.mipmap.icon4));
        tipsList.add(new tips(5,getActivity().getString(R.string.t),getActivity().getString(R.string.t1),R.mipmap.icon5));
        tipsList.add(new tips(6,getActivity().getString(R.string.y),getActivity().getString(R.string.y1),R.mipmap.icon6));
        tipsList.add(new tips(7,getActivity().getString(R.string.u),getActivity().getString(R.string.u1),R.mipmap.icon7));
        tipsList.add(new tips(8,getActivity().getString(R.string.i),getActivity().getString(R.string.i1),R.mipmap.icon8));
        tipsList.add(new tips(9,getActivity().getString(R.string.o),getActivity().getString(R.string.o1),R.mipmap.icon9));
        tipsList.add(new tips(10,getActivity().getString(R.string.p),getActivity().getString(R.string.p1),R.mipmap.icon10));
        tipsList.add(new tips(11,getActivity().getString(R.string.a),getActivity().getString(R.string.a1),R.mipmap.icon11));
        tipsList.add(new tips(12,getActivity().getString(R.string.s),getActivity().getString(R.string.s1),R.mipmap.icon12));
        tipsList.add(new tips(13,getActivity().getString(R.string.d),getActivity().getString(R.string.d1),R.mipmap.icon13));
        tipsList.add(new tips(14,getActivity().getString(R.string.f),getActivity().getString(R.string.f1),R.mipmap.icon14));
        tipsList.add(new tips(15,getActivity().getString(R.string.g),getActivity().getString(R.string.g1),R.mipmap.icon15));




        adapter = new tipsAdapter(getContext(),tipsList);
        recyclerView.setAdapter(adapter);
    }
}
