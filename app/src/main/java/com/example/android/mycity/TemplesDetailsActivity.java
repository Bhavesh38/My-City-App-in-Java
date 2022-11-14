package com.example.android.mycity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class TemplesDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temples_details);


        final ArrayList<list> Words=new ArrayList<list>();

        Words.add(new list(R.drawable.kalighattemple,"Kalighat Kali Temple","Anami sangha","5:00am-10:30pm",R.drawable.locationlogo));
        Words.add(new list(R.drawable.birlamandir,"Birla Mandir","Old Ballygunge road","05:00am-9:00pm",R.drawable.locationlogo));
        Words.add(new list(R.drawable.miramandir,"Mira Mandir","Moirast","6:00am-8:00pm",R.drawable.locationlogo));
        Words.add(new list(R.drawable.thsnthsniakalibari,"Dakshineswar Kali Temple","Dakshineswar","7:00am-9:00pm",R.drawable.locationlogo));
        Words.add(new list(R.drawable.taraknathtemple,"Taraknath Temple","Taraknath Mandir road","2:30pm-8:30pm",R.drawable.locationlogo));
        Words.add(new list(R.drawable.lakekalibaritemple,"Lake Kalibhari Temple","Karunamayee kalimata mandir","24h",R.drawable.locationlogo));
        Words.add(new list(R.drawable.thsnthsniakalibari,"Thanthania Kalibari","College stree market","3:00pm-8:00pm",R.drawable.locationlogo));
        Words.add(new list(R.drawable.iskonsrisritemple,"ISKON Temple","Albert road","6:00am-6:00pm",R.drawable.locationlogo));


        CustomAdapter adapter = new CustomAdapter(this, Words);

        ListView listView = (ListView) findViewById(R.id.temples_details_list_view);
        listView.setAdapter(adapter);
    }
}