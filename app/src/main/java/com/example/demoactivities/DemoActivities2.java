package com.example.demoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DemoActivities2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_activities2);

        // Get intent so as to get the "things" inside intent

        Intent i = getIntent();

        // get the String array named "info" we passed in
        String[] info = i.getStringArrayExtra("info");

        // get TextView object
        TextView tv1 = findViewById(R.id.textView1);

        // display the name and age on TextView
        tv1.setText("You are " + info[0] + " age " + info[1]);

        // done
    }
}
