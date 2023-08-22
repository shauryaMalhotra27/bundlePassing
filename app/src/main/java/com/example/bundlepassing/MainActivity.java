package com.example.bundlepassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nameEt, numberEt, emailEt, genderEt;

    Button nextPageBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEt = findViewById(R.id.name);
        numberEt = findViewById(R.id.number);
        emailEt = findViewById(R.id.email);
        genderEt = findViewById(R.id.gender);
        nextPageBtn = findViewById(R.id.toNextPage);

        String textName = nameEt.getText().toString();
        String textNumber = numberEt.getText().toString();
        String textEmail = emailEt.getText().toString();
        String textGender = genderEt.getText().toString();

        nextPageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, pageView2.class);

                i.putExtra("NAME", textName);
                i.putExtra("NUMBER", textNumber);
                i.putExtra("EMAIL", textEmail);
                i.putExtra("GENDER", textGender);

                startActivity(i);
            }
        });
    }
}