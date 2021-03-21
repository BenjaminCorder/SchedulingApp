package com.schedulingapp.factory.googlesheets.sheets;

import com.google.api.services.sheets.v4.model.BasicFilter;
import com.google.api.services.sheets.v4.model.FilterCriteria;
import com.google.api.services.sheets.v4.model.GridRange;
import com.google.api.services.sheets.v4.model.SortSpec;
import com.schedulingapp.factory.Factory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BasicFilterFactory implements Factory<BasicFilter> {
    //
    // Fields
    //

    private GridRange range;
    private List<SortSpec> sortSpecs;
    private Map<String, FilterCriteria> criteria;

    //
    // Constructor
    //

    public BasicFilterFactory() {
        range = null;
        sortSpecs = new ArrayList<>();
        criteria = new HashMap<>();
    }

    //
    // Public Methods
    //

    @Override
    public BasicFilter build() {
        // Declare Variables
        BasicFilter filter = new BasicFilter();

        // Format filter
        if(range != null) {
            filter.setRange(range);
        }

        if(!sortSpecs.isEmpty()) {
            filter.setSortSpecs(sortSpecs);
        }

        if(!criteria.isEmpty()) {
            filter.setCriteria(criteria);
        }

        return filter;
    }

    //
    // Accessor Methods
    //

    public void setRange(GridRange range) {
        this.range = range;
    }

    public void setSortSpecs(List<SortSpec> sortSpecs) {
        this.sortSpecs = sortSpecs;
    }

    public void addSortSpec(SortSpec sortSpec) {
        sortSpecs.add(sortSpec);
    }

    public void removeSortSpec(SortSpec sortSpec) {
        sortSpecs.remove(sortSpec);
    }

    public void setCriteria(Map<String, FilterCriteria> criteria) {
        this.criteria = criteria;
    }

    public void addCriteria(String key, FilterCriteria value) {
        criteria.put(key, value);
    }

    public void removeCriteria(String key) {
        criteria.remove(key);
    }
}
