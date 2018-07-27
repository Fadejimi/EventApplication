package com.example.sfldpguser_24.eventcheckinapplication.views;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sfldpguser_24.eventcheckinapplication.R;
import com.example.sfldpguser_24.eventcheckinapplication.databinding.FragmentConfirmImageBinding;


/**
 * A simple {@link Fragment} subclass.
 */
public class ConfirmImageFragment extends Fragment {
    private FragmentConfirmImageBinding mBinding;

    public ConfirmImageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mBinding =  FragmentConfirmImageBinding.inflate(inflater);

        return mBinding.getRoot();
    }

}
