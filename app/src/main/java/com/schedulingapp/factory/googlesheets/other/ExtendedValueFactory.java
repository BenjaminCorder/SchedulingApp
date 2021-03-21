package com.schedulingapp.factory.googlesheets.other;

import com.google.api.services.sheets.v4.model.ErrorValue;
import com.google.api.services.sheets.v4.model.ExtendedValue;
import com.schedulingapp.factory.Factory;

public class ExtendedValueFactory implements Factory<ExtendedValue> {
    //
    // Fields
    //

    private UnionField unionField;

    //
    // Union Field: Only One of the Following
    //

    private Double numberValue;
    private String stringValue;
    private Boolean boolValue;
    private String formulaValue;
    private ErrorValue errorValue;

    public ExtendedValueFactory() {
        unionField = UnionField.UNION_FIELD_UNSPECIFIED;
        numberValue = null;
        stringValue = null;
        boolValue = null;
        formulaValue = null;
        errorValue = null;
    }

    @Override
    public ExtendedValue build() {
        // Declare Variables
        ExtendedValue extendedValue = new ExtendedValue();

        // Format extendedValue
        switch(unionField.getValue()){
            case "NUMBER_VALUE":
                extendedValue.setNumberValue(numberValue);
                break;
            case "STRING_VALUE":
                extendedValue.setStringValue(stringValue);
                break;
            case "BOOL_VALUE":
                extendedValue.setBoolValue(boolValue);
                break;
            case "FORMULA_VALUE":
                extendedValue.setFormulaValue(formulaValue);
                break;
            case "ERROR_VALUE":
                extendedValue.setErrorValue(errorValue);
                break;
        }

        return extendedValue;
    }

    public void setNumberValue(Double numberValue) {
        this.numberValue = numberValue;
        unionField = UnionField.NUMBER_VALUE;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
        unionField = UnionField.STRING_VALUE;
    }

    public void setBoolValue(Boolean boolValue) {
        this.boolValue = boolValue;
        unionField = UnionField.BOOL_VALUE;
    }

    public void setFormulaValue(String formulaValue) {
        this.formulaValue = formulaValue;
        unionField = UnionField.FORMULA_VALUE;
    }

    public void setErrorValue(ErrorValue errorValue) {
        this.errorValue = errorValue;
        unionField = UnionField.ERROR_VALUE;
    }

    //
    // Enums
    //

    private enum UnionField {
        //
        // Enum Values
        //

        UNION_FIELD_UNSPECIFIED("UNION_FIELD_UNSPECIFIED"),
        NUMBER_VALUE("NUMBER_VALUE"),
        STRING_VALUE("STRING_VALUE"),
        BOOL_VALUE("BOOL_VALUE"),
        FORMULA_VALUE("FORMULA_VALUE"),
        ERROR_VALUE("ERROR_VALUE");

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
