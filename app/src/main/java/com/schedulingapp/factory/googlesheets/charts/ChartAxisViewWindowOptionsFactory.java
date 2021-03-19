package com.schedulingapp.factory.googlesheets.charts;

import com.google.api.services.sheets.v4.model.ChartAxisViewWindowOptions;
import com.schedulingapp.factory.Factory;

public class ChartAxisViewWindowOptionsFactory
        implements Factory<ChartAxisViewWindowOptions> {
    //
    // Fields
    //

    private Double viewWindowMin;
    private Double viewWindowMax;
    private String viewWindowMode;

    //
    // Constructor
    //

    public ChartAxisViewWindowOptionsFactory() {
        viewWindowMin = null;
        viewWindowMax = null;
        viewWindowMode = null;
    }

    //
    // Public Methods
    //

    @Override
    public ChartAxisViewWindowOptions generate() {
        // Declare Variables
        ChartAxisViewWindowOptions options = new ChartAxisViewWindowOptions();

        // Format options
        if(viewWindowMin != null) {
            options.setViewWindowMin(viewWindowMin);
        }

        if(viewWindowMax != null) {
            options.setViewWindowMax(viewWindowMax);
        }

        if(viewWindowMode != null) {
            options.setViewWindowMode(viewWindowMode);
        }

        return options;
    }

    //
    // Accessor Methods
    //

    public void setViewWindowMin(Double viewWindowMin) {
        this.viewWindowMin = viewWindowMin;
    }

    public void setViewWindowMax(Double viewWindowMax) {
        this.viewWindowMax = viewWindowMax;
    }

    public void setViewWindowMode(String viewWindowMode) {
        this.viewWindowMode = viewWindowMode;
    }
}
