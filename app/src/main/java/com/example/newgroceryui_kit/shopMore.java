package com.example.newgroceryui_kit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import static com.example.newgroceryui_kit.Constant_Variable.shopNow;

public class shopMore extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_more);
        shopNow=findViewById(R.id.shop_now_btn);

        shopNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent move=new Intent(shopMore.this,HomeActivity.class);
                startActivity(move);
            }
        });

    }
}
