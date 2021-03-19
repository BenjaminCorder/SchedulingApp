package com.schedulingapp.factory.googlesheets.spreadsheets;

import com.google.api.services.sheets.v4.model.ColorStyle;
import com.google.api.services.sheets.v4.model.ThemeColorPair;
import com.schedulingapp.factory.Factory;

public class ThemeColorPairFactory implements Factory<ThemeColorPair> {
    //
    // Fields
    //

    private String colorType;
    private ColorStyle color;

    //
    // Constructor
    //

    public ThemeColorPairFactory() {
        colorType = null;
        color = null;
    }

    //
    // Public Methods
    //

    @Override
    public ThemeColorPair generate() {
        // Declare Variables
        ThemeColorPair themeColorPair = new ThemeColorPair();

        // Format themeColorPair
        if (colorType != null) {
            themeColorPair.setColorType(colorType);
        }

        if (color != null) {
            themeColorPair.setColor(color);
        }

        return themeColorPair;
    }

    //
    // Accessor Methods
    //

    public void setColorType(String colorType) {
        this.colorType = colorType;
    }

    public void setColor(ColorStyle color) {
        this.color = color;
    }
}
