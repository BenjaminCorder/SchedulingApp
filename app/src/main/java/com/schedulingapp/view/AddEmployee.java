package com.schedulingapp.view;
/**
 * A class representing a full time employee.
 *
 * @author Cami Wallace
 * @version 1.0
 * @since 1.0
 * @see com.schedulingapp.model.employee.Employee
 */
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
import com.schedulingapp.presenter.AddEmployeePresenter;

public class AddEmployee extends AppCompatActivity {

    //varibles for adding an employee
    private RadioGroup radioGenderGroup;
    private RadioButton radioGenderBtn;
    private RadioButton shiftBtn;
    private RadioGroup shiftGroup;
    private Button addEmployeeBtn;
    private AddEmployeePresenter presenter;
    EditText firstName;
    EditText lastName;
    EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_employee);
        //addEmployeePresentor
        presenter = new AddEmployeePresenter(this);


        addEmployeeBtn = findViewById(R.id.add_employee_btn);
        addEmployeeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getShift();//may not be needed since checking shift before switch
                getGender(); //method to collect gender data on employee
                //collecting data from textBoxes and saving them to variables
                firstName = (EditText) findViewById(R.id.first_name_text);
                lastName = (EditText) findViewById(R.id.last_name_text);
                email = (EditText) findViewById(R.id.email_text);
                //getting the shift data in form of int
                int shift = shiftGroup.getCheckedRadioButtonId();
                //calling presenter to add employee to correct by using their shift
                presenter.addEmployeeByShift(shift);


                //after employee is added to list direct customer back to menu page
                navigateToMenu();

            }
        });

    }
    //I am leaving these methods in the view because they are only saving retrieved
    // data to a variable.
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

    //method that retrieves gender and saves it to variable
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