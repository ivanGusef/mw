package com.ivangusev.moneywatcher.mw.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ivangusev.moneywatcher.mw.R;

/**
 * Created by ivan on 17.01.14.
 */
public class StatisticFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_statistic, null);
    }
}
