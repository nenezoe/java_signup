package com.example.java_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnClick(View view){
        TextView txtFirstName = findViewById(R.id.textViewFirstName);
        TextView txtLastName = findViewById(R.id.textViewLastName);
        TextView txtEmail = findViewById(R.id.textViewEmail);


        EditText edTextFirstName = findViewById(R.id.firstName);
        EditText edTextLastName = findViewById(R.id.lastName);
        EditText edTextEmail = findViewById(R.id.email);


        txtFirstName.setText( edTextFirstName.getText().toString());
        txtLastName.setText(edTextLastName.getText().toString());
        txtEmail.setText(edTextEmail.getText().toString());

    }
}