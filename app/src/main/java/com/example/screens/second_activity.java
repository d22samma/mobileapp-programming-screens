package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class second_activity extends AppCompatActivity {
    private Button btnClick;

    Bundle extras = getIntent().getExtras();
    if (extras != null) {
        String name = extras.getString("name");
        int number = extras.getInt("number");
        // Do something with the name and number
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                Intent intent = new Intent(second_activity.this, MainActivity.class);
                startActivity(intent);
            }
            });
    }
}