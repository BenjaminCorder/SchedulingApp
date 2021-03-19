package com.schedulingapp.factory.googlesheets.pivottables;

import com.google.api.services.sheets.v4.model.ManualRule;
import com.google.api.services.sheets.v4.model.ManualRuleGroup;
import com.schedulingapp.factory.Factory;

import java.util.ArrayList;
import java.util.List;

public class ManualRuleFactory implements Factory<ManualRule> {
    //
    // Fields
    //

    private List<ManualRuleGroup> groups;

    //
    // Constructor
    //

    public ManualRuleFactory() {
        groups = new ArrayList<>();
    }

    //
    // Public Methods
    //

    @Override
    public ManualRule generate() {
        // Declare Variables
        ManualRule rule = new ManualRule();

        // Format rule
        if (!groups.isEmpty()) {
            rule.setGroups(groups);
        }

        return rule;
    }

    //
    // Accessor Methods
    //

    public void setGroups(List<ManualRuleGroup> groups) {
        this.groups = groups;
    }

    public void addGroup(ManualRuleGroup group) {
        groups.add(group);
    }

    public void removeGroup(ManualRuleGroup group) {
        groups.remove(group);
    }
}
