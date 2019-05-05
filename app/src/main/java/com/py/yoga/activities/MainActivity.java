package com.py.yoga.activities;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.py.yoga.R;
import com.py.yoga.fragments.challengeFragment;
import com.py.yoga.fragments.exercisesFragment;
import com.py.yoga.fragments.tipsFragment;
import com.py.yoga.fragments.utilityFragment;
import com.py.yoga.fragments.workoutFragment;

public class MainActivity extends AppCompatActivity {

    public static InterstitialAd mInterstitialAd,getmInterstitialAd;

    public static RewardedVideoAd mRewardedVideoAd,getmRewardedVideoAd;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            Fragment fragment = new workoutFragment();
            switch (item.getItemId()) {
                case R.id.navigation_workout:
                    fragment = new workoutFragment();
                break;
                case R.id.navigation_excercises:
                    fragment = new exercisesFragment();
                break;
                case R.id.navigation_tips:
                    fragment = new tipsFragment();
                break;

                case R.id.navigation_utilities:
                    fragment = new utilityFragment();
                break;
                case R.id.navigation_challenge:
                    fragment = new challengeFragment();
                    break;
            }
            displayfrag(fragment);
            return true;
        }
    };

    public void displayfrag(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.contentmain, fragment)
                .commit();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, "ca-app-pub-8427729765627466~9350858481");

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-8427729765627466/8720303094");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());


        getmInterstitialAd = new InterstitialAd(this);
        getmInterstitialAd.setAdUnitId("ca-app-pub-8427729765627466/6533123456");
        getmInterstitialAd.loadAd(new AdRequest.Builder().build());


        mRewardedVideoAd = MobileAds.getRewardedVideoAdInstance(this);
        loadRewardedVideoAd();
        getmRewardedVideoAd = MobileAds.getRewardedVideoAdInstance(this);
        loadRewardedVideoAd1();

        displayfrag(new workoutFragment());
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
    private void loadRewardedVideoAd() {
        mRewardedVideoAd.loadAd("ca-app-pub-8427729765627466/8556651561",
                new AdRequest.Builder().build());
    }
    private void loadRewardedVideoAd1() {
        mRewardedVideoAd.loadAd("ca-app-pub-8427729765627466/4808978240",
                new AdRequest.Builder().build());
    }

}
