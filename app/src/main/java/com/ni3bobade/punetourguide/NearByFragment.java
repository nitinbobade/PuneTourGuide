package com.ni3bobade.punetourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class NearByFragment extends Fragment {


    public NearByFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.tour_list_view, container, false);

        final ArrayList<Tour> tours = new ArrayList<>();

        tours.add(new Tour(R.drawable.jejuri_town, getString(R.string.first_nearby_destination_name), getString(R.string.first_nearby_destination_location), getString(R.string.first_nearby_destination_description)));
        tours.add(new Tour(R.drawable.lonavala_hill_station, getString(R.string.second_nearby_destination_name), getString(R.string.second_nearby_destination_location), getString(R.string.second_nearby_destination_description)));
        tours.add(new Tour(R.drawable.rajgad_fort, getString(R.string.third_nearby_destination_name), getString(R.string.third_nearby_destination_location), getString(R.string.third_nearby_destination_description)));
        tours.add(new Tour(R.drawable.mulshi_dam, getString(R.string.fourth_nearby_destination_name), getString(R.string.fourth_nearby_destination_location), getString(R.string.fourth_nearby_destination_description)));

        TourAdapter tourAdapter = new TourAdapter(getActivity(), tours);

        ListView tourListView = rootView.findViewById(R.id.tourListView);
        tourListView.setAdapter(tourAdapter);

        return rootView;
    }

}
