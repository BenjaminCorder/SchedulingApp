package com.schedulingapp.factory.googlesheets.charts;

import com.google.api.services.sheets.v4.model.ChartData;
import com.google.api.services.sheets.v4.model.ChartSourceRange;
import com.schedulingapp.factory.Factory;

public class ChartDataFactory implements Factory<ChartData> {
    //
    // Fields
    //

    //private ChartGroupRule groupRule;
    //private String aggregateType;

    private UnionField unionField;

    //
    // Union Field: Only One of the Following
    //

    private ChartSourceRange sourceRange;
    //private DataSourceColumnReference columnReference;

    //
    // Constructor
    //

    public ChartDataFactory() {
        unionField = UnionField.UNION_FIELD_UNSPECIFIED;

        sourceRange = null;
    }

    //
    // Public Methods
    //

    @Override
    public ChartData build() {
        // Declare Variables
        ChartData data = new ChartData();

        // Format data According to unionField
        switch(unionField.getType()) {
            case "SOURCE_RANGE":
                data.setSourceRange(sourceRange);
                break;
            case "COLUMN_REFERENCE":
                break;
        }

        return data;
    }

    //
    // Accessor Methods
    //

    public void setSourceRange(ChartSourceRange sourceRange) {
        this.sourceRange = sourceRange;
        unionField = UnionField.SOURCE_RANGE;
    }

    //
    // Enums
    //

    private enum UnionField {
        //
        // Enum Types
        //

        UNION_FIELD_UNSPECIFIED("UNION_FIELD_UNSPECIFIED"),
        SOURCE_RANGE("SOURCE_RANGE"),
        COLUMN_REFERENCE("COLUMN_REFERENCE");

        //
        // Fields
        //

        private final String type;

        //
        // Constructor
        //

        UnionField(String type) {
            this.type = type;
        }

        //
        // Accessor Methods
        //

        public String getType() {
            return type;
        }
    }
}
