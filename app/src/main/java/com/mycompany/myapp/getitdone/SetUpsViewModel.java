package com.mycompany.myapp.getitdone;

import android.app.Activity;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.ViewModel;
import android.content.Context;
import android.databinding.BindingAdapter;
import android.support.design.widget.NavigationView;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;
import android.view.View;

import com.github.florent37.awesomebar.ActionItem;
import com.github.florent37.awesomebar.AwesomeBar;
import com.mycompany.myapp.getitdone.R;
import com.mycompany.myapp.getitdone.Home;
import com.mycompany.myapp.getitdone.MyFragmentAdapter;

public class SetUpsViewModel {
    Context context;

    public SetUpsViewModel(Context context) { this.context = context;
    }


    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }
    public  void bindMainViewPagerAdapter(ViewPager viewPager) {
        MainActivity activity = (MainActivity)context;
        final MyFragmentAdapter adapter = new MyFragmentAdapter(activity.getSupportFragmentManager());
        viewPager.setAdapter(adapter);
    }
}
