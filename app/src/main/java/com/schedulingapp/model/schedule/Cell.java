package com.schedulingapp.model.schedule;

import com.schedulingapp.misc.ErrorValue;
import com.schedulingapp.misc.Formula;

public class Cell {
    //
    // Constants
    //

    private static final NumberFormat DEFAULT_NUMBER_FORMAT_TYPE
            = NumberFormat.NUMBER_FORMAT_TYPE_UNSPECIFIED;
    private static final Float DEFAULT_BACKGROUND_COLOR
            = (float)1;
    private static final Style DEFAULT_BORDERS_STYLE
            = Style.NONE;
    private static final Float DEFAULT_BORDERS_COLOR
            = (float)0;
    private static final HorizontalAlign DEFAULT_HORIZONTAL_ALIGN
            = HorizontalAlign.CENTER;
    private static final VerticalAlign DEFAULT_VERTICAL_ALIGN
            = VerticalAlign.MIDDLE;
    private static final String DEFAULT_TEXT_FORMAT_FONT_FAMILY
            = "Arial";
    private static final Integer DEFAULT_TEXT_FORMAT_FONT_SIZE
            = 10;
    private static final Boolean DEFAULT_TEXT_FORMAT_BOLD
            = false;
    private static final Boolean DEFAULT_TEXT_FORMAT_ITALIC
            = false;
    private static final Boolean DEFAULT_TEXT_FORMAT_STRIKETHROUGH
            = false;
    private static final Boolean DEFAULT_TEXT_FORMAT_UNDERLINE
            = false;

    //
    // Fields
    //

    private final String index;
    private final Object value;
    private final String numberFormatType;
    private final Float backgroundColorRed;
    private final Float backgroundColorGreen;
    private final Float backgroundColorBlue;
    private final Float backgroundColorAlpha;
    private final String bordersStyleTop;
    private final String bordersStyleBottom;
    private final String bordersStyleRight;
    private final String bordersStyleLeft;
    private final Float bordersColorTopRed;
    private final Float bordersColorTopGreen;
    private final Float bordersColorTopBlue;
    private final Float bordersColorTopAlpha;
    private final Float bordersColorBottomRed;
    private final Float bordersColorBottomGreen;
    private final Float bordersColorBottomBlue;
    private final Float bordersColorBottomAlpha;
    private final Float bordersColorRightRed;
    private final Float bordersColorRightGreen;
    private final Float bordersColorRightBlue;
    private final Float bordersColorRightAlpha;
    private final Float bordersColorLeftRed;
    private final Float bordersColorLeftGreen;
    private final Float bordersColorLeftBlue;
    private final Float bordersColorLeftAlpha;
    private final String horizontalAlign;
    private final String verticalAlign;
    private final String textFormatFontFamily;
    private final Integer textFormatFontSize;
    private final Boolean textFormatBold;
    private final Boolean textFormatItalic;
    private final Boolean textFormatStrikethrough;
    private final Boolean textFormatUnderline;

    //
    // Constructor
    //

