package com.schedulingapp.factory.googlesheets.pivottables;

import com.google.api.services.sheets.v4.model.BooleanCondition;
import com.google.api.services.sheets.v4.model.Color;
import com.google.api.services.sheets.v4.model.ColorStyle;
import com.google.api.services.sheets.v4.model.FilterCriteria;
import com.schedulingapp.factory.Factory;

import java.util.ArrayList;
import java.util.List;

public class FilterCriteriaFactory implements Factory<FilterCriteria> {
    //
    // Fields
    //

    private List<String> hiddenValues;
    private BooleanCondition condition;
    private Color visibleBackgroundColor;
    private ColorStyle visibleBackgroundColorStyle;
    private Color visibleForegroundColor;
    private ColorStyle visibleForegroundColorStyle;

    //
    // Constructor
    //

    public FilterCriteriaFactory() {
        hiddenValues = new ArrayList<>();
        condition = null;
        visibleBackgroundColor = null;
        visibleBackgroundColorStyle = null;
        visibleForegroundColor = null;
        visibleForegroundColorStyle = null;
    }

    //
    // Public Methods
    //

    @Override
    public FilterCriteria build() {
        // Declare Variables
        FilterCriteria criteria = new FilterCriteria();

        // Format criteria
        if(!hiddenValues.isEmpty()) {
            criteria.setHiddenValues(hiddenValues);
        }

        if(condition != null) {
            criteria.setCondition(condition);
        }

        if(visibleBackgroundColor != null) {
            criteria.setVisibleBackgroundColor(visibleBackgroundColor);
        }

        if(visibleBackgroundColorStyle != null) {
            criteria.setVisibleBackgroundColorStyle(visibleBackgroundColorStyle);
        }

        if(visibleForegroundColor != null) {
            criteria.setVisibleForegroundColor(visibleForegroundColor);
        }

        if(visibleForegroundColorStyle != null) {
            criteria.setVisibleForegroundColorStyle(visibleForegroundColorStyle);
        }

        return criteria;
    }

    //
    // Accessor Methods
    //

    public void setHiddenValues(List<String> hiddenValues) {
        this.hiddenValues = hiddenValues;
    }

    public void addHiddenValue(String hiddenValue) {
        hiddenValues.add(hiddenValue);
    }

    public void removeHiddenValue(String hiddenValue) {
        hiddenValues.remove(hiddenValue);
    }

    public void setCondition(BooleanCondition condition) {
        this.condition = condition;
    }

    public void setVisibleBackgroundColor(Color visibleBackgroundColor) {
        this.visibleBackgroundColor = visibleBackgroundColor;
    }

    public void setVisibleBackgroundColorStyle(ColorStyle visibleBackgroundColorStyle) {
        this.visibleBackgroundColorStyle = visibleBackgroundColorStyle;
    }

    public void setVisibleForegroundColor(Color visibleForegroundColor) {
        this.visibleForegroundColor = visibleForegroundColor;
    }

    public void setVisibleForegroundColorStyle(ColorStyle visibleForegroundColorStyle) {
        this.visibleForegroundColorStyle = visibleForegroundColorStyle;
    }
}
