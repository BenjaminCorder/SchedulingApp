package com.schedulingapp.factory.googlesheets.other;

import com.google.api.services.sheets.v4.model.Color;
import com.google.api.services.sheets.v4.model.ColorStyle;
import com.google.api.services.sheets.v4.model.TextFormat;
import com.schedulingapp.factory.Factory;

public class TextFormatFactory implements Factory<TextFormat> {
    //
    // Fields
    //

    private Color foregroundColor;
    private ColorStyle foregroundColorStyle;
    private String fontFamily;
    private Integer fontSize;
    private Boolean bold;
    private Boolean italic;
    private Boolean strikethrough;
    private Boolean underline;

    //
    // Constructor
    //

    public TextFormatFactory() {
        foregroundColor = null;
        foregroundColorStyle = null;
        fontFamily = null;
        fontSize = null;
        bold = null;
        italic = null;
        strikethrough = null;
        underline = null;
    }

    //
    // Public Methods
    //

    @Override
    public TextFormat generate() {
        // Declare Variables
        TextFormat textFormat = new TextFormat();

        // Format cellFormat to match member variables
        if (foregroundColor != null) {
            textFormat.setForegroundColor(foregroundColor);
        }

        if (foregroundColorStyle != null) {
            textFormat.setForegroundColorStyle(foregroundColorStyle);
        }

        if (fontFamily != null) {
            textFormat.setFontFamily(fontFamily);
        }

        if (fontSize != null) {
            textFormat.setFontSize(fontSize);
        }

        if (bold != null) {
            textFormat.setBold(bold);
        }

        if (italic != null) {
            textFormat.setItalic(italic);
        }

        if (strikethrough != null) {
            textFormat.setStrikethrough(strikethrough);
        }

        if (underline != null) {
            textFormat.setUnderline(underline);
        }

        return textFormat;
    }

    //
    // Accessor Methods
    //

    public void setForegroundColor(Color foregroundColor) {
        this.foregroundColor = foregroundColor;
    }

    public void setForegroundColorStyle(ColorStyle foregroundColorStyle) {
        this.foregroundColorStyle = foregroundColorStyle;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public void setFontSize(Integer fontSize) {
        this.fontSize = fontSize;
    }

    public void setBold(Boolean bold) {
        this.bold = bold;
    }

    public void setItalic(Boolean italic) {
        this.italic = italic;
    }

    public void setStrikethrough(Boolean strikethrough) {
        this.strikethrough = strikethrough;
    }

    public void setUnderline(Boolean underline) {
        this.underline = underline;
    }
}
