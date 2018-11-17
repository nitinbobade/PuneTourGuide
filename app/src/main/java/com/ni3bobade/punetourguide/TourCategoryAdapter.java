package com.ni3bobade.punetourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TourCategoryAdapter extends FragmentPagerAdapter {

    private Context context;

    public TourCategoryAdapter(Context context, FragmentManager fragmentManager) {
        super(fragmentManager);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new PlacesFragment();
        } else if (position == 1) {
            return new FoodFragment();
        } else if (position == 2) {
            return new ShoppingFragment();
        } else {
            return new NearByFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.places);
        } else if (position == 1) {
            return context.getString(R.string.food);
        } else if (position == 2) {
            return context.getString(R.string.shopping);
        } else {
            return context.getString(R.string.nearby);
        }
    }
}
