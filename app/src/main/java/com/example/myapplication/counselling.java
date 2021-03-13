package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class counselling extends AppCompatActivity {

    Button wazi, cbt, interpersonal, online;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.counsellorlink);

        wazi = (Button) findViewById(R.id.wazi);
        cbt = (Button) findViewById(R.id.cbt);
        interpersonal = (Button) findViewById(R.id.interpersonal);
        online = (Button) findViewById(R.id.online);

        wazi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });
    }
    public void openNewActivity(){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https:www.wazi.co"));
        startActivity(intent);
    }
}