package com.schedulingapp.factory.googlesheets.sheets;

import com.google.api.services.sheets.v4.model.Editors;
import com.google.api.services.sheets.v4.model.GridRange;
import com.google.api.services.sheets.v4.model.ProtectedRange;
import com.schedulingapp.factory.Factory;

import java.util.ArrayList;
import java.util.List;

public class ProtectedRangeFactory implements Factory<ProtectedRange> {
    //
    // Fields
    //

    private Integer protectedRangeId;
    private GridRange range;
    private String namedRangeId;
    private String description;
    private Boolean warningOnly;
    private Boolean requestingUserCanEdit;
    private List<GridRange> unprotectedRanges;
    private Editors editors;

    //
    // Constructor
    //

    public ProtectedRangeFactory() {
        this.protectedRangeId = null;
        this.range = null;
        this.namedRangeId = null;
        this.description = null;
        this.warningOnly = null;
        this.requestingUserCanEdit = null;
        this.unprotectedRanges = new ArrayList<>();
        this.editors = null;
    }

    //
    // Public Methods
    //

    @Override
    public ProtectedRange build() {
        // Declare Variables
        ProtectedRange protectedRange = new ProtectedRange();

        // Format protectedRange
        if(protectedRangeId != null) {
            protectedRange.setProtectedRangeId(protectedRangeId);
        }

        if(range != null) {
            protectedRange.setRange(range);
        }

        if(namedRangeId != null) {
            protectedRange.setNamedRangeId(namedRangeId);
        }

        if(description != null) {
            protectedRange.setDescription(description);
        }

        if(warningOnly != null) {
            protectedRange.setWarningOnly(warningOnly);
        }

        if(requestingUserCanEdit != null) {
            protectedRange.setRequestingUserCanEdit(requestingUserCanEdit);
        }

        if(!unprotectedRanges.isEmpty()) {
            protectedRange.setUnprotectedRanges(unprotectedRanges);
        }

        if(editors != null) {
            protectedRange.setEditors(editors);
        }

        return protectedRange;
    }

    //
    // Accessor Methods
    //

    public void setProtectedRangeId(Integer protectedRangeId) {
        this.protectedRangeId = protectedRangeId;
    }

    public void setRange(GridRange range) {
        this.range = range;
    }

    public void setNamedRangeId(String namedRangeId) {
        this.namedRangeId = namedRangeId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setWarningOnly(Boolean warningOnly) {
        this.warningOnly = warningOnly;
    }

    public void setRequestingUserCanEdit(Boolean requestingUserCanEdit) {
        this.requestingUserCanEdit = requestingUserCanEdit;
    }

    public void setUnprotectedRanges(List<GridRange> unprotectedRanges) {
        this.unprotectedRanges = unprotectedRanges;
    }

    public void addUnprotectedRange(GridRange unprotectedRange) {
        unprotectedRanges.add(unprotectedRange);
    }

    public void removeUnprotectedRange(GridRange unprotectedRange) {
        unprotectedRanges.remove(unprotectedRange);
    }

    public void setEditors(Editors editors) {
        this.editors = editors;
    }
}
