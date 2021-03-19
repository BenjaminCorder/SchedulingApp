package com.schedulingapp.factory.googlesheets.charts;

import com.google.api.services.sheets.v4.model.ChartSpec;
import com.google.api.services.sheets.v4.model.EmbeddedChart;
import com.google.api.services.sheets.v4.model.EmbeddedObjectPosition;
import com.schedulingapp.factory.Factory;

public class EmbeddedChartFactory implements Factory<EmbeddedChart> {
    //
    // Fields
    //

    private Integer chartId;
    private ChartSpec spec;
    private EmbeddedObjectPosition position; // TODO Create EmbeddedObjectPositionFactory
    // private EmbeddedObjectBorder border

    //
    // Constructor
    //

    public EmbeddedChartFactory() {
        chartId = null;
        spec = null;
        position = null;
        // border = null;
    }

    //
    // Public Methods
    //

    @Override
    public EmbeddedChart generate() {
        // Declare Variables
        EmbeddedChart chart = new EmbeddedChart();

        // Format chart
        if(chartId != null) {
            chart.setChartId(chartId);
        }

        if(spec != null) {
            chart.setSpec(spec);
        }

        if(position != null) {
            chart.setPosition(position);
        }

        return chart;
    }

    //
    // Accessor Methods
    //

    public void setChartId(Integer chartId) {
        this.chartId = chartId;
    }

    public void setSpec(ChartSpec spec) {
        this.spec = spec;
    }

    public void setPosition(EmbeddedObjectPosition position) {
        this.position = position;
    }
}
