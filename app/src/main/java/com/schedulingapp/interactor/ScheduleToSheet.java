package com.schedulingapp.interactor;

import com.google.api.services.sheets.v4.model.CellData;
import com.google.api.services.sheets.v4.model.ExtendedValue;
import com.google.api.services.sheets.v4.model.GridData;
import com.google.api.services.sheets.v4.model.RowData;
import com.google.api.services.sheets.v4.model.Sheet;
import com.google.api.services.sheets.v4.model.SheetProperties;
import com.schedulingapp.factory.googlesheets.sheets.SheetFactory;
import com.schedulingapp.model.schedule.Cell;
import com.schedulingapp.model.schedule.Schedule;

import java.util.ArrayList;
import java.util.List;

public class ScheduleToSheet {
    //
    // Fields
    //
    private final Schedule schedule;
    private SheetFactory sheetFactory;

    //
    // Constructor
    //

    public ScheduleToSheet(Schedule schedule) {
        this.schedule = schedule;
        this.sheetFactory = new SheetFactory();
    }

    //
    // Accessor Methods
    //

    public Sheet getSheet() {
        sheetFactory
                .propertiesSheetId(schedule.getSheetId())
                .propertiesTitle(schedule.getTitle())
                .propertiesIndex(schedule.getIndex());

        for (int i = 0; i < schedule.getDataValues().size(); i++) {
            sheetFactory
                    .dataStartRow(schedule.getDataStartRow().get(i), i)
                    .dataStartColumn(schedule.getDataStartColumn().get(i), i)
                    .mergesStartRowIndex(
                            schedule.getMergesStartRowIndex().get(i), i)
                    .mergesEndRowIndex(
                            schedule.getMergesEndRowIndex().get(i), i)
                    .mergesStartColumnIndex(
                            schedule.getMergesStartColumnIndex().get(i), i)
                    .mergesEndColumnIndex(
                            schedule.getMergesEndColumnIndex().get(i), i);
            for (int j = 0; j < schedule.getDataValues().get(i).size(); j++) {
                for (int k = 0; k < schedule.getDataValues().get(i).get(j).size(); k++) {
                    Cell cell = schedule.getDataValues().get(i).get(j).get(k);
                    sheetFactory
                            .dataRowDataValuesUserEnteredValue(
                                    cell.getValue(), i, j, k)
                            .dataRowDataValuesUserEnteredFormatNumberFormatType(
                                    cell.getNumberFormatType(), i, j, k)
                            .dataRowDataValuesUserEnteredFormatBackgroundColorRed(
                                    cell.getBackgroundColorRed(), i, j, k)
                            .dataRowDataValuesUserEnteredFormatBackgroundColorBlue(
                                    cell.getBackgroundColorRed(), i, j, k)
                            .dataRowDataValuesUserEnteredFormatBackgroundColorGreen(
                                    cell.getBackgroundColorRed(), i, j, k)
                            .dataRowDataValuesUserEnteredFormatBackgroundColorAlpha(
                                    cell.getBackgroundColorRed(), i, j, k)
                            .dataRowDataValuesUserEnteredFormatBordersStyleTop(
                                    cell.getBordersStyleTop(), i, j, k)
                            .dataRowDataValuesUserEnteredFormatBordersStyleBottom(
                                    cell.getBordersStyleBottom(), i, j, k)
                            .dataRowDataValuesUserEnteredFormatBordersStyleRight(
                                    cell.getBordersStyleRight(), i, j, k)
                            .dataRowDataValuesUserEnteredFormatBordersStyleLeft(
                                    cell.getBordersStyleLeft(), i, j, k)
                            .dataRowDataValuesUserEnteredFormatBordersColorTopRed(
                                    cell.getBordersColorTopRed(), i, j, k)
                            .dataRowDataValuesUserEnteredFormatBordersColorTopBlue(
                                    cell.getBordersColorTopBlue(), i, j, k)
                            .dataRowDataValuesUserEnteredFormatBordersColorTopGreen(
                                    cell.getBordersColorTopGreen(), i, j, k)
                            .dataRowDataValuesUserEnteredFormatBordersColorTopAlpha(
                                    cell.getBordersColorTopAlpha(), i, j, k)
                            .dataRowDataValuesUserEnteredFormatBordersColorBottomRed(
                                    cell.getBordersColorBottomRed(), i, j, k)
                            .dataRowDataValuesUserEnteredFormatBordersColorBottomBlue(
                                    cell.getBordersColorBottomBlue(), i, j, k)
                            .dataRowDataValuesUserEnteredFormatBordersColorBottomGreen(
                                    cell.getBordersColorBottomGreen(), i, j, k)
                            .dataRowDataValuesUserEnteredFormatBordersColorBottomAlpha(
                                    cell.getBordersColorBottomAlpha(), i, j, k)
                            .dataRowDataValuesUserEnteredFormatBordersColorRightRed(
                                    cell.getBordersColorRightRed(), i, j, k)
                            .dataRowDataValuesUserEnteredFormatBordersColorRightBlue(
                                    cell.getBordersColorRightBlue(), i, j, k)
                            .dataRowDataValuesUserEnteredFormatBordersColorRightGreen(
                                    cell.getBordersColorRightGreen(), i, j, k)
                            .dataRowDataValuesUserEnteredFormatBordersColorRightAlpha(
                                    cell.getBordersColorRightAlpha(), i, j, k)
                            .dataRowDataValuesUserEnteredFormatBordersColorLeftRed(
                                    cell.getBordersColorLeftRed(), i, j, k)
                            .dataRowDataValuesUserEnteredFormatBordersColorLeftBlue(
                                    cell.getBordersColorLeftBlue(), i, j, k)
                            .dataRowDataValuesUserEnteredFormatBordersColorLeftGreen(
                                    cell.getBordersColorLeftGreen(), i, j, k)
                            .dataRowDataValuesUserEnteredFormatBordersColorLeftAlpha(
                                    cell.getBordersColorLeftAlpha(), i, j, k)
                            .dataRowDataValuesUserEnteredFormatHorizontalAlign(
                                    cell.getHorizontalAlign(), i, j, k)
                            .dataRowDataValuesUserEnteredFormatVerticalAlign(
                                    cell.getVerticalAlign(), i, j, k)
                            .dataRowDataValuesUserEnteredFormatTextFormatFontFamily(
                                    cell.getTextFormatFontFamily(), i, j, k)
                            .dataRowDataValuesUserEnteredFormatTextFormatFontSize(
                                    cell.getTextFormatFontSize(), i, j, k)
                            .dataRowDataValuesUserEnteredFormatTextFormatBold(
                                    cell.getTextFormatBold(), i, j, k)
                            .dataRowDataValuesUserEnteredFormatTextFormatItalic(
                                    cell.getTextFormatItalic(), i, j, k)
                            .dataRowDataValuesUserEnteredFormatTextFormatUnderline(
                                    cell.getTextFormatUnderline(), i, j, k);
                }
            }
        }

        return sheetFactory.build();
    }
}
