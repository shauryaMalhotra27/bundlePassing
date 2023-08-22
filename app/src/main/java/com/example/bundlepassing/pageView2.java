package com.example.bundlepassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class pageView2 extends AppCompatActivity {


    TextView nameView, numberView, emailView,genderView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_view2);

        Intent j = getIntent();

        nameView = findViewById(R.id.nameView);
        String name1 = j.getStringExtra("NAME");
        nameView.setText(name1);

        numberView = findViewById(R.id.numberView);
        String number1= j.getStringExtra("NUMBER");
        numberView.setText(number1);

        emailView = findViewById(R.id.emailView);
        String email1 = j.getStringExtra("EMAIL");
        emailView.setText(email1);

        genderView = findViewById(R.id.genderView);
        String gender1 = j.getStringExtra("GENDER");
        genderView.setText(gender1);


    }
}