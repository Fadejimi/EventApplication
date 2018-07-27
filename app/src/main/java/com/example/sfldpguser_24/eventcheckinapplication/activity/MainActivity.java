package com.example.sfldpguser_24.eventcheckinapplication.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.sfldpguser_24.eventcheckinapplication.R;
import com.example.sfldpguser_24.eventcheckinapplication.databinding.ActivityMainBinding;
import com.example.sfldpguser_24.eventcheckinapplication.presenter.ActivityPresenter;
import com.example.sfldpguser_24.eventcheckinapplication.presenter.IActivityPresenter;

public class MainActivity extends AppCompatActivity implements IMainActivity {
    private IActivityPresenter presenter;
    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        presenter = new ActivityPresenter(this, mBinding);
        presenter.setWelcomeFragment();
    }

    @Override
    public IActivityPresenter getPresenter() {
         return presenter;
    }
}
