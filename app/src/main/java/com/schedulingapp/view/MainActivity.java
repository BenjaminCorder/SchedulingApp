package com.schedulingapp.view;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.schedulingapp.R;
import com.schedulingapp.presenter.MainPresenter;

/**
 * Class MainActivity
 */
public class MainActivity extends AppCompatActivity implements MainContractView {

    //
    // Fields
    //


    //
    // Constructors
    //
    public MainActivity() {
    }

    //
    // Methods
    //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //
    // Accessor methods
    //

    //
    // Other methods
    //

    /**
     * @param presenter
     */
    @Override
    public void setPresenter(MainPresenter presenter) {

    }

    /**
     * Called when pointer capture is enabled or disabled for the current window.
     *
     * @param hasCapture True if the window has pointer capture.
     */
    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
