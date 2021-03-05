package com.schedulingapp.view;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.schedulingapp.R;
import com.schedulingapp.presenter.MainPresenter;

import com.schedulingapp.interactor.EmployeeInteractor;

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

    private MainPresenter mainPresenter;

    //
    // Activity Methods
    //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Run standard methods for onCreate
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create and attack a presenter
        setPresenter(new MainPresenter(this, new EmployeeInteractor()));
    }

    @Override
    protected void onStart() {
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

    //
    // Other Methods
    //

    @Override
    public void setPresenter(MainPresenter presenter) {

    }

}
