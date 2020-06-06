package com.example.newgroceryui_kit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class HomeActivity extends AppCompatActivity {

    private LinearLayout home,Search,card1;
    private CardView card;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        home=findViewById(R.id.home_button);
        Search=findViewById(R.id.search_button);
        card=findViewById(R.id.item1);
        card1=findViewById(R.id.cart_buttton);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent move=new Intent(HomeActivity.this,HomeActivity.class);
                startActivity(move);
            }
        });

        Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent move=new Intent(HomeActivity.this,noInternet.class);
                startActivity(move);
            }
        });

        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent move=new Intent(HomeActivity.this,ItemDescription.class);
                startActivity(move);
            }
        });

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent move=new Intent(HomeActivity.this,Kart.class);
                startActivity(move);
            }
        });
    }
}
