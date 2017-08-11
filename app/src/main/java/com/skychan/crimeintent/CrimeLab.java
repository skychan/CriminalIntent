package com.skychan.crimeintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by CSK on 2017/8/11.
 */

public class CrimeLab {
    private Context mAppContext;
    private ArrayList<Crime> mCrimes;
    private static volatile  CrimeLab sCrimeLab;

    private CrimeLab(Context appContext) {
        mAppContext = appContext;
        mCrimes = new ArrayList<Crime>();
        for (int i = 0; i < 100; i++) {
            Crime c = new Crime();
            c.setTitle("Crime #" + i);
            c.setSolved(i % 2 == 0);
            mCrimes.add(c);
        }
    }

    public static final CrimeLab get(Context c) {
        if (sCrimeLab == null) {
            synchronized (CrimeLab.class) {
                if (sCrimeLab == null) {
                    sCrimeLab = new CrimeLab(c.getApplicationContext());
                }
            }
        }
        return sCrimeLab;
    }

    public Crime getCrime(UUID id) {
        for (Crime c : mCrimes) {
            if (c.getId().equals(id))
                return c;
        }
        return null;
    }

    public ArrayList<Crime> getCrimes() {
        return mCrimes;
    }
}
