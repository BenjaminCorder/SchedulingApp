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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //setting value to buttons
        addEmployee = (Button) findViewById(R.id.add_employee_btn);
        viewEmployee = (Button) findViewById(R.id.view_employee_btn);
        log_out = (Button) findViewById(R.id.logoutBtn);

        //setting onclick listoner for addEmployee
        addEmployee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAddEmployeeActivity();
            }
        });

        //setting onclick listoner for viewEmployee
        viewEmployee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openViewEmployeeActivity();
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
        //logic to anddle button click here
        Intent intent = new Intent(this, ViewEmployeeActivity.class);
        startActivity(intent);
    }
    //method to log out of app
    public void logout(){
        //send back to login in page if logging out
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

        //may need to add stuf to log out of google

    }
}