    public Cell(Builder builder) {
        index = builder.index;
        value = builder.getValue();
        numberFormatType = builder.numberFormatType.getValue();
        backgroundColorRed = builder.backgroundColorRed;
        backgroundColorGreen = builder.backgroundColorGreen;
        backgroundColorBlue = builder.backgroundColorBlue;
        backgroundColorAlpha = builder.backgroundColorAlpha;
        bordersStyleTop = builder.bordersStyleTop.getValue();
        bordersStyleBottom = builder.bordersStyleBottom.getValue();
        bordersStyleRight = builder.bordersStyleRight.getValue();
        bordersStyleLeft = builder.bordersStyleLeft.getValue();
        bordersColorTopRed = builder.bordersColorTopRed;
        bordersColorTopGreen = builder.bordersColorTopGreen;
        bordersColorTopBlue = builder.bordersColorTopBlue;
        bordersColorTopAlpha = builder.bordersColorTopAlpha;
        bordersColorBottomRed = builder.bordersColorBottomRed;
        bordersColorBottomGreen = builder.bordersColorBottomGreen;
        bordersColorBottomBlue = builder.bordersColorBottomBlue;
        bordersColorBottomAlpha = builder.bordersColorBottomAlpha;
        bordersColorRightRed = builder.bordersColorRightRed;
        bordersColorRightGreen = builder.bordersColorRightGreen;
        bordersColorRightBlue = builder.bordersColorRightBlue;
        bordersColorRightAlpha = builder.bordersColorRightAlpha;
        bordersColorLeftRed = builder.bordersColorLeftRed;
        bordersColorLeftGreen = builder.bordersColorLeftGreen;
        bordersColorLeftBlue = builder.bordersColorLeftBlue;
        bordersColorLeftAlpha = builder.bordersColorLeftAlpha;
        horizontalAlign = builder.horizontalAlign.getValue();
        verticalAlign = builder.verticalAlign.getValue();
        textFormatFontFamily = builder.textFormatFontFamily;
        textFormatFontSize = builder.textFormatFontSize;
        textFormatBold = builder.textFormatBold;
        textFormatItalic = builder.textFormatItalic;
        textFormatStrikethrough = builder.textFormatStrikethrough;
        textFormatUnderline = builder.textFormatUnderline;
    }

    //
    // Accessor Methods
    //

    public String getIndex() {
        return index;
    }

    public Object getValue() {
        return value;
    }

    public String getNumberFormatType() {
        return numberFormatType;
    }

    public Float getBackgroundColorRed() {
        return backgroundColorRed;
    }

    public Float getBackgroundColorGreen() {
        return backgroundColorGreen;
    }

    public Float getBackgroundColorBlue() {
        return backgroundColorBlue;
    }

    public Float getBackgroundColorAlpha() {
        return backgroundColorAlpha;
    }

    public String getBordersStyleTop() {
        return bordersStyleTop;
    }

    public String getBordersStyleBottom() {
        return bordersStyleBottom;
    }

    public String getBordersStyleRight() {
        return bordersStyleRight;
    }

    public String getBordersStyleLeft() {
        return bordersStyleLeft;
    }

    public Float getBordersColorTopRed() {
        return bordersColorTopRed;
    }

    public Float getBordersColorTopGreen() {
        return bordersColorTopGreen;
    }

    public Float getBordersColorTopBlue() {
        return bordersColorTopBlue;
    }

    public Float getBordersColorTopAlpha() {
        return bordersColorTopAlpha;
    }

    public Float getBordersColorBottomRed() {
        return bordersColorBottomRed;
    }

    public Float getBordersColorBottomGreen() {
        return bordersColorBottomGreen;
    }

    public Float getBordersColorBottomBlue() {
        return bordersColorBottomBlue;
    }

    public Float getBordersColorBottomAlpha() {
        return bordersColorBottomAlpha;
    }

    public Float getBordersColorRightRed() {
        return bordersColorRightRed;
    }

    public Float getBordersColorRightGreen() {
        return bordersColorRightGreen;
    }

    public Float getBordersColorRightBlue() {
        return bordersColorRightBlue;
    }

    public Float getBordersColorRightAlpha() {
        return bordersColorRightAlpha;
    }

    public Float getBordersColorLeftRed() {
        return bordersColorLeftRed;
    }

    public Float getBordersColorLeftGreen() {
        return bordersColorLeftGreen;
    }

    public Float getBordersColorLeftBlue() {
        return bordersColorLeftBlue;
    }

    public Float getBordersColorLeftAlpha() {
        return bordersColorLeftAlpha;
    }

    public String getHorizontalAlign() {
        return horizontalAlign;
    }

    public String getVerticalAlign() {
        return verticalAlign;
    }

    public String getTextFormatFontFamily() {
        return textFormatFontFamily;
    }

    public Integer getTextFormatFontSize() {
        return textFormatFontSize;
    }

    public Boolean getTextFormatBold() {
        return textFormatBold;
    }

    public Boolean getTextFormatItalic() {
        return textFormatItalic;
    }

    public Boolean getTextFormatStrikethrough() {
        return textFormatStrikethrough;
    }

    public Boolean getTextFormatUnderline() {
        return textFormatUnderline;
    }

