package com.example.projet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class superviseur extends AppCompatActivity {
    ImageView imageView11 , imageView12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_superviseur);
        imageView11 = findViewById(R.id.imageView11);
        imageView12 = findViewById(R.id.imageView12);
        imageView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vendeur();
            }
        });

        imageView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cherchervendeur();
            }
        });
    }

    public void vendeur(){
        Intent intent= new Intent(this, addvendeur.class);
        startActivity(intent);
    }

    public void cherchervendeur(){
        Intent intent= new Intent(this, cherchervendeur.class);
        startActivity(intent);
    }
}