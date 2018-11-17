package com.ni3bobade.punetourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlacesFragment extends Fragment {

    public PlacesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.tour_list_view, container, false);

        final ArrayList<Tour> tours = new ArrayList<>();

        tours.add(new Tour(R.drawable.sinhagad_pune, getString(R.string.first_places_destination_name), getString(R.string.first_places_destination_location), getString(R.string.first_places_destination_description)));
        tours.add(new Tour(R.drawable.aga_khan_palace, getString(R.string.second_places_destination_name), getString(R.string.second_places_destination_location), getString(R.string.second_places_destination_description)));
        tours.add(new Tour(R.drawable.shaniwar_wada, getString(R.string.third_places_destination_name), getString(R.string.third_places_destination_location), getString(R.string.third_places_destination_description)));
        tours.add(new Tour(R.drawable.khadakwasla_dam, getString(R.string.fourth_places_destination_name), getString(R.string.fourth_places_destination_location), getString(R.string.fourth_places_destination_description)));

        TourAdapter tourAdapter = new TourAdapter(getActivity(), tours);

        ListView tourListView = rootView.findViewById(R.id.tourListView);
        tourListView.setAdapter(tourAdapter);

        return rootView;
    }

}
