package com.schedulingapp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.schedulingapp.MenuActivity;
import com.schedulingapp.R;
import com.schedulingapp.misc.Gender;
import com.schedulingapp.model.employee.FullTimeEmployee;

public class AddEmployee extends AppCompatActivity {

    //varibles for adding an employee
    private RadioGroup radioGenderGroup;
    private RadioButton radioGenderBtn;
    private RadioButton shiftBtn;
    private RadioGroup shiftGroup;
    private Button addEmployeeBtn;
    EditText firstName;
    EditText lastName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_employee);

        //call method to retreive gender data
        addEmployeeBtn = findViewById(R.id.add_employee_btn);
        addEmployeeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getShift();//may not be needed since checking shift before switch
                getGender();
                firstName = (EditText) findViewById(R.id.first_name_text);
                firstName.getText().toString();
                lastName = (EditText) findViewById(R.id.last_name_text);
                lastName.getText().toString();
                //Log.d(TAG, "onClick: Name of employee :" + firstName + lastName);

                //use switch w/shift to determine what list you will add your
                //new employee too.
                //not sure how we are going to be adding employees to a list
                int shift = shiftGroup.getCheckedRadioButtonId();
                switch (shift){
                    case R.id.full_time_radio_btn:
                        //add employee to full time list

                        break;
                    case R.id.part_time_radio_btn:
                        //add employee to part time list

                        break;
                    case R.id.reserve_radio_btn:
                        //add employee to reserve list

                        break;
                    default:
                        //It was giving me an error on TAG saying it is a private varibale somewhere else
                        //Log.d(TAG, "onClick: Error adding Employee");
                       Toast.makeText(getApplicationContext(), "Error adding employee", Toast.LENGTH_LONG).show();
                }

                //after employee is added to list direct customer back to menu page
                navigateToMenu();

            }
        });

    }
    //possible different way to get shift data from radio group
    //Method to save shift type of employee to variable
    public void getShift(){
        shiftGroup = (RadioGroup) findViewById(R.id.shift_radio_group);
        //get selected radio button from group
        int selected = shiftGroup.getCheckedRadioButtonId();
        //determine radio button by id
        shiftBtn = (RadioButton) findViewById(selected);
        //show user what shift is added
        Toast.makeText(AddEmployee.this, shiftBtn.getText(), Toast.LENGTH_LONG).show();
    }

    //method that retreives gender and saves it to variable
    public void getGender(){
        radioGenderGroup = (RadioGroup) findViewById(R.id.gender_radio_group);
        //get selected radio button from group
        int selectedId = radioGenderGroup.getCheckedRadioButtonId();
        //determine radio button by id
        radioGenderBtn = (RadioButton) findViewById(selectedId);
        //show user what gender is added
        Toast.makeText(AddEmployee.this, radioGenderBtn.getText(), Toast.LENGTH_LONG).show();


    }
    public void navigateToMenu(){
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }
}