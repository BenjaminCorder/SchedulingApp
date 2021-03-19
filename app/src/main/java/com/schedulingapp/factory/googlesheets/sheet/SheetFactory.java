package com.schedulingapp.factory.googlesheets.sheet;

import com.google.api.services.sheets.v4.model.BandedRange;
import com.google.api.services.sheets.v4.model.BasicFilter;
import com.google.api.services.sheets.v4.model.ConditionalFormatRule;
import com.google.api.services.sheets.v4.model.DeveloperMetadata;
import com.google.api.services.sheets.v4.model.DimensionGroup;
import com.google.api.services.sheets.v4.model.EmbeddedChart;
import com.google.api.services.sheets.v4.model.FilterView;
import com.google.api.services.sheets.v4.model.GridData;
import com.google.api.services.sheets.v4.model.GridRange;
import com.google.api.services.sheets.v4.model.ProtectedRange;
import com.google.api.services.sheets.v4.model.Sheet;
import com.google.api.services.sheets.v4.model.SheetProperties;
import com.google.api.services.sheets.v4.model.Slicer;
import com.schedulingapp.factory.Factory;

import java.util.ArrayList;
import java.util.List;

public class SheetFactory implements Factory<Sheet> {
    //
    // Fields
    //

    private SheetProperties properties;
    private List<GridData> data;
    private List<GridRange> merges;
    private List<ConditionalFormatRule> conditionalFormats;
    private List<FilterView> filterViews;
    private List<ProtectedRange> protectedRanges; // TODO(user) create Factory
    private BasicFilter basicFilter; // TODO(user) create Factory
    private List<EmbeddedChart> charts; // TODO(user) create Factory
    private List<BandedRange> bandedRanges; // TODO(user) create Factory
    private List<DeveloperMetadata> developerMetadata; // TODO(user) create Factory
    private List<DimensionGroup> rowGroups;
    private List<DimensionGroup> columnGroups;
    private List<Slicer> slicers; // TODO(user) create Factory

    //
    // Constructor
    //

    public SheetFactory() {
        properties = null;
        data = new ArrayList<>();
        merges = new ArrayList<>();
        conditionalFormats = new ArrayList<>();
        filterViews = new ArrayList<>();
        protectedRanges = new ArrayList<>();
        basicFilter = null;
        charts = new ArrayList<>();
        bandedRanges = new ArrayList<>();
        developerMetadata = new ArrayList<>();
        rowGroups = new ArrayList<>();
        columnGroups = new ArrayList<>();
        slicers = new ArrayList<>();
    }
    @Override
    public Sheet generate() {
        // Declare Variables
        Sheet sheet = new Sheet();

        // Format sheet
        if (properties != null) {
            sheet.setProperties(properties);
        }

        if (!data.isEmpty()) {
            sheet.setData(data);
        }

        if (!merges.isEmpty()) {
            sheet.setMerges(merges);
        }

        if (!conditionalFormats.isEmpty()) {
            sheet.setConditionalFormats(conditionalFormats);
        }

        if (!filterViews.isEmpty()) {
            sheet.setFilterViews(filterViews);
        }

        if (!protectedRanges.isEmpty()) {
            sheet.setProtectedRanges(protectedRanges);
        }

        if (basicFilter != null) {
            sheet.setBasicFilter(basicFilter);
        }

        if (!charts.isEmpty()) {
            sheet.setCharts(charts);
        }

        if (!bandedRanges.isEmpty()) {
            sheet.setBandedRanges(bandedRanges);
        }

        if (!developerMetadata.isEmpty()) {
            sheet.setDeveloperMetadata(developerMetadata);
        }

        if (!rowGroups.isEmpty()) {
            sheet.setRowGroups(rowGroups);
        }

        if (!columnGroups.isEmpty()) {
            sheet.setColumnGroups(columnGroups);
        }

        if (!slicers.isEmpty()) {
            sheet.setSlicers(slicers);
        }

        return sheet;
    }

