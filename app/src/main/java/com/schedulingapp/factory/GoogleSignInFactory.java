package com.schedulingapp.factory;

import android.app.Activity;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

public class GoogleSignInFactory {
    public GoogleSignInOptions getSignInOptions() {
        return new GoogleSignInOptions.Builder(
                GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();
    }

    public GoogleSignInClient getSignInClient(Activity activity) {
        return GoogleSignIn.getClient(activity, getSignInOptions());
    }

    public GoogleSignInAccount getLastSignedInAccount(Activity activity) {
        return GoogleSignIn.getLastSignedInAccount(activity);
    }
}
