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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.tour_list_view, container, false);

        final ArrayList<Tour> tours = new ArrayList<>();

        tours.add(new Tour(R.drawable.phoenix_market_city, "Phoenix Marketcity", "Viman Nagar Rd, Pune, Maharashtra", "One of the largest malls in India, with the area of 3.4 million square feet"));
        tours.add(new Tour(R.drawable.amanora_mall, "Amanora Mall", "Hadapsar-Kharadi Bypass, Pune", "Shopping destination of Pune where city meets to Shop, Eat & have a great time"));
        tours.add(new Tour(R.drawable.pune_central, "Pune Central", "Shivaji Nagar, Pune, Maharashtra", "One stop shopping destination for all the shopaholics"));
        tours.add(new Tour(R.drawable.kumar_pacific_mall, "Kumar Pacific Mall", "Shankarshet Road Near Swargate, Pune", "A lifestyle mall that keeps perfect synergy between convenience and entertainment"));
        tours.add(new Tour(R.drawable.seasons_mall, "Seasons Mall", "Magarpatta City, Hadapsar, Pune", "Home to over 100 brands, 25,000 sq. ft. of food court, & a 15 screen multiplex"));

        TourAdapter tourAdapter = new TourAdapter(getActivity(), tours);

        ListView tourListView = rootView.findViewById(R.id.tourListView);
        tourListView.setAdapter(tourAdapter);

        return rootView;
    }

}
