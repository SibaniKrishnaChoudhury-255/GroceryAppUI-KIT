package com.example.newgroceryui_kit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;


public class MainActivity extends AppCompatActivity {

    private LinearLayout splashButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Window window = this.getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this,R.color.statusbar_color));

        splashButton = findViewById(R.id.splash_btn);

        splashButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent move = new Intent(MainActivity.this, LoginScreen.class);
                startActivity(move);
            }
        });
    }
}
