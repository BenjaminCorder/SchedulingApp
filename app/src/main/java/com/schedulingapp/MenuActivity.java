package com.schedulingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.schedulingapp.presenter.MenuPresenter;
import com.schedulingapp.view.AddEmployee;
import com.schedulingapp.view.MainActivity;
import com.schedulingapp.view.ViewEmployeeActivity;

public class MenuActivity extends AppCompatActivity  {

    //declairing variables
    private Button addEmployee;
    private Button viewEmployee;
    private Button log_out;
    private Button createSchedule;
    private Button emailSchedule;

    private MenuPresenter menuPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //setting value to buttons
        addEmployee = (Button) findViewById(R.id.add_employee_btn);
        viewEmployee = (Button) findViewById(R.id.view_employee_btn);
        log_out = (Button) findViewById(R.id.logoutBtn);
        createSchedule = (Button) findViewById(R.id.create_schedule_btn);
        emailSchedule = (Button) findViewById(R.id.email_schedule_btn);

        //setting onclick listener for addEmployee
        addEmployee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menuPresenter.openAddEmployeeActivity();
            }
        });

        //setting onclick listener for viewEmployee
        viewEmployee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menuPresenter.openViewEmployeeActivity();
            }
        });
        //onclick listener for create schedule
        createSchedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menuPresenter.create_schedule();
            }
        });
        //onclick listener for create schedule
        emailSchedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menuPresenter.email_schedule();
            }
        });

        //setting onclick listoner for logout
        log_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menuPresenter.logout();
            }
        });

    }


}