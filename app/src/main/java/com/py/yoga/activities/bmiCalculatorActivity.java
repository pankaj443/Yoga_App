package com.py.yoga.activities;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.TextView;

import com.py.yoga.R;

import java.util.regex.Pattern;

public class bmiCalculatorActivity extends AppCompatActivity {
    TextView height,weight;
    Button cal;
   static Float h,w,bmi;
    private static final Pattern UPI_PATTERN = Pattern.compile("[+-]?[0-9]+(\\.[0-9]+)?([Ee][+-]?[0-9]+)?");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_calculator);

        height = (TextView) findViewById(R.id.height);
        weight = (TextView) findViewById(R.id.weight);
        cal = (Button) findViewById(R.id.cal);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               if (validateheight()){
                   if (validateweight()){
                       doit();
                   }
               }

            }
        });


    }


    private void doit()
    {
        InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        String hi,wi;

        hi = height.getText().toString();
        wi = weight.getText().toString();

        h = Float.parseFloat(hi);
        w = Float.parseFloat(wi);

        bmi = w/((h/100)*(h/100));


        Dialog dialog = new Dialog();
        dialog.show(getSupportFragmentManager(),"dialog");
    }
    private boolean validateheight(){

        String mobileinput = height.getText().toString().trim();

        if (mobileinput.isEmpty()){
            height.setError("Field can't be empty");
            return false;
        }else if (!UPI_PATTERN.matcher(mobileinput).matches()){
            height.setError("Wrong Credentials");
            return false;
        }
        else {
            height.setError(null);
            return true;
        }

    }

    private boolean validateweight(){

        String mobileinput = weight.getText().toString().trim();

        if (mobileinput.isEmpty()){
            weight.setError("Field can't be empty");
            return false;
        }else if (!UPI_PATTERN.matcher(mobileinput).matches()){
            weight.setError("Wrong Credentials");
            return false;
        }
        else {
            weight.setError(null);
            return true;
        }

    }
}
