package com.schedulingapp.factory.googlesheets.charts;

import com.google.api.services.sheets.v4.model.ChartSourceRange;
import com.google.api.services.sheets.v4.model.GridRange;
import com.schedulingapp.factory.Factory;

import java.util.List;

public class ChartSourceRangeFactory implements Factory<ChartSourceRange> {
    //
    // Fields
    //

    private List<GridRange> sources;

    //
    // Constructor
    //

    public ChartSourceRangeFactory() {
        sources = null;
    }

    //
    // Public Methods
    //

    @Override
    public ChartSourceRange build() {
        // Declare Variables
        ChartSourceRange range = new ChartSourceRange();

        // Format range
        if(sources != null) {
            range.setSources(sources);
        }

        return range;
    }

    //
    // Accessor Methods
    //

    public List<GridRange> getSources() {
        return sources;
    }

    public void setSources(List<GridRange> sources) {
        this.sources = sources;
    }

    public void addSource(GridRange source) {
        this.sources.add(source);
    }

    public void removeSource(GridRange source) {
        this.sources.remove(source);
    }
}
