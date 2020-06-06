package com.example.newgroceryui_kit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import static com.example.newgroceryui_kit.Constant_Variable.locateMe;


public class locateMe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locate_me);


        locateMe=findViewById(R.id.locate_me_buttton);

        locateMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent move=new Intent(locateMe.this,HomeActivity.class);
                startActivity(move);
            }
        });

    }
}
