package com.schedulingapp.factory.googlesheets.pivottables;

import com.google.api.services.sheets.v4.model.HistogramRule;
import com.schedulingapp.factory.Factory;

public class HistogramRuleFactory implements Factory<HistogramRule> {
    //
    // Fields
    //

    private Double interval;
    private Double start;
    private Double end;

    //
    // Constructor
    //

    public HistogramRuleFactory() {
        interval = null;
        start = null;
        end = null;
    }

    //
    // Public Methods
    //

    @Override
    public HistogramRule build() {
        // Declare Variables
        HistogramRule rule = new HistogramRule();

        // Format rule
        if(interval != null) {
            rule.setInterval(interval);
        }

        if(start != null) {
            rule.setStart(start);
        }

        if(end != null) {
            rule.setEnd(end);
        }

        return rule;
    }

    //
    // Accessor Methods
    //

    public void setInterval(Double interval) {
        this.interval = interval;
    }

    public void setStart(Double start) {
        this.start = start;
    }

    public void setEnd(Double end) {
        this.end = end;
    }
}
