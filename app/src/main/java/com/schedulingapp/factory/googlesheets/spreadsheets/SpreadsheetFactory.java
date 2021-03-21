package com.schedulingapp.factory.googlesheets.spreadsheets;

import com.google.api.services.sheets.v4.model.CellFormat;
import com.google.api.services.sheets.v4.model.DeveloperMetadata;
import com.google.api.services.sheets.v4.model.IterativeCalculationSettings;
import com.google.api.services.sheets.v4.model.NamedRange;
import com.google.api.services.sheets.v4.model.Sheet;
import com.google.api.services.sheets.v4.model.Spreadsheet;
import com.google.api.services.sheets.v4.model.SpreadsheetProperties;
import com.google.api.services.sheets.v4.model.SpreadsheetTheme;
import com.schedulingapp.factory.Factory;
import com.schedulingapp.factory.googlesheets.sheets.SheetFactory;

import java.util.ArrayList;
import java.util.List;

public final class SpreadsheetFactory implements Factory<Spreadsheet> {
    //
    // Fields
    //

    private String spreadsheetId;
    private SpreadsheetProperties properties;
    private List<Sheet> sheets;
    private List<NamedRange> namedRanges;
    private String spreadsheetUrl;
    private List<DeveloperMetadata> developerMetadata;

    private SpreadsheetPropertiesFactory propertiesFactory;
    private List<SheetFactory> sheetFactories;
    private List<Factory> namedRangeFactories; // TODO: Implement Factory
    private List<Factory> developerMetadataFactories; // TODO: Implement Factory


    //
    // Constructor
    //

    public SpreadsheetFactory() {
        spreadsheetId = null;
        properties = null;
        sheets = new ArrayList<>();
        namedRanges = new ArrayList<>();
        spreadsheetUrl = null;
        developerMetadata = new ArrayList<>();

        propertiesFactory = new SpreadsheetPropertiesFactory();
        sheetFactories = new ArrayList<>();
        namedRangeFactories = new ArrayList<>();
        developerMetadataFactories = new ArrayList<>();
        }

    //
    // Public Methods
    //

    public Spreadsheet build() {
        // Initialize variables
        Spreadsheet spreadsheet = new Spreadsheet();

        // Build Remaining Member Variables
        if (properties == null) {
            properties = propertiesFactory.build();
        }

        if (sheets.isEmpty()) {
            for (SheetFactory sheetFactory : this.sheetFactories) {
                sheets.add(sheetFactory.build());
            }
        }

//        if (namedRanges == null) {
//            for (NamedRangeFactory namedRangeFactory : this.namedRangeFactories) {
//                namedRanges.add(namedRangeFactory.build());
//            }
//        }

//        if (developerMetadata == null) {
//            for (DeveloperMetadataFactory developerMetadataFactory
//                    : this.developerMetadataFactories) {
//                developerMetadata.add(developerMetadataFactory.build());
//            }
//        }

        // Format spreadsheet
        spreadsheet.setSpreadsheetId(spreadsheetId)
                .setProperties(properties)
                .setSheets(sheets)
                .setNamedRanges(namedRanges)
                .setSpreadsheetUrl(spreadsheetUrl)
                .setDeveloperMetadata(developerMetadata);

        return spreadsheet;
    }

    //
    // Builder Methods
    //

    public SpreadsheetFactory spreadsheetId(String spreadsheetId) {
        this.spreadsheetId = spreadsheetId;
        return this;
    }

    public SpreadsheetFactory properties(SpreadsheetProperties properties) {
        this.properties = properties;
        return this;
    }

    public SpreadsheetFactory sheets(List<Sheet> sheets) {
        this.sheets = sheets;
        return this;
    }

    public SpreadsheetFactory namedRanges(List<NamedRange> namedRanges) {
        this.namedRanges = namedRanges;
        return this;
    }

    public SpreadsheetFactory spreadsheetUrl(String spreadsheetUrl) {
        this.spreadsheetUrl = spreadsheetUrl;
        return this;
    }

    public SpreadsheetFactory developerMetadata(List<DeveloperMetadata> developerMetadata) {
        this.developerMetadata = developerMetadata;
        return this;
    }
}