    //
    // Enums
    //

    private enum NumberFormat {
        //
        // Enum Values
        //

        NUMBER_FORMAT_TYPE_UNSPECIFIED("NUMBER_FORMAT_TYPE_UNSPECIFIED"),
        TEXT("TEXT"),
        NUMBER("NUMBER"),
        PERCENT("PERCENT"),
        CURRENCY("CURRENCY"),
        DATE("DATE"),
        TIME("TIME"),
        DATE_TIME("DATE_TIME"),
        SCIENTIFIC("SCIENTIFIC");

        //
        // Fields
        //

        private final String value;

        //
        // Constructor
        //

        NumberFormat(String value) {
            this.value = value;
        }

        //
        // Public Methods
        //

        public static NumberFormat create(String value){
            switch(value) {
                case "TEXT":
                    return TEXT;
                case "NUMBER":
                    return NUMBER;
                case "PERCENT":
                    return PERCENT;
                case "CURRENCY":
                    return CURRENCY;
                case "DATE":
                    return DATE;
                case "TIME":
                    return TIME;
                case "DATE_TIME":
                    return DATE_TIME;
                case "SCIENTIFIC":
                    return SCIENTIFIC;
            }

            return NUMBER_FORMAT_TYPE_UNSPECIFIED;
        }

        //
        // Accessor Methods
        //

        public String getValue() {
            return value;
        }
    }

    private enum Style {
        //
        // Enum Values
        //

        STYLE_UNSPECIFIED("STYLE_UNSPECIFIED"),
        DOTTED("DOTTED"),
        DASHED("DASHED"),
        SOLID("SOLID"),
        SOLID_MEDIUM("SOLID_MEDIUM"),
        SOLID_THICK("SOLID_THICK"),
        NONE("NONE"),
        DOUBLE("DOUBLE");

        //
        // Fields
        //

        private final String value;

        //
        // Constructor
        //

        Style(String value) {
            this.value = value;
        }

        //
        // Public Methods
        //

        public static Style create(String value) {
            switch(value) {
                case "DOTTED":
                    return DOTTED;
                case "DASHED":
                    return DASHED;
                case "SOLID":
                    return SOLID;
                case "SOLID_MEDIUM":
                    return SOLID_MEDIUM;
                case "SOLID_THICK":
                    return SOLID_THICK;
                case "NONE":
                    return NONE;
                case "DOUBLE":
                    return DOUBLE;
            }

            return STYLE_UNSPECIFIED;
        }

        //
        // Accessor Methods
        //

        public String getValue() {
            return value;
        }
    }

    private enum HorizontalAlign {
        //
        // Enum Values
        //

        HORIZONTAL_ALIGN_UNSPECIFIED("HORIZONTAL_ALIGN_UNSPECIFIED"),
        LEFT("LEFT"),
        CENTER("CENTER"),
        RIGHT("RIGHT");

        //
        // Fields
        //

        private final String value;

        //
        // Constructor
        //

        HorizontalAlign(String value) {
            this.value = value;
        }

        //
        // Pubic Methods
        //

        public static HorizontalAlign create(String value) {
            switch(value) {
                case "LEFT":
                    return LEFT;
                case "CENTER":
                    return CENTER;
                case "RIGHT":
                    return RIGHT;
            }

            return HORIZONTAL_ALIGN_UNSPECIFIED;
        }

        //
        // Accessor Methods
        //

        public String getValue() {
            return value;
        }
    }

    private enum VerticalAlign {
        //
        // Enum Values
        //

        VERTICAL_ALIGN_UNSPECIFIED("VERTICAL_ALIGN_UNSPECIFIED"),
        TOP("TOP"),
        MIDDLE("MIDDLE"),
        BOTTOM("BOTTOM");

        //
        // Fields
        //
        public final String value;

        //
        // Constructor
        //

        VerticalAlign(String value) {
            this.value = value;
        }

        //
        // Public Methods
        //

        public static VerticalAlign create(String value) {
            switch(value) {
                case "TOP":
                    return TOP;
                case "MIDDLE":
                    return MIDDLE;
                case "BOTTOM":
                    return BOTTOM;
            }

            return VERTICAL_ALIGN_UNSPECIFIED;
        }

