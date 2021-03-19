package com.schedulingapp.factory.googlesheets.charts;

import com.google.api.services.sheets.v4.model.TextPosition;
import com.schedulingapp.factory.Factory;

public class TextPositionFactory implements Factory<TextPosition> {
    //
    // Fields
    //

    private String horizontalAlign;

    //
    // Constructor
    //

    public TextPositionFactory() {
        horizontalAlign = null;
    }

    //
    // Public Methods
    //

    @Override
    public TextPosition generate() {
        // Declare Variables
        TextPosition textPosition = new TextPosition();

        // Format textPosition
        if(horizontalAlign != null) {
            textPosition.setHorizontalAlignment(horizontalAlign);
        }

        return textPosition;
    }

    //
    // Accessor Methods
    //

    public void setHorizontalAlign(String horizontalAlign) {
        this.horizontalAlign = horizontalAlign;
    }
}
