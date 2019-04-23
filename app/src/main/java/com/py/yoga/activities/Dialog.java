package com.py.yoga.activities;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatDialogFragment;
import android.widget.Toast;

import com.py.yoga.R;

public class Dialog extends AppCompatDialogFragment {

    @Override
    public android.app.Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Results")
                .setIcon(R.mipmap.icon)
                .setMessage("Your Calculated BMI is : "+ bmiCalculatorActivity.bmi.toString())
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getContext(), "STAY FIT!", Toast.LENGTH_SHORT).show();
                    }
                });
        return builder.create();
    }

}
