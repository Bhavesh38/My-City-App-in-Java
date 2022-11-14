package com.example.android.mycity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ParkDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_park_details);


        final ArrayList<list> Words=new ArrayList<list>();

        Words.add(new list(R.drawable.maidanpark,"Maidan","Kolkata","24h",R.drawable.locationlogo));
        Words.add(new list(R.drawable.centralpark,"Central Park","BidhanNagar","10:00am-5:30pm",R.drawable.locationlogo));
        Words.add(new list(R.drawable.millenianpark,"Millenium Park","Strand road","10:00am-6:30pm",R.drawable.locationlogo));
        Words.add(new list(R.drawable.deshpriyapark,"Deshapriya Park","Kalighat","7:00am-9:00pm",R.drawable.locationlogo));
        Words.add(new list(R.drawable.ecoturismpark,"Eco tourism Park","18km from city centre","2:30pm-8:30pm",R.drawable.locationlogo));
        Words.add(new list(R.drawable.elliatpark,"Elliot Park","Lush green","24h",R.drawable.locationlogo));
        Words.add(new list(R.drawable.mohorkunjapark,"Mohar Kunja","Permises of Maidan","3:00pm-8:00pm",R.drawable.locationlogo));
        Words.add(new list(R.drawable.safaripark,"Safari Park","Gariahat Golpark","6:00am-6:00pm",R.drawable.locationlogo));
        Words.add(new list(R.drawable.botonikalpark,"Botanical Garden","Shibpur,Hawrah","8:00am-5:00pm",R.drawable.locationlogo));
        Words.add(new list(R.drawable.niccopark,"Nicco park","Kolkata","10:30am-6:00pm",R.drawable.locationlogo));
        CustomAdapter adapter = new CustomAdapter(this, Words);

        ListView listView = (ListView) findViewById(R.id.park_details_list_view);
        listView.setAdapter(adapter);
                


    }
}