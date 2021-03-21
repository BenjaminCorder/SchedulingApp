package com.schedulingapp.model.schedule;

import java.util.ArrayList;
import java.util.List;

public class Schedule {
    //
    // Constants
    //

    private static final Integer FROZEN_ROWS = 2;
    private static final Integer FROZEN_COLUMNS = 1;
    private static final Integer DATA_START_ROW = 0;

    // Row 1
    private static final Cell CELL_A1 = new Cell.Builder("A1")
            .stringValue("Date")
            .textFormatBold(true)
            .horizontalAlign("Left")
            .build();
    private static final Cell CELL_B1 = new Cell.Builder("B1")
            .stringValue("Week 01")
            .textFormatBold(true)
            .build();
    private static final Cell CELL_P1 = new Cell.Builder("P1")
            .stringValue("Week 02")
            .textFormatBold(true)
            .build();;

    // Row 2
    private static final Cell CELL_A2 = new Cell.Builder("A2")
            .stringValue("Employee")
            .textFormatBold(true)
            .horizontalAlign("Left")
            .build();

    // Merges
    private static final Integer mergesStartRowIndex00 = 0;
    private static final Integer mergesEndRowIndex00 = 1;
    private static final Integer mergesStartColumnIndex00 = 1;
    private static final Integer mergesEndColumnIndex00 = 15;

    private static final Integer mergesStartRowIndex01 = 0;
    private static final Integer mergesEndRowIndex01 = 1;
    private static final Integer mergesStartColumnIndex01 = 15;
    private static final Integer mergesEndColumnIndex01 = 29;

    //
    // Fields
    //

    private final Integer sheetId;
    private final String title;
    private final Integer index;
    private final List<Integer> dataStartRow;
    private final List<Integer> dataStartColumn;
    private final List<List<List<Cell>>> dataValues;
    private final List<Integer> mergesStartRowIndex;
    private final List<Integer> mergesEndRowIndex;
    private final List<Integer> mergesStartColumnIndex;
    private final List<Integer> mergesEndColumnIndex;

    //
    // Constructor
    //

    public Schedule(Builder builder) {
        this.sheetId = builder.sheetId;
        this.title = builder.title;
        this.index = builder.index;
        this.dataStartRow = builder.dataStartRow;
        this.dataStartColumn = builder.dataStartColumn;
        this.dataValues = builder.dataValues;
        this.mergesStartRowIndex = builder.mergesStartRowIndex;
        this.mergesEndRowIndex = builder.mergesEndRowIndex;
        this.mergesStartColumnIndex = builder.mergesStartColumnIndex;
        this.mergesEndColumnIndex = builder.mergesEndColumnIndex;
    }

    //
    // Accessor Methods
    //

    public Integer getSheetId() {
        return sheetId;
    }

    public String getTitle() {
        return title;
    }

    public Integer getIndex() {
        return index;
    }

    public List<Integer> getDataStartRow() {
        return dataStartRow;
    }

    public List<Integer> getDataStartColumn() {
        return dataStartColumn;
    }

    public List<List<List<Cell>>> getDataValues() {
        return dataValues;
    }

    public List<Integer> getMergesStartRowIndex() {
        return mergesStartRowIndex;
    }

    public List<Integer> getMergesEndRowIndex() {
        return mergesEndRowIndex;
    }

    public List<Integer> getMergesStartColumnIndex() {
        return mergesStartColumnIndex;
    }

    public List<Integer> getMergesEndColumnIndex() {
        return mergesEndColumnIndex;
    }

    //
    // Nested Classes
    //

    public static class Builder {
        //
        // Fields
        //

        private Integer sheetId;
        private String title;
        private Integer index;
        private List<Integer> dataStartRow;
        private List<Integer> dataStartColumn;
        private List<List<List<Cell>>> dataValues;
        private List<Integer> mergesStartRowIndex;
        private List<Integer> mergesEndRowIndex;
        private List<Integer> mergesStartColumnIndex;
        private List<Integer> mergesEndColumnIndex;

        //
        // Constructor
        //

        public Builder() {
            sheetId = null;
            title = null;
            index = null;
            dataStartRow = new ArrayList<>();
            dataStartColumn = new ArrayList<>();
            dataValues = new ArrayList<>();
            mergesStartRowIndex = new ArrayList<>();
            mergesEndRowIndex = new ArrayList<>();
            mergesStartColumnIndex = new ArrayList<>();
            mergesEndColumnIndex = new ArrayList<>();
        }

        //
        // Public Methods
        //

        public Schedule build() {
            return new Schedule(this);
        }

        //
        // Builder Methods
        //

        public Builder sheetId(Integer sheetId) {
            this.sheetId = sheetId;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder index(Integer index) {
            this.index = index;
            return this;
        }

        public Builder dataStartRow(List<Integer> dataStartRow) {
            this.dataStartRow = dataStartRow;
            return this;
        }

        public Builder dataStartColumn(List<Integer> dataStartColumn) {
            this.dataStartColumn = dataStartColumn;
            return this;
        }

        public Builder dataValues(List<List<List<Cell>>> dataValues) {
            this.dataValues = dataValues;
            return this;
        }

        public Builder mergesStartRowIndex(List<Integer> mergesStartRowIndex) {
            this.mergesStartRowIndex = mergesStartRowIndex;
            return this;
        }

        public Builder mergesEndRowIndex(List<Integer> mergesEndRowIndex) {
            this.mergesEndRowIndex = mergesEndRowIndex;
            return this;
        }

        public Builder mergesStartColumnIndex(List<Integer> mergesStartColumnIndex) {
            this.mergesStartColumnIndex = mergesStartColumnIndex;
            return this;
        }

        public Builder mergesEndColumnIndex(List<Integer> mergesEndColumnIndex) {
            this.mergesEndColumnIndex = mergesEndColumnIndex;
            return this;
        }
    }
}
