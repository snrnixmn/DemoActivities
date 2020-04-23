package com.example.demoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DemoActivities extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_activities);

        // Get button and set on OnClickListener
        Button btnDone = (Button) findViewById(R.id.buttonDone);
        btnDone.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                // get edittext that user keys in name
                EditText etName = (EditText) findViewById(R.id.editTextName);

                // get edittext that user keys in age
                EditText etAge = (EditText) findViewById(R.id.editTextAge);

                // put the name and age into array
                String[] info = {etName.getText().toString(), etAge.getText().toString()};

                // create an intent to start another activity called
                // DemoActivities (which he would create later)
                Intent i = new Intent(DemoActivities.this, DemoActivities2.class);

                // pass the string array holding the name and age into new activity
                i.putExtra("info", info);

                // start new activity
                startActivity(i);
            }
        });
    }
}
