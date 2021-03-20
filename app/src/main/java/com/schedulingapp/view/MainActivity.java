package com.schedulingapp.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.tasks.Task;
import com.schedulingapp.MenuActivity;
import com.schedulingapp.R;
import com.schedulingapp.presenter.MainPresenter;

import com.schedulingapp.presenter.MainPresenterContract;

/**
 * Class MainActivity
 *
 * @author Ben Corder
 * @author Cami Wallace
 * @version 1.0
 * @since 1.0
 */
public class MainActivity extends AppCompatActivity implements MainViewContract{

    //
    // Fields
    //

    private static final int RC_SIGN_IN = 9001;

    private MainPresenterContract presenter;
    private TextView mStatusTextView;
    //Google sign in btn variables
    SignInButton signInButton;
    //Declairing GoogleSignInClient object
    GoogleSignInClient mGoogleSignInClient;

    //
    // Activity Methods
    //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Run standard methods for onCreate
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mStatusTextView = findViewById(R.id.status);

        // Create and attack a presenter
        setPresenter(new MainPresenter(this));

        // Configure sign-in to request the user's ID, email address, and basic
        // profile. ID and basic profile are included in DEFAULT_SIGN_IN.
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();

        // Build a GoogleSignInClient with the options specified by gso.
           mGoogleSignInClient = GoogleSignIn.getClient(this, gso);
        //
        //possible changes(older version)
        //googleApiClient = new GoogleApiClient.Builder(this).enableAutoManage(this, this)
        //                .addApi(Auth.GOOGLE_SIGN_IN_API, gso)
        //                .build();}
        SignInButton signInButton = findViewById(R.id.sign_in_button);
        signInButton.setSize(SignInButton.SIZE_STANDARD);

        //register OnClickListener to sign in when clicked
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signIn();
            }
        });
    }
    private void signIn(){
        Intent signInIntent = mGoogleSignInClient.getSignInIntent();
        startActivityForResult(signInIntent, RC_SIGN_IN);
    }

    @Override
    protected void onStart() {
        presenter.onStart();
        super.onStart();
        //check if user has already signed in to app with Google.
        GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(this);
        updateUi(account);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.sign_in_button) {
            presenter.signIn();
        }
    }

    //
    // UI Methods
    //

    @Override
    public void updateUi(@Nullable GoogleSignInAccount account) {
        if (account != null) {
            mStatusTextView.setText(getString(
                    R.string.signed_in_fmt, account.getDisplayName()));

            findViewById(R.id.sign_in_button).setVisibility(View.GONE);
            //may move to different activity
            //findViewById(R.id.sign_out_and_disconnect).setVisibility(View.VISIBLE);
        } else {
            mStatusTextView.setText(R.string.signed_out);

            findViewById(R.id.sign_in_button).setVisibility(View.VISIBLE);
            //may move to different activity
            //findViewById(R.id.sign_out_and_disconnect).setVisibility(View.GONE);
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // Result returned from launching the Intent;
        if (requestCode == RC_SIGN_IN) {
            //completeSignIn method from presenter calls the handleSignInResult method also located
            //in the presenter class.
            presenter.completeSignIn(data);
            //possible change
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);


        }
    }

    //
    // Intent Methods
    //

    @Override
    public void startSignInActivity(Intent signInIntent) {
        startActivityForResult(signInIntent, RC_SIGN_IN);
    }



    //
    // Other Methods
    //

    @Override
    public void setPresenter(MainPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public AppCompatActivity getActivity() {
        return this;
    }

    public void navigateToMenu(){
        startActivity(new Intent(MainActivity.this, MenuActivity.class));
    }

}
