package com.schedulingapp.presenter;

import android.content.Intent;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import com.schedulingapp.interactor.GoogleSignInInteractor;
import com.schedulingapp.view.MainViewContract;

public class MainPresenter implements MainPresenterContract {
    //
    // Fields
    //

    private final MainViewContract view;

    //
    // Interactors
    //

    private GoogleSignInInteractor signInInteractor;
    private static final String TAG = "5CSignInActivity";

    //
    // Constructors
    //

    public MainPresenter(MainViewContract view) {
        this.view = view;
        signInInteractor = new GoogleSignInInteractor(view.getActivity());
    }

    //
    // Activity Methods
    //

    @Override
    public void onStart() {
        // Check for existing signed-in user.
        view.updateUi(signInInteractor.getLastSignedInAccount());
    }

    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void onRestart() {

    }

    /**
     *
     */
    @Override
    public void onDestroy() {

    }

    //
    // Other Methods
    //

    @Override
    public void saveData() {

    }

    @Override
    public void signIn() {
        view.startSignInActivity(signInInteractor.getSignInIntent());
    }

    @Override
    public void completeSignIn(Intent data) {
        handleSignInResult(signInInteractor.getSignInResult(data));
    }

    private void handleSignInResult(@Nullable Task<GoogleSignInAccount> completedTask) {
        Log.d(TAG, "handleSignInResult:" + completedTask.isSuccessful());

        try {
            // Signed in successfully, show authenticated UI.
            GoogleSignInAccount account = completedTask.getResult(ApiException.class);
            view.updateUi(account);
        } catch (ApiException e) {
            // Signed out, show unauthenticated UI.
            Log.w(TAG, "handleSignInResult:error", e);
            view.updateUi(null);
        }
    }}
