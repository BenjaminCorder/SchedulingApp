package com.schedulingapp.factory.googlesheets.sheets;

import com.google.api.services.sheets.v4.model.GridProperties;
import com.schedulingapp.factory.Factory;

public class GridPropertiesFactory implements Factory<GridProperties> {
    //
    // Fields
    //

    private Integer rowCount;
    private Integer columnCount;
    private Integer frozenRowCount;
    private Integer frozenColumnCount;
    private Boolean hideGridlines;
    private Boolean rowGroupControlAfter;
    private Boolean columnGroupControlAfter;

    //
    // Constructor
    //

    public GridPropertiesFactory() {
        rowCount = null;
        columnCount = null;
        frozenRowCount = null;
        frozenColumnCount = null;
        hideGridlines = null;
        rowGroupControlAfter = null;
        columnGroupControlAfter = null;
    }

    //
    // Public Methods
    //

    @Override
    public GridProperties build() {
        // Declare Variables
        GridProperties properties = new GridProperties();

        // Format properties
        if(rowCount != null) {
            properties.setRowCount(rowCount);
        }

        if(columnCount != null) {
            properties.setColumnCount(columnCount);
        }

        if(frozenRowCount != null) {
            properties.setFrozenRowCount(frozenRowCount);
        }

        if(frozenColumnCount != null) {
            properties.setFrozenColumnCount(frozenColumnCount);
        }

        if(hideGridlines != null) {
            properties.setHideGridlines(hideGridlines);
        }

        if(rowGroupControlAfter != null) {
            properties.setRowGroupControlAfter(rowGroupControlAfter);
        }

        if(columnGroupControlAfter != null) {
            properties.setColumnGroupControlAfter(columnGroupControlAfter);
        }

        return properties;
    }

    //
    // Accessor Methods
    //

    public void setRowCount(Integer rowCount) {
        this.rowCount = rowCount;
    }

    public void setColumnCount(Integer columnCount) {
        this.columnCount = columnCount;
    }

    public void setFrozenRowCount(Integer frozenRowCount) {
        this.frozenRowCount = frozenRowCount;
    }

    public void setFrozenColumnCount(Integer frozenColumnCount) {
        this.frozenColumnCount = frozenColumnCount;
    }

    public void setHideGridlines(Boolean hideGridlines) {
        this.hideGridlines = hideGridlines;
    }

    public void setRowGroupControlAfter(Boolean rowGroupControlAfter) {
        this.rowGroupControlAfter = rowGroupControlAfter;
    }

    public void setColumnGroupControlAfter(Boolean columnGroupControlAfter) {
        this.columnGroupControlAfter = columnGroupControlAfter;
    }
}
