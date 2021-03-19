package com.schedulingapp.factory.googlesheets.spreadsheets;

import com.google.api.services.sheets.v4.model.DeveloperMetadata;
import com.google.api.services.sheets.v4.model.NamedRange;
import com.google.api.services.sheets.v4.model.Sheet;
import com.google.api.services.sheets.v4.model.Spreadsheet;
import com.google.api.services.sheets.v4.model.SpreadsheetProperties;
import com.schedulingapp.factory.Factory;

import java.util.ArrayList;
import java.util.List;

public class SpreadsheetFactory implements Factory<Spreadsheet> {
    //
    // Fields
    //

    private String spreadsheetId;
    private SpreadsheetProperties properties;
    private List<Sheet> sheets;
    private List<NamedRange> namedRanges;
    private String spreadsheetUrl;
    private List<DeveloperMetadata> developerMetadata;

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
    }

    //
    // Public Methods
    //

    public Spreadsheet generate() {
        // Declare variables
        Spreadsheet spreadsheet = new Spreadsheet();

        // Format spreadsheet to match member variables
        if (spreadsheetId != null) {
            spreadsheet.setSpreadsheetId(spreadsheetId);
        }

        if (properties != null) {
            spreadsheet.setProperties(properties);
        }

        if (!sheets.isEmpty()){
            spreadsheet.setSheets(sheets);
        }

        if (!namedRanges.isEmpty()){
            spreadsheet.setNamedRanges(namedRanges);
        }

        if (spreadsheetUrl != null){
            spreadsheet.setSpreadsheetUrl(spreadsheetUrl);
        }

        if (!developerMetadata.isEmpty()){
            spreadsheet.setDeveloperMetadata(developerMetadata);
        }

        return spreadsheet;
    }

    //
    // Accessor Methods
    //

    public void setSpreadsheetId(String spreadsheetId) {
        this.spreadsheetId = spreadsheetId;
    }

    public void setProperties(SpreadsheetProperties properties) {
        this.properties = properties;
    }

    public void setSheets(List<Sheet> sheets) {
        this.sheets = sheets;
    }

    public void addSheet(Sheet sheet) {
        sheets.add(sheet);
    }

    public void removeSheet(Sheet sheet) {
        sheets.add(sheet);
    }

    public void setNamedRanges(List<NamedRange> namedRanges) {
        this.namedRanges = namedRanges;
    }

    public void addNamedRange(NamedRange namedRange) {
        namedRanges.add(namedRange);

    }

    public void removeNamedRange(NamedRange namedRange) {
        namedRanges.add(namedRange);

    }

    public void setSpreadsheetUrl(String spreadsheetUrl) {
        this.spreadsheetUrl = spreadsheetUrl;
    }

    public void setDeveloperMetadata(List<DeveloperMetadata> developerMetadata) {
        this.developerMetadata = developerMetadata;
    }

    public void addDeveloperMetadata(DeveloperMetadata developerMetadata) {
        this.developerMetadata.add(developerMetadata);

    }

    public void removeDeveloperMetadata(DeveloperMetadata developerMetadata) {
        this.developerMetadata.add(developerMetadata);

    }
}