        //
        // Accessor Methods
        //

        public String getValue() {
            return value;
        }
    }

    //
    // Member Classes
    //

    public static class Builder {
        //
        // Fields
        //

        private final String index;
        private NumberFormat numberFormatType;
        private Float backgroundColorRed;
        private Float backgroundColorGreen;
        private Float backgroundColorBlue;
        private Float backgroundColorAlpha;
        private Style bordersStyleTop;
        private Style bordersStyleBottom;
        private Style bordersStyleRight;
        private Style bordersStyleLeft;
        private Float bordersColorTopRed;
        private Float bordersColorTopGreen;
        private Float bordersColorTopBlue;
        private Float bordersColorTopAlpha;
        private Float bordersColorBottomRed;
        private Float bordersColorBottomGreen;
        private Float bordersColorBottomBlue;
        private Float bordersColorBottomAlpha;
        private Float bordersColorRightRed;
        private Float bordersColorRightGreen;
        private Float bordersColorRightBlue;
        private Float bordersColorRightAlpha;
        private Float bordersColorLeftRed;
        private Float bordersColorLeftGreen;
        private Float bordersColorLeftBlue;
        private Float bordersColorLeftAlpha;
        private HorizontalAlign horizontalAlign;
        private VerticalAlign verticalAlign;
        private String textFormatFontFamily;
        private Integer textFormatFontSize;
        private Boolean textFormatBold;
        private Boolean textFormatItalic;
        private Boolean textFormatStrikethrough;
        private Boolean textFormatUnderline;

        private UnionField unionField;

        //
        // Union Field: Only One of the Following
        //

        private Float doubleValue;
        private String stringValue;
        private Boolean booleanValue;
        private Formula formulaValue;
        private ErrorValue errorValue;

        public Builder(String index) {
            this.index = index;
            this.numberFormatType = DEFAULT_NUMBER_FORMAT_TYPE;
            this.backgroundColorRed = DEFAULT_BACKGROUND_COLOR;
            this.backgroundColorGreen = DEFAULT_BACKGROUND_COLOR;
            this.backgroundColorBlue = DEFAULT_BACKGROUND_COLOR;
            this.backgroundColorAlpha = DEFAULT_BACKGROUND_COLOR;
            this.bordersStyleTop = DEFAULT_BORDERS_STYLE;
            this.bordersStyleBottom = DEFAULT_BORDERS_STYLE;
            this.bordersStyleRight = DEFAULT_BORDERS_STYLE;
            this.bordersStyleLeft = DEFAULT_BORDERS_STYLE;
            this.bordersColorTopRed = DEFAULT_BORDERS_COLOR;
            this.bordersColorTopGreen = DEFAULT_BORDERS_COLOR;
            this.bordersColorTopBlue = DEFAULT_BORDERS_COLOR;
            this.bordersColorTopAlpha = DEFAULT_BORDERS_COLOR;
            this.bordersColorBottomRed = DEFAULT_BORDERS_COLOR;
            this.bordersColorBottomGreen = DEFAULT_BORDERS_COLOR;
            this.bordersColorBottomBlue = DEFAULT_BORDERS_COLOR;
            this.bordersColorBottomAlpha = DEFAULT_BORDERS_COLOR;
            this.bordersColorRightRed = DEFAULT_BORDERS_COLOR;
            this.bordersColorRightGreen = DEFAULT_BORDERS_COLOR;
            this.bordersColorRightBlue = DEFAULT_BORDERS_COLOR;
            this.bordersColorRightAlpha = DEFAULT_BORDERS_COLOR;
            this.bordersColorLeftRed = DEFAULT_BORDERS_COLOR;
            this.bordersColorLeftGreen = DEFAULT_BORDERS_COLOR;
            this.bordersColorLeftBlue = DEFAULT_BORDERS_COLOR;
            this.bordersColorLeftAlpha = DEFAULT_BORDERS_COLOR;
            this.horizontalAlign = DEFAULT_HORIZONTAL_ALIGN;
            this.verticalAlign = DEFAULT_VERTICAL_ALIGN;
            this.textFormatFontFamily = DEFAULT_TEXT_FORMAT_FONT_FAMILY;
            this.textFormatFontSize = DEFAULT_TEXT_FORMAT_FONT_SIZE;
            this.textFormatBold = DEFAULT_TEXT_FORMAT_BOLD;
            this.textFormatItalic = DEFAULT_TEXT_FORMAT_ITALIC;
            this.textFormatStrikethrough = DEFAULT_TEXT_FORMAT_STRIKETHROUGH;
            this.textFormatUnderline = DEFAULT_TEXT_FORMAT_UNDERLINE;

            this.unionField = UnionField.UNION_FIELD_UNSPECIFIED;

            this.doubleValue = null;
            this.stringValue = null;
            this.booleanValue = null;
            this.formulaValue = null;
            this.errorValue = null;
        }

