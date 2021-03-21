package com.schedulingapp.factory.googlesheets.charts;

import com.google.api.services.sheets.v4.model.BasicChartSpec;
import com.google.api.services.sheets.v4.model.BubbleChartSpec;
import com.google.api.services.sheets.v4.model.CandlestickChartSpec;
import com.google.api.services.sheets.v4.model.ChartSpec;
import com.google.api.services.sheets.v4.model.Color;
import com.google.api.services.sheets.v4.model.ColorStyle;
import com.google.api.services.sheets.v4.model.HistogramChartSpec;
import com.google.api.services.sheets.v4.model.OrgChartSpec;
import com.google.api.services.sheets.v4.model.PieChartSpec;
import com.google.api.services.sheets.v4.model.ScorecardChartSpec;
import com.google.api.services.sheets.v4.model.TextFormat;
import com.google.api.services.sheets.v4.model.TextPosition;
import com.google.api.services.sheets.v4.model.TreemapChartSpec;
import com.google.api.services.sheets.v4.model.WaterfallChartSpec;
import com.schedulingapp.factory.Factory;

public class ChartSpecFactory implements Factory<ChartSpec> {
    //
    // Fields
    //

    private String title;
    private String altText;
    private TextFormat titleTextFormat;
    private TextPosition titleTextPosition;
    private String subtitle;
    private TextFormat subtitleTextFormat;
    private TextPosition subtitleTextPosition;
    private String fontName;
    private Boolean maximized;
    private Color backgroundColor;
    private ColorStyle backgroundColorStyle;
    //private DataSourceChartProperties dataSourceChartProperties
    //private List<FilterSpec> filterSpecs;
    //private List<SortSpec> sortSpecs;
    private String hiddenDimensionStrategy;

    private UnionField unionField;

    //
    // Union Field: Only One of the Following
    //

    private BasicChartSpec basicChart;
    private PieChartSpec pieChart; // TODO Create PieChartSpecFactory
    private BubbleChartSpec bubbleChart; // TODO Create BubbleChartSpecFactory
    private CandlestickChartSpec candlestickChart; // TODO CandlestickChartSpecCreate Factory
    private OrgChartSpec orgChart; // TODO Create OrgChartSpecFactory
    private HistogramChartSpec histogramChart; // TODO Create HistogramChartSpecFactory
    private WaterfallChartSpec waterfallChart; // TODO Create WaterfallChartSpecFactory
    private TreemapChartSpec treemapChart; // TODO Create TreemapChartSpecFactory
    private ScorecardChartSpec scorecardChart; // TODO Create ScorecardChartSpecFactory

    //
    // Constructor
    //

    public ChartSpecFactory() {
        title = null;
        altText = null;
        titleTextFormat = null;
        titleTextPosition = null;
        subtitle = null;
        subtitleTextFormat = null;
        subtitleTextPosition = null;
        fontName = null;
        maximized = null;
        backgroundColor = null;
        backgroundColorStyle = null;
        hiddenDimensionStrategy = null;

        unionField = UnionField.UNION_FIELD_UNSPECIFIED;

        basicChart = null;
        pieChart = null;
        bubbleChart = null;
        candlestickChart = null;
        orgChart = null;
        histogramChart = null;
        waterfallChart = null;
        treemapChart = null;
        scorecardChart = null;
    }

    //
    // Public Methods
    //

