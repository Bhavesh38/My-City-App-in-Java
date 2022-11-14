package com.example.android.mycity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels_details);



        final ArrayList<list> Words=new ArrayList<list>();

        Words.add(new list(R.drawable.firstiningshotel,"First innings Resturant","Sector-3,Saltlake","7:00am-10:30pm",R.drawable.locationlogo));
        Words.add(new list(R.drawable.spicecrafthotel,"Spice Craft","54/1/2A Haza road","11:00am-11:00pm",R.drawable.locationlogo));
        Words.add(new list(R.drawable.arsalnhotel,"Arsalan Hotel","Park street area","10:30am-12:00pm",R.drawable.locationlogo));
        Words.add(new list(R.drawable.theliquidhotel,"Vertex-The liquid","CB-218,Newtown","4:00pm-11:59pm",R.drawable.locationlogo));
        Words.add(new list(R.drawable.darjilinglonge,"Darjeeling Lounge","1jbs Haldane Avenue","11:00am-11:00pm",R.drawable.locationlogo));
        Words.add(new list(R.drawable.seasonaltastehotel,"Seasonal Tastes","CBD/2,NewTown","7:00am-10:30pm",R.drawable.locationlogo));


        CustomAdapter adapter = new CustomAdapter(this, Words);
        ListView listView = (ListView) findViewById(R.id.hotels_details_list_view);
        listView.setAdapter(adapter);
    }
}