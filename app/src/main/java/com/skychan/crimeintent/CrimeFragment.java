package com.skychan.crimeintent;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * Created by CSK on 2017/8/9.
 */

public class CrimeFragment extends Fragment {
    private Crime mCrime;
    private EditText mTitleField;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCrime = new Crime();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_crime, parent, false);

        mTitleField = (EditText) v.findViewById(R.id.crime_title);
        mTitleField.addTextChangedListener(new TextWatcher() {

            public void beforeTextChanged(CharSequence charSequence, int start, int before, int count) {

            }

            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
                mCrime.setmTtitle(charSequence.toString());
            }

            public void afterTextChanged(Editable editable) {

            }
        });



        return  v;


    }

}
