package com.example.tourapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IntoTheCity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_into_the_city);
    }
    public void getIntoCity(View view)
    {
        Intent objectIntent=new Intent(this,MainActivity.class);

        startActivity(objectIntent);

         this.finish();
    }

}
