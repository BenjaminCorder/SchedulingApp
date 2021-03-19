package com.schedulingapp.factory.googlesheets.pivottables;

import com.google.api.services.sheets.v4.model.ExtendedValue;
import com.google.api.services.sheets.v4.model.PivotGroupSortValueBucket;
import com.schedulingapp.factory.Factory;

import java.util.ArrayList;
import java.util.List;

public class PivotGroupSortValueBucketFactory
        implements Factory<PivotGroupSortValueBucket> {
    //
    // Fields
    //

    private Integer valuesIndex;
    private List<ExtendedValue> buckets;

    //
    // Constructors
    //

    public PivotGroupSortValueBucketFactory() {
        valuesIndex = null;
        buckets = new ArrayList<>();
    }

    @Override
    public PivotGroupSortValueBucket generate() {
        // Declare Variables
        PivotGroupSortValueBucket bucket = new PivotGroupSortValueBucket();

        // Format bucket
        if(valuesIndex != null) {
            bucket.setValuesIndex(valuesIndex);
        }

        if(!buckets.isEmpty()) {
            bucket.setBuckets(buckets);
        }

        return bucket;
    }

    public void setValuesIndex(Integer valuesIndex) {
        this.valuesIndex = valuesIndex;
    }

    public void setBuckets(List<ExtendedValue> buckets) {
        this.buckets = buckets;
    }

    public void addBucket(ExtendedValue bucket) {
        buckets.add(bucket);
    }

    public void removeBucket(ExtendedValue bucket) {
        buckets.remove(bucket);
    }
}
