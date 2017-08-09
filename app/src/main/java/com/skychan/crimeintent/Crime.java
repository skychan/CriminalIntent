package com.skychan.crimeintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by CSK on 2017/8/9.
 */

public class Crime {

    private Date mDate;

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public Date getmDate() {
        return mDate;
    }

    public boolean ismSolved() {
        return mSolved;
    }

    public void setmSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }

    private boolean mSolved;


    public UUID getmId() {
        return mId;
    }

    public String getmTtitle() {
        return mTtitle;
    }

    private UUID mId;

    public void setmTtitle(String mTtitle) {
        this.mTtitle = mTtitle;
    }

    private String mTtitle;

    public Crime() {
        mId = UUID.randomUUID();
    }

}
