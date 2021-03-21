package com.schedulingapp.factory.googlesheets.sheet;

import com.google.api.services.sheets.v4.model.Color;
import com.google.api.services.sheets.v4.model.ColorStyle;
import com.google.api.services.sheets.v4.model.GridProperties;
import com.google.api.services.sheets.v4.model.SheetProperties;
import com.schedulingapp.factory.Factory;

public class SheetPropertiesFactory implements Factory<SheetProperties> {
    //
    // Fields
    //

    private Integer sheetId;
    private String title;
    private Integer index;
    private String sheetType;
    private GridProperties gridProperties;
    private Boolean hidden;
    private Color tabColor;
    private ColorStyle tabColorStyle;
    private Boolean rightToLeft;

    //
    // Constructor
    //

    public SheetPropertiesFactory() {
        sheetId = null;
        title = null;
        index = null;
        sheetType = null;
        gridProperties = null;
        hidden = null;
        tabColor = null;
        tabColorStyle = null;
        rightToLeft = null;
    }

    //
    // Public Methods
    //

    @Override
    public SheetProperties generate() {
        // Declare Variables
        SheetProperties properties = new SheetProperties();

        // Format properties
        if (sheetId != null) {
            properties.setSheetId(sheetId);
        }

        if (title != null) {
            properties.setTitle(title);
        }

        if (index != null) {
            properties.setIndex(index);
        }

        if (sheetType != null) {
            properties.setSheetType(sheetType);
        }

        if (gridProperties != null) {
            properties.setGridProperties(gridProperties);
        }

        if (hidden != null) {
            properties.setHidden(hidden);
        }

        if (tabColor != null) {
            properties.setTabColor(tabColor);
        }

        if (tabColorStyle != null) {
            properties.setTabColorStyle(tabColorStyle);
        }

        if (rightToLeft != null) {
            properties.setRightToLeft(rightToLeft);
        }

        return properties;
    }

    //
    // Accessor Methods
    //

    public void setSheetId(Integer sheetId) {
        this.sheetId = sheetId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public void setSheetType(String sheetType) {
        this.sheetType = sheetType;
    }

    public void setGridProperties(GridProperties gridProperties) {
        this.gridProperties = gridProperties;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public void setTabColor(Color tabColor) {
        this.tabColor = tabColor;
    }

    public void setTabColorStyle(ColorStyle tabColorStyle) {
        this.tabColorStyle = tabColorStyle;
    }

    public void setRightToLeft(Boolean rightToLeft) {
        this.rightToLeft = rightToLeft;
    }
}
