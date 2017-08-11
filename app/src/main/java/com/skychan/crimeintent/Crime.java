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
//        return DateFormat.getLongDateFormat(null).format(mDate);
//    }
    public Date getDate() {
        return mDate;
    }
    public boolean ismSolved() {
        return mSolved;
    }

    public void setSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }

    private boolean mSolved;


    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    private UUID mId;

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    private String mTitle;

    public Crime() {
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    @Override
    public String toString()
    {
        return mTitle;
    }

}
