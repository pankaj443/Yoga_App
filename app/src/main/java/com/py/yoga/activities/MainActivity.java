package com.py.yoga.activities;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.py.yoga.R;
import com.py.yoga.fragments.exercisesFragment;
import com.py.yoga.fragments.tipsFragment;
import com.py.yoga.fragments.utilityFragment;
import com.py.yoga.fragments.workoutFragment;

public class MainActivity extends AppCompatActivity {

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

        displayfrag(new workoutFragment());
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
