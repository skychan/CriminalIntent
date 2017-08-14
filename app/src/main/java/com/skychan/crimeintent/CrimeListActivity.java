package com.skychan.crimeintent;

import android.support.v4.app.Fragment;

/**
 * Created by CSK on 2017/8/11.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
