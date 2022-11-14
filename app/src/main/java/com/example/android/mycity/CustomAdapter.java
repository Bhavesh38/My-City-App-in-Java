package com.example.android.mycity;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<list> {

    public CustomAdapter(Activity context, ArrayList<list> words) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        list currentWord = getItem(position);

        ImageView placeImageView=(ImageView) listItemView.findViewById(R.id.place_image_view);
        placeImageView.setImageResource(currentWord.getMainImageResourseId());

        TextView placeNameTextView=(TextView) listItemView.findViewById(R.id.place_name_text_view);
        placeNameTextView.setText(currentWord.getTitleName());

        TextView nearLocationTextView=(TextView) listItemView.findViewById(R.id.location_text_view);
        nearLocationTextView.setText(currentWord.getNearLocation());

        TextView timingTextView=(TextView) listItemView.findViewById(R.id.timing_text_view);
        timingTextView.setText(currentWord.getOpenandCloseTime());

        ImageView locationLogoImageView=(ImageView) listItemView.findViewById(R.id.location_logo_image_view);
        locationLogoImageView.setImageResource(currentWord.getLogoImageResourceId());





//        // Find the TextView in the list_item.xml layout with the ID version_name
//        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_Text_View);
//        // Get the version name from the current AndroidFlavor object and
//        // set this text on the name TextView
//        miwokTextView.setText(currentWord.getMiwokTranslation());
//
//        // Find the TextView in the list_item.xml layout with the ID version_number
//        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_Text_View);
//        // Get the version number from the current AndroidFlavor object and
//        // set this text on the number TextView
//        defaultTextView.setText(currentWord.getDefaultTranslation());
//
////        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
//        ImageView imageView=(ImageView) listItemView.findViewById(R.id.image_view);
////        // Get the image resource ID from the current AndroidFlavor object and
////        // set the image to iconView
//        imageView.setImageResource(currentWord.getImageResourceId());
//
//        // Return the whole list item layout (containing 2 TextViews and an ImageView)
//        // so that it can be shown in the ListView
        return listItemView;
    }

}






