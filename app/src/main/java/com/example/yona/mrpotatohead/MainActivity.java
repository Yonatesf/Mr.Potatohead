package com.example.yona.mrpotatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.GridView;

import static com.example.yona.mrpotatohead.R.drawable.arms;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCheckboxClicked(CheckBox view) {
        boolean checked = ((CheckBox) view).isChecked();

        // check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkbox_shoes:
                if (checked);
                    // make shoes visible
                else
                    // shoes stay invisible
                break;
            case R.id.checkbox_arms:
                if (checked);
                    // make arms visible
                else
                    // arms stay invisible
                break;
            case R.id.checkbox_eyes:
                if (checked);
                    // make eyes visible
                else
                    // eyes stay invisible
                break;
            case R.id.checkbox_ears:
                if (checked);
                    // makes ears visible
                else
                    // ears stay invisible
                break;
            case R.id.checkbox_mouth:
                if (checked);
                    // make mouth visible
                else
                    // mouth stays invisible
                break;
            case R.id.checkbox_nose:
                if (checked);
                    // make nose visible
                else
                    // nose stays invisible
                break;
            case R.id.checkbox_mustache:
                if (checked);
                    // make mustache visible
                else
                    // mustache stays invisible
                break;
            case R.id.checkbox_eyebrows:
                if (checked);
                    // make eyebrows visible
                else
                    // eyebrows stay invisible
                break;
            case R.id.checkbox_glasses:
                if (checked);
                    // make glasses visible
                else
                    //glasses stay invisible
                break;
            case R.id.checkbox_hat:
                if (checked);
                    // make hat invisible
                else
                    // hat stays invisible
                break;
        }
    }
}
