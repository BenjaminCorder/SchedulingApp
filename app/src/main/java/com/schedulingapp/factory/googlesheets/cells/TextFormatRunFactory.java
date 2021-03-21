package com.schedulingapp.factory.googlesheets.cells;

import com.google.api.services.sheets.v4.model.TextFormat;
import com.google.api.services.sheets.v4.model.TextFormatRun;
import com.schedulingapp.factory.Factory;

public class TextFormatRunFactory implements Factory<TextFormatRun> {
    //
    // Fields
    //

    private Integer startIndex;
    private TextFormat format;

    //
    // Constructor
    //

    public TextFormatRunFactory() {
        startIndex = null;
        format = null;
    }

    //
    // Public Methods
    //

    @Override
    public TextFormatRun generate() {
        // Declare Variables
        TextFormatRun formatRun = new TextFormatRun();

        // Format formatRun
        if(startIndex != null) {
            formatRun.setStartIndex(startIndex);
        }

        if(format != null) {
            formatRun.setFormat(format);
        }

        return formatRun;
    }

    //
    // Accessor Methods
    //

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public void setFormat(TextFormat format) {
        this.format = format;
    }
}