    @Override
    public ChartSpec build() {
        // Declare Variables
        ChartSpec spec = new ChartSpec();

        // Format spec
        if(title != null) {
            spec.setTitle(title);
        }
        if(altText != null) {
            spec.setAltText(altText);
        }
        if(titleTextFormat != null) {
            spec.setTitleTextFormat(titleTextFormat);
        }
        if(titleTextPosition != null) {
            spec.setTitleTextPosition(titleTextPosition);
        }
        if(subtitle != null) {
            spec.setSubtitle(subtitle);
        }
        if(subtitleTextFormat != null) {
            spec.setSubtitleTextFormat(subtitleTextFormat);
        }
        if(subtitleTextPosition != null) {
            spec.setSubtitleTextPosition(subtitleTextPosition);
        }
        if(fontName != null) {
            spec.setFontName(fontName);
        }
        if(maximized != null) {
            spec.setMaximized(maximized);
        }
        if(backgroundColor != null) {
            spec.setBackgroundColor(backgroundColor);
        }
        if(backgroundColorStyle != null) {
            spec.setBackgroundColorStyle(backgroundColorStyle);
        }
        if(hiddenDimensionStrategy != null) {
            spec.setHiddenDimensionStrategy(hiddenDimensionStrategy);
        }

        // Format spec According to unionField
        switch(unionField.getValue()) {
            case "BASIC_CHART":
                spec.setBasicChart(basicChart);
                break;
            case "PIE_CHART":
                spec.setPieChart(pieChart);
                break;
            case "BUBBLE_CHART":
                spec.setBubbleChart(bubbleChart);
                break;
            case "CANDLESTICK_CHART":
                spec.setCandlestickChart(candlestickChart);
                break;
            case "ORG_CHART":
                spec.setOrgChart(orgChart);
                break;
            case "HISTOGRAM_CHART":
                spec.setHistogramChart(histogramChart);
                break;
            case "WATERFALL_CHART":
                spec.setWaterfallChart(waterfallChart);
                break;
            case "TREEMAP_CHART":
                spec.setTreemapChart(treemapChart);
                break;
            case "SCORECARD_CHART":
                spec.setScorecardChart(scorecardChart);
                break;
        }


        return spec;
    }

    //
    // Accessor Methods
    //

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAltText(String altText) {
        this.altText = altText;
    }

    public void setTitleTextFormat(TextFormat titleTextFormat) {
        this.titleTextFormat = titleTextFormat;
    }

    public void setTitleTextPosition(TextPosition titleTextPosition) {
        this.titleTextPosition = titleTextPosition;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public void setSubtitleTextFormat(TextFormat subtitleTextFormat) {
        this.subtitleTextFormat = subtitleTextFormat;
    }

    public void setSubtitleTextPosition(TextPosition subtitleTextPosition) {
        this.subtitleTextPosition = subtitleTextPosition;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public void setMaximized(Boolean maximized) {
        this.maximized = maximized;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public void setBackgroundColorStyle(ColorStyle backgroundColorStyle) {
        this.backgroundColorStyle = backgroundColorStyle;
    }

    public void setHiddenDimensionStrategy(String hiddenDimensionStrategy) {
        this.hiddenDimensionStrategy = hiddenDimensionStrategy;
    }

    public void setBasicChart(BasicChartSpec basicChart) {
        this.basicChart = basicChart;
        unionField = UnionField.BASIC_CHART;
    }

    public void setPieChart(PieChartSpec pieChart) {
        this.pieChart = pieChart;
        unionField = UnionField.PIE_CHART;
    }

    public void setBubbleChart(BubbleChartSpec bubbleChart) {
        this.bubbleChart = bubbleChart;
        unionField = UnionField.BUBBLE_CHART;
    }

    public void setCandlestickChart(CandlestickChartSpec candlestickChart) {
        this.candlestickChart = candlestickChart;
        unionField = UnionField.CANDLESTICK_CHART;
    }

    public void setOrgChart(OrgChartSpec orgChart) {
        this.orgChart = orgChart;
        unionField = UnionField.ORG_CHART;
    }

    public void setHistogramChart(HistogramChartSpec histogramChart) {
        this.histogramChart = histogramChart;
        unionField = UnionField.HISTOGRAM_CHART;
    }

    public void setWaterfallChart(WaterfallChartSpec waterfallChart) {
        this.waterfallChart = waterfallChart;
        unionField = UnionField.WATERFALL_CHART;
    }

    public void setTreemapChart(TreemapChartSpec treemapChart) {
        this.treemapChart = treemapChart;
        unionField = UnionField.TREEMAP_CHART;
    }

    public void setScorecardChart(ScorecardChartSpec scorecardChart) {
        this.scorecardChart = scorecardChart;
        unionField = UnionField.SCORECARD_CHART;
    }

    //
    // Enums
    //

    private enum UnionField {
        //
        // Enum Values
        //

        UNION_FIELD_UNSPECIFIED("UNION_FIELD_UNSPECIFIED"),
        BASIC_CHART("BASIC_CHART"),
        PIE_CHART("PIE_CHART"),
        BUBBLE_CHART("BUBBLE_CHART"),
        CANDLESTICK_CHART("CANDLESTICK_CHART"),
        ORG_CHART("ORG_CHART"),
        HISTOGRAM_CHART("HISTOGRAM_CHART"),
        WATERFALL_CHART("WATERFALL_CHART"),
        TREEMAP_CHART("TREEMAP_CHART"),
        SCORECARD_CHART("SCORECARD_CHART");

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
