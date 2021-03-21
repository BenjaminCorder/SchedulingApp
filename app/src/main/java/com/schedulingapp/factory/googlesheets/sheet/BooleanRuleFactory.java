package com.schedulingapp.factory.googlesheets.sheet;

import com.google.api.services.sheets.v4.model.BooleanCondition;
import com.google.api.services.sheets.v4.model.BooleanRule;
import com.google.api.services.sheets.v4.model.CellFormat;
import com.schedulingapp.factory.Factory;

public class BooleanRuleFactory implements Factory<BooleanRule> {
    //
    // Fields
    //

    private BooleanCondition condition;
    private CellFormat format;

    //
    // Constructor
    //

    public BooleanRuleFactory() {
        condition = null;
        format = null;
    }

    //
    // Public Methods
    //

    @Override
    public BooleanRule generate() {
        // Declare Variables
        BooleanRule rule = new BooleanRule();

        // Format rule
        if(condition != null) {
            rule.setCondition(condition);
        }

        if(format != null) {
            rule.setFormat(format);
        }

        return rule;
    }

    //
    // Accessor Methods
    //

    public void setCondition(BooleanCondition condition) {
        this.condition = condition;
    }

    public void setFormat(CellFormat format) {
        this.format = format;
    }
}
