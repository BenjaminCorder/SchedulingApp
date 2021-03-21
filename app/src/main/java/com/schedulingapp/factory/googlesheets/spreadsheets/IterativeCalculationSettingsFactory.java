package com.schedulingapp.factory.googlesheets.spreadsheets;

import com.google.api.services.sheets.v4.model.IterativeCalculationSettings;
import com.schedulingapp.factory.Factory;

public class IterativeCalculationSettingsFactory
        implements Factory<IterativeCalculationSettings> {
    //
    // Fields
    //

    private Integer maxIterations;
    private Double convergenceThreshold;

    //
    // Constructor
    //

    public IterativeCalculationSettingsFactory() {
        maxIterations = null;
        convergenceThreshold = null;
    }

    //
    // Public Methods
    //

    @Override
    public IterativeCalculationSettings build() {
        // Declare Variables
        IterativeCalculationSettings iterativeCalculationSettings =
                new IterativeCalculationSettings();

        // Format iterativeCalculationSettings
        if (maxIterations != null) {
            iterativeCalculationSettings.setMaxIterations(maxIterations);
        }

        if (convergenceThreshold != null) {
            iterativeCalculationSettings.setConvergenceThreshold(convergenceThreshold);
        }

        return iterativeCalculationSettings;
    }

    //
    // Accessor Methods
    //

    public void setMaxIterations(Integer maxIterations) {
        this.maxIterations = maxIterations;
    }

    public void setConvergenceThreshold(Double convergenceThreshold) {
        this.convergenceThreshold = convergenceThreshold;
    }
}
