package com.sparecode.wishlistapp.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.widget.FrameLayout;

import com.sparecode.wishlistapp.R;
import com.sparecode.wishlistapp.fragments.LoginFragment;
import com.sparecode.wishlistapp.fragments.WishListFragment;
import com.sparecode.wishlistapp.interfaces.MainNavigationImpl;
import com.sparecode.wishlistapp.utils.DebugLog;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends FragmentActivity implements MainNavigationImpl {

    @Bind(R.id.container)
    FrameLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        openLoginPage();
    }

    void replaceFragment(Fragment mFragment, int id, String tag) {
        FragmentTransaction mTransaction = getSupportFragmentManager().beginTransaction();
        mTransaction.replace(id, mFragment);
        DebugLog.e("TAG::" + tag);
        mTransaction.addToBackStack(tag);
        mTransaction.commit();
    }

    @Override
    public void openLoginPage() {
        replaceFragment(new LoginFragment(), R.id.container, LoginFragment.class.getName());
    }

    @Override
    public void onBackPressed() {
        Fragment f = getSupportFragmentManager().findFragmentById(R.id.container);
        DebugLog.e("" + f.getClass().getName());
        if (getSupportFragmentManager().getBackStackEntryCount() == 1) {
            finish();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public void openWhishListPage() {
        replaceFragment(new WishListFragment(), R.id.container, WishListFragment.class.getName());
    }
}
