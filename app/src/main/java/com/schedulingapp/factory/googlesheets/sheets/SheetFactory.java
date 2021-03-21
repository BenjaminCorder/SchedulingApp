package com.schedulingapp.factory.googlesheets.sheets;

import com.google.api.services.sheets.v4.model.BandedRange;
import com.google.api.services.sheets.v4.model.BasicFilter;
import com.google.api.services.sheets.v4.model.Border;
import com.google.api.services.sheets.v4.model.Borders;
import com.google.api.services.sheets.v4.model.CellData;
import com.google.api.services.sheets.v4.model.Color;
import com.google.api.services.sheets.v4.model.ConditionalFormatRule;
import com.google.api.services.sheets.v4.model.DeveloperMetadata;
import com.google.api.services.sheets.v4.model.DimensionGroup;
import com.google.api.services.sheets.v4.model.EmbeddedChart;
import com.google.api.services.sheets.v4.model.ExtendedValue;
import com.google.api.services.sheets.v4.model.FilterView;
import com.google.api.services.sheets.v4.model.GridData;
import com.google.api.services.sheets.v4.model.GridRange;
import com.google.api.services.sheets.v4.model.ProtectedRange;
import com.google.api.services.sheets.v4.model.RowData;
import com.google.api.services.sheets.v4.model.Sheet;
import com.google.api.services.sheets.v4.model.SheetProperties;
import com.google.api.services.sheets.v4.model.Slicer;
import com.schedulingapp.R;
import com.schedulingapp.factory.Factory;
import com.schedulingapp.factory.googlesheets.cells.BorderFactory;
import com.schedulingapp.factory.googlesheets.cells.BordersFactory;
import com.schedulingapp.factory.googlesheets.cells.CellDataFactory;
import com.schedulingapp.factory.googlesheets.cells.CellFormatFactory;
import com.schedulingapp.factory.googlesheets.cells.NumberFormatFactory;
import com.schedulingapp.factory.googlesheets.charts.EmbeddedChartFactory;
import com.schedulingapp.factory.googlesheets.other.ColorFactory;
import com.schedulingapp.factory.googlesheets.other.ErrorValueFactory;
import com.schedulingapp.factory.googlesheets.other.ExtendedValueFactory;
import com.schedulingapp.factory.googlesheets.other.GridRangeFactory;
import com.schedulingapp.factory.googlesheets.other.TextFormatFactory;
import com.schedulingapp.misc.ErrorValue;
import com.schedulingapp.misc.Formula;
import com.schedulingapp.model.schedule.Cell;
import com.schedulingapp.model.schedule.Schedule;

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
    private List<ProtectedRange> protectedRanges;
    private BasicFilter basicFilter;
    private List<EmbeddedChart> charts;
    private List<BandedRange> bandedRanges;
    private List<DeveloperMetadata> developerMetadata;
    private List<DimensionGroup> rowGroups;
    private List<DimensionGroup> columnGroups;
    private List<Slicer> slicers;

    private SheetPropertiesFactory propertiesFactory;
    private List<GridDataFactory> dataFactories;
    private List<GridRangeFactory> mergeFactories;
    private List<ConditionalFormatRuleFactory> conditionalFormatFactories;
    private List<FilterViewFactory> filterViewFactories;
    private List<ProtectedRangeFactory> protectedRangeFactories;
    private BasicFilterFactory basicFilterFactory;
    private List<EmbeddedChartFactory> chartFactories;
    private List<Factory> bandedRangeFactories; // TODO Create BandedRangeFactory
    private List<Factory> developerMetadataFactories; // TODO Create DeveloperMetadataFactory
    private List<Factory> rowGroupFactories;
    private List<Factory> columnGroupFactories;
    private List<Factory> slicerFactories; // TODO Create SlicerFactory

    private List<List<RowDataFactory>> rowDataFactories;
    private List<List<List<CellDataFactory>>> valueFactories;
    private List<List<List<CellFormatFactory>>> cellFormatFactories;
    private List<List<List<ExtendedValueFactory>>> extendedValueFactories;
    private List<List<List<ErrorValueFactory>>> errorValueFactories;
    private List<List<List<NumberFormatFactory>>> numberFormatFactories;
    private List<List<List<ColorFactory>>> backgroundColorFactories;
    private List<List<List<BordersFactory>>> bordersFactories;
    private List<List<List<List<BorderFactory>>>> borderFactoriesList;
    private List<List<List<List<ColorFactory>>>> borderColorFactories;
    private List<List<List<TextFormatFactory>>> textFormatFactory;


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

        propertiesFactory = new SheetPropertiesFactory();
        dataFactories = new ArrayList<>();
        mergeFactories = new ArrayList<>();
        conditionalFormatFactories = new ArrayList<>();
        filterViewFactories = new ArrayList<>();
        protectedRangeFactories = new ArrayList<>();
        basicFilterFactory = new BasicFilterFactory();
        chartFactories = new ArrayList<>();
        bandedRangeFactories = new ArrayList<>();
        developerMetadataFactories = new ArrayList<>();
        rowGroupFactories = new ArrayList<>();
        columnGroupFactories = new ArrayList<>();
        slicerFactories = new ArrayList<>();

        rowDataFactories = new ArrayList<>();
        valueFactories = new ArrayList<>();
    }
    @Override
    public Sheet build() {
        // Declare Variables
        Sheet sheet = new Sheet();

        // Build Uninitialized Member Variables
        properties = propertiesFactory.build();

        for (int i = 0; i < dataFactories.size(); i++) {
            List<RowData> rowDataList = new ArrayList<>();
            for (int j = 0; j < rowDataFactories.get(i).size(); j++) {
                List<CellData> cellDataList = new ArrayList<>();
                for (int k = 0; k < valueFactories.get(i).get(j).size(); k++) {
                    extendedValueFactories
                            .get(i)
                            .get(j)
                            .get(k)
                            .setErrorValue(
                                    errorValueFactories
                                            .get(i)
                                            .get(j)
                                            .get(k)
                                            .build()
                            );

                    valueFactories
                            .get(i)
                            .get(j)
                            .get(k)
                            .setUserEnteredValue(
                                    extendedValueFactories
                                            .get(i)
                                            .get(j)
                                            .get(k)
                                            .build()
                            );

                    cellFormatFactories
                            .get(i)
                            .get(j)
                            .get(k)
                            .setNumberFormat(
                                    numberFormatFactories
                                            .get(i)
                                            .get(j)
                                            .get(k)
                                            .build()
                            );

                    cellFormatFactories
                            .get(i)
                            .get(j)
                            .get(k)
                            .setBackgroundColor(
                                    backgroundColorFactories
                                            .get(i)
                                            .get(j)
                                            .get(k)
                                            .build()
                            );

                    borderFactoriesList
                            .get(i)
                            .get(j)
                            .get(k)
                            .get(0)
                            .setColor(
                                    borderColorFactories
                                            .get(i)
                                            .get(j)
                                            .get(k)
                                            .get(0)
                                            .build()
                            );

                    borderFactoriesList
                            .get(i)
                            .get(j)
                            .get(k)
                            .get(1)
                            .setColor(
                                    borderColorFactories
                                            .get(i)
                                            .get(j)
                                            .get(k)
                                            .get(1)
                                            .build()
                            );

                    borderFactoriesList
                            .get(i)
                            .get(j)
                            .get(k)
                            .get(2)
                            .setColor(
                                    borderColorFactories
                                            .get(i)
                                            .get(j)
                                            .get(k)
                                            .get(2)
                                            .build()
                            );

                    borderFactoriesList
                            .get(i)
                            .get(j)
                            .get(k)
                            .get(3)
                            .setColor(
                                    borderColorFactories
                                            .get(i)
                                            .get(j)
                                            .get(k)
                                            .get(3)
                                            .build()
                            );


                    bordersFactories
                            .get(i)
                            .get(j)
                            .get(k)
                            .setTop(
                                    borderFactoriesList
                                            .get(i)
                                            .get(j)
                                            .get(k)
                                            .get(0)
                                            .build()
                            );

                    bordersFactories
                            .get(i)
                            .get(j)
                            .get(k)
                            .setBottom(
                                    borderFactoriesList
                                            .get(i)
                                            .get(j)
                                            .get(k)
                                            .get(1)
                                            .build()
                            );

                    bordersFactories
                            .get(i)
                            .get(j)
                            .get(k)
                            .setRight(
                                    borderFactoriesList
                                            .get(i)
                                            .get(j)
                                            .get(k)
                                            .get(2)
                                            .build()
                            );

                    bordersFactories
                            .get(i)
                            .get(j)
                            .get(k)
                            .setLeft(
                                    borderFactoriesList
                                            .get(i)
                                            .get(j)
                                            .get(k)
                                            .get(3)
                                            .build()
                            );

                    cellFormatFactories
                            .get(i)
                            .get(j)
                            .get(k)
                            .setBorders(
                                    bordersFactories
                                            .get(i)
                                            .get(j)
                                            .get(k)
                                            .build()
                            );

                    cellFormatFactories
                            .get(i)
                            .get(j)
                            .get(k)
                            .setTextFormat(
                                    textFormatFactory
                                            .get(i)
                                            .get(j)
                                            .get(k)
                                            .build()
                            );

                    valueFactories
                            .get(i)
                            .get(j)
                            .get(k)
                            .setUserEnteredFormat(
                                    cellFormatFactories
                                            .get(i)
                                            .get(j)
                                            .get(k)
                                            .build()
                            );

                    cellDataList.add(valueFactories
                            .get(i)
                            .get(j)
                            .get(k)
                            .build()
                    );
                }

                rowDataFactories
                        .get(i)
                        .get(j)
                        .setValues(cellDataList);

                rowDataList
                        .add(
                                rowDataFactories
                                        .get(i)
                                        .get(j)
                                        .build()
                        );
            }

            dataFactories
                    .get(i)
                    .setRowData(rowDataList);
        }

        for(GridDataFactory dataFactory : dataFactories) {
            data.add(dataFactory.build());
        }

        for(GridRangeFactory gridRangeFactory : mergeFactories) {
            merges.add(gridRangeFactory.build());
        }

        for(ConditionalFormatRuleFactory conditionalFormatRuleFactory :
                conditionalFormatFactories) {
            conditionalFormats.add(conditionalFormatRuleFactory.build());
        }

        for(FilterViewFactory filterViewFactory : filterViewFactories) {
            filterViews.add(filterViewFactory.build());
        }

        for(ProtectedRangeFactory protectedRangeFactory : protectedRangeFactories) {
            protectedRanges.add(protectedRangeFactory.build());
        }

        basicFilter = basicFilterFactory.build();

        for(EmbeddedChartFactory embeddedChartFactory : chartFactories) {
            charts.add(embeddedChartFactory.build());
        }

//        if (bandedRanges.isEmpty()) {
//            for(GridDataFactory) {
//                bandedRanges.add(gridDataFactory.build());
//            }
//        }

//        if (developerMetadata.isEmpty()) {
//            for(GridDataFactory) {
//                developerMetadata.add(gridDataFactory.build());
//            }
//        }

//        if (rowGroups.isEmpty()) {
//            for(GridDataFactory) {
//                rowGroups.add(gridDataFactory.build());
//            }
//        }

//        if (columnGroups.isEmpty()) {
//            for(GridDataFactory) {
//                columnGroups.add(gridDataFactory.build());
//            }
//        }

//        if (slicers.isEmpty()) {
//            for(GridDataFactory) {
//                slicers.add(gridDataFactory.build());
//            }
//        }

        // Format sheet
        sheet
                .setProperties(properties)
                .setData(data)
                .setMerges(merges)
                .setConditionalFormats(conditionalFormats)
                .setFilterViews(filterViews)
                .setProtectedRanges(protectedRanges)
                .setBasicFilter(basicFilter)
                .setCharts(charts)
                .setBandedRanges(bandedRanges)
                .setDeveloperMetadata(developerMetadata)
                .setRowGroups(rowGroups)
                .setColumnGroups(columnGroups)
                .setSlicers(slicers);

        return sheet;
    }

    //
    // Builder Methods
    //

    public SheetFactory properties(SheetProperties properties) {
        this.properties = properties;
        return this;
    }

    public SheetFactory basicFilter(BasicFilter basicFilter) {
        this.basicFilter = basicFilter;
        return this;
    }

    //
    // Builder Methods for lowest level data types
    //

    public SheetFactory propertiesSheetId(Integer sheetId) {
        propertiesFactory.setSheetId(sheetId);
        return this;
    }

    public SheetFactory propertiesTitle(String title) {
        propertiesFactory.setTitle(title);
        return this;
    }

    public SheetFactory propertiesIndex(Integer index) {
        propertiesFactory.setIndex(index);
        return this;
    }

    public SheetFactory dataStartRow(Integer dataStartRow,
                                     int dataIndex) {
        verifyDataIndex(dataIndex);
        dataFactories.get(dataIndex).setStartRow(dataStartRow);
        return this;
    }

    public SheetFactory dataStartColumn(Integer dataStartColumn,
                                        int dataIndex) {
        verifyDataIndex(dataIndex);
        dataFactories.get(dataIndex).setStartColumn(dataStartColumn);
        return this;
    }

    public SheetFactory dataRowDataValuesUserEnteredValue(Object value,
                                                          int dataIndex,
                                                          int rowDataIndex,
                                                          int valuesIndex) {
        verifyValuesIndex(dataIndex, rowDataIndex, valuesIndex);
        return this;
    }

    public SheetFactory dataRowDataValuesUserEnteredValue(Double doubleValue,
                                                          int dataIndex,
                                                          int rowDataIndex,
                                                          int valuesIndex) {
        verifyValuesIndex(dataIndex, rowDataIndex, valuesIndex);
        extendedValueFactories.get(dataIndex).get(rowDataIndex).get(valuesIndex)
                .setNumberValue(doubleValue);
        return this;
    }

    public SheetFactory dataRowDataValuesUserEnteredValue(String stringValue,
                                                          int dataIndex,
                                                          int rowDataIndex,
                                                          int valuesIndex) {
        verifyValuesIndex(dataIndex, rowDataIndex, valuesIndex);
        extendedValueFactories.get(dataIndex).get(rowDataIndex).get(valuesIndex)
                .setStringValue(stringValue);
        return this;
    }

    public SheetFactory dataRowDataValuesUserEnteredValue(Boolean booleanValue,
                                                          int dataIndex,
                                                          int rowDataIndex,
                                                          int valuesIndex) {
        verifyValuesIndex(dataIndex, rowDataIndex, valuesIndex);
        extendedValueFactories.get(dataIndex).get(rowDataIndex).get(valuesIndex)
                .setBoolValue(booleanValue);
        return this;
    }

    public SheetFactory dataRowDataValuesUserEnteredValue(Formula formulaValue,
                                                          int dataIndex,
                                                          int rowDataIndex,
                                                          int valuesIndex) {
        verifyValuesIndex(dataIndex, rowDataIndex, valuesIndex);
        extendedValueFactories.get(dataIndex).get(rowDataIndex).get(valuesIndex)
                .setFormulaValue(formulaValue.getFormula());
        return this;
    }

    public SheetFactory dataRowDataValuesUserEnteredValue(ErrorValue errorValue,
                                                          int dataIndex,
                                                          int rowDataIndex,
                                                          int valuesIndex) {
        verifyValuesIndex(dataIndex, rowDataIndex, valuesIndex);
        errorValueFactories.get(dataIndex).get(rowDataIndex).get(valuesIndex)
                .setMessage(errorValue.getMessage());
        errorValueFactories.get(dataIndex).get(rowDataIndex).get(valuesIndex)
                .setType(errorValue.getType().getValue());
        return this;
    }

    public SheetFactory dataRowDataValuesUserEnteredFormatNumberFormatType(
            String numberFormatType,
            int dataIndex,
            int rowDataIndex,
            int valuesIndex) {
        verifyValuesIndex(dataIndex, rowDataIndex, valuesIndex);
        numberFormatFactories.get(dataIndex).get(rowDataIndex).get(valuesIndex)
                .setType(numberFormatType);
        return this;
    }

    public SheetFactory dataRowDataValuesUserEnteredFormatBackgroundColorRed(
            Float red,
            int dataIndex,
            int rowDataIndex,
            int valuesIndex) {
        verifyValuesIndex(dataIndex, rowDataIndex, valuesIndex);
        backgroundColorFactories.get(dataIndex).get(rowDataIndex).get(valuesIndex)
                .setRed(red);
        return this;
    }

    public SheetFactory dataRowDataValuesUserEnteredFormatBackgroundColorGreen(
            Float green,
            int dataIndex,
            int rowDataIndex,
            int valuesIndex) {
        verifyValuesIndex(dataIndex, rowDataIndex, valuesIndex);
        backgroundColorFactories.get(dataIndex).get(rowDataIndex).get(valuesIndex)
                .setRed(green);
        return this;
    }

    public SheetFactory dataRowDataValuesUserEnteredFormatBackgroundColorBlue(
            Float blue,
            int dataIndex,
            int rowDataIndex,
            int valuesIndex) {
        verifyValuesIndex(dataIndex, rowDataIndex, valuesIndex);
        backgroundColorFactories.get(dataIndex).get(rowDataIndex).get(valuesIndex)
                .setRed(blue);
        return this;
    }

    public SheetFactory dataRowDataValuesUserEnteredFormatBackgroundColorAlpha(
            Float alpha,
            int dataIndex,
            int rowDataIndex,
            int valuesIndex) {
        verifyValuesIndex(dataIndex, rowDataIndex, valuesIndex);
        backgroundColorFactories.get(dataIndex).get(rowDataIndex).get(valuesIndex)
                .setRed(alpha);
        return this;
    }

    public SheetFactory dataRowDataValuesUserEnteredFormatBordersStyleTop(
            String style,
            int dataIndex,
            int rowDataIndex,
            int valuesIndex) {
        verifyValuesIndex(dataIndex, rowDataIndex, valuesIndex);
        borderFactoriesList.get(dataIndex).get(rowDataIndex).get(valuesIndex).get(0)
                .setStyle(style);
        return this;
    }

    public SheetFactory dataRowDataValuesUserEnteredFormatBordersStyleBottom(
            String style,
            int dataIndex,
            int rowDataIndex,
            int valuesIndex) {
        verifyValuesIndex(dataIndex, rowDataIndex, valuesIndex);
        borderFactoriesList.get(dataIndex).get(rowDataIndex).get(valuesIndex).get(1)
                .setStyle(style);
        return this;
    }

    public SheetFactory dataRowDataValuesUserEnteredFormatBordersStyleRight(
            String style,
            int dataIndex,
            int rowDataIndex,
            int valuesIndex) {
        verifyValuesIndex(dataIndex, rowDataIndex, valuesIndex);
        borderFactoriesList.get(dataIndex).get(rowDataIndex).get(valuesIndex).get(2)
                .setStyle(style);
        return this;
    }

    public SheetFactory dataRowDataValuesUserEnteredFormatBordersStyleLeft(
            String style,
            int dataIndex,
            int rowDataIndex,
            int valuesIndex) {
        verifyValuesIndex(dataIndex, rowDataIndex, valuesIndex);
        borderFactoriesList.get(dataIndex).get(rowDataIndex).get(valuesIndex).get(3)
                .setStyle(style);
        return this;
    }

    public SheetFactory dataRowDataValuesUserEnteredFormatBordersColorTopRed(
            Float red,
            int dataIndex,
            int rowDataIndex,
            int valuesIndex) {
        verifyValuesIndex(dataIndex, rowDataIndex, valuesIndex);
        borderColorFactories.get(dataIndex).get(rowDataIndex).get(valuesIndex).get(0)
                .setRed(red);
        return this;
    }

    public SheetFactory dataRowDataValuesUserEnteredFormatBordersColorTopGreen(
            Float green,
            int dataIndex,
            int rowDataIndex,
            int valuesIndex) {
        verifyValuesIndex(dataIndex, rowDataIndex, valuesIndex);
        borderColorFactories.get(dataIndex).get(rowDataIndex).get(valuesIndex).get(0)
                .setRed(green);
        return this;
    }

    public SheetFactory dataRowDataValuesUserEnteredFormatBordersColorTopBlue(
            Float blue,
            int dataIndex,
            int rowDataIndex,
            int valuesIndex) {
        verifyValuesIndex(dataIndex, rowDataIndex, valuesIndex);
        borderColorFactories.get(dataIndex).get(rowDataIndex).get(valuesIndex).get(0)
                .setRed(blue);
        return this;
    }

    public SheetFactory dataRowDataValuesUserEnteredFormatBordersColorTopAlpha(
            Float alpha,
            int dataIndex,
            int rowDataIndex,
            int valuesIndex) {
        verifyValuesIndex(dataIndex, rowDataIndex, valuesIndex);
        borderColorFactories.get(dataIndex).get(rowDataIndex).get(valuesIndex).get(0)
                .setRed(alpha);
        return this;
    }

    public SheetFactory dataRowDataValuesUserEnteredFormatBordersColorBottomRed(
            Float red,
            int dataIndex,
            int rowDataIndex,
            int valuesIndex) {
        verifyValuesIndex(dataIndex, rowDataIndex, valuesIndex);
        borderColorFactories.get(dataIndex).get(rowDataIndex).get(valuesIndex).get(1)
                .setRed(red);
        return this;
    }

    public SheetFactory dataRowDataValuesUserEnteredFormatBordersColorBottomGreen(
            Float green,
            int dataIndex,
            int rowDataIndex,
            int valuesIndex) {
        verifyValuesIndex(dataIndex, rowDataIndex, valuesIndex);
        borderColorFactories.get(dataIndex).get(rowDataIndex).get(valuesIndex).get(1)
                .setRed(green);
        return this;
    }

    public SheetFactory dataRowDataValuesUserEnteredFormatBordersColorBottomBlue(
            Float blue,
            int dataIndex,
            int rowDataIndex,
            int valuesIndex) {
        verifyValuesIndex(dataIndex, rowDataIndex, valuesIndex);
        borderColorFactories.get(dataIndex).get(rowDataIndex).get(valuesIndex).get(1)
                .setRed(blue);
        return this;
    }

    public SheetFactory dataRowDataValuesUserEnteredFormatBordersColorBottomAlpha(
            Float alpha,
            int dataIndex,
            int rowDataIndex,
            int valuesIndex) {
        verifyValuesIndex(dataIndex, rowDataIndex, valuesIndex);
        borderColorFactories.get(dataIndex).get(rowDataIndex).get(valuesIndex).get(1)
                .setRed(alpha);
        return this;
    }

    public SheetFactory dataRowDataValuesUserEnteredFormatBordersColorRightRed(
            Float red,
            int dataIndex,
            int rowDataIndex,
            int valuesIndex) {
        verifyValuesIndex(dataIndex, rowDataIndex, valuesIndex);
        borderColorFactories.get(dataIndex).get(rowDataIndex).get(valuesIndex).get(2)
                .setRed(red);
        return this;
    }

    public SheetFactory dataRowDataValuesUserEnteredFormatBordersColorRightGreen(
            Float green,
            int dataIndex,
            int rowDataIndex,
            int valuesIndex) {
        verifyValuesIndex(dataIndex, rowDataIndex, valuesIndex);
        borderColorFactories.get(dataIndex).get(rowDataIndex).get(valuesIndex).get(2)
                .setRed(green);
        return this;
    }

    public SheetFactory dataRowDataValuesUserEnteredFormatBordersColorRightBlue(
            Float blue,
            int dataIndex,
            int rowDataIndex,
            int valuesIndex) {
        verifyValuesIndex(dataIndex, rowDataIndex, valuesIndex);
        borderColorFactories.get(dataIndex).get(rowDataIndex).get(valuesIndex).get(2)
                .setRed(blue);
        return this;
    }

    public SheetFactory dataRowDataValuesUserEnteredFormatBordersColorRightAlpha(
            Float alpha,
            int dataIndex,
            int rowDataIndex,
            int valuesIndex) {
        verifyValuesIndex(dataIndex, rowDataIndex, valuesIndex);
        borderColorFactories.get(dataIndex).get(rowDataIndex).get(valuesIndex).get(2)
                .setRed(alpha);
        return this;
    }

    public SheetFactory dataRowDataValuesUserEnteredFormatBordersColorLeftRed(
            Float red,
            int dataIndex,
            int rowDataIndex,
            int valuesIndex) {
        verifyValuesIndex(dataIndex, rowDataIndex, valuesIndex);
        borderColorFactories.get(dataIndex).get(rowDataIndex).get(valuesIndex).get(3)
                .setRed(red);
        return this;
    }

    public SheetFactory dataRowDataValuesUserEnteredFormatBordersColorLeftGreen(
            Float green,
            int dataIndex,
            int rowDataIndex,
            int valuesIndex) {
        verifyValuesIndex(dataIndex, rowDataIndex, valuesIndex);
        borderColorFactories.get(dataIndex).get(rowDataIndex).get(valuesIndex).get(3)
                .setRed(green);
        return this;
    }

    public SheetFactory dataRowDataValuesUserEnteredFormatBordersColorLeftBlue(
            Float blue,
            int dataIndex,
            int rowDataIndex,
            int valuesIndex) {
        verifyValuesIndex(dataIndex, rowDataIndex, valuesIndex);
        borderColorFactories.get(dataIndex).get(rowDataIndex).get(valuesIndex).get(3)
                .setRed(blue);
        return this;
    }

    public SheetFactory dataRowDataValuesUserEnteredFormatBordersColorLeftAlpha(
            Float alpha,
            int dataIndex,
            int rowDataIndex,
            int valuesIndex) {
        verifyValuesIndex(dataIndex, rowDataIndex, valuesIndex);
        borderColorFactories.get(dataIndex).get(rowDataIndex).get(valuesIndex).get(3)
                .setRed(alpha);
        return this;
    }

    public SheetFactory dataRowDataValuesUserEnteredFormatHorizontalAlign(
            String horizontalAlign,
            int dataIndex,
            int rowDataIndex,
            int valuesIndex) {
        verifyValuesIndex(dataIndex, rowDataIndex, valuesIndex);
        cellFormatFactories.get(dataIndex).get(rowDataIndex).get(valuesIndex)
                .setHorizontalAlignment(horizontalAlign);
        return this;
    }

    public SheetFactory dataRowDataValuesUserEnteredFormatVerticalAlign(
            String verticalAlign,
            int dataIndex,
            int rowDataIndex,
            int valuesIndex) {
        verifyValuesIndex(dataIndex, rowDataIndex, valuesIndex);
        cellFormatFactories.get(dataIndex).get(rowDataIndex).get(valuesIndex)
                .setVerticalAlignment(verticalAlign);
        return this;
    }

    public SheetFactory dataRowDataValuesUserEnteredFormatTextFormatFontFamily(
            String fontFamily,
            int dataIndex,
            int rowDataIndex,
            int valuesIndex) {
        verifyValuesIndex(dataIndex, rowDataIndex, valuesIndex);
        textFormatFactory.get(dataIndex).get(rowDataIndex).get(valuesIndex)
                .setFontFamily(fontFamily);
        return this;
    }

    public SheetFactory dataRowDataValuesUserEnteredFormatTextFormatFontSize(
            Integer fontSize,
            int dataIndex,
            int rowDataIndex,
            int valuesIndex) {
        verifyValuesIndex(dataIndex, rowDataIndex, valuesIndex);
        textFormatFactory.get(dataIndex).get(rowDataIndex).get(valuesIndex)
                .setFontSize(fontSize);
        return this;
    }

    public SheetFactory dataRowDataValuesUserEnteredFormatTextFormatBold(
            Boolean bold,
            int dataIndex,
            int rowDataIndex,
            int valuesIndex) {
        verifyValuesIndex(dataIndex, rowDataIndex, valuesIndex);
        textFormatFactory.get(dataIndex).get(rowDataIndex).get(valuesIndex)
                .setBold(bold);
        return this;
    }

    public SheetFactory dataRowDataValuesUserEnteredFormatTextFormatItalic(
            Boolean italic,
            int dataIndex,
            int rowDataIndex,
            int valuesIndex) {
        verifyValuesIndex(dataIndex, rowDataIndex, valuesIndex);
        textFormatFactory.get(dataIndex).get(rowDataIndex).get(valuesIndex)
                .setItalic(italic);
        return this;
    }

    public SheetFactory dataRowDataValuesUserEnteredFormatTextFormatStrikethrough(
            Boolean strikethrough,
            int dataIndex,
            int rowDataIndex,
            int valuesIndex) {
        verifyValuesIndex(dataIndex, rowDataIndex, valuesIndex);
        textFormatFactory.get(dataIndex).get(rowDataIndex).get(valuesIndex)
                .setStrikethrough(strikethrough);
        return this;
    }

    public SheetFactory dataRowDataValuesUserEnteredFormatTextFormatUnderline(
            Boolean underline,
            int dataIndex,
            int rowDataIndex,
            int valuesIndex) {
        verifyValuesIndex(dataIndex, rowDataIndex, valuesIndex);
        textFormatFactory.get(dataIndex).get(rowDataIndex).get(valuesIndex)
                .setUnderline(underline);
        return this;
    }

    public SheetFactory mergesStartRowIndex(Integer mergesStartRowIndex,
                                            int mergesIndex) {
        mergeFactories.get(mergesIndex).setStartRowIndex(mergesStartRowIndex);
        return this;
    }

    public SheetFactory mergesEndRowIndex(Integer mergesEndRowIndex,
                                          int mergesIndex) {
        mergeFactories.get(mergesIndex).setStartRowIndex(mergesEndRowIndex);
        return this;
    }

    public SheetFactory mergesStartColumnIndex(Integer mergesStartColumnIndex,
                                               int mergesIndex) {
        mergeFactories.get(mergesIndex).setStartRowIndex(mergesStartColumnIndex);
        return this;
    }

    public SheetFactory mergesEndColumnIndex(Integer mergesEndColumnIndex,
                                             int mergesIndex) {
        mergeFactories.get(mergesIndex).setStartRowIndex(mergesEndColumnIndex);
        return this;
    }

    //
    // Private Methods
    //

    private void verifyDataIndex(int dataIndex) {
        while (dataFactories.size() - 1 < dataIndex) {
            dataFactories.add(new GridDataFactory());
            rowDataFactories.add(new ArrayList<>());
            valueFactories.add(new ArrayList<>());
            cellFormatFactories.add(new ArrayList<>());
            extendedValueFactories.add(new ArrayList<>());
            numberFormatFactories.add(new ArrayList<>());
            backgroundColorFactories.add(new ArrayList<>());
            bordersFactories.add(new ArrayList<>());
            borderFactoriesList.get(0)
                    .add(new ArrayList<>());
            borderFactoriesList.get(1)
                    .add(new ArrayList<>());
            borderFactoriesList.get(2)
                    .add(new ArrayList<>());
            borderFactoriesList.get(3)
                    .add(new ArrayList<>());
            borderColorFactories.get(0)
                    .add(new ArrayList<>());
            borderColorFactories.get(1)
                    .add(new ArrayList<>());
            borderColorFactories.get(2)
                    .add(new ArrayList<>());
            borderColorFactories.get(3)
                    .add(new ArrayList<>());
            textFormatFactory.add(new ArrayList<>());
        }
    }

    private void verifyRowDataIndex(int dataIndex, int rowDataIndex) {
        verifyDataIndex(dataIndex);
        while (rowDataFactories.size() - 1 < rowDataIndex) {
            rowDataFactories.get(dataIndex)
                    .add(new RowDataFactory());
            valueFactories.get(dataIndex)
                    .add(new ArrayList<>());
            cellFormatFactories.get(dataIndex)
                    .add(new ArrayList<>());
            extendedValueFactories.get(dataIndex)
                    .add(new ArrayList<>());
            numberFormatFactories.get(dataIndex)
                    .add(new ArrayList<>());
            backgroundColorFactories.get(dataIndex)
                    .add(new ArrayList<>());
            bordersFactories.get(dataIndex)
                    .add(new ArrayList<>());
            borderFactoriesList.get(dataIndex)
                    .get(0)
                    .add(new ArrayList<>());
            borderFactoriesList.get(dataIndex)
                    .get(1)
                    .add(new ArrayList<>());
            borderFactoriesList.get(dataIndex)
                    .get(2)
                    .add(new ArrayList<>());
            borderFactoriesList.get(dataIndex)
                    .get(3)
                    .add(new ArrayList<>());
            borderColorFactories.get(dataIndex)
                    .get(0)
                    .add(new ArrayList<>());
            borderColorFactories.get(dataIndex)
                    .get(1)
                    .add(new ArrayList<>());
            borderColorFactories.get(dataIndex)
                    .get(2)
                    .add(new ArrayList<>());
            borderColorFactories.get(dataIndex)
                    .get(3)
                    .add(new ArrayList<>());
            textFormatFactory.get(dataIndex)
                    .add(new ArrayList<>());
        }
    }

    private void verifyValuesIndex(int dataIndex, int rowDataIndex, int valuesIndex) {
        verifyRowDataIndex(dataIndex, rowDataIndex);
        while (valueFactories.size() - 1 < valuesIndex) {
            valueFactories.get(dataIndex)
                    .get(rowDataIndex)
                    .add(new CellDataFactory());
            cellFormatFactories.get(dataIndex)
                    .get(rowDataIndex)
                    .add(new CellFormatFactory());
            extendedValueFactories.get(dataIndex)
                    .get(rowDataIndex)
                    .add(new ExtendedValueFactory());
            numberFormatFactories.get(dataIndex)
                    .get(rowDataIndex)
                    .add(new NumberFormatFactory());
            backgroundColorFactories.get(dataIndex)
                    .get(rowDataIndex)
                    .add(new ColorFactory());
            bordersFactories.get(dataIndex)
                    .get(rowDataIndex)
                    .add(new BordersFactory());
            borderFactoriesList.get(dataIndex)
                    .get(rowDataIndex)
                    .get(0)
                    .add(new BorderFactory());
            borderFactoriesList.get(dataIndex)
                    .get(rowDataIndex)
                    .get(1)
                    .add(new BorderFactory());
            borderFactoriesList.get(dataIndex)
                    .get(rowDataIndex)
                    .get(2)
                    .add(new BorderFactory());
            borderFactoriesList.get(dataIndex)
                    .get(rowDataIndex)
                    .get(3)
                    .add(new BorderFactory());
            borderColorFactories.get(dataIndex)
                    .get(rowDataIndex)
                    .get(0)
                    .add(new ColorFactory());
            borderColorFactories.get(dataIndex)
                    .get(rowDataIndex)
                    .get(1)
                    .add(new ColorFactory());
            borderColorFactories.get(dataIndex)
                    .get(rowDataIndex)
                    .get(2)
                    .add(new ColorFactory());
            borderColorFactories.get(dataIndex)
                    .get(rowDataIndex)
                    .get(3)
                    .add(new ColorFactory());
            textFormatFactory.get(dataIndex)
                    .get(rowDataIndex)
                    .add(new TextFormatFactory());
        }
    }
}
