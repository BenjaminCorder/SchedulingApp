package com.schedulingapp.interactor;

import com.google.api.services.sheets.v4.model.Spreadsheet;
import com.schedulingapp.factory.googlesheets.spreadsheets.SpreadsheetFactory;

public class CreateNewSchedule {
    //
    // Fields
    //

    private String title;
    private SpreadsheetFactory spreadsheetFactory;

    //
    // Constructor
    //

    public CreateNewSchedule(String title) {
        spreadsheetFactory = new SpreadsheetFactory();
        formatSchedule();
    }

    //
    // Public Methods
    //

    public Spreadsheet generate() {
        return spreadsheetFactory.generate();
    }

    //
    // Accessor Methods
    //

    //
    // Private Methods
    //

    private void formatSchedule() {

        spreadsheetFactory.setProperties();
    }
}
