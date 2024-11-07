package com.ebookonline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout bukuelektronBtn = findViewById(R.id.bukuelektronBtn);
        final LinearLayout komponenBtn = findViewById(R.id.komponenBtn);

        bukuelektronBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, webview.class);
                startActivity(intent);
            }
        });

        komponenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, webview.class);
                startActivity(intent);
            }
        });
    }
}