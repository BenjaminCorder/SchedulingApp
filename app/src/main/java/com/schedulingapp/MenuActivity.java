package com.schedulingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.schedulingapp.view.AddEmployee;
import com.schedulingapp.view.MainActivity;
import com.schedulingapp.view.ViewEmployeeActivity;

public class MenuActivity extends AppCompatActivity  {

    //declairing variables
    Button addEmployee;
    Button viewEmployee;
    Button log_out;
    Button createSchedule;
    Button emailSchedule;

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
                openAddEmployeeActivity();
            }
        });

        //setting onclick listener for viewEmployee
        viewEmployee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openViewEmployeeActivity();
            }
        });
        //onclick listener for create schedule
        createSchedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                create_schedule();
            }
        });
        //onclick listener for create schedule
        emailSchedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email_schedule();
            }
        });

        //setting onclick listoner for logout
        log_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logout();
            }
        });

    }

   //method to open the AddEmployee Activity on button click
    public void openAddEmployeeActivity(){
        Intent intent = new Intent(this, AddEmployee.class);
        startActivity(intent);
    }

    //method to handle logic when View Employee button is clicked
    public void openViewEmployeeActivity(){
        //logic to handle button click here
        Intent intent = new Intent(this, ViewEmployeeActivity.class);
        startActivity(intent);
    }
    //temporary stub function to email employee schedules
    //logic for emailing schedule to employees or directs to where it is happening
    public void email_schedule(){
        //logic

    }
    //temporary stub function to create employee schedule
    //either open new activity or direct to class in order to create new schedule
    public void create_schedule(){
        //add logic for creating schedule or direct to where that happens

    }
    //method to log out of app
    public void logout(){
        //send back to login in page if logging out
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

        //may need to add stuff to log out of google

    }
}