package com.schedulingapp.factory.googlesheets.other;

import com.google.api.services.sheets.v4.model.Color;
import com.schedulingapp.factory.Factory;

public class ColorFactory implements Factory<Color> {
    //
    // Fields
    //

    private Float red;
    private Float green;
    private Float blue;
    private Float alpha;

    //
    // Constructor
    //

    public ColorFactory() {
        red = null;
        green = null;
        blue = null;
        alpha = null;
    }

    //
    // Public Methods
    //

    @Override
    public Color generate() {
        // Declare Variables
        Color color = new Color();

        // Format cellFormat to match member variables
        if (red != null) {
            color.setRed(red);
        }

        if (green != null) {
            color.setGreen(green);
        }

        if (blue != null) {
            color.setBlue(blue);
        }

        if (alpha != null) {
            color.setAlpha(alpha);
        }

        return color;
    }

    //
    // Mutator Methods
    //

    public void setRed(Float red) {
        this.red = red;
    }

    public void setGreen(Float green) {
        this.green = green;
    }

    public void setBlue(Float blue) {
        this.blue = blue;
    }

    public void setAlpha(Float alpha) {
        this.alpha = alpha;
    }
}
