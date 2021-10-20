package com.example.buttonsdifferenttypes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Addition extends AppCompatActivity {

    EditText editText1,editText2;
    Button addbtn;
    String value1,value2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);

        //calling the method
        addbutton();

       }

    public void addbutton(){
        editText1 = findViewById(R.id.edit_1);
        editText2 = findViewById(R.id.edit_2);
        addbtn = findViewById(R.id.addbtn);
    }
    public void Add(View view) {
        value1 = editText1.getText().toString();
        value2 = editText2.getText().toString();

        int a = Integer.parseInt(value1);
        int b = Integer.parseInt(value2);
        int sum = a+b;
        Toast.makeText(this, "sum is "+ sum, Toast.LENGTH_SHORT).show();
    }
}