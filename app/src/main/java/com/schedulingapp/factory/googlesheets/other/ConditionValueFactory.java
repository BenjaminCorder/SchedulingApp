package com.schedulingapp.factory.googlesheets.other;

import com.google.api.services.sheets.v4.model.ConditionValue;
import com.schedulingapp.factory.Factory;

public class ConditionValueFactory implements Factory<ConditionValue> {
    //
    // Fields
    //

    private UnionField unionField;

    //
    // Union Field: Only One of the Following
    //

    private String relativeDate;
    private String userEnteredValue;

    public ConditionValueFactory() {
        unionField = UnionField.UNION_FIELD_UNSPECIFIED;
        relativeDate = null;
        userEnteredValue = null;
    }

    @Override
    public ConditionValue build() {
        // Declare Variables
        ConditionValue value = new ConditionValue();

        // Format value
        switch(unionField.getValue()) {
            case "RELATIVE_DATE":
                value.setRelativeDate(relativeDate);
                break;
            case "USER_ENTERED_VALUE":
                value.setUserEnteredValue(userEnteredValue);
                break;
        }

        return value;
    }

    public void setRelativeDate(String relativeDate) {
        this.relativeDate = relativeDate;
        unionField = UnionField.RELATIVE_DATE;
    }

    public void setUserEnteredValue(String userEnteredValue) {
        this.userEnteredValue = userEnteredValue;
        unionField = UnionField.USER_ENTERED_VALUE;
    }

    //
    // Enums
    //

    private enum UnionField {
        //
        // Enum Values
        //

        UNION_FIELD_UNSPECIFIED("UNION_FIELD_UNSPECIFIED"),
        RELATIVE_DATE("RELATIVE_DATE"),
        USER_ENTERED_VALUE("USER_ENTERED_VALUE");

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
