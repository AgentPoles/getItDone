package com.mycompany.myapp.getitdone;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.github.florent37.awesomebar.ActionItem;
import com.github.florent37.awesomebar.AwesomeBar;
import com.mycompany.myapp.getitdone.SetUpsViewModel;
import com.mycompany.myapp.getitdone.databinding.ActivityHomBinding;

import java.util.Timer;
import java.util.TimerTask;


public class Home extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    MyFragmentAdapter myFragmentAdapter;
    AutoScrollViewPager mViewPager;
    ActivityHomBinding binding;
    Context context;
    BottomFragment bottomFragment;
    public static String TAGE = "bottomfragment";
   Timer timer;

    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

         binding  = DataBindingUtil.setContentView(this, R.layout.activity_hom);
//        SetUpsViewModel setUpsViewModel = new SetUpsViewModel(this);


           binding.setHomeactivity(this);
           binding.appbar.setHomeactivitye(this);


        binding.appbar.toolbare.setOnMenuClickedListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.drawerLayout.openDrawer(Gravity.START);
            }
        });

        bindViewPagerAdapter(binding.appbar.viewpager,this);
        bottomFragment = new BottomFragment();
        context = this;
//        setUpFragment();
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        myFragmentAdapter = new MyFragmentAdapter(getSupportFragmentManager());
//        mViewPager = (ViewPager)findViewById(R.id.viewpager);
//        mViewPager.setAdapter(myFragmentAdapter);
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
//
//        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
//                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
//        drawer.addDrawerListener(toggle);
//        toggle.syncState();
//
//        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
//        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public  void bindViewPagerAdapter(final AutoScrollViewPager view, final Home activity) {
        final MyFragmentAdapter adapter = new MyFragmentAdapter(activity.getSupportFragmentManager());
        view.startAutoScroll();
        view.setInterval(3000);
        view.setCycle(true);
        view.setStopScrollWhenTouch(true);
        view.setAdapter(adapter);
    }


    @BindingAdapter("setNavItemSelectedListener")
    public static void bindnavadapter(final NavigationView navigationView, final Home activity){
        navigationView.setNavigationItemSelectedListener(activity);
    }


//    @BindingAdapter("setsupporttoolbar")
//    public static void bindtoolbar(final android.support.v7.widget.Toolbar toolbar, final Home activity){
//        activity.setSupportActionBar(toolbar);
//    }



    @BindingAdapter("setupawesomebar")
    public static void setupawesome(final AwesomeBar awesomeBar, final Home activity){
        awesomeBar.addAction(R.drawable.ic_softmale, "username");
        awesomeBar.displayHomeAsUpEnabled(false);
    }

    @BindingAdapter("setactionitemclicklistener")
    public static void setActionItemClickListener(final AwesomeBar awesomeBar, final Home activity) {

        awesomeBar.setActionItemClickListener(new AwesomeBar.ActionItemClickListener() {
            @Override
            public void onActionItemClicked(int position, ActionItem actionItem) {
//                Toast.makeText(getBaseContext(), actionItem.getText() + " clicked", Toast.LENGTH_LONG).show();
            }
        });
    }

    @BindingAdapter("setonmenuclickedlistener")
    public static void setOnMenuClickedListener(final AwesomeBar awesomeBar, final Home activity) {

    }

    @BindingAdapter("setoverflowitemclicklistener")
    public static void setOverFlowItemClickedListener(final AwesomeBar awesomeBar, final Home activity) {
        awesomeBar.setOverflowActionItemClickListener(new AwesomeBar.OverflowActionItemClickListener() {
            @Override
            public void onOverflowActionItemClicked(int position, String item) {

            }
        });
    }

//    public void setUpFragment(){
////        BaseView baseView = new BaseView();
//        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction transaction = fragmentManager.beginTransaction();
////        transaction.replace(R.id.fragmenthome,baseView);
//        transaction.commit();
//    }


    public void onClick(View v){
        if(bottomFragment!=null) {
            bottomFragment.show((((AppCompatActivity) context).getSupportFragmentManager()), TAGE);
            binding.appbar.fabMenu.close(true);
        }
        else{
             bottomFragment = new BottomFragment();
            bottomFragment.show((((AppCompatActivity) context).getSupportFragmentManager()), TAGE);
            binding.appbar.fabMenu.close(true);
        }
    }

//    private void timer(final ViewPager viewPager, final int NumberOfPages, final MyFragmentAdapter adapter ){
//        timer = new Timer();
//        timer.scheduleAtFixedRate(new TimerTask() {
//            @Override
//            public void run() {
//                runOnUiThread(new Runnable() {
//                    @Override
//                    public void run() {
//                        int current = adapter.
//                        if(current == NumberOfPages -1){
//                            current = 0;
//                        }
//                        viewPager.setCurrentItem(current++,true);
//                    }
//                });
//            }
//        }, 500, 5000);
//    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        timer.cancel();

    }
}
