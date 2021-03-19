package com.schedulingapp.factory.googlesheets.other;

import com.google.api.services.sheets.v4.model.BooleanCondition;
import com.google.api.services.sheets.v4.model.ConditionValue;
import com.schedulingapp.factory.Factory;

import java.util.ArrayList;
import java.util.List;

public class BooleanConditionFactory implements Factory<BooleanCondition> {
    //
    // Fields
    //

    private String type;
    private List<ConditionValue> values;

    //
    // Constructor
    //

    public BooleanConditionFactory() {
        type = null;
        values = new ArrayList<>();
    }

    //
    // Public Methods
    //

    @Override
    public BooleanCondition generate() {
        // Declare Variables
        BooleanCondition condition = new BooleanCondition();

        // Format condition
        if(type != null) {
            condition.setType(type);
        }

        if(!values.isEmpty()) {
            condition.setValues(values);
        }

        return null;
    }

    //
    // Accessor Methods
    //

    public void setType(String type) {
        this.type = type;
    }

    public void setValues(List<ConditionValue> values) {
        this.values = values;
    }

    public void addValue(ConditionValue value) {
        values.add(value);
    }

    public void removeValue(ConditionValue value) {
        values.remove(value);
    }
}
