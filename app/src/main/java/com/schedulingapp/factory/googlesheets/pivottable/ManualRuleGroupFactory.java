package com.schedulingapp.factory.googlesheets.pivottable;

import com.google.api.services.sheets.v4.model.ExtendedValue;
import com.google.api.services.sheets.v4.model.ManualRuleGroup;
import com.schedulingapp.factory.Factory;

import java.util.ArrayList;
import java.util.List;

public class ManualRuleGroupFactory implements Factory<ManualRuleGroup> {
    //
    // Fields
    //

    private ExtendedValue groupName;
    private List<ExtendedValue> items;

    //
    // Constructor
    //

    public ManualRuleGroupFactory() {
        groupName = null;
        items = new ArrayList<>();
    }

    //
    // Public Methods
    //

    @Override
    public ManualRuleGroup generate() {
        // Declare Variables
        ManualRuleGroup group = new ManualRuleGroup();

        // Format group
        if(groupName != null) {
            group.setGroupName(groupName);
        }

        if(!items.isEmpty()) {
            group.setItems(items);
        }

        return group;
    }

    //
    // Accessor Methods
    //

    public void setGroupName(ExtendedValue groupName) {
        this.groupName = groupName;
    }

    public void setItems(List<ExtendedValue> items) {
        this.items = items;
    }

    public void addItem(ExtendedValue item) {
        items.add(item);
    }

    public void removeItem(ExtendedValue item) {
        items.remove(item);
    }
}
