package com.schedulingapp.factory.googlesheets.pivottables;

import com.google.api.services.sheets.v4.model.PivotFilterCriteria;
import com.schedulingapp.factory.Factory;

import java.util.ArrayList;
import java.util.List;

public class PivotFilterCriteriaFactory implements Factory<PivotFilterCriteria> {
    //
    // Fields
    //

    private List<String> visibleValues;

    public PivotFilterCriteriaFactory() {
        visibleValues = new ArrayList<>();
    }

    @Override
    public PivotFilterCriteria build() {
        // Declare Variables
        PivotFilterCriteria criteria = new PivotFilterCriteria();

        // Format criteria
        if(!visibleValues.isEmpty()) {
            criteria.setVisibleValues(visibleValues);
        }

        return criteria;
    }

    public void setVisibleValues(List<String> visibleValues) {
        this.visibleValues = visibleValues;
    }

    public void addVisibleValue(String visibleValue) {
        visibleValues.add(visibleValue);
    }

    public void removeVisibleValue(String visibleValue) {
        visibleValues.remove(visibleValue);
    }
}
