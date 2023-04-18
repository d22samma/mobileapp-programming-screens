package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class second_activity extends AppCompatActivity {
    private Button btnClick;
    private TextView collectvalue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView collectvalue = (TextView) findViewById(R.id.textview);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String food = extras.getString("food");
            int count = extras.getInt("count");

            collectvalue.setText(count+ " " + " " +food+ " left");
        }

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