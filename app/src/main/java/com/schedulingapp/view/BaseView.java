package com.schedulingapp.view;

import androidx.appcompat.app.AppCompatActivity;

/**
 * An interface representing all methods shared by a View class.
 *
 * @author Ben Corder
 * @version 1.0
 * @since 1.0
 */
public interface BaseView<T> {
    //
    // Methods
    //

    /**
     * Sets a value for the presenter that corresponds with the view represented by
     * the current object.
     *
     * @param presenter presenter associated with the current object.
     */
    void setPresenter(T presenter);
    AppCompatActivity getActivity();
}
