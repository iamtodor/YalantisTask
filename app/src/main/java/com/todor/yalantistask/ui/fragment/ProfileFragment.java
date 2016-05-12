package com.todor.yalantistask.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.todor.yalantistask.Prefs;
import com.todor.yalantistask.R;
import com.todor.yalantistask.model.User;

import butterknife.Bind;

public class ProfileFragment extends BaseFragment {

    @Bind(R.id.profile_icon) protected ImageView userIcon;
    @Bind(R.id.profile_name) protected TextView userName;
    @Bind(R.id.profile_email) protected TextView userEmail;
    @Bind(R.id.profile_birthday) protected TextView userBirthday;

    @Override
    protected int getContentViewId() {
        return R.layout.profile_fragment;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        Prefs prefs = new Prefs(getContext());
        User user = prefs.getUser();
        Picasso.with(getContext()).load(user.getProfileIcon()).into(userIcon);

        userName.setText(user.getName());
        userEmail.setText(user.getEmail());
        userBirthday.setText(user.getBirthday());
    }
}