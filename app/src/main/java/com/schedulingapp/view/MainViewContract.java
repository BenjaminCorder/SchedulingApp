package com.schedulingapp.view;

import android.content.Intent;
import android.view.View;

import androidx.annotation.Nullable;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.schedulingapp.presenter.MainPresenter;

/**
 * An interface extending the BaseView interface with all public methods that the
 * MainActivity class implements.
 *
 * @author Ben Corder
 * @version 1.0
 * @since 1.0
 */
public interface MainViewContract extends BaseView<MainPresenter> {
    //
    // Fields
    //

    //
    // Activity Methods
    //

    void onClick(View v);
    void onActivityResult(int requestCode, int resultCode, Intent data);

    //
    // UI Methods
    //

    void updateUi(@Nullable GoogleSignInAccount account);

    //
    // Intent Methods
    //

    void startSignInActivity(Intent signInIntent);

    //
    // Other Methods
    //

}
