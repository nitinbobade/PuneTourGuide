package com.ni3bobade.punetourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ShoppingFragment extends Fragment {

    public ShoppingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.tour_list_view, container, false);

        final ArrayList<Tour> tours = new ArrayList<>();

        tours.add(new Tour(R.drawable.phoenix_market_city, getString(R.string.first_shopping_destination_name), getString(R.string.first_shopping_destination_location), getString(R.string.first_shopping_destination_description)));
        tours.add(new Tour(R.drawable.amanora_mall, getString(R.string.second_shopping_destination_name), getString(R.string.second_shopping_destination_location), getString(R.string.second_shopping_destination_description)));
        tours.add(new Tour(R.drawable.pune_central, getString(R.string.third_shopping_destination_name), getString(R.string.third_shopping_destination_location), getString(R.string.third_shopping_destination_description)));
        tours.add(new Tour(R.drawable.kumar_pacific_mall, getString(R.string.fourth_shopping_destination_name), getString(R.string.fourth_shopping_destination_location), getString(R.string.fourth_shopping_destination_description)));
        tours.add(new Tour(R.drawable.seasons_mall, getString(R.string.fifth_shopping_destination_name), getString(R.string.fifth_shopping_destination_location), getString(R.string.fifth_shopping_destination_description)));

        TourAdapter tourAdapter = new TourAdapter(getActivity(), tours);

        ListView tourListView = rootView.findViewById(R.id.tourListView);
        tourListView.setAdapter(tourAdapter);

        return rootView;
    }

}
