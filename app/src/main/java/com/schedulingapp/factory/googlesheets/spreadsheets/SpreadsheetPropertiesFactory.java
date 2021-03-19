package com.schedulingapp.factory.googlesheets.spreadsheets;

import com.google.api.services.sheets.v4.model.CellFormat;
import com.google.api.services.sheets.v4.model.IterativeCalculationSettings;
import com.google.api.services.sheets.v4.model.SpreadsheetProperties;
import com.google.api.services.sheets.v4.model.SpreadsheetTheme;
import com.schedulingapp.factory.Factory;

public class SpreadsheetPropertiesFactory implements Factory<SpreadsheetProperties> {
    //
    // Fields
    //

    private String title;
    private String locale;
    private String autoRecalc;
    private String timeZone;
    private CellFormat defaultFormat;
    private IterativeCalculationSettings iterativeCalculationSettings;
    private SpreadsheetTheme spreadsheetTheme;

    //
    // Constructor
    //

    public SpreadsheetPropertiesFactory() {
        title = null;
        locale = null;
        autoRecalc = null;
        timeZone = null;
        defaultFormat = null;
        iterativeCalculationSettings = null;
        spreadsheetTheme = null;
    }

    //
    // Public Methods
    //

    public SpreadsheetProperties generate() {
        // Declare Variables
        SpreadsheetProperties properties = new SpreadsheetProperties();

        // Format properties to match member variables
        if (title != null) {
            properties.setTitle(title);
        }

        if (locale != null) {
            properties.setLocale(locale);
        }

        if (autoRecalc != null) {
            properties.setAutoRecalc(autoRecalc);
        }

        if (timeZone != null) {
            properties.setTimeZone(timeZone);
        }

        if (defaultFormat != null) {
            properties.setDefaultFormat(defaultFormat);
        }

        if (iterativeCalculationSettings != null) {
            properties.setIterativeCalculationSettings(iterativeCalculationSettings);
        }

        if (spreadsheetTheme != null) {
            properties.setSpreadsheetTheme(spreadsheetTheme);
        }

        return properties;
    }

    //
    // Accessor Methods
    //

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public void setAutoRecalc(String autoRecalc) {
        this.autoRecalc = autoRecalc;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public void setDefaultFormat(CellFormat defaultFormat) {
        this.defaultFormat = defaultFormat;
    }

    public void setIterativeCalculationSettings(
            IterativeCalculationSettings iterativeCalculationSettings) {
        this.iterativeCalculationSettings = iterativeCalculationSettings;
    }

    public void setSpreadsheetTheme(SpreadsheetTheme spreadsheetTheme) {
        this.spreadsheetTheme = spreadsheetTheme;
    }
}
