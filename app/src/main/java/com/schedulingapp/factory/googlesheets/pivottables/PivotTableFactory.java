package com.schedulingapp.factory.googlesheets.pivottables;

import com.google.api.services.sheets.v4.model.GridRange;
import com.google.api.services.sheets.v4.model.PivotFilterCriteria;
import com.google.api.services.sheets.v4.model.PivotGroup;
import com.google.api.services.sheets.v4.model.PivotTable;
import com.google.api.services.sheets.v4.model.PivotValue;
import com.schedulingapp.factory.Factory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PivotTableFactory implements Factory<PivotTable> {
    //
    // Fields
    //

    private List<PivotGroup> rows;
    private List<PivotGroup> columns;

    // Criteria is depreciated, but the replacement field appears to not exist in the
    // library imported from the Google Sheets API.
    private Map<String, PivotFilterCriteria> criteria;

    private List<PivotValue> values;
    private String valueLayout;

    private UnionField unionField;

    //
    // Union Field: Only One of the Following
    //

    private GridRange source;
    private String dataSourceId;

    //
    // Constructor
    //

    public PivotTableFactory() {
        unionField = UnionField.UNION_FIELD_UNSPECIFIED;
        rows = new ArrayList<>();
        columns = new ArrayList<>();
        criteria = new HashMap<>();
        values = new ArrayList<>();
        valueLayout = null;
        source = null;
        dataSourceId = null;
    }

    //
    // Public Methods
    //

    @Override
    public PivotTable generate() {
        // Declare Variables
        PivotTable pivotTable = new PivotTable();

        // Format pivotTable
        if(!rows.isEmpty()) {
            pivotTable.setRows(rows);
        }

        if(!columns.isEmpty()) {
            pivotTable.setColumns(columns);
        }

        if(!criteria.isEmpty()) {
            pivotTable.setCriteria(criteria);
        }

        if(!values.isEmpty()) {
            pivotTable.setValues(values);
        }

        if(valueLayout != null) {
            pivotTable.setValueLayout(valueLayout);
        }

        // Format pivotTable according to unionField
        switch(unionField.getValue()) {
            case "SOURCE":
                pivotTable.setSource(source);
                break;
            case "DATA_SOURCE_ID":
                // Method apparently does not exist in the imported class?
                break;
        }

        return pivotTable;
    }

    //
    // Accessor Methods
    //

    public void setRows(List<PivotGroup> rows) {
        this.rows = rows;
    }

    public void addRow(PivotGroup row) {
        this.rows.add(row);
    }

    public void removeRow(PivotGroup row) {
        this.rows.remove(row);
    }

    public void setColumns(List<PivotGroup> columns) {
        this.columns = columns;
    }

    public void addColumn(PivotGroup column) {
        this.columns.add(column);
    }

    public void removeColumn(PivotGroup column) {
        this.columns.remove(column);
    }

    public void setCriteria(Map<String, PivotFilterCriteria> criteria) {
        this.criteria = criteria;
    }

    public void addCriteria(String key, PivotFilterCriteria value) {
        this.criteria.put(key, value);
    }

    public void removeCriteria(String key) {
        this.criteria.remove(key);
    }

    public void setValues(List<PivotValue> values) {
        this.values = values;
    }

    public void addValue(PivotValue value) {
        this.values.add(value);
    }

    public void removeValue(PivotValue value) {
        this.values.remove(value);
    }

    public void setValueLayout(String valueLayout) {
        this.valueLayout = valueLayout;
    }

    public void setSource(GridRange source) {
        this.source = source;
        unionField = UnionField.SOURCE;
    }

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        unionField = UnionField.DATA_SOURCE_ID;
    }

    //
    // Enums
    //

    private enum UnionField {
        //
        // Enum Values
        //

        UNION_FIELD_UNSPECIFIED("UNION_FIELD_UNSPECIFIED"),
        SOURCE("SOURCE"),
        DATA_SOURCE_ID("DATA_SOURCE_ID");

        //
        // Fields
        //

        private final String value;

        //
        // Constructor
        //

        UnionField(String value) {
            this.value = value;
        }

        //
        // Accessor Methods
        //

        public String getValue() {
            return value;
        }
    }
}
