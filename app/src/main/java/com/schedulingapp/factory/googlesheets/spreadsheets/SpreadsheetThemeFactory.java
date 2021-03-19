package com.schedulingapp.factory.googlesheets.spreadsheets;

import com.google.api.services.sheets.v4.model.SpreadsheetTheme;
import com.google.api.services.sheets.v4.model.ThemeColorPair;
import com.schedulingapp.factory.Factory;

import java.util.ArrayList;
import java.util.List;

public class SpreadsheetThemeFactory implements Factory<SpreadsheetTheme> {
    //
    // Fields
    //

    private String primaryFontFamily;
    private List<ThemeColorPair> themeColors;

    //
    // Constructor
    //

    public SpreadsheetThemeFactory() {
        primaryFontFamily = null;
        themeColors = new ArrayList<ThemeColorPair>();
    }

    //
    // Public Methods
    //

    @Override
    public SpreadsheetTheme generate() {
        // Declare Variables
        SpreadsheetTheme theme = new SpreadsheetTheme();

        // Format theme
        if (primaryFontFamily != null) {
            theme.setPrimaryFontFamily(primaryFontFamily);
        }

        if (!themeColors.isEmpty()) {
            theme.setThemeColors(themeColors);
        }

        return theme;
    }

    //
    // Accessor Methods
    //

    public void setPrimaryFontFamily(String primaryFontFamily) {
        this.primaryFontFamily = primaryFontFamily;
    }

    public void setThemeColors(List<ThemeColorPair> themeColors) {
        this.themeColors = themeColors;
    }

    public void addThemeColor(ThemeColorPair themeColor) {
        themeColors.add(themeColor);
    }

    public void removeThemeColor(ThemeColorPair themeColor) {
        themeColors.remove(themeColor);
    }
}
