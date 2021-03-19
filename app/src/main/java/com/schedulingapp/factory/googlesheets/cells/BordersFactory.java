package com.schedulingapp.factory.googlesheets.cells;

import com.google.api.services.sheets.v4.model.Border;
import com.google.api.services.sheets.v4.model.Borders;
import com.schedulingapp.factory.Factory;

public class BordersFactory implements Factory<Borders> {
    //
    // Fields
    //

    private Border top;
    private Border bottom;
    private Border left;
    private Border right;

    //
    // Constructor
    //

    public BordersFactory() {
        top = null;
        bottom = null;
        left = null;
        right = null;
    }

    //
    // Public Methods
    //

    @Override
    public Borders generate() {
        // Declare Variables
        Borders borders = new Borders();

        // Format cellFormat to match member variables
        if (top != null) {
            borders.setTop(top);
        }

        if (bottom != null) {
            borders.setBottom(bottom);
        }

        if (left != null) {
            borders.setLeft(left);
        }

        if (right != null) {
            borders.setRight(right);
        }

        return borders;
    }

    //
    // Accessor Methods
    //

    public void setTop(Border top) {
        this.top = top;
    }

    public void setBottom(Border bottom) {
        this.bottom = bottom;
    }

    public void setLeft(Border left) {
        this.left = left;
    }

    public void setRight(Border right) {
        this.right = right;
    }
}
