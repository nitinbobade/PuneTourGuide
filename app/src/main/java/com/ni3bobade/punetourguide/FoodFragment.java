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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.tour_list_view, container, false);

        final ArrayList<Tour> tours = new ArrayList<>();

        tours.add(new Tour(R.drawable.cafe_good_luck, "Cafe Goodluck", "FC Road, Deccan Gymkhana, Pune", "A popular Irani cafe-restaurant established in 1935 by Hussain Ali Yakshi"));
        tours.add(new Tour(R.drawable.vaishali_restaurant, "Vaishali", "FC Road, Deccan Gymkhana, Pune", "A restaurant popular in Pune for southern Indian food"));
        tours.add(new Tour(R.drawable.bedekar_misal, "Bedekar Misal", "Narayan Peth, Pune, Maharashtra", "Grassroots India dining at a basic restaurant with self-service & an open kitchen."));
        tours.add(new Tour(R.drawable.shabree_restaurant, "Shabree Restaurant", "Paduka Chowk off FC Road, Pune", "A fine-dine restaurant, specialized in ethnic Maharashtrian thali"));
        tours.add(new Tour(R.drawable.tiranga_nonveg, "Tiranga’s Nonveg", "Pitambar Heights, Paud Rd, Kothrud, Pune", "A must try delicious biryani, legendary outlets & nice ambience too."));

        TourAdapter tourAdapter = new TourAdapter(getActivity(), tours);

        ListView tourListView = rootView.findViewById(R.id.tourListView);
        tourListView.setAdapter(tourAdapter);

        return rootView;
    }

}
