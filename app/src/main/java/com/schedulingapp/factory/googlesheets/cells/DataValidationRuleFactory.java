package com.schedulingapp.factory.googlesheets.cells;

import com.google.api.services.sheets.v4.model.BooleanCondition;
import com.google.api.services.sheets.v4.model.DataValidationRule;
import com.schedulingapp.factory.Factory;

public class DataValidationRuleFactory implements Factory<DataValidationRule> {
    //
    // Fields
    //

    private BooleanCondition condition;
    private String inputMessage;
    private Boolean strict;
    private Boolean showCustomUi;

    //
    // Constructor
    //

    public DataValidationRuleFactory() {
        condition = null;
        inputMessage = null;
        strict = null;
        showCustomUi = null;
    }

    //
    // Public Methods
    //

    @Override
    public DataValidationRule build() {
        // Declare Variables
        DataValidationRule validationRule = new DataValidationRule();

        // Format validationRule
        if(condition != null) {
            validationRule.setCondition(condition);
        }

        if(inputMessage != null) {
            validationRule.setInputMessage(inputMessage);
        }

        if(strict != null) {
            validationRule.setStrict(strict);
        }

        if(showCustomUi != null) {
            validationRule.setShowCustomUi(showCustomUi);
        }

        return validationRule;
    }

    //
    // Accessor Methods
    //

    public void setCondition(BooleanCondition condition) {
        this.condition = condition;
    }

    public void setInputMessage(String inputMessage) {
        this.inputMessage = inputMessage;
    }

    public void setStrict(Boolean strict) {
        this.strict = strict;
    }

    public void setShowCustomUi(Boolean showCustomUi) {
        this.showCustomUi = showCustomUi;
    }
}
