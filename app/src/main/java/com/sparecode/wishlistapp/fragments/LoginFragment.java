package com.sparecode.wishlistapp.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.sparecode.wishlistapp.R;
import com.sparecode.wishlistapp.activities.MainActivity;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by master on 22-06-2016.
 */
public class LoginFragment extends BaseFragment {
    @Bind(R.id.whiteSpace)
    View whiteSpace;
    @Bind(R.id.imgLogo)
    ImageView imgLogo;
    @Bind(R.id.linearEmail)
    LinearLayout linearEmail;
    @Bind(R.id.linearPwd)
    LinearLayout linearPwd;
    @Bind(R.id.loginButton)
    Button loginButton;
    @Bind(R.id.linearRemeber)
    LinearLayout linearRemeber;
    @Bind(R.id.space)
    View space;
    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_login, container, false);
        ButterKnife.bind(this, view);
        return view;
    }



    @OnClick(R.id.loginButton)
    void onLoginClick() {
        ((MainActivity) getActivity()).openWhishListPage();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
