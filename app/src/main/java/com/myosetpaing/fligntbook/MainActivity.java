package com.myosetpaing.fligntbook;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnRoundTrip = findViewById(R.id.btn_round_trip);
        Button btnOneWay = findViewById(R.id.btn_one_way);
        Button btnSearch = findViewById(R.id.btn_search);

        btnRoundTrip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout linearLayout = findViewById(R.id.return_date);
                linearLayout.setVisibility(View.VISIBLE);
            }
        });
        btnOneWay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout linearLayout = findViewById(R.id.return_date);
                linearLayout.setVisibility(View.INVISIBLE);
            }
        });
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RelativeLayout price = findViewById(R.id.price);
                price.setVisibility(View.VISIBLE);
            }
        });
        final Calendar myCalendar = Calendar.getInstance();

    }
}
