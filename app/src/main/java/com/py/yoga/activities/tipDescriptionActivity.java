package com.py.yoga.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.py.yoga.R;
import com.py.yoga.fragments.tipsFragment;

public class tipDescriptionActivity extends AppCompatActivity {

    TextView texttitle,textdesc;
    ImageView back,next;
    public int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_description);

        Intent intent = getIntent();
        final String title = intent.getStringExtra("title");
        String desc = intent.getStringExtra("desc");
        id = Integer.parseInt(intent.getStringExtra("id"));

        Log.i("MSG", String.valueOf(id));

        textdesc = (TextView)findViewById(R.id.textdesc);
        texttitle = (TextView)findViewById(R.id.texttitle);

        back = (ImageView)findViewById(R.id.back);
        next = (ImageView)findViewById(R.id.next);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MSG","AAA");
                id-=1;
                if (id == 0)id =15;
               texttitle.setText(tipsFragment.tipsList.get(id-1).getTitle());
                textdesc.setText(tipsFragment.tipsList.get(id-1).getDesc());
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MSG","AAA");
                id+=1;
                if (id == 16)id =1;
                texttitle.setText(tipsFragment.tipsList.get(id-1).getTitle());
                textdesc.setText(tipsFragment.tipsList.get(id-1).getDesc());
            }
        });

        texttitle.setText(title);
        textdesc.setText(desc);

    }
}
