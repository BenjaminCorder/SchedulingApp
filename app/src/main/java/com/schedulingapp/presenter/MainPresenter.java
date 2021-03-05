package com.schedulingapp.presenter;

import com.schedulingapp.view.MainViewContract;

import com.schedulingapp.interactor.EmployeeInteractor;

public class MainPresenter implements MainPresenterContract {
    //
    // Fields
    //

    private MainViewContract mainView;
    private EmployeeInteractor employeeInteractor;

    //
    // Constructors
    //

    public MainPresenter(MainViewContract mainView,
                         EmployeeInteractor employeeInteractor) {
        this.mainView = mainView;
        this.employeeInteractor = employeeInteractor;
    }

    //
    // Activity Methods
    //

    @Override
    public void onStart() {

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

}