        //
        // Public Methods
        //

        public Cell build() {
            return new Cell(this);
        }

        public Object getValue() {
            switch(unionField.getValue()) {
                case "DOUBLE_VALUE":
                    return doubleValue;
                case "STRING_VALUE":
                    return stringValue;
                case "BOOL_VALUE":
                    return booleanValue;
                case "FORMULA_VALUE":
                    return formulaValue;
                case "ERROR_VALUE":
                    return errorValue;
            }

            return null;
        }

        //
        // Builder Methods
        //

        public Builder numberFormatType(String numberFormatType) {
            this.numberFormatType = NumberFormat.create(numberFormatType);
            return this;
        }

        public Builder backgroundColorRed(Float backgroundColorRed) {
            this.backgroundColorRed = backgroundColorRed;
            return this;
        }

        public Builder backgroundColorGreen(Float backgroundColorGreen) {
            this.backgroundColorGreen = backgroundColorGreen;
            return this;
        }

        public Builder backgroundColorBlue(Float backgroundColorBlue) {
            this.backgroundColorBlue = backgroundColorBlue;
            return this;
        }

        public Builder backgroundColorAlpha(Float backgroundColorAlpha) {
            this.backgroundColorAlpha = backgroundColorAlpha;
            return this;
        }

        public Builder bordersStyleTop(String bordersStyleTop) {
            this.bordersStyleTop = Style.create(bordersStyleTop);
            return this;
        }

        public Builder bordersStyleBottom(String bordersStyleBottom) {
            this.bordersStyleBottom = Style.create(bordersStyleBottom);
            return this;
        }

        public Builder bordersStyleRight(String bordersStyleRight) {
            this.bordersStyleRight = Style.create(bordersStyleRight);
            return this;
        }

        public Builder bordersStyleLeft(String bordersStyleLeft) {
            this.bordersStyleLeft = Style.create(bordersStyleLeft);
            return this;
        }

        public Builder bordersColorTopRed(Float bordersColorTopRed) {
            this.bordersColorTopRed = bordersColorTopRed;
            return this;
        }

        public Builder bordersColorTopGreen(Float bordersColorTopGreen) {
            this.bordersColorTopGreen = bordersColorTopGreen;
            return this;
        }

        public Builder bordersColorTopBlue(Float bordersColorTopBlue) {
            this.bordersColorTopBlue = bordersColorTopBlue;
            return this;
        }

        public Builder bordersColorTopAlpha(Float bordersColorTopAlpha) {
            this.bordersColorTopAlpha = bordersColorTopAlpha;
            return this;
        }

        public Builder bordersColorBottomRed(Float bordersColorBottomRed) {
            this.bordersColorBottomRed = bordersColorBottomRed;
            return this;
        }

        public Builder bordersColorBottomGreen(Float bordersColorBottomGreen) {
            this.bordersColorBottomGreen = bordersColorBottomGreen;
            return this;
        }

        public Builder bordersColorBottomBlue(Float bordersColorBottomBlue) {
            this.bordersColorBottomBlue = bordersColorBottomBlue;
            return this;
        }

        public Builder bordersColorBottomAlpha(Float bordersColorBottomAlpha) {
            this.bordersColorBottomAlpha = bordersColorBottomAlpha;
            return this;
        }

