package com.schedulingapp.interactor;

import android.util.Log;

import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.Sheet;
import com.google.api.services.sheets.v4.model.Spreadsheet;
import com.google.api.services.sheets.v4.model.SpreadsheetProperties;
import com.schedulingapp.exceptions.IllegalDateException;
import com.schedulingapp.misc.Date;
import com.schedulingapp.model.schedule.Schedule;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CreateScheduleInteractor {
    //
    // Constants
    //

    private static final String TAG = "CreateSchedule";

    //
    // Fields
    //

    private final Sheets service;
    private Date date;
    private Spreadsheet spreadsheet;

    //
    // Constructor
    //

    public CreateScheduleInteractor(Sheets service) {
        this.service = service;
        try {
            this.date = new Date(1,
                    Calendar.JANUARY + 1,
                    Calendar.getInstance().get(Calendar.YEAR));
            this.spreadsheet = new Spreadsheet()
                    .setProperties(generateProperties())
                    .setSheets(generateSheets());
        } catch (IllegalDateException e) {
            System.out.print(e);
        }
    }

    //
    // Public Methods
    //

    public Spreadsheet uploadSchedule() throws IOException {
        return service.spreadsheets().create(spreadsheet)
                .execute();
    }

    //
    // Private Methods
    //

    private SpreadsheetProperties generateProperties() {
        return new SpreadsheetProperties()
                .setTitle(String.format("%s", date.getYear()));
    }

    private List<Sheet> generateSheets() throws IllegalDateException {
        // Initialize Variables
        List<Sheet> sheets = new ArrayList<>();
        Date datePrime = new Date(date.getDay() + 13,
                date.getMonth(),
                date.getYear());

        // Create a sheet for every PayPeriod in the current year
        while (datePrime.getYear() == date.getYear()) {
            sheets.add(new ScheduleToSheet(
                    new Schedule.Builder()
                            .title(String.format("%s/%s - %s/%s",
                                date.get(Calendar.MONTH),
                                date.get(Calendar.DAY_OF_MONTH),
                                datePrime.get(Calendar.MONTH),
                                datePrime.get(Calendar.DAY_OF_MONTH)))
                        .index(0)
                        .build())
                    .getSheet());
        }

        return sheets;
    }
}
