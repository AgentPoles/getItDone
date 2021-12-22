package com.mycompany.myapp.getitdone;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class MyFragmentAdapter extends FragmentStatePagerAdapter {

    private static int positio;
    //   private List<Fragment> fragments;
    public MyFragmentAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new One();
            case 1:
                return new Two();
            case 2:
                return new Three();
            case 3:
                return new Four();
            case 4:
                return new Five();

        }
        return null;
    }
    //  public void setItem(Fragment a, Fragment b , Fragment c){
//
//  }
    @Override
    public int getCount(){
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
//            case 0: return "All";
//            case 1: return "Answered";
//            case 2: return "UnAnswered";
//    case 4: return "Interact";
//    case 5: return "Spicer";
//    case 6: return "Spicenext";
        }
        return null;
    }
}
