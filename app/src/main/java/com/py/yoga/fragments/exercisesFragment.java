package com.py.yoga.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.py.yoga.R;

import com.py.yoga.adapters.exercisesAdapter;
import com.py.yoga.object.exercise;

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


        exerciselist.add(new exercise(1,getActivity().getString(R.string.x1),R.raw.utkatasana));
        exerciselist.add(new exercise(2,getActivity().getString(R.string.x2),R.raw.garudasana));
        exerciselist.add(new exercise(3,getActivity().getString(R.string.x3),R.raw.utthita_parsvakonasana));
        exerciselist.add(new exercise(4,getActivity().getString(R.string.x4),R.raw.parighasana));
        exerciselist.add(new exercise(5,getActivity().getString(R.string.x5),R.raw.natarajasana));
        exerciselist.add(new exercise(6,getActivity().getString(R.string.x6),R.raw.adho_mukha_svanasana));
        exerciselist.add(new exercise(7,getActivity().getString(R.string.x7),R.raw.tadasana));
        exerciselist.add(new exercise(8,getActivity().getString(R.string.x8),R.raw.urdhva_prasarita_eka_padasana));
        exerciselist.add(new exercise(9,getActivity().getString(R.string.x9),R.raw.vrksasana));
        exerciselist.add(new exercise(10,getActivity().getString(R.string.x10),R.raw.anjaneyasana));
        exerciselist.add(new exercise(11,getActivity().getString(R.string.x11),R.raw.bharadvajasana));
        exerciselist.add(new exercise(12,getActivity().getString(R.string.x12),R.raw.ardha_matsyendrasana));
        exerciselist.add(new exercise(13,getActivity().getString(R.string.x13),R.raw.marichyasana));
        exerciselist.add(new exercise(14,getActivity().getString(R.string.x14),R.raw.parivrtta_parsvakonasana));
        exerciselist.add(new exercise(15,getActivity().getString(R.string.x15),R.raw.parivrtta_janu_sirsasana));
        exerciselist.add(new exercise(16,getActivity().getString(R.string.x16),R.raw.paschimottanasana));
        exerciselist.add(new exercise(17,getActivity().getString(R.string.x17),R.raw.janu_sirsasana));
        exerciselist.add(new exercise(18,getActivity().getString(R.string.x18),R.raw.upavistha_konasana));
        exerciselist.add(new exercise(19,getActivity().getString(R.string.x19),R.raw.dhanurasana));
        exerciselist.add(new exercise(20,getActivity().getString(R.string.x20),R.raw.urdhva_dhanurasana));
        exerciselist.add(new exercise(21,getActivity().getString(R.string.x21),R.raw.urdhva_mukha_svanasana));
        exerciselist.add(new exercise(22,getActivity().getString(R.string.x22),R.raw.tolasana));
        exerciselist.add(new exercise(23,getActivity().getString(R.string.x23),R.raw.eka_pada_koundinyanasana));
        exerciselist.add(new exercise(24,getActivity().getString(R.string.x24),R.raw.kapotasana));
        exerciselist.add(new exercise(25,getActivity().getString(R.string.x25),R.raw.bhujangasana));
        exerciselist.add(new exercise(26,getActivity().getString(R.string.x26),R.raw.virasana));
        exerciselist.add(new exercise(27,getActivity().getString(R.string.x27),R.raw.bitilasana));
        exerciselist.add(new exercise(28,getActivity().getString(R.string.x28),R.raw.dandasana));
        exerciselist.add(new exercise(29,getActivity().getString(R.string.x29),R.raw.purvottanasana));
        exerciselist.add(new exercise(30,getActivity().getString(R.string.x30),R.raw.ustrasana));



        adapter = new exercisesAdapter(getContext(),exerciselist);
        recyclerView_e.setAdapter(adapter);

    }
}
