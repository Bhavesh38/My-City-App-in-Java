package com.example.android.mycity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MallsDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malls_details);

        final ArrayList<list> Words=new ArrayList<list>();

        Words.add(new list(R.drawable.questmall,"Quest Mall","syed Amir","10:00am-10:00pm",R.drawable.locationlogo));
        Words.add(new list(R.drawable.southcitymall,"South city Mall","Prince Anwar shah road","10:00am-5:30pm",R.drawable.locationlogo));
        Words.add(new list(R.drawable.citycentremall,"City centra Mall","New Town","10:00am-10:00pm",R.drawable.locationlogo));
        Words.add(new list(R.drawable.manisquaremall,"Mani Square Mall","Maniktala main road","7:00am-9:00pm",R.drawable.locationlogo));
        Words.add(new list(R.drawable.questmall,"Acropolish Mall","Rajdanga main road","10:00am-9:00pm",R.drawable.locationlogo));
        Words.add(new list(R.drawable.southcitymall,"Lake Mall","Rashbehari Avenue","10:00am-9:30pm",R.drawable.locationlogo));
        Words.add(new list(R.drawable.citycentremall,"Avani Riverside Mall","Jagat Banarjee Ghat road","10:00am-9:30pm",R.drawable.locationlogo));
        Words.add(new list(R.drawable.manisquaremall,"Gariahat Mall","Jamir lane","11:00am-8:00pm",R.drawable.locationlogo));


        CustomAdapter adapter = new CustomAdapter(this, Words);

        ListView listView = (ListView) findViewById(R.id.malls_details_list_view);
        listView.setAdapter(adapter);
    }
}