package com.skychan.crimeintent;

import android.app.Fragment;

/**
 * Created by CSK on 2017/8/11.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
