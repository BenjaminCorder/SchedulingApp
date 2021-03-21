package com.schedulingapp.factory.googlesheets.other;

import com.google.api.services.sheets.v4.model.GridRange;
import com.schedulingapp.factory.Factory;

public class GridRangeFactory implements Factory<GridRange> {
    //
    // Fields
    //

    private Integer sheetId;
    private Integer startRowIndex;
    private Integer endRowIndex;
    private Integer startColumnIndex;
    private Integer endColumnIndex;

    //
    // Constructor
    //

    public GridRangeFactory() {
        sheetId = null;
        startRowIndex = null;
        endRowIndex = null;
        startColumnIndex = null;
        endColumnIndex = null;
    }

    //
    // Public Methods
    //

    @Override
    public GridRange build() {
        // Declare Variables
        GridRange range = new GridRange();

        // Format range
        if(sheetId != null) {
            range.setSheetId(sheetId);
        }

        if(startRowIndex != null) {
            range.setStartRowIndex(startRowIndex);
        }

        if(endRowIndex != null) {
            range.setEndRowIndex(endRowIndex);
        }

        if(startColumnIndex != null) {
            range.setStartColumnIndex(startColumnIndex);
        }

        if(endColumnIndex != null) {
            range.setEndColumnIndex(endColumnIndex);
        }

        return range;
    }

    //
    // Accessor Methods
    //

    public void setSheetId(Integer sheetId) {
        this.sheetId = sheetId;
    }

    public void setStartRowIndex(Integer startRowIndex) {
        this.startRowIndex = startRowIndex;
    }

    public void setEndRowIndex(Integer endRowIndex) {
        this.endRowIndex = endRowIndex;
    }

    public void setStartColumnIndex(Integer startColumnIndex) {
        this.startColumnIndex = startColumnIndex;
    }

    public void setEndColumnIndex(Integer endColumnIndex) {
        this.endColumnIndex = endColumnIndex;
    }
}
