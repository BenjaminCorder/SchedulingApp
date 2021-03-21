package com.schedulingapp.factory.googlesheets.charts;

import com.google.api.services.sheets.v4.model.BasicChartAxis;
import com.google.api.services.sheets.v4.model.BasicChartDomain;
import com.google.api.services.sheets.v4.model.BasicChartSeries;
import com.google.api.services.sheets.v4.model.BasicChartSpec;
import com.schedulingapp.factory.Factory;

import java.util.ArrayList;
import java.util.List;

public class BasicChartSpecFactory implements Factory<BasicChartSpec> {
    //
    // Fields
    //

    private String chartType;
    private String legendPosition;
    private List<BasicChartAxis> axis;
    private List<BasicChartDomain> domains;
    private List<BasicChartSeries> series; // TODO Create BasicChartSeriesFactory
    private Integer headerCount;
    private Boolean threeDimensional;
    private Boolean interpolateNulls;
    private String stackedType;
    private Boolean lineSmoothing;
    private String compareMode;
    //private DataLabel totalDataLabel

    //
    // Constructor
    //

    public BasicChartSpecFactory() {
        chartType = null;
        legendPosition = null;
        axis = new ArrayList<>();
        domains = new ArrayList<>();
        series = new ArrayList<>();
        headerCount = null;
        threeDimensional = null;
        interpolateNulls = null;
        stackedType = null;
        lineSmoothing = null;
        compareMode = null;
    }

    //
    // Public Methods
    //

    @Override
    public BasicChartSpec build() {
        // Declare Variables
        BasicChartSpec chartSpec = new BasicChartSpec();

        // Format chartSpec
        if(chartType != null) {
            chartSpec.setChartType(chartType);
        }

        if(legendPosition != null) {
            chartSpec.setLegendPosition(legendPosition);
        }

        if(!axis.isEmpty()) {
            chartSpec.setAxis(axis);
        }

        if(!domains.isEmpty()) {
            chartSpec.setDomains(domains);
        }

        if(!series.isEmpty()) {
            chartSpec.setSeries(series);
        }

        if(headerCount != null) {
            chartSpec.setHeaderCount(headerCount);
        }

        if(threeDimensional != null) {
            chartSpec.setThreeDimensional(threeDimensional);
        }

        if(interpolateNulls != null) {
            chartSpec.setInterpolateNulls(interpolateNulls);
        }

        if(stackedType != null) {
            chartSpec.setStackedType(stackedType);
        }

        if(lineSmoothing != null) {
            chartSpec.setLineSmoothing(lineSmoothing);
        }

        if(compareMode != null) {
            chartSpec.setCompareMode(compareMode);
        }

        return chartSpec;
    }

    //
    // Accessor Methods
    //

    public void setChartType(String chartType) {
        this.chartType = chartType;
    }

    public void setLegendPosition(String legendPosition) {
        this.legendPosition = legendPosition;
    }

    public List<BasicChartAxis> getAxis() {
        return axis;
    }

    public void setAxis(List<BasicChartAxis> axis) {
        this.axis = axis;
    }

    public void addAxis(BasicChartAxis axis) {
        this.axis.add(axis);
    }

    public void removeAxis(BasicChartAxis axis) {
        this.axis.remove(axis);
    }

    public List<BasicChartDomain> getDomains() {
        return domains;
    }

    public void setDomain(List<BasicChartDomain> domains) {
        this.domains = domains;
    }

    public void addDomain(BasicChartDomain domain) {
        this.domains.add(domain);
    }

    public void removeDomain(BasicChartDomain domain) {
        this.domains.remove(domain);
    }

    public List<BasicChartSeries> getSeries() {
        return series;
    }

    public void setSeries(List<BasicChartSeries> series) {
        this.series = series;
    }

    public void addSeries(BasicChartSeries series) {
        this.series.add(series);
    }

    public void removeSeries(BasicChartSeries series) {
        this.series.remove(series);
    }

    public void setHeaderCount(Integer headerCount) {
        this.headerCount = headerCount;
    }

    public void setThreeDimensional(Boolean threeDimensional) {
        this.threeDimensional = threeDimensional;
    }

    public void setInterpolateNulls(Boolean interpolateNulls) {
        this.interpolateNulls = interpolateNulls;
    }

    public void setStackedType(String stackedType) {
        this.stackedType = stackedType;
    }

    public void setLineSmoothing(Boolean lineSmoothing) {
        this.lineSmoothing = lineSmoothing;
    }

    public void setCompareMode(String compareMode) {
        this.compareMode = compareMode;
    }
}
