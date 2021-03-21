package com.schedulingapp.factory.googlesheets.charts;

import com.google.api.services.sheets.v4.model.BasicChartDomain;
import com.google.api.services.sheets.v4.model.ChartData;
import com.schedulingapp.factory.Factory;

public class BasicChartDomainFactory implements Factory<BasicChartDomain> {
    //
    // Fields
    //

    private ChartData domain;
    private Boolean reversed;

    //
    // Constructor
    //

    public BasicChartDomainFactory() {
        domain = null;
        reversed = null;
    }

    //
    // Public Methods
    //

    @Override
    public BasicChartDomain build() {
        // Declare Variables
        BasicChartDomain chartDomain = new BasicChartDomain();

        // Format chartDomain
        if(domain != null) {
            chartDomain.setDomain(domain);
        }

        if(reversed != null) {
            chartDomain.setReversed(reversed);
        }

        return chartDomain;
    }

    //
    // Accessor Methods
    //

    public void setDomain(ChartData domain) {
        this.domain = domain;
    }

    public void setReversed(Boolean reversed) {
        this.reversed = reversed;
    }
}
