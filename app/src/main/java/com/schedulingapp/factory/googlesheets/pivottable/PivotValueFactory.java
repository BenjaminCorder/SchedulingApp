package com.schedulingapp.factory.googlesheets.pivottable;

import com.google.api.services.sheets.v4.model.PivotValue;
import com.schedulingapp.factory.Factory;

public class PivotValueFactory implements Factory<PivotValue> {
    //
    // Fields
    //

    private String summarizeFunction;
    private String name;
    private String calculatedDisplayType;

    private UnionField unionField;

    //
    // Union Field: Only One of the Following
    //

    private Integer sourceColumnOffset;
    private String formula;

    public PivotValueFactory() {
        summarizeFunction = null;
        name = null;
        calculatedDisplayType = null;

        unionField = UnionField.UNION_FIELD_UNSPECIFIED;

        sourceColumnOffset = null;
        formula = null;
    }

    @Override
    public PivotValue generate() {
        // Declare Variables
        PivotValue value = new PivotValue();

        // Format value
        if(summarizeFunction != null) {
            value.setSummarizeFunction(summarizeFunction);
        }

        if(name != null) {
            value.setName(name);
        }

        if(calculatedDisplayType != null) {
            value.setCalculatedDisplayType(calculatedDisplayType);
        }

        // Format value Based on unionField
        switch(unionField.getValue()) {
            case "SOURCE_COLUMN_OFFSET":
                value.setSourceColumnOffset(sourceColumnOffset);
                break;
            case "FORMULA":
                value.setFormula(formula);
                break;
        }

        return value;
    }

    public void setSummarizeFunction(String summarizeFunction) {
        this.summarizeFunction = summarizeFunction;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCalculatedDisplayType(String calculatedDisplayType) {
        this.calculatedDisplayType = calculatedDisplayType;
    }

    public void setSourceColumnOffset(Integer sourceColumnOffset) {
        this.sourceColumnOffset = sourceColumnOffset;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    //
    // Enums
    //

    private enum UnionField {
        //
        // Enum Values
        //

        UNION_FIELD_UNSPECIFIED("UNION_FIELD_UNSPECIFIED"),
        SOURCE_COLUMN_OFFSET("SOURCE_COLUMN_OFFSET"),
        FORMULA("FORMULA");

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
