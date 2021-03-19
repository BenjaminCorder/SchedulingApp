package com.schedulingapp.factory.googlesheets.sheet;

import com.google.api.services.sheets.v4.model.FilterCriteria;
import com.google.api.services.sheets.v4.model.FilterView;
import com.google.api.services.sheets.v4.model.GridRange;
import com.google.api.services.sheets.v4.model.SortSpec;
import com.schedulingapp.factory.Factory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilterViewFactory implements Factory<FilterView> {
    //
    // Fields
    //

    private Integer filterViewId;
    private String title;
    private GridRange range;
    private String namedRangeId;
    private List<SortSpec> sortSpecs;
    private Map<String, FilterCriteria> criteria;

    //
    // Constructor
    //

    public FilterViewFactory() {
        filterViewId = null;
        title = null;
        range = null;
        namedRangeId = null;
        sortSpecs = new ArrayList<>();
        criteria = new HashMap<>();
    }

    //
    // Public Methods
    //

    @Override
    public FilterView generate() {
        // Declare Variables
        FilterView view = new FilterView();

        // Format view
        if(filterViewId != null) {
            view.setFilterViewId(filterViewId);
        }

        if(title != null) {
            view.setTitle(title);
        }

        if(range != null) {
            view.setRange(range);
        }

        if(namedRangeId != null) {
            view.setNamedRangeId(namedRangeId);
        }

        if(!sortSpecs.isEmpty()) {
            view.setSortSpecs(sortSpecs);
        }

        if(!criteria.isEmpty()) {
            view.setCriteria(criteria);
        }

        return view;
    }

    //
    // Accessor Methods
    //

    public void setFilterViewId(Integer filterViewId) {
        this.filterViewId = filterViewId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setRange(GridRange range) {
        this.range = range;
    }

    public void setNamedRangeId(String namedRangeId) {
        this.namedRangeId = namedRangeId;
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
