package com.schedulingapp.presenter;

import android.content.Intent;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.schedulingapp.MenuActivity;
import com.schedulingapp.view.AddEmployee;
import com.schedulingapp.view.MainActivity;
import com.schedulingapp.view.ViewEmployeeActivity;

/**
 * Class MainActivity
 *
 * @author Cami Wallace
 * @version 1.0
 * @since 1.0
 */
public class MenuPresenter {
    //varibles
    private Button addEmployee;
    private Button viewEmployee;
    private Button log_out;
    private Button createSchedule;
    private Button emailSchedule;

    private MenuActivity menuActivity;
    GoogleApiClient mGoogleApiClient;


    /**
     * Constructor for MenuPresenter
     * @param menuActivity
     */
    public MenuPresenter(MenuActivity menuActivity){
        this.menuActivity = menuActivity;
    }

    /**
     * method to log out of google and redirect to login page.
     */
    public void logout(){
        Auth.GoogleSignInApi.signOut(mGoogleApiClient).setResultCallback(new ResultCallback<Status>() {
            @Override
            public void onResult(@NonNull Status status) {
                Toast.makeText(menuActivity, "Logged out", Toast.LENGTH_LONG).show();
                //send back to login in page if logging out
                Intent intent = new Intent(menuActivity, MainActivity.class);
                menuActivity.startActivity(intent);
            }
        });


    }
    /**
     * temporary stub function to create employee schedule
     * either open new activity or direct to class in order to create new schedule
     */
    public void create_schedule(){
        //add logic for creating schedule or direct to where that happens

    }
    /**
     * temporary stub function to email employee schedules
     * logic for emailing schedule to employees or directs to where it is happening
     */
    public void email_schedule(){
        //logic

    }
    /**
     * method to open the AddEmployee Activity on button click
     */
    public void openAddEmployeeActivity(){
        Intent intent = new Intent(menuActivity, AddEmployee.class);
        menuActivity.startActivity(intent);
    }

    /**
     * method to handle logic when View Employee button is clicked
     */
    public void openViewEmployeeActivity(){
        //logic to handle button click here
        Intent intent = new Intent(menuActivity, ViewEmployeeActivity.class);
        menuActivity.startActivity(intent);
    }
}
