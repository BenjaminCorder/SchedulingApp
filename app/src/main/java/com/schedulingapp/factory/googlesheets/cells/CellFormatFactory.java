package com.schedulingapp.factory.googlesheets.cells;

import com.google.api.services.sheets.v4.model.Borders;
import com.google.api.services.sheets.v4.model.CellFormat;
import com.google.api.services.sheets.v4.model.Color;
import com.google.api.services.sheets.v4.model.ColorStyle;
import com.google.api.services.sheets.v4.model.NumberFormat;
import com.google.api.services.sheets.v4.model.Padding;
import com.google.api.services.sheets.v4.model.TextFormat;
import com.google.api.services.sheets.v4.model.TextRotation;
import com.schedulingapp.factory.Factory;

public class CellFormatFactory implements Factory<CellFormat> {
    //
    // Fields
    //

    private NumberFormat numberFormat;
    private Color backgroundColor;
    private ColorStyle backgroundColorStyle;
    private Borders borders;
    private Padding padding;
    private String horizontalAlignment;
    private String verticalAlignment;
    private String wrapStrategy;
    private String textDirection;
    private TextFormat textFormat;
    private String hyperlinkDisplayType;
    private TextRotation textRotation;

    //
    // Constructor
    //

    public CellFormatFactory() {
        numberFormat = null;
        backgroundColor = null;
        backgroundColorStyle = null;
        borders = null;
        padding = null;
        horizontalAlignment = null;
        verticalAlignment = null;
        wrapStrategy = null;
        textDirection = null;
        textFormat = null;
        hyperlinkDisplayType = null;
        textRotation = null;
    }

    //
    // Public Methods
    //

    @Override
    public CellFormat generate() {
        // Declare Variables
        CellFormat cellFormat = new CellFormat();

        // Format cellFormat to match member variables
        if (numberFormat != null) {
            cellFormat.setNumberFormat(numberFormat);
        }

        if (backgroundColor != null) {
            cellFormat.setBackgroundColor(backgroundColor);
        }

        if (backgroundColorStyle != null) {
            cellFormat.setBackgroundColorStyle(backgroundColorStyle);
        }

        if (borders != null) {
            cellFormat.setBorders(borders);
        }

        if (padding != null) {
            cellFormat.setPadding(padding);
        }

        if (horizontalAlignment != null) {
            cellFormat.setHorizontalAlignment(horizontalAlignment);
        }

        if (verticalAlignment != null) {
            cellFormat.setVerticalAlignment(verticalAlignment);
        }

        if (wrapStrategy != null) {
            cellFormat.setWrapStrategy(wrapStrategy);
        }

        if (textDirection != null) {
            cellFormat.setTextDirection(textDirection);
        }

        if (textFormat != null) {
            cellFormat.setTextFormat(textFormat);
        }

        if (hyperlinkDisplayType != null) {
            cellFormat.setHyperlinkDisplayType(hyperlinkDisplayType);
        }

        if (textRotation != null) {
            cellFormat.setTextRotation(textRotation);
        }

        return cellFormat;
    }

    //
    // Accessor Methods
    //

    public void setNumberFormat(NumberFormat numberFormat) {
        this.numberFormat = numberFormat;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public void setBackgroundColorStyle(ColorStyle backgroundColorStyle) {
        this.backgroundColorStyle = backgroundColorStyle;
    }

    public void setBorders(Borders borders) {
        this.borders = borders;
    }

    public void setPadding(Padding padding) {
        this.padding = padding;
    }

    public void setHorizontalAlignment(String horizontalAlignment) {
        this.horizontalAlignment = horizontalAlignment;
    }

    public void setVerticalAlignment(String verticalAlignment) {
        this.verticalAlignment = verticalAlignment;
    }

    public void setWrapStrategy(String wrapStrategy) {
        this.wrapStrategy = wrapStrategy;
    }

    public void setTextDirection(String textDirection) {
        this.textDirection = textDirection;
    }

    public void setTextFormat(TextFormat textFormat) {
        this.textFormat = textFormat;
    }

    public void setHyperlinkDisplayType(String hyperlinkDisplayType) {
        this.hyperlinkDisplayType = hyperlinkDisplayType;
    }

    public void setTextRotation(TextRotation textRotation) {
        this.textRotation = textRotation;
    }
}
