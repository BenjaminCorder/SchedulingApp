package com.schedulingapp.factory.googlesheets.sheets;

import com.google.api.services.sheets.v4.model.Color;
import com.google.api.services.sheets.v4.model.ColorStyle;
import com.google.api.services.sheets.v4.model.InterpolationPoint;
import com.schedulingapp.factory.Factory;

public class InterpolationPointFactory implements Factory<InterpolationPoint> {
    //
    // Fields
    //

    private Color color;
    private ColorStyle colorStyle;
    private String value;

    //
    // Constructor
    //

    public InterpolationPointFactory() {
        color = null;
        colorStyle = null;
        value = null;
    }

    //
    // Public Methods
    //

    @Override
    public InterpolationPoint generate() {
        // Declare Variables
        InterpolationPoint interpolationPoint = new InterpolationPoint();

        // Format interpolationPoint
        if(color != null) {
            interpolationPoint.setColor(color);
        }

        if(colorStyle != null) {
            interpolationPoint.setColorStyle(colorStyle);
        }

        if(value != null) {
            interpolationPoint.setValue(value);
        }

        return interpolationPoint;
    }

    //
    // Accessor Methods
    //

    public void setColor(Color color) {
        this.color = color;
    }

    public void setColorStyle(ColorStyle colorStyle) {
        this.colorStyle = colorStyle;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