    //
    // Accessor Methods
    //

    public void setProperties(SheetProperties properties) {
        this.properties = properties;
    }

    public void setData(List<GridData> data) {
        this.data = data;
    }

    public void addData(GridData data) {
        this.data.add(data);
    }

    public void removeData(GridData data) {
        this.data.remove(data);
    }

    public void setMerges(List<GridRange> merges) {
        this.merges = merges;
    }

    public void addMerge(GridRange merge) {
        this.merges.add(merge);
    }

    public void removeMerge(GridRange merge) {
        this.merges.remove(merge);
    }

    public void setConditionalFormats(List<ConditionalFormatRule> conditionalFormats) {
        this.conditionalFormats = conditionalFormats;
    }

    public void addConditionalFormat(ConditionalFormatRule conditionalFormat) {
        this.conditionalFormats.add(conditionalFormat);
    }

    public void removeConditionalFormat(ConditionalFormatRule conditionalFormat) {
        this.conditionalFormats.remove(conditionalFormat);
    }

    public void setFilterViews(List<FilterView> filterViews) {
        this.filterViews = filterViews;
    }

    public void addFilterView(FilterView filterView) {
        this.filterViews.add(filterView);
    }

    public void removeFilterView(FilterView filterView) {
        this.filterViews.remove(filterView);
    }

    public void setProtectedRanges(List<ProtectedRange> protectedRanges) {
        this.protectedRanges = protectedRanges;
    }

    public void addProtectedRange(ProtectedRange protectedRange) {
        this.protectedRanges.add(protectedRange);
    }

    public void removeProtectedRange(ProtectedRange protectedRange) {
        this.protectedRanges.remove(protectedRange);
    }

    public void setBasicFilter(BasicFilter basicFilter) {
        this.basicFilter = basicFilter;
    }

    public void setCharts(List<EmbeddedChart> charts) {
        this.charts = charts;
    }

    public void addChart(EmbeddedChart chart) {
        this.charts.add(chart);
    }

    public void removeChart(EmbeddedChart chart) {
        this.charts.remove(chart);
    }

    public void setBandedRanges(List<BandedRange> bandedRanges) {
        this.bandedRanges = bandedRanges;
    }

    public void addBandedRange(BandedRange bandedRange) {
        this.bandedRanges.add(bandedRange);
    }

    public void removeBandedRange(BandedRange bandedRange) {
        this.bandedRanges.remove(bandedRange);
    }

    public void setDeveloperMetadata(List<DeveloperMetadata> developerMetadata) {
        this.developerMetadata = developerMetadata;
    }

    public void addDeveloperMetadata(DeveloperMetadata developerMetadata) {
        this.developerMetadata.add(developerMetadata);
    }

    public void removeDeveloperMetadata(DeveloperMetadata developerMetadata) {
        this.developerMetadata.remove(developerMetadata);
    }

    public void setRowGroups(List<DimensionGroup> rowGroups) {
        this.rowGroups = rowGroups;
    }

    public void addRowGroups(DimensionGroup rowGroup) {
        this.rowGroups.add(rowGroup);
    }

    public void removeRowGroups(DimensionGroup rowGroup) {
        this.rowGroups.remove(rowGroup);
    }

    public void setColumnGroups(List<DimensionGroup> columnGroups) {
        this.columnGroups = columnGroups;
    }

    public void addColumnGroups(DimensionGroup columnGroup) {
        this.columnGroups.add(columnGroup);
    }

    public void removeColumnGroups(DimensionGroup columnGroup) {
        this.columnGroups.remove(columnGroup);
    }

    public void setSlicers(List<Slicer> slicers) {
        this.slicers = slicers;
    }

    public void addSlicers(Slicer slicer) {
        this.slicers.add(slicer);
    }

    public void removeSlicers(Slicer slicer) {
        this.slicers.remove(slicer);
    }
}
