package com.schedulingapp.factory.googlesheets.other;

import com.google.api.services.sheets.v4.model.Color;
import com.google.api.services.sheets.v4.model.ColorStyle;
import com.schedulingapp.factory.Factory;

public class ColorStyleFactory implements Factory<ColorStyle> {
    //
    // Fields
    //

    private Kind unionField;

    //
    // Union Field: only one of the following
    //

    private Color rgbColor;
    private String themeColor;

    //
    // Constructor
    //

    public ColorStyleFactory() {
        unionField = Kind.KIND_UNSPECIFIED;
        rgbColor = null;
        themeColor = null;
    }

    //
    // Public Methods
    //

    @Override
    public ColorStyle build() {
        // Declare Variables
        ColorStyle style = new ColorStyle();

        // Format properties to match member variables that correspond to the union field
        switch(unionField.getKind()) {
            case "RGB_COLOR":
                style.setRgbColor(rgbColor);
                break;
            case "THEME_COLOR":
                style.setThemeColor(themeColor);
                break;
        }

        return style;
    }

    //
    // Accessor Methods
    //

    public void setRgbColor(Color rgbColor) {
        this.rgbColor = rgbColor;
        unionField = Kind.RGB_COLOR;
    }

    public void setThemeColor(String themeColor) {
        this.themeColor = themeColor;
        unionField = Kind.THEME_COLOR;
    }

//
    // Enums
    //

    private enum Kind {
        //
        // Enum Values
        //

        KIND_UNSPECIFIED("KIND_UNSPECIFIED"),
        RGB_COLOR("RGB_COLOR"),
        THEME_COLOR("THEME_COLOR");

        //
        // Fields
        //

        private final String kind;

        //
        // Constructor
        //

        Kind(String kind) {
            this.kind = kind;
        }

        //
        // Accessor Methods
        //

        public String getKind() {
            return kind;
        }
    }
}
