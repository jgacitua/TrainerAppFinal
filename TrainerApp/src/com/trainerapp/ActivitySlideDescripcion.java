package com.trainerapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

public class ActivitySlideDescripcion extends FragmentActivity {
private MyPagerAdapter adapterViewPager;
private static Bundle b;


	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_slide);
        ViewPager vpPager = (ViewPager) findViewById(R.id.vpPager);
        adapterViewPager = new MyPagerAdapter(getSupportFragmentManager());
        vpPager.setPageTransformer(true, new ZoomOutPageTransformer());
        vpPager.setAdapter(adapterViewPager);
      Intent iin= getIntent();
       b = iin.getExtras();
    }
	  public static class MyPagerAdapter extends FragmentPagerAdapter {
		    private static int NUM_ITEMS = 3;

		        public MyPagerAdapter(FragmentManager fragmentManager) {
		            super(fragmentManager);
		        }

		        // Returns total number of pages
		        @Override
		        public int getCount() {
		            return NUM_ITEMS;
		        }

		        // Returns the fragment to display for that page
		        @Override
		        public Fragment getItem(int position) {
		            switch (position) {
		            case 0: // Fragment # 0 - This will show FirstFragment
		                return FragmentInicio.newInstance(0, "Page # 1",b.getString("ID"),b.getString("DIA"));
		            case 1: // Fragment # 0 - This will show FirstFragment different title
		                return  FragmentFinal.newInstance(1, "Page # 2",b.getString("ID"),b.getString("DIA"));
		            case 2: // Fragment # 1 - This will show SecondFragment
		                return  FragmentDescripcion.newInstance(2, "Page # 3",b.getString("ID"),b.getString("DIA"));
		            default:
		                return null;
		            }
		        }

		        // Returns the page title for the top indicator
		        @Override
		        public CharSequence getPageTitle(int position) {
		        	
		            return "Pagina " + position;
		        }

		    }
}