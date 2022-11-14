package com.example.android.mycity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class CategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);


//        intent for opening for list of parks

        LinearLayout parkTextView=findViewById(R.id.park);
        parkTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(CategoryActivity.this, ParkDetailsActivity.class);
                CategoryActivity.this.startActivity(intent2);
            }
        });


//        intent for opening for list of hotels

        LinearLayout hotelsTextView=findViewById(R.id.hotels);
        hotelsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(CategoryActivity.this, HotelsDetailsActivity.class);
                CategoryActivity.this.startActivity(intent2);
            }
        });


//        intent for opening for list of malls

        LinearLayout mallsTextView=findViewById(R.id.malls);
        mallsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(CategoryActivity.this, MallsDetailsActivity.class);
                CategoryActivity.this.startActivity(intent2);
            }
        });

//        intent for opening for list of temples

        LinearLayout templesTextView=findViewById(R.id.temples);
        templesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(CategoryActivity.this, TemplesDetailsActivity.class);
                CategoryActivity.this.startActivity(intent2);
            }
        });
    }
}