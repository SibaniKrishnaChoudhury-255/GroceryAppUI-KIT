package com.example.newgroceryui_kit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import static com.example.newgroceryui_kit.Constant_Variable.noIntenet;
import static com.example.newgroceryui_kit.Constant_Variable.shopNow;


public class noInternet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_internet);

        noIntenet=findViewById(R.id.refresh_btn);

        noIntenet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent move=new Intent(noInternet.this,HomeActivity.class);
                startActivity(move);
            }
        });
    }
}
