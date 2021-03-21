package com.schedulingapp.factory.googlesheets.pivottables;

import com.google.api.services.sheets.v4.model.DateTimeRule;
import com.schedulingapp.factory.Factory;

public class DateTimeRuleFactory implements Factory<DateTimeRule> {
    //
    // Fields
    //

    private String type;

    //
    // Constructor
    //

    public DateTimeRuleFactory() {
        type = null;
    }

    //
    // Public Methods
    //

    @Override
    public DateTimeRule build() {
        // Declare Variables
        DateTimeRule rule = new DateTimeRule();

        // Format rule
        if (type != null) {
            rule.setType(type);
        }

        return rule;
    }

    //
    // Accessor Methods
    //

    public void setType(String type) {
        this.type = type;
    }
}
