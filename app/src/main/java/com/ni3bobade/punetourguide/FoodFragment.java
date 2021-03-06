package com.ni3bobade.punetourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class FoodFragment extends Fragment {

    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.tour_list_view, container, false);

        final ArrayList<Tour> tours = new ArrayList<>();

        tours.add(new Tour(R.drawable.cafe_good_luck, getString(R.string.first_food_destination_name), getString(R.string.first_food_destination_location), getString(R.string.first_food_destination_description)));
        tours.add(new Tour(R.drawable.vaishali_restaurant, getString(R.string.second_food_destination_name), getString(R.string.second_food_destination_location), getString(R.string.second_food_destination_description)));
        tours.add(new Tour(R.drawable.bedekar_misal, getString(R.string.third_food_destination_name), getString(R.string.third_food_destination_location), getString(R.string.third_food_destination_description)));
        tours.add(new Tour(R.drawable.shabree_restaurant, getString(R.string.fourth_food_destination_name), getString(R.string.fourth_food_destination_location), getString(R.string.fourth_food_destination_description)));
        tours.add(new Tour(R.drawable.tiranga_nonveg, getString(R.string.fifth_food_destination_name), getString(R.string.fifth_food_destination_location), getString(R.string.fifth_food_destination_description)));

        TourAdapter tourAdapter = new TourAdapter(getActivity(), tours);

        ListView tourListView = rootView.findViewById(R.id.tourListView);
        tourListView.setAdapter(tourAdapter);

        return rootView;
    }

}
