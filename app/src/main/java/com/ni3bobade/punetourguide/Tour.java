package com.ni3bobade.punetourguide;

public class Tour {
    private int tourImageResourceId;
    private String tourDestinationName;
    private String tourDestinationLocation;
    private String tourDestinationDescription;

    public Tour(int tourImageResourceId, String tourDestinationName, String tourDestinationLocation, String tourDestinationDescription) {
        this.tourImageResourceId = tourImageResourceId;
        this.tourDestinationName = tourDestinationName;
        this.tourDestinationLocation = tourDestinationLocation;
        this.tourDestinationDescription = tourDestinationDescription;
    }

    public int getTourImageResourceId() {
        return tourImageResourceId;
    }

    public String getTourDestinationName() {
        return tourDestinationName;
    }

    public String getTourDestinationLocation() {
        return tourDestinationLocation;
    }

    public String getTourDestinationDescription() {
        return tourDestinationDescription;
    }
}
