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


        exerciselist.add(new exercise(1,getActivity().getString(R.string.x1),R.raw.utkatasana,getActivity().getString(R.string.z1)));
        exerciselist.add(new exercise(2,getActivity().getString(R.string.x2),R.raw.garudasana,getActivity().getString(R.string.z2)));
        exerciselist.add(new exercise(3,getActivity().getString(R.string.x3),R.raw.utthita_parsvakonasana,getActivity().getString(R.string.z3)));
        exerciselist.add(new exercise(4,getActivity().getString(R.string.x4),R.raw.parighasana,getActivity().getString(R.string.z4)));
        exerciselist.add(new exercise(5,getActivity().getString(R.string.x5),R.raw.natarajasana,getActivity().getString(R.string.z5)));
        exerciselist.add(new exercise(6,getActivity().getString(R.string.x6),R.raw.adho_mukha_svanasana,getActivity().getString(R.string.z6)));
        exerciselist.add(new exercise(7,getActivity().getString(R.string.x7),R.raw.tadasana,getActivity().getString(R.string.z7)));
        exerciselist.add(new exercise(8,getActivity().getString(R.string.x8),R.raw.urdhva_prasarita_eka_padasana,getActivity().getString(R.string.z8)));
        exerciselist.add(new exercise(9,getActivity().getString(R.string.x9),R.raw.vrksasana,getActivity().getString(R.string.z9)));
        exerciselist.add(new exercise(10,getActivity().getString(R.string.x10),R.raw.anjaneyasana,getActivity().getString(R.string.z10)));
        exerciselist.add(new exercise(11,getActivity().getString(R.string.x11),R.raw.bharadvajasana,getActivity().getString(R.string.z11)));
        exerciselist.add(new exercise(12,getActivity().getString(R.string.x12),R.raw.ardha_matsyendrasana,getActivity().getString(R.string.z12)));
        exerciselist.add(new exercise(13,getActivity().getString(R.string.x13),R.raw.marichyasana,getActivity().getString(R.string.z13)));
        exerciselist.add(new exercise(14,getActivity().getString(R.string.x14),R.raw.parivrtta_parsvakonasana,getActivity().getString(R.string.z14)));
        exerciselist.add(new exercise(15,getActivity().getString(R.string.x15),R.raw.parivrtta_janu_sirsasana,getActivity().getString(R.string.z15)));
        exerciselist.add(new exercise(16,getActivity().getString(R.string.x16),R.raw.paschimottanasana,getActivity().getString(R.string.z16)));
        exerciselist.add(new exercise(17,getActivity().getString(R.string.x17),R.raw.janu_sirsasana,getActivity().getString(R.string.z17)));
        exerciselist.add(new exercise(18,getActivity().getString(R.string.x18),R.raw.upavistha_konasana,getActivity().getString(R.string.z18)));
        exerciselist.add(new exercise(19,getActivity().getString(R.string.x19),R.raw.dhanurasana,getActivity().getString(R.string.z19)));
        exerciselist.add(new exercise(20,getActivity().getString(R.string.x20),R.raw.urdhva_dhanurasana,getActivity().getString(R.string.z20)));
        exerciselist.add(new exercise(21,getActivity().getString(R.string.x21),R.raw.urdhva_mukha_svanasana,getActivity().getString(R.string.z21)));
        exerciselist.add(new exercise(22,getActivity().getString(R.string.x22),R.raw.tolasana,getActivity().getString(R.string.z22)));
        exerciselist.add(new exercise(23,getActivity().getString(R.string.x23),R.raw.eka_pada_koundinyanasana,getActivity().getString(R.string.z23)));
        exerciselist.add(new exercise(24,getActivity().getString(R.string.x24),R.raw.kapotasana,getActivity().getString(R.string.z24)));
        exerciselist.add(new exercise(25,getActivity().getString(R.string.x25),R.raw.bhujangasana,getActivity().getString(R.string.z25)));
        exerciselist.add(new exercise(26,getActivity().getString(R.string.x26),R.raw.virasana,getActivity().getString(R.string.z26)));
        exerciselist.add(new exercise(27,getActivity().getString(R.string.x27),R.raw.bitilasana,getActivity().getString(R.string.z27)));
        exerciselist.add(new exercise(28,getActivity().getString(R.string.x28),R.raw.dandasana,getActivity().getString(R.string.z28)));
        exerciselist.add(new exercise(29,getActivity().getString(R.string.x29),R.raw.purvottanasana,getActivity().getString(R.string.z29)));
        exerciselist.add(new exercise(30,getActivity().getString(R.string.x30),R.raw.ustrasana,getActivity().getString(R.string.z30)));
        exerciselist.add(new exercise(1,getString(R.string.ba),R.raw.utthita_hasta_padangustasana,getString(R.string.bal)));
        exerciselist.add(new exercise(1,getString(R.string.ba1),R.raw.ardha_chandrasana,getString(R.string.bal1)));
        exerciselist.add(new exercise(1,getString(R.string.ba2),R.raw.adho_mukha_vrksasana,getString(R.string.bal2)));
        exerciselist.add(new exercise(1,getString(R.string.ba3),R.raw.vasisthasana,getString(R.string.bal3)));
        exerciselist.add(new exercise(1,getString(R.string.ba4),R.raw.salamba_sirsasana,getString(R.string.bal4)));
        exerciselist.add(new exercise(1,getString(R.string.ba5),R.raw.salamba_sarvangasana,getString(R.string.bal5)));
        exerciselist.add(new exercise(1,getString(R.string.ba6),R.raw.virabhadrasana3,getString(R.string.bal6)));
        exerciselist.add(new exercise(1,getString(R.string.co),R.raw.paripurna_navasana,getString(R.string.cor1)));
        exerciselist.add(new exercise(1,getString(R.string.co1),R.raw.marjaryasana,getString(R.string.cor2)));
        exerciselist.add(new exercise(1,getString(R.string.co2),R.raw.bakasana,getString(R.string.cor3)));
        exerciselist.add(new exercise(1,getString(R.string.co3),R.raw.dolphin_pose,getString(R.string.cor4)));
        exerciselist.add(new exercise(1,getString(R.string.co4),R.raw.chaturanga_dandasana,getString(R.string.cor5)));
        exerciselist.add(new exercise(1,getString(R.string.co5),R.raw.ananda_balasana,getString(R.string.cor6)));
        exerciselist.add(new exercise(1,getString(R.string.co6),R.raw.plank_pose,getString(R.string.cor7)));



        adapter = new exercisesAdapter(getContext(),exerciselist);
        recyclerView_e.setAdapter(adapter);

    }
}
