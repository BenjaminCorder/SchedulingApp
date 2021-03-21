package com.schedulingapp.factory.googlesheets.sheets;

import com.google.api.services.sheets.v4.model.DimensionProperties;
import com.google.api.services.sheets.v4.model.GridData;
import com.google.api.services.sheets.v4.model.RowData;
import com.schedulingapp.factory.Factory;

import java.util.ArrayList;
import java.util.List;

public class GridDataFactory implements Factory<GridData> {
    //
    // Fields
    //

    private Integer startRow;
    private Integer startColumn;
    private List<RowData> rowData;
    private List<DimensionProperties> rowMetadata;
    private List<DimensionProperties> columnMetadata;

    //
    // Constructor
    //

    public GridDataFactory() {
        startRow = null;
        startColumn = null;
        rowData = new ArrayList<>();
        rowMetadata = new ArrayList<>();
        columnMetadata = new ArrayList<>();
    }

    //
    // Public Methods
    //

    @Override
    public GridData build() {
        // Declare Variables
        GridData gridData = new GridData();

        // Format gridData
        if(startRow != null) {
            gridData.setStartRow(startRow);
        }

        if(startColumn != null) {
            gridData.setStartColumn(startColumn);
        }

        if(!rowData.isEmpty()) {
            gridData.setRowData(rowData);
        }

        if(!rowMetadata.isEmpty()) {
            gridData.setRowMetadata(rowMetadata);
        }

        if(!columnMetadata.isEmpty()) {
            gridData.setColumnMetadata(columnMetadata);
        }

        return gridData;
    }

    //
    // Accessor Methods
    //

    public void setStartRow(Integer startRow) {
        this.startRow = startRow;
    }

    public void setStartColumn(Integer startColumn) {
        this.startColumn = startColumn;
    }

    public void setRowData(List<RowData> rowData) {
        this.rowData = rowData;
    }

    public void addRowData(RowData rowData) {
        this.rowData.add(rowData);
    }

    public void removeRowData(RowData rowData) {
        this.rowData.remove(rowData);
    }

    public void setRowMetadata(List<DimensionProperties> rowMetadata) {
        this.rowMetadata = rowMetadata;
    }

    public void addRowMetadata(DimensionProperties rowMetadata) {
        this.rowMetadata.add(rowMetadata);
    }

    public void removeRowMetadata(DimensionProperties rowMetadata) {
        this.rowMetadata.remove(rowMetadata);
    }

    public void setColumnMetadata(List<DimensionProperties> columnMetadata) {
        this.columnMetadata = columnMetadata;
    }

    public void addColumnMetadata(DimensionProperties columnMetadata) {
        this.columnMetadata.add(columnMetadata);
    }

    public void removeColumnMetadata(DimensionProperties columnMetadata) {
        this.columnMetadata.remove(columnMetadata);
    }
}
