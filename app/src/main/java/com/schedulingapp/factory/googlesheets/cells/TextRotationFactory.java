package com.schedulingapp.factory.googlesheets.cells;

import com.google.api.services.sheets.v4.model.TextRotation;
import com.schedulingapp.factory.Factory;

public class TextRotationFactory implements Factory<TextRotation> {
    //
    // Fields
    //

    private UnionField unionField;

    //
    // Union Field: Only one of the following
    //

    private Integer angle;
    private Boolean vertical;

    //
    // Constructor
    //

    public TextRotationFactory() {
        unionField = UnionField.UNION_FIELD_UNSPECIFIED;
        angle = null;
        vertical = null;
    }

    //
    // Public Methods
    //

    @Override
    public TextRotation build() {
        // Declare Variables
        TextRotation textRotation = new TextRotation();

        // Format textRotation to match member variables in unionField
        switch (unionField.getKind()) {
            case "ANGLE":
                textRotation.setAngle(angle);
                break;
            case "VERTICAL":
                textRotation.setVertical(vertical);
                break;
        }

        return textRotation;
    }

    //
    // Accessor Methods
    //

    public void setAngle(Integer angle) {
        this.angle = angle;
        unionField = UnionField.ANGLE;
    }

    public void setVertical(Boolean vertical) {
        this.vertical = vertical;
        unionField = UnionField.VERTICAL;
    }

    //
    // Enums
    //

    private enum UnionField {
        //
        // Enum Values
        //

        UNION_FIELD_UNSPECIFIED("UNION_FIELD_UNSPECIFIED"),
        ANGLE("ANGLE"),
        VERTICAL("VERTICAL");

        //
        // Fields
        //

        private final String kind;

        //
        // Constructors
        //

        UnionField(String kind) {
            this.kind = kind;
        }

        //
        // Accessor Methods
        //

        public String getKind() {
            return kind;
        }
    }
}
