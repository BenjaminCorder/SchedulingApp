package com.schedulingapp.presenter;


/**
 * An interface representing all methods shared by presenter classes.
 *
 * @author Ben Corder
 * @version 1.0
 * @since 1.0
 */
public interface BasePresenter {
    //
    // Activity Methods
    //

    void onStart();
    void onResume();
    void onPause();
    void onStop();
    void onRestart();
    void onDestroy();

    //
    // Other Methods
    //

}
