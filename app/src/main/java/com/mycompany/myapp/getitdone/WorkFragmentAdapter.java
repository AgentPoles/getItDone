package com.mycompany.myapp.getitdone;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class WorkFragmentAdapter extends FragmentStatePagerAdapter {

    private static int positio;
    //   private List<Fragment> fragments;
    public WorkFragmentAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new Requests();
            case 1:
                return new Jobs();
        }
        return null;
    }
    //  public void setItem(Fragment a, Fragment b , Fragment c){
//
//  }
    @Override
    public int getCount(){
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0: return "Requests";
            case 1:return "Jobs";
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

