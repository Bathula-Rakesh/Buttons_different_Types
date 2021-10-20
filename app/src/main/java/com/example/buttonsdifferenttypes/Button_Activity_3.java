package com.example.buttonsdifferenttypes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Button_Activity_3 extends AppCompatActivity implements View.OnClickListener {

    Button button1,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button3);

        button1 = findViewById(R.id.btn3_1);
        button2 = findViewById(R.id.btn3_2);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.btn3_1:
                Toast.makeText(this,"Button 1 is clicked",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn3_2:
                Toast.makeText(this,"Button 2 is clicked",Toast.LENGTH_SHORT).show();
                break;

        }

    }
}