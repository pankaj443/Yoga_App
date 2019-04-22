package com.py.yoga.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.py.yoga.R;

import org.w3c.dom.Text;

public class exerciseDescriptionActivity extends AppCompatActivity {

    ImageView exeimage;
    TextView exedesc,exetitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_description);


        Intent intent = getIntent();
        final String title = intent.getStringExtra("title");
        Bundle bundle=this.getIntent().getExtras();
        int pic=bundle.getInt("image");


        exedesc = (TextView) findViewById(R.id.exedesc);
        exeimage = (ImageView) findViewById(R.id.exeimage);
        exetitle = (TextView) findViewById(R.id.exetitle);

        exetitle.setText(title);
        exeimage.setImageResource(pic);
        //exeimage.setImageResource(Integer.parseInt(imageView));

    }
}
