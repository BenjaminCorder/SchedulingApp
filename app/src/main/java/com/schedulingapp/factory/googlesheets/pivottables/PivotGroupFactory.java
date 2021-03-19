package com.schedulingapp.factory.googlesheets.pivottables;

import com.google.api.services.sheets.v4.model.PivotGroup;
import com.google.api.services.sheets.v4.model.PivotGroupRule;
import com.google.api.services.sheets.v4.model.PivotGroupSortValueBucket;
import com.google.api.services.sheets.v4.model.PivotGroupValueMetadata;
import com.schedulingapp.factory.Factory;

import java.util.ArrayList;
import java.util.List;

public class PivotGroupFactory implements Factory<PivotGroup> {
    //
    // Fields
    //

    private Boolean showTotals;
    private List<PivotGroupValueMetadata> valueMetadata;
    private String sortOrder;
    private PivotGroupSortValueBucket valueBucket;
    private Boolean repeatHeadings;
    private String label;
    private PivotGroupRule groupRule;

    // Technically in a Union Field, but the other field's type does not exist.
    private Integer sourceColumnOffset;

    //
    // Constructor
    //

    public PivotGroupFactory() {
        showTotals = null;
        valueMetadata = new ArrayList<>();
        sortOrder = null;
        valueBucket = null;
        repeatHeadings = null;
        label = null;
        groupRule = null;
        sourceColumnOffset = null;
    }

    //
    // Public Methods
    //

    @Override
    public PivotGroup generate() {
        // Declare Variables
        PivotGroup group = new PivotGroup();

        // Format group
        if(showTotals != null) {
            group.setShowTotals(showTotals);
        }

        if(!valueMetadata.isEmpty()) {
            group.setValueMetadata(valueMetadata);
        }

        if(sortOrder != null) {
            group.setSortOrder(sortOrder);
        }

        if(valueBucket != null) {
            group.setValueBucket(valueBucket);
        }

        if(repeatHeadings != null) {
            group.setRepeatHeadings(repeatHeadings);
        }

        if(label != null) {
            group.setLabel(label);
        }

        if(groupRule != null) {
            group.setGroupRule(groupRule);
        }

        if(sourceColumnOffset != null) {
            group.setSourceColumnOffset(sourceColumnOffset);
        }

        return group;
    }

    //
    // Accessor Methods
    //

    public void setShowTotals(Boolean showTotals) {
        this.showTotals = showTotals;
    }

    public void setValueMetadata(List<PivotGroupValueMetadata> valueMetadata) {
        this.valueMetadata = valueMetadata;
    }

    public void addValueMetadata(PivotGroupValueMetadata valueMetadata) {
        this.valueMetadata.add(valueMetadata);
    }

    public void removeValueMetadata(PivotGroupValueMetadata valueMetadata) {
        this.valueMetadata.remove(valueMetadata);
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    public void setValueBucket(PivotGroupSortValueBucket valueBucket) {
        this.valueBucket = valueBucket;
    }

    public void setRepeatHeadings(Boolean repeatHeadings) {
        this.repeatHeadings = repeatHeadings;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setGroupRule(PivotGroupRule groupRule) {
        this.groupRule = groupRule;
    }

    public void setSourceColumnOffset(Integer sourceColumnOffset) {
        this.sourceColumnOffset = sourceColumnOffset;
    }
}
