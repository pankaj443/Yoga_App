package com.py.yoga.activities;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.py.yoga.R;

import org.w3c.dom.Text;

public class exerciseDescriptionActivity extends AppCompatActivity {


    ProgressBar progressBar,progressBar1;
    ImageView exeimage;
    TextView exedesc,exetitle;
    CountDownTimer countDownTimer;
   public static boolean isplaying = false;
    ScrollView scrollView;
    private long millisecondsleft = 21000;
   public static MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_description);


        Intent intent = getIntent();
        final String title = intent.getStringExtra("title");
        final String desc = intent.getStringExtra("desc");
        Bundle bundle=this.getIntent().getExtras();
        int pic=bundle.getInt("image");

        progressBar = (ProgressBar) findViewById(R.id.progress_horizontal);
        progressBar1 = (ProgressBar) findViewById(R.id.progress_horizontal1);


        progressBar.setVisibility(View.INVISIBLE);
        progressBar1.setVisibility(View.INVISIBLE);



        exedesc = (TextView) findViewById(R.id.exedesc);
        exeimage = (ImageView) findViewById(R.id.exeimage);
        exetitle = (TextView) findViewById(R.id.exetitle);
        final Button start = (Button) findViewById(R.id.start);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.fv_backgroundb);
                mediaPlayer.start();
                isplaying = true;

                final int[] progress = {0};
                progressBar.setVisibility(View.VISIBLE);
                progressBar1.setVisibility(View.VISIBLE);


              countDownTimer = new CountDownTimer(millisecondsleft,1000) {
                  @Override
                  public void onTick(long millisUntilFinished) {
                                millisecondsleft = millisUntilFinished;

                                progress[0] +=5;
                                progressBar.setProgress(progress[0]);
                      progressBar1.setProgress(progress[0]);


                                update();
                  }

                  @Override
                  public void onFinish() {
                      mediaPlayer.stop();
                      isplaying = false;
                      Toast.makeText(exerciseDescriptionActivity.this, "You Did Great!", Toast.LENGTH_SHORT).show();

                  }
              }.start();

                start.setVisibility(View.INVISIBLE);

                exedesc.setGravity(1);

                exedesc.setText("15");
                exedesc.setTextSize(50f);




            }
        });

        exetitle.setText(title);
        exeimage.setImageResource(pic);

        //exeimage.setImageResource(Integer.parseInt(imageView));
        exedesc.setText(desc);
    }
    private void update(){

        int sec = (int) (millisecondsleft%60000)/1000;

        String timeleft = "";



        if (sec<10) timeleft+= "0";
        timeleft+=sec;

        exedesc.setText(timeleft);


    }

    public void onBackPressed() {
        super.onBackPressed();
        if (isplaying)
        mediaPlayer.stop();
    }





}
