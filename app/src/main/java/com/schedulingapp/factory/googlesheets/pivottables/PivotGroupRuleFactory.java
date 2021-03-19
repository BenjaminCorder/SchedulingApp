package com.schedulingapp.factory.googlesheets.pivottables;

import com.google.api.services.sheets.v4.model.DateTimeRule;
import com.google.api.services.sheets.v4.model.HistogramRule;
import com.google.api.services.sheets.v4.model.ManualRule;
import com.google.api.services.sheets.v4.model.PivotGroupRule;
import com.schedulingapp.factory.Factory;

public class PivotGroupRuleFactory implements Factory<PivotGroupRule> {
    //
    // Fields
    //

    private UnionField unionField;

    //
    // Union Field: Only One of the Following
    //

    private ManualRule manualRule;
    private HistogramRule histogramRule;
    private DateTimeRule dateTimeRule;

    public PivotGroupRuleFactory() {
        unionField = UnionField.UNION_FIELD_UNSPECIFIED;
        manualRule = null;
        histogramRule = null;
        dateTimeRule = null;
    }

    @Override
    public PivotGroupRule generate() {
        // Declare Variables
        PivotGroupRule pivotGroupRule = new PivotGroupRule();

        // Format pivotGroupRule according to Union Field
        switch(unionField.getValue()) {
            case "MANUAL_RULE":
                pivotGroupRule.setManualRule(manualRule);
                break;
            case "HISTOGRAM_RULE":
                pivotGroupRule.setHistogramRule(histogramRule);
                break;
            case "DATE_TIME_RULE":
                pivotGroupRule.setDateTimeRule(dateTimeRule);
                break;
        }

        return pivotGroupRule;
    }

    public void setManualRule(ManualRule manualRule) {
        this.manualRule = manualRule;
        unionField = UnionField.MANUAL_RULE;
    }

    public void setHistogramRule(HistogramRule histogramRule) {
        this.histogramRule = histogramRule;
        unionField = UnionField.HISTOGRAM_RULE;
    }

    public void setDateTimeRule(DateTimeRule dateTimeRule) {
        this.dateTimeRule = dateTimeRule;
        unionField = UnionField.DATE_TIME_RULE;
    }

    //
    // Enums
    //

    private enum UnionField {
        //
        // Enum Values
        //

        UNION_FIELD_UNSPECIFIED("UNION_FIELD_UNSPECIFIED"),
        MANUAL_RULE("MANUAL_RULE"),
        HISTOGRAM_RULE("HISTOGRAM_RULE"),
        DATE_TIME_RULE("DATE_TIME_RULE");

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
