package com.example.newgroceryui_kit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Kart extends AppCompatActivity {
    private TextView checkout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kart);
        checkout=findViewById(R.id.check_out_btn);

        checkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent move=new Intent(Kart.this,payment.class);
                startActivity(move);
            }
        });
    }
}
