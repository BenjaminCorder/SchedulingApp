package com.schedulingapp.interactor;

import android.accounts.Account;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.widget.TextView;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.tasks.Task;
import com.google.api.client.googleapis.extensions.android.gms.auth.GoogleAccountCredential;
import com.schedulingapp.factory.GoogleSignInFactory;

import java.util.Collections;

public class GoogleSignInInteractor {
    //
    // Fields
    //

    private final GoogleSignInFactory signInFactory;
    private GoogleSignInClient mSignInClient;
    private Activity activity;

    private static final String CONTACTS_SCOPE =
            "https://www.googleapis.com/auth/spreadsheets";

    //
    // Constructors
    //

    public GoogleSignInInteractor(Activity activity) {
        this.activity = activity;
        signInFactory = new GoogleSignInFactory();

        // Configure sign in with minimal permissions
        mSignInClient = signInFactory.getSignInClient(activity);
    }

    //
    // Public Methods
    //

    public GoogleSignInAccount getLastSignedInAccount() {
        return signInFactory.getLastSignedInAccount(activity);
    }

    public Intent getSignInIntent() {
        return mSignInClient.getSignInIntent();
    }

    public Task<GoogleSignInAccount> getSignInResult(Intent data) {
        return GoogleSignIn.getSignedInAccountFromIntent(data);
    }

    public GoogleAccountCredential getCredential(Account account) {
        GoogleAccountCredential credential = GoogleAccountCredential.usingOAuth2(
                activity,
                Collections.singleton(CONTACTS_SCOPE));
        credential.setSelectedAccount(account);
        return credential;
    }
}
