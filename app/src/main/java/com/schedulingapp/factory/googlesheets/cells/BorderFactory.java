package com.schedulingapp.factory.googlesheets.cells;

import com.google.api.services.sheets.v4.model.Border;
import com.google.api.services.sheets.v4.model.Color;
import com.google.api.services.sheets.v4.model.ColorStyle;
import com.schedulingapp.factory.Factory;

public class BorderFactory implements Factory<Border> {
    //
    // Fields
    //

    private String style;
    private Integer width;
    private Color color;
    private ColorStyle colorStyle;

    //
    // Constructor
    //

    public BorderFactory() {
        style = null;
        width = null;
        color = null;
        colorStyle = null;
    }

    //
    // Public Methods
    //

    @Override
    public Border generate() {
        // Declare Variables
        Border border = new Border();

        // Format cellFormat to match member variables
        if (style != null) {
            border.setStyle(style);
        }

        if (width != null) {
            border.setWidth(width);
        }

        if (color != null) {
            border.setColor(color);
        }

        if (colorStyle != null) {
            border.setColorStyle(colorStyle);
        }

        return border;
    }

    //
    // Accessor Methods
    //

    public void setStyle(String style) {
        this.style = style;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setColorStyle(ColorStyle colorStyle) {
        this.colorStyle = colorStyle;
    }
}
