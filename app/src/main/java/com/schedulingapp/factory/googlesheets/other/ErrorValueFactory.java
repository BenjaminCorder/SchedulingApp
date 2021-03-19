package com.schedulingapp.factory.googlesheets.other;

import com.google.api.services.sheets.v4.model.ErrorValue;
import com.schedulingapp.factory.Factory;

public class ErrorValueFactory implements Factory<ErrorValue> {
    //
    // Fields
    //

    private String type;
    private String message;

    public ErrorValueFactory() {
        type = null;
        message = null;
    }

    @Override
    public ErrorValue generate() {
        // Declare Variables
        ErrorValue value = new ErrorValue();

        // Format value
        if(type != null) {
            value.setType(type);
        }

        if(message != null) {
            value.setMessage(message);
        }

        return value;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