        public Builder bordersColorRightRed(Float bordersColorRightRed) {
            this.bordersColorRightRed = bordersColorRightRed;
            return this;
        }

        public Builder bordersColorRightGreen(Float bordersColorRightGreen) {
            this.bordersColorRightGreen = bordersColorRightGreen;
            return this;
        }

        public Builder bordersColorRightBlue(Float bordersColorRightBlue) {
            this.bordersColorRightBlue = bordersColorRightBlue;
            return this;
        }

        public Builder bordersColorRightAlpha(Float bordersColorRightAlpha) {
            this.bordersColorRightAlpha = bordersColorRightAlpha;
            return this;
        }

        public Builder bordersColorLeftRed(Float bordersColorLeftRed) {
            this.bordersColorLeftRed = bordersColorLeftRed;
            return this;
        }

        public Builder bordersColorLeftGreen(Float bordersColorLeftGreen) {
            this.bordersColorLeftGreen = bordersColorLeftGreen;
            return this;
        }

        public Builder bordersColorLeftBlue(Float bordersColorLeftBlue) {
            this.bordersColorLeftBlue = bordersColorLeftBlue;
            return this;
        }

        public Builder bordersColorLeftAlpha(Float bordersColorLeftAlpha) {
            this.bordersColorLeftAlpha = bordersColorLeftAlpha;
            return this;
        }

        public Builder horizontalAlign(String horizontalAlign) {
            this.horizontalAlign = HorizontalAlign.create(horizontalAlign);
            return this;
        }

        public Builder verticalAlign(String verticalAlign) {
            this.verticalAlign = VerticalAlign.create(verticalAlign);
            return this;
        }

        public Builder textFormatFontFamily(String textFormatFontFamily) {
            this.textFormatFontFamily = textFormatFontFamily;
            return this;
        }

        public Builder textFormatFontSize(Integer textFormatFontSize) {
            this.textFormatFontSize = textFormatFontSize;
            return this;
        }

        public Builder textFormatBold(Boolean textFormatBold) {
            this.textFormatBold = textFormatBold;
            return this;
        }

        public Builder textFormatItalic(Boolean textFormatItalic) {
            this.textFormatItalic = textFormatItalic;
            return this;
        }

        public Builder textFormatStrikethrough(Boolean textFormatStrikethrough) {
            this.textFormatStrikethrough = textFormatStrikethrough;
            return this;
        }

        public Builder textFormatUnderline(Boolean textFormatUnderline) {
            this.textFormatUnderline = textFormatUnderline;
            return this;
        }

        public Builder doubleValue(Float doubleValue) {
            this.doubleValue = doubleValue;
            unionField = UnionField.DOUBLE_VALUE;
            return this;
        }

        public Builder stringValue(String stringValue) {
            this.stringValue = stringValue;
            unionField = UnionField.STRING_VALUE;
            return this;
        }

        public Builder booleanValue(Boolean booleanValue) {
            this.booleanValue = booleanValue;
            unionField = UnionField.BOOL_VALUE;
            return this;
        }

        public Builder formulaValue(Formula formulaValue) {
            this.formulaValue = formulaValue;
            unionField = UnionField.FORMULA_VALUE;
            return this;
        }

        public Builder errorValue(ErrorValue errorValue) {
            this.errorValue = errorValue;
            unionField = UnionField.ERROR_VALUE;
            return this;
        }

        //
        // Enums
        //

        private enum UnionField {
            //
            // Enum Values
            //

            UNION_FIELD_UNSPECIFIED("UNION_FIELD_UNSPECIFIED"),
            DOUBLE_VALUE("DOUBLE_VALUE"),
            STRING_VALUE("STRING_VALUE"),
            BOOL_VALUE("BOOL_VALUE"),
            FORMULA_VALUE("FORMULA_VALUE"),
            ERROR_VALUE("ERROR_VALUE");

            //
            // Fields
            //

            private final String value;

            //
            // Constructor
            //

            UnionField(String value) {
                this.value = value;
            }

            //
            // Accessor Methods
            //

            public String getValue() {
                return value;
            }
        }
    }
}
