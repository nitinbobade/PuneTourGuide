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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.tour_list_view, container, false);

        final ArrayList<Tour> tours = new ArrayList<>();

        tours.add(new Tour(R.drawable.sinhagad_pune, "Sinhagad", "Sinhagad Ghat Road, Thoptewadi Pune", "Hill fortress located at around 36 km southwest of the city"));
        tours.add(new Tour(R.drawable.aga_khan_palace, "Aga Khan Palace", "Aga Khan Palace Road, Pune, Maharashtra", "Built in 1892 by Sultan Muhammed Shah Aga Khan III in Pune, India."));
        tours.add(new Tour(R.drawable.shaniwar_wada, "Shaniwar Wada", "Shaniwar Peth, Pune, Maharashtra", "Historical fortification built in 1732 in the city of Pune in Maharashtra, India."));
        tours.add(new Tour(R.drawable.khadakwasla_dam, "Khadakwasla Dam", "Khadakwasla, Pune, Maharashtra", "A dam on the Mutha River 21 km (13 mi) from the centre of the city"));

        TourAdapter tourAdapter = new TourAdapter(getActivity(), tours);

        ListView tourListView = rootView.findViewById(R.id.tourListView);
        tourListView.setAdapter(tourAdapter);

        return rootView;
    }

}
