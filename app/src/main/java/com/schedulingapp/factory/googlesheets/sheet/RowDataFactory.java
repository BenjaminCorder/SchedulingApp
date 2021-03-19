package com.schedulingapp.factory.googlesheets.sheet;

import com.google.api.services.sheets.v4.model.CellData;
import com.google.api.services.sheets.v4.model.RowData;
import com.schedulingapp.factory.Factory;

import java.util.List;

public class RowDataFactory implements Factory<RowData> {
    //
    // Fields
    //

    private List<CellData> values;

    public RowDataFactory() {
        values = null;
    }

    @Override
    public RowData generate() {
        // Declare Variables
        RowData rowData = new RowData();

        // Format rowData
        if(values != null) {
            rowData.setValues(values);
        }

        return rowData;
    }

    public void setValues(List<CellData> values) {
        this.values = values;
    }

    public void addValues(CellData value) {
        this.values.add(value);
    }

    public void removeValues(CellData value) {
        this.values.remove(value);
    }
}
