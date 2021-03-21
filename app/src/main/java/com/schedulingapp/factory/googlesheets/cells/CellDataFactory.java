package com.schedulingapp.factory.googlesheets.cells;

import com.google.api.services.sheets.v4.model.CellData;
import com.google.api.services.sheets.v4.model.CellFormat;
import com.google.api.services.sheets.v4.model.DataValidationRule;
import com.google.api.services.sheets.v4.model.ExtendedValue;
import com.google.api.services.sheets.v4.model.PivotTable;
import com.google.api.services.sheets.v4.model.TextFormatRun;
import com.schedulingapp.factory.Factory;

import java.util.ArrayList;
import java.util.List;

public class CellDataFactory implements Factory<CellData> {
    //
    // Fields
    //

    private ExtendedValue userEnteredValue;
    private ExtendedValue effectiveValue;
    private String formattedValue;
    private CellFormat userEnteredFormat;
    private CellFormat effectiveFormat;
    private String hyperlink;
    private String note;
    private List<TextFormatRun> textFormatRuns;
    private DataValidationRule dataValidation;
    private PivotTable pivotTable;

    //
    // Constructor
    //

    public CellDataFactory() {
        userEnteredValue = null;
        effectiveValue = null;
        formattedValue = null;
        userEnteredFormat = null;
        effectiveFormat = null;
        hyperlink = null;
        note = null;
        textFormatRuns = new ArrayList<>();
        dataValidation = null;
        pivotTable = null;
    }

    //
    // Public Methods
    //

    @Override
    public CellData build() {
        // Declare Variables
        CellData data = new CellData();

        // Format data
        if(userEnteredValue != null) {
            data.setUserEnteredValue(userEnteredValue);
        }

        if(effectiveValue != null) {
            data.setEffectiveValue(effectiveValue);
        }

        if(formattedValue != null) {
            data.setFormattedValue(formattedValue);
        }

        if(userEnteredFormat != null) {
            data.setUserEnteredFormat(userEnteredFormat);
        }

        if(effectiveFormat != null) {
            data.setEffectiveFormat(effectiveFormat);
        }

        if(hyperlink != null) {
            data.setHyperlink(hyperlink);
        }

        if(note != null) {
            data.setNote(note);
        }

        if(!textFormatRuns.isEmpty()) {
            data.setTextFormatRuns(textFormatRuns);
        }

        if(dataValidation != null) {
            data.setDataValidation(dataValidation);
        }

        if(pivotTable != null) {
            data.setPivotTable(pivotTable);
        }

        return data;
    }

    public void setUserEnteredValue(ExtendedValue userEnteredValue) {
        this.userEnteredValue = userEnteredValue;
    }

    public void setEffectiveValue(ExtendedValue effectiveValue) {
        this.effectiveValue = effectiveValue;
    }

    public void setFormattedValue(String formattedValue) {
        this.formattedValue = formattedValue;
    }

    public void setUserEnteredFormat(CellFormat userEnteredFormat) {
        this.userEnteredFormat = userEnteredFormat;
    }

    public void setEffectiveFormat(CellFormat effectiveFormat) {
        this.effectiveFormat = effectiveFormat;
    }

    public void setHyperlink(String hyperlink) {
        this.hyperlink = hyperlink;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setTextFormatRuns(List<TextFormatRun> textFormatRuns) {
        this.textFormatRuns = textFormatRuns;
    }

    public void addTextFormatRun(TextFormatRun textFormatRun) {
        this.textFormatRuns.add(textFormatRun);
    }

    public void removeTextFormatRun(TextFormatRun textFormatRun) {
        this.textFormatRuns.remove(textFormatRun);
    }

    public void setDataValidation(DataValidationRule dataValidation) {
        this.dataValidation = dataValidation;
    }

    public void setPivotTable(PivotTable pivotTable) {
        this.pivotTable = pivotTable;
    }
}
