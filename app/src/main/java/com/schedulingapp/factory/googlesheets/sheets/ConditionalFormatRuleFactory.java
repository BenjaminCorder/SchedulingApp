package com.schedulingapp.factory.googlesheets.sheets;

import com.google.api.services.sheets.v4.model.BooleanRule;
import com.google.api.services.sheets.v4.model.ConditionalFormatRule;
import com.google.api.services.sheets.v4.model.GradientRule;
import com.google.api.services.sheets.v4.model.GridRange;
import com.schedulingapp.factory.Factory;

import java.util.ArrayList;
import java.util.List;

public class ConditionalFormatRuleFactory implements Factory<ConditionalFormatRule> {
    //
    // Fields
    //

    private List<GridRange> ranges;

    private UnionField unionField;

    //
    // Union Field: Only One of the Following
    //

    private BooleanRule booleanRule;
    private GradientRule gradientRule;

    //
    // Constructor
    //

    public ConditionalFormatRuleFactory() {
        this.ranges = new ArrayList<>();

        this.unionField = UnionField.UNION_FIELD_UNSPECIFIED;

        this.booleanRule = null;
        this.gradientRule = null;
    }

    //
    // Public Methods
    //

    @Override
    public ConditionalFormatRule build() {
        // Declare Variables
        ConditionalFormatRule rule = new ConditionalFormatRule();

        // Format rule
        if(!this.ranges.isEmpty()) {
            rule.setRanges(ranges);
        }

        // Format rule Based on unionField
        switch(unionField.getValue()) {
            case "BOOLEAN_RULE":
                rule.setBooleanRule(booleanRule);
                break;
            case "GRADIENT_RULE":
                rule.setGradientRule(gradientRule);
                break;
        }

        return rule;
    }

    //
    // Accessor Methods
    //

    public void setRanges(List<GridRange> ranges) {
        this.ranges = ranges;
    }

    public void setBooleanRule(BooleanRule booleanRule) {
        this.booleanRule = booleanRule;
        this.unionField = UnionField.BOOLEAN_RULE;
    }

    public void setGradientRule(GradientRule gradientRule) {
        this.gradientRule = gradientRule;
        this.unionField = UnionField.GRADIENT_RULE;
    }

    //
    // Enums
    //

    private enum UnionField {
        //
        // Enum Values
        //

        UNION_FIELD_UNSPECIFIED("UNION_FIELD_UNSPECIFIED"),
        BOOLEAN_RULE("BOOLEAN_RULE"),
        GRADIENT_RULE("GRADIENT_RULE");

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
