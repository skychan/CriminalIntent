package com.skychan.crimeintent;

import android.text.format.DateFormat;

import java.util.Date;
import java.util.UUID;

/**
 * Created by CSK on 2017/8/9.
 */

public class Crime {

    private Date mDate;

    public void setDate(Date mDate) {
        this.mDate = mDate;
    }

//    public String getDate() {
//        return DateFormat.format("EEEEMMMMdYYYY", mDate);
//    }
    public Date getDate() {
        return mDate;
    }
    public boolean ismSolved() {
        return mSolved;
    }

    public void setmSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }

    private boolean mSolved;


    public UUID getId() {
        return mId;
    }

    public String getTtitle() {
        return mTtitle;
    }

    private UUID mId;

    public void setTtitle(String mTtitle) {
        this.mTtitle = mTtitle;
    }

    private String mTtitle;

    public Crime() {
        mId = UUID.randomUUID();
        mDate = new Date();
    }

}
