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

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_screen_slide);
//
//        // Instantiate a ViewPager and a PagerAdapter.
//        mPager = (ViewPager) findViewById(R.id.pager);
//        mPagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
//        mPager.setAdapter(mPagerAdapter);
//        args = new Bundle();
//        Intent iin= getIntent();
//        Bundle b = iin.getExtras();
//        
//        args.putString("DIA",b.getString("DIA"));
//        args.putString("ID",b.getString("ID")); 
//        
//        
//    }
//
//    @Override
//    public void onBackPressed() {
//        if (mPager.getCurrentItem() == 0) {
//            // If the user is currently looking at the first step, allow the system to handle the
//            // Back button. This calls finish() on this activity and pops the back stack.
//            super.onBackPressed();
//        } else {
//            // Otherwise, select the previous step.
//            mPager.setCurrentItem(mPager.getCurrentItem() - 1);
//        }
//    }
//
//    /**
//     * A simple pager adapter that represents 5 ScreenSlidePageFragment objects, in
//     * sequence.
//     */
//    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
//        public ScreenSlidePagerAdapter(FragmentManager fm) {
//            super(fm);
//        }
//
//        @Override
//        public Fragment getItem(int position) {
//        	ScreenSlidePageFragment fragment = new ScreenSlidePageFragment();
//        	args.putString("POSITION",""+position); 
//        	fragment.setArguments(args);
//        	
//            return  fragment;
//        }
//
//        @Override
//        public int getCount() {
//            return NUM_PAGES;
//        }
//    }
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