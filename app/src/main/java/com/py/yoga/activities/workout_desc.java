package com.py.yoga.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;

import com.py.yoga.R;
import com.py.yoga.adapters.wo_exe_Adapter;
import com.py.yoga.object.wo_exe;

import java.util.ArrayList;
import java.util.List;

public class workout_desc extends AppCompatActivity {

    RecyclerView recyclerView;
    public static List<wo_exe> List,List1,List2,List3,List4,List5,List6,List7,List8,List9,List10;
    wo_exe_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_desc);


        Intent i=getIntent();

        TextView title=findViewById(R.id.wo_d_name);
        title.setText(i.getStringExtra("title"));

        String temp = title.getText().toString();

        TextView total=findViewById(R.id.wo_d_totalexe);
        total.setText(i.getStringExtra("total"));

        TextView dur=findViewById(R.id.wo_d_dur);
        dur.setText(i.getStringExtra("dur"));

        TextView desc=findViewById(R.id.wo_d_desc);
        desc.setText(i.getStringExtra("desc"));




        List = new ArrayList<>();
        List1 = new ArrayList<>();
        List2 = new ArrayList<>();
        List3 = new ArrayList<>();
        List4 = new ArrayList<>();
        List5 = new ArrayList<>();
        List6 = new ArrayList<>();
        List7 = new ArrayList<>();
        List8 = new ArrayList<>();
        List9 = new ArrayList<>();
        List10 = new ArrayList<>();

        recyclerView = (RecyclerView)findViewById((R.id.wo_desc_recyclerView));;
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));


        List.add(new wo_exe(1,getString(R.string.x6),R.raw.adho_mukha_svanasana,getString(R.string.z6)));
        List.add(new wo_exe(1,getString(R.string.x7),R.raw.tadasana,getString(R.string.z7)));
        List.add(new wo_exe(1,getString(R.string.x3),R.raw.utthita_parsvakonasana,getString(R.string.z3)));
        List.add(new wo_exe(1,getString(R.string.x18),R.raw.upavistha_konasana,getString(R.string.z18)));
        List.add(new wo_exe(1,getString(R.string.x26),R.raw.virasana,getString(R.string.z26)));
        List.add(new wo_exe(1,getString(R.string.x21),R.raw.urdhva_mukha_svanasana,getString(R.string.z21)));
        List.add(new wo_exe(1,getString(R.string.x5),R.raw.natarajasana,getString(R.string.z5)));
        List.add(new wo_exe(1,getString(R.string.x1),R.raw.vrksasana,getString(R.string.z9)));
        List.add(new wo_exe(1,getString(R.string.x28),R.raw.dandasana,getString(R.string.z28)));
        List.add(new wo_exe(1,getString(R.string.x17),R.raw.janu_sirsasana,getString(R.string.z17)));



        List1.add(new wo_exe(1,"Balasana",R.raw.childs_pose_balasana,getString(R.string.z1)));
        List1.add(new wo_exe(1,"Ardha Bhujangasana",R.raw.baby_cobra,getString(R.string.z25)));
        List1.add(new wo_exe(1,"Phalakasana",R.raw.forearm_plank,getString(R.string.pl)));
        List1.add(new wo_exe(1,getString(R.string.x6),R.raw.adho_mukha_svanasana1,getString(R.string.z6)));
        List1.add(new wo_exe(1,getString(R.string.x3),R.raw.extended_side_angle,getString(R.string.z3)));
        List1.add(new wo_exe(1,"Trikonasana",R.raw.trikonasana_triangle,getString(R.string.trik)));
        List1.add(new wo_exe(1,"Virabhadrasana-I",R.raw.virabhadrasana_warrior_1,getString(R.string.w3)));
        List1.add(new wo_exe(1,"Virabhadrasana-II",R.raw.virabhadrasana_warrior_2,getString(R.string.w2)));
        List1.add(new wo_exe(1,"Urdhva Hastasana",R.raw.urdhva_hastasana,getString(R.string.uh)));
        List1.add(new wo_exe(1,getString(R.string.x7),R.raw.tadasana1,getString(R.string.z7)));





        List2.add(new wo_exe(1,getString(R.string.x1),R.raw.utkatasana,getString(R.string.z1)));
        List2.add(new wo_exe(1,getString(R.string.x5),R.raw.natarajasana,getString(R.string.z5)));
        List2.add(new wo_exe(1,getString(R.string.x6),R.raw.adho_mukha_svanasana,getString(R.string.z6)));
        List2.add(new wo_exe(1,getString(R.string.x8),R.raw.urdhva_prasarita_eka_padasana,getString(R.string.z8)));
        List2.add(new wo_exe(1,getString(R.string.x14),R.raw.parivrtta_parsvakonasana,getString(R.string.z14)));
        List2.add(new wo_exe(1,getString(R.string.x15),R.raw.parivrtta_janu_sirsasana,getString(R.string.z15)));
        List2.add(new wo_exe(1,getString(R.string.x19),R.raw.dhanurasana,getString(R.string.z19)));
        List2.add(new wo_exe(1,getString(R.string.x20),R.raw.urdhva_dhanurasana,getString(R.string.z20)));
        List2.add(new wo_exe(1,getString(R.string.x24),R.raw.kapotasana,getString(R.string.z24)));
        List2.add(new wo_exe(1,getString(R.string.x29),R.raw.purvottanasana,getString(R.string.z29)));
        List2.add(new wo_exe(1,getString(R.string.x30),R.raw.ustrasana,getString(R.string.z30)));
        List2.add(new wo_exe(1,getString(R.string.co2),R.raw.bakasana,getString(R.string.cor3)));
        List2.add(new wo_exe(1,getString(R.string.co6),R.raw.plank_pose,getString(R.string.cor7)));





        List3.add(new wo_exe(1,getString(R.string.ba),R.raw.utthita_hasta_padangustasana,getString(R.string.bal)));
        List3.add(new wo_exe(1,getString(R.string.ba1),R.raw.ardha_chandrasana,getString(R.string.bal1)));
        List3.add(new wo_exe(1,getString(R.string.ba2),R.raw.adho_mukha_vrksasana,getString(R.string.bal2)));
        List3.add(new wo_exe(1,getString(R.string.ba3),R.raw.vasisthasana,getString(R.string.bal3)));
        List3.add(new wo_exe(1,getString(R.string.ba4),R.raw.salamba_sirsasana,getString(R.string.bal4)));
        List3.add(new wo_exe(1,getString(R.string.ba5),R.raw.salamba_sarvangasana,getString(R.string.bal5)));
        List3.add(new wo_exe(1,getString(R.string.ba6),R.raw.virabhadrasana3,getString(R.string.bal6)));
        List3.add(new wo_exe(1,"Virabhadrasana-II",R.raw.virabhadrasana_warrior_2,getString(R.string.w2)));
        List3.add(new wo_exe(1,getString(R.string.x9),R.raw.vrksasana,getString(R.string.z9)));
        List3.add(new wo_exe(1,getString(R.string.x5),R.raw.natarajasana,getString(R.string.z5)));
        List3.add(new wo_exe(1,getString(R.string.x2),R.raw.garudasana,getString(R.string.z2)));




        List4.add(new wo_exe(1,getString(R.string.co),R.raw.paripurna_navasana,getString(R.string.cor1)));
        List4.add(new wo_exe(1,getString(R.string.co1),R.raw.marjaryasana,getString(R.string.cor2)));
        List4.add(new wo_exe(1,getString(R.string.co2),R.raw.bakasana,getString(R.string.cor3)));
        List4.add(new wo_exe(1,getString(R.string.co3),R.raw.dolphin_pose,getString(R.string.cor4)));
        List4.add(new wo_exe(1,getString(R.string.co4),R.raw.chaturanga_dandasana,getString(R.string.cor5)));
        List4.add(new wo_exe(1,getString(R.string.co5),R.raw.ananda_balasana,getString(R.string.cor6)));
        List4.add(new wo_exe(1,getString(R.string.co6),R.raw.plank_pose,getString(R.string.cor7)));
        List4.add(new wo_exe(1,getString(R.string.x22),R.raw.tolasana,getString(R.string.z22)));
        List4.add(new wo_exe(1,getString(R.string.ba3),R.raw.vasisthasana,getString(R.string.bal3)));
        List4.add(new wo_exe(1,"Phalakasana",R.raw.forearm_plank,getString(R.string.pl)));
        List4.add(new wo_exe(1,getString(R.string.x1),R.raw.utkatasana,getString(R.string.z1)));





        List5.add(new wo_exe(1,"Pranamasana",R.raw.ss1,"Stand at the edge of your mat, keep your feet together and balance your weight equally on both the feet. Expand your chest and relax your shoulders. As you breathe in, lift both arms up from the sides, and as you exhale, bring your palms together in front of the chest in prayer position."));
        List5.add(new wo_exe(1,"Hastauttanasana",R.raw.ss2,"Breathing in, lift the arms up and back, keeping the biceps close to the ears. In this pose, the effort is to stretch the whole body up from the heels to the tips of the fingers."));
        List5.add(new wo_exe(1,"Hastapadasana",R.raw.ss3,"Breathing out, bend forward from the waist keeping the spine erect. As you exhale completely, bring the hands down to the floor beside the feet."));
        List5.add(new wo_exe(1,"Ashwa Sanchalanasana",R.raw.ss4,"Breathing in, push your right leg back, as far back as possible. Bring the right knee to the floor and look up."));
        List5.add(new wo_exe(1,"Dandasana",R.raw.ss5,"As you breathe in, take the left leg back and bring the whole body in a straight line."));
        List5.add(new wo_exe(1,"Ashtanga Namaskara",R.raw.ss6,"Gently bring your knees down to the floor and exhale. Take the hips back slightly, slide forward, rest your chest and chin on the floor. Raise your posterior a little bit. The two hands, two feet, two knees, chest and chin (eight parts of the body) should touch the floor.\n" +
                "\n"));
        List5.add(new wo_exe(1,"Bhujangasana ",R.raw.ss7,"Slide forward and raise the chest up into the Cobra pose. You may keep your elbows bent in this pose with the shoulders away from the ears. Look up at the ceiling."));
        List5.add(new wo_exe(1,"Adho Mukha Svanasana",R.raw.ss8,"Breathing out, lift the hips and the tailbone up to bring the body into an inverted ‘V’ pose."));
        List5.add(new wo_exe(1,"Ashwa Sanchalanasana",R.raw.ss9,"Breathing in, bring the right foot forward in between the two hands. The left knee goes down on the floor. Press the hips down and look up.\n" +
                "\n"));
        List5.add(new wo_exe(1,"Hastapadasana",R.raw.ss10,"Breathing out, bring the left foot forward. Keep the palms on the floor. You may bend the knees, if necessary."));
        List5.add(new wo_exe(1,"Hastauttanasana",R.raw.ss11,"Breathing in, roll the spine up. Raise the hands up and bend backward a little bit, pushing the hips slightly outward."));
        List5.add(new wo_exe(1,"Tadasana",R.raw.ss12,"As you exhale, first straighten the body, then bring the arms down. Relax in this position and observe the sensations in your body.\n" +
                "\n" +
                "This completes one set of Surya Namaskar. Complete the round by repeating the steps. Only this time, start with taking the left foot behind in step number 4 and bringing the right foot forward in step number 10. Once done, you would’ve completed one round of Surya Namaskar."));



        List6.add(new wo_exe(1,getString(R.string.co4),R.raw.chaturanga_dandasana,getString(R.string.cor5)));
        List6.add(new wo_exe(1,getString(R.string.co2),R.raw.bakasana,getString(R.string.cor3)));
        List6.add(new wo_exe(1,getString(R.string.co),R.raw.paripurna_navasana,getString(R.string.cor1)));
        List6.add(new wo_exe(1,getString(R.string.ba4),R.raw.salamba_sirsasana,getString(R.string.bal4)));
        List6.add(new wo_exe(1,getString(R.string.ba2),R.raw.adho_mukha_vrksasana,getString(R.string.bal2)));
        List6.add(new wo_exe(1,getString(R.string.ba3),R.raw.vasisthasana,getString(R.string.bal3)));
        List6.add(new wo_exe(1,getString(R.string.ba1),R.raw.ardha_chandrasana,getString(R.string.bal1)));
        List6.add(new wo_exe(1,getString(R.string.x30),R.raw.ustrasana,getString(R.string.z30)));
        List6.add(new wo_exe(1,getString(R.string.x20),R.raw.urdhva_dhanurasana,getString(R.string.z20)));
        List6.add(new wo_exe(1,getString(R.string.x3),R.raw.utthita_parsvakonasana,getString(R.string.z3)));
        List6.add(new wo_exe(1,getString(R.string.x8),R.raw.urdhva_prasarita_eka_padasana,getString(R.string.z8)));





        List7.add(new wo_exe(1,getString(R.string.x2),R.raw.garudasana,getString(R.string.z2)));
        List7.add(new wo_exe(1,getString(R.string.x1),R.raw.utkatasana,getString(R.string.z1)));
        List7.add(new wo_exe(1,getString(R.string.x7),R.raw.tadasana,getString(R.string.x7)));
        List7.add(new wo_exe(1,getString(R.string.x9),R.raw.vrksasana,getString(R.string.z9)));
        List7.add(new wo_exe(1,getString(R.string.x18),R.raw.upavistha_konasana,getString(R.string.z18)));
        List7.add(new wo_exe(1,getString(R.string.x21),R.raw.urdhva_mukha_svanasana,getString(R.string.x21)));
        List7.add(new wo_exe(1,getString(R.string.x27),R.raw.bitilasana,getString(R.string.x27)));
        List7.add(new wo_exe(1,getString(R.string.ba1),R.raw.ardha_chandrasana,getString(R.string.bal1)));
        List7.add(new wo_exe(1,getString(R.string.ba6),R.raw.virabhadrasana3,getString(R.string.bal6)));
        List7.add(new wo_exe(1,getString(R.string.co5),R.raw.ananda_balasana,getString(R.string.cor6)));
        List7.add(new wo_exe(1,getString(R.string.co3),R.raw.dolphin_pose,getString(R.string.cor4)));
        List7.add(new wo_exe(1,getString(R.string.co1),R.raw.marjaryasana,getString(R.string.cor2)));







        List8.add(new wo_exe(1,"Trikonasana",R.raw.trikonasana_triangle,getString(R.string.trik)));
        List8.add(new wo_exe(1,getString(R.string.x17),R.raw.janu_sirsasana,getString(R.string.z17)));
        List8.add(new wo_exe(1,getString(R.string.x14),R.raw.parivrtta_parsvakonasana,getString(R.string.z14)));
        List8.add(new wo_exe(1,getString(R.string.x15),R.raw.parivrtta_janu_sirsasana,getString(R.string.z15)));
        List8.add(new wo_exe(1,getString(R.string.x23),R.raw.eka_pada_koundinyanasana,getString(R.string.x23)));
        List8.add(new wo_exe(1,getString(R.string.x13),R.raw.marichyasana,getString(R.string.x13)));
        List8.add(new wo_exe(1,getString(R.string.x12),R.raw.ardha_matsyendrasana,getString(R.string.x12)));
        List8.add(new wo_exe(1,getString(R.string.x11),R.raw.bharadvajasana,getString(R.string.x11)));




        List9.add(new wo_exe(1,getString(R.string.bc),R.raw.matsyasana,getString(R.string.bck)));
        List9.add(new wo_exe(1,getString(R.string.bc1),R.raw.salabhasana,getString(R.string.bck1)));
        List9.add(new wo_exe(1,getString(R.string.bc2),R.raw.eka_pada_rajakapotasana,getString(R.string.bck2)));
        List9.add(new wo_exe(1,getString(R.string.bc3),R.raw.eka_pada_rajakapotasana2,getString(R.string.bck3)));
        List9.add(new wo_exe(1,getString(R.string.bc4),R.raw.sphinx_pose,getString(R.string.bck4)));
        List9.add(new wo_exe(1,getString(R.string.bc5),R.raw.camatkarasana,getString(R.string.bck5)));
        List9.add(new wo_exe(1,getString(R.string.x20),R.raw.urdhva_dhanurasana,getString(R.string.z20)));
        List9.add(new wo_exe(1,getString(R.string.x21),R.raw.urdhva_mukha_svanasana,getString(R.string.z21)));
        List9.add(new wo_exe(1,getString(R.string.x5),R.raw.natarajasana,getString(R.string.z5)));
        List9.add(new wo_exe(1,getString(R.string.x24),R.raw.kapotasana,getString(R.string.z24)));
        List9.add(new wo_exe(1,getString(R.string.x27),R.raw.bitilasana,getString(R.string.z27)));
        List9.add(new wo_exe(1,getString(R.string.x25),R.raw.bhujangasana,getString(R.string.z25)));
        List9.add(new wo_exe(1,getString(R.string.x30),R.raw.ustrasana,getString(R.string.z30)));
        List9.add(new wo_exe(1,getString(R.string.x19),R.raw.dhanurasana,getString(R.string.z19)));




        List10.add(new wo_exe(1,getString(R.string.x28),R.raw.dandasana,getString(R.string.z28)));
        List10.add(new wo_exe(1,getString(R.string.x25),R.raw.bhujangasana,getString(R.string.z25)));
        List10.add(new wo_exe(1,getString(R.string.x26),R.raw.virasana,getString(R.string.z26)));
        List10.add(new wo_exe(1,getString(R.string.x21),R.raw.urdhva_mukha_svanasana,getString(R.string.z21)));
        List10.add(new wo_exe(1,getString(R.string.x16),R.raw.paschimottanasana,getString(R.string.z16)));
        List10.add(new wo_exe(1,getString(R.string.x11),R.raw.bharadvajasana,getString(R.string.z11)));
        List10.add(new wo_exe(1,getString(R.string.x12),R.raw.ardha_matsyendrasana,getString(R.string.z12)));
        List10.add(new wo_exe(1,getString(R.string.x10),R.raw.anjaneyasana,getString(R.string.z10)));
        List10.add(new wo_exe(1,getString(R.string.x14),R.raw.parivrtta_parsvakonasana,getString(R.string.z14)));
        List10.add(new wo_exe(1,getString(R.string.x15),R.raw.parivrtta_janu_sirsasana,getString(R.string.z15)));



        Log.i("MSG",temp.substring(0,2));
        if (temp.substring(0,2).equals("Be"))
        adapter = new wo_exe_Adapter(getApplicationContext(),List);

       else if (temp.substring(0,2).equals("Mo"))
            adapter = new wo_exe_Adapter(getApplicationContext(),List1);

        else if (temp.substring(0,2).equals("Dy"))
            adapter = new wo_exe_Adapter(getApplicationContext(),List2);
        else if (temp.substring(0,2).equals("Yo"))
            adapter = new wo_exe_Adapter(getApplicationContext(),List3);
        else if (temp.substring(0,2).equals("Co"))
            adapter = new wo_exe_Adapter(getApplicationContext(),List4);
        else if (temp.substring(0,2).equals("Su"))
            adapter = new wo_exe_Adapter(getApplicationContext(),List5);
        else if (temp.substring(0,2).equals("Po"))
            adapter = new wo_exe_Adapter(getApplicationContext(),List6);
        else if (temp.substring(0,2).equals("Ge"))
            adapter = new wo_exe_Adapter(getApplicationContext(),List7);
        else if (temp.substring(0,2).equals("Tw"))
            adapter = new wo_exe_Adapter(getApplicationContext(),List8);
        else if (temp.substring(0,2).equals("Ba"))
            adapter = new wo_exe_Adapter(getApplicationContext(),List9);
        else if (temp.substring(0,2).equals("He"))
            adapter = new wo_exe_Adapter(getApplicationContext(),List10);



        recyclerView.setAdapter(adapter);
    }
}


