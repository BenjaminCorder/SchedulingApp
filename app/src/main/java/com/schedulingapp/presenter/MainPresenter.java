package com.schedulingapp.presenter;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import com.schedulingapp.interactor.GoogleSignInInteractor;
import com.schedulingapp.view.MainActivity;
import com.schedulingapp.view.MainViewContract;

public class MainPresenter implements MainPresenterContract {
    //
    // Fields
    //

    private final MainViewContract view;
    private MainActivity mainActivity;
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

        //possible changes(not sure how to work this with the presenter)
        //GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(this);
        //updateUI(account);
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
            //Use the GoogleSignIn.getLastSignedInAccount method to request profile information
            // for the currently signed in user.
            GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(view.getActivity());
            if (acct != null) {
                String personName = acct.getDisplayName();
                String personGivenName = acct.getGivenName();
                String personFamilyName = acct.getFamilyName();
                String personEmail = acct.getEmail();
                String personId = acct.getId();
                Uri personPhoto = acct.getPhotoUrl();

                Log.d(TAG, "handleSignInResult: User email: ");

            }
            mainActivity.navigateToMenu();
            view.updateUi(account);

        } catch (ApiException e) {
            // Signed out, show unauthenticated UI.
            Log.w(TAG, "handleSignInResult:error", e);
            view.updateUi(null);
        }
    }}
