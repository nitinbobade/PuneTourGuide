package com.ni3bobade.punetourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TourAdapter extends ArrayAdapter<Tour> {

    public TourAdapter(Context context, ArrayList<Tour> tours) {
        super(context, 0, tours);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        // check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.tour_list_item, parent, false);
        }

        Tour currentTour = getItem(position);

        ImageView tourDestinationImageView = listItemView.findViewById(R.id.tourDestinationImageView);
        tourDestinationImageView.setImageResource(currentTour.getTourImageResourceId());

        TextView tourDestinationNameTextView = listItemView.findViewById(R.id.tourDestinationNameTextView);
        tourDestinationNameTextView.setText(currentTour.getTourDestinationName());

        TextView tourDestinationLocationTextView = listItemView.findViewById(R.id.tourDestinationLocationTextView);
        tourDestinationLocationTextView.setText(currentTour.getTourDestinationLocation());

        TextView tourDestinationDescriptionTextView = listItemView.findViewById(R.id.tourDestinationDescriptionTextView);
        tourDestinationDescriptionTextView.setText(currentTour.getTourDestinationDescription());

        return listItemView;
    }

}
