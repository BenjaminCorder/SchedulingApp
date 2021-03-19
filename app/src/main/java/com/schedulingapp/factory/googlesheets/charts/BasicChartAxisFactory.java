package com.schedulingapp.factory.googlesheets.charts;

import com.google.api.services.sheets.v4.model.BasicChartAxis;
import com.google.api.services.sheets.v4.model.ChartAxisViewWindowOptions;
import com.google.api.services.sheets.v4.model.TextFormat;
import com.google.api.services.sheets.v4.model.TextPosition;
import com.schedulingapp.factory.Factory;

public class BasicChartAxisFactory implements Factory<BasicChartAxis> {
    //
    // Fields
    //

    private String position;
    private String title;
    private TextFormat format;
    private TextPosition titleTextPosition;
    private ChartAxisViewWindowOptions viewWindowOptions;

    //
    // Constructor
    //

    public BasicChartAxisFactory() {
        position = null;
        title = null;
        format = null;
        titleTextPosition = null;
        viewWindowOptions = null;
    }

    //
    // Public Methods
    //

    @Override
    public BasicChartAxis generate() {
        // Declare Variables
        BasicChartAxis axis = new BasicChartAxis();

        if(position != null) {
            axis.setPosition(position);
        }

        if(title != null) {
            axis.setTitle(title);
        }

        if(format != null) {
            axis.setFormat(format);
        }

        if(titleTextPosition != null) {
            axis.setTitleTextPosition(titleTextPosition);
        }

        if(viewWindowOptions != null) {
            axis.setViewWindowOptions(viewWindowOptions);
        }

        return axis;
    }

    //
    // Accessor Methods
    //

    public void setPosition(String position) {
        this.position = position;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setFormat(TextFormat format) {
        this.format = format;
    }

    public void setTitleTextPosition(TextPosition titleTextPosition) {
        this.titleTextPosition = titleTextPosition;
    }

    public void setViewWindowOptions(ChartAxisViewWindowOptions viewWindowOptions) {
        this.viewWindowOptions = viewWindowOptions;
    }
}
