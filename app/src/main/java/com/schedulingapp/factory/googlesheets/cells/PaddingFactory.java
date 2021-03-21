package com.schedulingapp.factory.googlesheets.cells;

import com.google.api.services.sheets.v4.model.Padding;
import com.schedulingapp.factory.Factory;

public class PaddingFactory implements Factory<Padding> {
    //
    // Fields
    //

    private Integer top;
    private Integer right;
    private Integer bottom;
    private Integer left;

    //
    // Constructor
    //

    public PaddingFactory() {
        top = null;
        right = null;
        bottom = null;
        left = null;
    }

    //
    // Public Methods
    //

    @Override
    public Padding build() {
        // Declare Variables
        Padding padding = new Padding();

        // Format cellFormat to match member variables
        if (top != null) {
            padding.setTop(top);
        }

        if (bottom != null) {
            padding.setBottom(bottom);
        }

        if (left != null) {
            padding.setLeft(left);
        }

        if (right != null) {
            padding.setRight(right);
        }

        return padding;
    }

    //
    // Accessor Methods
    //

    public void setTop(Integer top) {
        this.top = top;
    }

    public void setRight(Integer right) {
        this.right = right;
    }

    public void setBottom(Integer bottom) {
        this.bottom = bottom;
    }

    public void setLeft(Integer left) {
        this.left = left;
    }
}
