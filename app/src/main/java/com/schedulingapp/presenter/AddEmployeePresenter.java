package com.schedulingapp.presenter;
/**
 * A class representing a full time employee.
 *
 * @author Cami Wallace
 * @version 1.0
 * @since 1.0
 * @see
 */
import android.util.Log;
import android.widget.Toast;

import com.schedulingapp.R;
import com.schedulingapp.misc.Gender;
import com.schedulingapp.model.employee.Employee;
import com.schedulingapp.model.employee.FullTimeEmployee;
import com.schedulingapp.model.employee.PartTimeEmployee;
import com.schedulingapp.model.employee.ReserveEmployee;
import com.schedulingapp.view.AddEmployee;

/**
 *AddEmployeePresenter.java works as a middle man between AddEmployee.java and Employee.java.
 *  It listens to the user action and updates the data mode.
 */
public class AddEmployeePresenter {
    //class variables
    private Employee employee;
    private AddEmployee view;
    private String firstName;
    private String lastName;
    private Gender gender;
    private static final String TAG = "AddEmployeePresenter";

    //AddEmployeePresentor constructor

    /**
     *constructor for AddEmployeePresenter
     * @param addEmployee
     */
    public AddEmployeePresenter(AddEmployee addEmployee){
        //add other files constructors
        this.employee = new Employee() {
            @Override
            protected void validate() {
             return;//need to figure out what we are validating here.
            }
        };
        this.view = addEmployee;
    }



    /**
     * takes the employees shift as a parameter and using this data decides what list
     * the employee should be added onto.
     * @param shift
     */
    public void addEmployeeByShift(int shift){
        switch (shift){
            case R.id.full_time_radio_btn:
                //have presenter add employee to full time list

                break;
            case R.id.part_time_radio_btn:
                //have presenter add employee to part time list

                break;
            case R.id.reserve_radio_btn:
                //have presenter add employee to reserve list

                break;
            default:
                Log.e(TAG, "Unable to add employee");


        }
    }



}
