package com.schedulingapp.presenter;


import android.content.Intent;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/**
 * An interface extending the BasePresenter interface with all public methods that the
 * BasePresenter class implements.
 *
 * @author Ben Corder
 * @version 1.0
 * @since 1.0
 */
public interface MainPresenterContract extends BasePresenter {
    //
    // Methods
    //

    void saveData();
    void signIn();
    void completeSignIn(Intent data);
}
