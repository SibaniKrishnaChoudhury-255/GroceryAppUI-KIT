package com.example.newgroceryui_kit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;



public class MainActivity extends AppCompatActivity {

    private LinearLayout splashButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        splashButton=findViewById(R.id.splash_btn);

        splashButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent move=new Intent(MainActivity.this,LoginScreen.class);
                startActivity(move);
            }
        });
    }
}
