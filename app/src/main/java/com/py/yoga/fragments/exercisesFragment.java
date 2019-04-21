package com.py.yoga.fragments;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.Resource;
import com.py.yoga.R;

import com.py.yoga.adapters.exercisesAdapter;
import com.py.yoga.object.exercise;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class exercisesFragment extends Fragment {


    RecyclerView recyclerView_e;
    public static List<exercise> exerciselist;
    ImageView imageView;

    exercisesAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_exercises,container,false);
        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        exerciselist = new ArrayList<>();
        recyclerView_e = (RecyclerView)view.findViewById(R.id.recyclerview_e);
        recyclerView_e.setHasFixedSize(true);
        recyclerView_e.setLayoutManager(new GridLayoutManager(this.getActivity(),2));


    exerciselist.add(new exercise(1,getActivity().getString(R.string.q),R.raw.yoga_urdhva_hastasana_d));
        exerciselist.add(new exercise(1,getActivity().getString(R.string.q),R.raw.yoga_urdhva_hastasana_d));
        exerciselist.add(new exercise(1,getActivity().getString(R.string.q),R.raw.yoga_urdhva_hastasana_d));
        exerciselist.add(new exercise(1,getActivity().getString(R.string.q),R.raw.yoga_urdhva_hastasana_d));
        exerciselist.add(new exercise(1,getActivity().getString(R.string.q),R.raw.yoga_urdhva_hastasana_d));
        exerciselist.add(new exercise(1,getActivity().getString(R.string.q),R.raw.yoga_urdhva_hastasana_d));
        exerciselist.add(new exercise(1,getActivity().getString(R.string.q),R.raw.yoga_urdhva_hastasana_d));
        exerciselist.add(new exercise(1,getActivity().getString(R.string.q),R.raw.yoga_urdhva_hastasana_d));
        exerciselist.add(new exercise(1,getActivity().getString(R.string.q),R.raw.yoga_urdhva_hastasana_d));
        exerciselist.add(new exercise(1,getActivity().getString(R.string.q),R.raw.yoga_urdhva_hastasana_d));
        exerciselist.add(new exercise(1,getActivity().getString(R.string.q),R.raw.yoga_urdhva_hastasana_d));
        exerciselist.add(new exercise(1,getActivity().getString(R.string.q),R.raw.yoga_urdhva_hastasana_d));
        exerciselist.add(new exercise(1,getActivity().getString(R.string.q),R.raw.yoga_urdhva_hastasana_d));
        exerciselist.add(new exercise(1,getActivity().getString(R.string.q),R.raw.yoga_urdhva_hastasana_d));
        exerciselist.add(new exercise(1,getActivity().getString(R.string.q),R.raw.yoga_urdhva_hastasana_d));
        exerciselist.add(new exercise(1,getActivity().getString(R.string.q),R.raw.yoga_urdhva_hastasana_d));
        exerciselist.add(new exercise(1,getActivity().getString(R.string.q),R.raw.yoga_urdhva_hastasana_d));
        exerciselist.add(new exercise(1,getActivity().getString(R.string.q),R.raw.yoga_urdhva_hastasana_d));
        exerciselist.add(new exercise(1,getActivity().getString(R.string.q),R.raw.yoga_urdhva_hastasana_d));
        exerciselist.add(new exercise(1,getActivity().getString(R.string.q),R.raw.yoga_urdhva_hastasana_d));
        exerciselist.add(new exercise(1,getActivity().getString(R.string.q),R.raw.yoga_urdhva_hastasana_d));
        exerciselist.add(new exercise(1,getActivity().getString(R.string.q),R.raw.yoga_urdhva_hastasana_d));
        exerciselist.add(new exercise(1,getActivity().getString(R.string.q),R.raw.yoga_urdhva_hastasana_d));
        exerciselist.add(new exercise(1,getActivity().getString(R.string.q),R.raw.yoga_urdhva_hastasana_d));



        adapter = new exercisesAdapter(getContext(),exerciselist);
        recyclerView_e.setAdapter(adapter);

    }
}
