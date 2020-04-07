package com.intern.projectassignmentsolutions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {

    ImageView logoImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        logoImageView = findViewById(R.id.logo_imagebutton);
        logoImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, MainActivity.class));
                finish();
            }
        });
    }
}
