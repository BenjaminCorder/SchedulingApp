package com.schedulingapp.factory.googlesheets.sheets;

import com.google.api.services.sheets.v4.model.DeveloperMetadata;
import com.google.api.services.sheets.v4.model.DimensionProperties;
import com.schedulingapp.factory.Factory;

import java.util.ArrayList;
import java.util.List;

public class DimensionPropertiesFactory implements Factory<DimensionProperties> {
    //
    // Fields
    //

    private Boolean hiddenByFilter;
    private Boolean hiddenByUser;
    private Integer pixelSize;
    private List<DeveloperMetadata> developerMetadata;

    //
    // Constructor
    //

    public DimensionPropertiesFactory() {
        hiddenByFilter = null;
        hiddenByUser = null;
        pixelSize = null;
        developerMetadata = new ArrayList<>();
    }

    //
    // Public Methods
    //

    @Override
    public DimensionProperties build() {
        // Declare Variables
        DimensionProperties properties = new DimensionProperties();

        // Format properties
        if(hiddenByFilter != null) {
            properties.setHiddenByFilter(hiddenByFilter);
        }

        if(hiddenByUser != null) {
            properties.setHiddenByUser(hiddenByUser);
        }

        if(pixelSize != null) {
            properties.setPixelSize(pixelSize);
        }

        if(!developerMetadata.isEmpty()) {
            properties.setDeveloperMetadata(developerMetadata);
        }

        return properties;
    }

    //
    // Accessor Methods
    //

    public void setHiddenByFilter(Boolean hiddenByFilter) {
        this.hiddenByFilter = hiddenByFilter;
    }

    public void setHiddenByUser(Boolean hiddenByUser) {
        this.hiddenByUser = hiddenByUser;
    }

    public void setPixelSize(Integer pixelSize) {
        this.pixelSize = pixelSize;
    }

    public void setDeveloperMetadata(List<DeveloperMetadata> developerMetadata) {
        this.developerMetadata = developerMetadata;
    }
}
