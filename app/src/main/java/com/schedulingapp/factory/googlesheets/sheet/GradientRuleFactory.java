package com.schedulingapp.factory.googlesheets.sheet;

import com.google.api.services.sheets.v4.model.GradientRule;
import com.google.api.services.sheets.v4.model.InterpolationPoint;
import com.schedulingapp.factory.Factory;

public class GradientRuleFactory implements Factory<GradientRule> {
    //
    // Fields
    //

    private InterpolationPoint minPoint;
    private InterpolationPoint midPoint;
    private InterpolationPoint maxPoint;

    //
    // Constructor
    //

    public GradientRuleFactory() {
        minPoint = null;
        midPoint = null;
        maxPoint = null;
    }

    //
    // Public Methods
    //

    @Override
    public GradientRule generate() {
        // Declare Variables
        GradientRule rule = new GradientRule();

        // Format rule
        if(minPoint != null) {
            rule.setMinpoint(minPoint);
        }

        if(midPoint != null) {
            rule.setMidpoint(midPoint);
        }

        if(maxPoint != null) {
            rule.setMaxpoint(maxPoint);
        }

        return rule;
    }

    //
    // Accessor Methods
    //

    public void setMinPoint(InterpolationPoint minPoint) {
        this.minPoint = minPoint;
    }

    public void setMidPoint(InterpolationPoint midPoint) {
        this.midPoint = midPoint;
    }

    public void setMaxPoint(InterpolationPoint maxPoint) {
        this.maxPoint = maxPoint;
    }
}
