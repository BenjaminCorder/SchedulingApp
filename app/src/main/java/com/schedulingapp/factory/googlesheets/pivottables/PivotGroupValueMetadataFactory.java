package com.schedulingapp.factory.googlesheets.pivottables;

import com.google.api.services.sheets.v4.model.ExtendedValue;
import com.google.api.services.sheets.v4.model.PivotGroupValueMetadata;
import com.schedulingapp.factory.Factory;

public class PivotGroupValueMetadataFactory implements Factory<PivotGroupValueMetadata> {
    //
    // Fields
    //

    private ExtendedValue value;
    private Boolean collapsed;

    //
    // Constructor
    //

    public PivotGroupValueMetadataFactory() {
        value = null;
        collapsed = null;
    }

    //
    // Public Methods
    //

    @Override
    public PivotGroupValueMetadata generate() {
        // Declare Variables
        PivotGroupValueMetadata metadata = new PivotGroupValueMetadata();

        // Format metadata
        if(value != null) {
            metadata.setValue(value);
        }

        if(collapsed != null) {
            metadata.setCollapsed(collapsed);
        }

        return metadata;
    }

    //
    // Accessor Methods
    //

    public void setValue(ExtendedValue value) {
        this.value = value;
    }

    public void setCollapsed(Boolean collapsed) {
        this.collapsed = collapsed;
    }
}
