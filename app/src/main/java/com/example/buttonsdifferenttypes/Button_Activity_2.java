package com.example.buttonsdifferenttypes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Button_Activity_2 extends AppCompatActivity {

    EditText name;
    String string;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button2);
        name = findViewById(R.id.edit_txt1);
    }

    public void save(View view) {
        string = name.getText().toString();
        if(string.equals("")){
            Toast.makeText(this, "Enter Name", Toast.LENGTH_SHORT).show();
            name.setError("Enter your Name");
            return;
        }
        else{
            Toast.makeText(this, "You have Saved Data of " + string, Toast.LENGTH_SHORT).show();
        }
    }

    public void Reset(View view) {
        Toast.makeText(this, "You have Reset The Data", Toast.LENGTH_SHORT).show();
    }
}