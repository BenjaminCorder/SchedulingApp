package com.schedulingapp.factory.googlesheets.other;

import com.google.api.services.sheets.v4.model.Color;
import com.google.api.services.sheets.v4.model.ColorStyle;
import com.google.api.services.sheets.v4.model.SortSpec;
import com.schedulingapp.factory.Factory;

public class SortSpecFactory implements Factory<SortSpec> {
    //
    // Fields
    //

    private String sortOrder;
    private Color foregroundColor;
    private ColorStyle foregroundColorStyle;
    private Color backgroundColor;
    private ColorStyle backgroundColorStyle;

    // Would be in a union field, but class of other reference doesn't exist
    private Integer dimensionIndex;

    //
    // Constructor
    //

    public SortSpecFactory() {
        sortOrder = null;
        foregroundColor = null;
        foregroundColorStyle = null;
        backgroundColor = null;
        backgroundColorStyle = null;
        dimensionIndex = null;
    }

    //
    // Public Methods
    //

    @Override
    public SortSpec build() {
        // Declare Variables
        SortSpec spec = new SortSpec();

        // Format spec
        if(sortOrder != null) {
            spec.setSortOrder(sortOrder);
        }

        if(foregroundColor != null) {
            spec.setForegroundColor(foregroundColor);
        }

        if(foregroundColorStyle != null) {
            spec.setForegroundColorStyle(foregroundColorStyle);
        }

        if(backgroundColor != null) {
            spec.setBackgroundColor(backgroundColor);
        }

        if(backgroundColorStyle != null) {
            spec.setBackgroundColorStyle(backgroundColorStyle);
        }

        if(dimensionIndex != null) {
            spec.setDimensionIndex(dimensionIndex);
        }

        return spec;
    }

    //
    // Accessor Methods
    //

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    public void setForegroundColor(Color foregroundColor) {
        this.foregroundColor = foregroundColor;
    }

    public void setForegroundColorStyle(ColorStyle foregroundColorStyle) {
        this.foregroundColorStyle = foregroundColorStyle;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public void setBackgroundColorStyle(ColorStyle backgroundColorStyle) {
        this.backgroundColorStyle = backgroundColorStyle;
    }

    public void setDimensionIndex(Integer dimensionIndex) {
        this.dimensionIndex = dimensionIndex;
    }
}
