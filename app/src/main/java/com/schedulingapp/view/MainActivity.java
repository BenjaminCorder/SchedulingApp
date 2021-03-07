package com.schedulingapp.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.schedulingapp.R;
import com.schedulingapp.presenter.MainPresenter;

import com.schedulingapp.presenter.MainPresenterContract;

/**
 * Class MainActivity
 *
 * @author Ben Corder
 * @version 1.0
 * @since 1.0
 */
public class MainActivity extends AppCompatActivity implements MainViewContract {

    //
    // Fields
    //

    private static final int RC_SIGN_IN = 9001;

    private MainPresenterContract presenter;
    private TextView mStatusTextView;

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
    }

    @Override
    protected void onStart() {
        presenter.onStart();
        super.onStart();
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
            findViewById(R.id.sign_out_and_disconnect).setVisibility(View.VISIBLE);
        } else {
            mStatusTextView.setText(R.string.signed_out);

            findViewById(R.id.sign_in_button).setVisibility(View.VISIBLE);
            findViewById(R.id.sign_out_and_disconnect).setVisibility(View.GONE);
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // Result returned from launching the Intent;
        if (requestCode == RC_SIGN_IN) {
            presenter.completeSignIn(data);
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


}
