package com.skychan.crimeintent;

import java.util.UUID;

/**
 * Created by CSK on 2017/8/9.
 */

public class Crime {
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
