package com.schedulingapp.factory.googlesheets.cells;

import com.google.api.services.sheets.v4.model.NumberFormat;
import com.schedulingapp.factory.Factory;

public class NumberFormatFactory implements Factory<NumberFormat> {
    //
    // Fields
    //

    private String type;
    private String pattern;

    //
    // Constructor
    //

    public NumberFormatFactory() {
        type = null;
        pattern = null;
    }

    //
    // Public Methods
    //

    @Override
    public NumberFormat generate() {
        // Declare variables
        NumberFormat format = new NumberFormat();

        // Format spreadsheet to match member variables
        if (type != null) {
            format.setType(type);
        }

        // Format spreadsheet to match member variables
        if (pattern != null) {
            format.setPattern(pattern);
        }

        return format;
    }

    //
    // Accessor Methods
    //

    public void setType(String type) {
        this.type = type;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

}
