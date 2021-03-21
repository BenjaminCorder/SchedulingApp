package com.schedulingapp.factory.googlesheets.sheets;

import com.google.api.services.sheets.v4.model.Editors;
import com.schedulingapp.factory.Factory;

import java.util.ArrayList;
import java.util.List;

public class EditorsFactory implements Factory<Editors> {
    //
    // Fields
    //

    private List<String> users;
    private List<String> groups;
    private Boolean domainUsersCanEdit;

    //
    // Constructors
    //

    public EditorsFactory() {
        users = new ArrayList<>();
        groups = new ArrayList<>();
        domainUsersCanEdit = null;
    }

    //
    // Public Methods
    //

    @Override
    public Editors build() {
        // Declare Variables
        Editors editors = new Editors();

        // Format editors
        if(!users.isEmpty()) {
            editors.setUsers(users);
        }

        if(!groups.isEmpty()) {
            editors.setGroups(groups);
        }

        if(domainUsersCanEdit != null) {
            editors.setDomainUsersCanEdit(domainUsersCanEdit);
        }

        return editors;
    }

    //
    // Accessor Methods
    //

    public void setUsers(List<String> users) {
        this.users = users;
    }

    public void addUser(String user) {
        users.add(user);
    }

    public void removeUser(String user) {
        users.remove(user);
    }

    public void setGroups(List<String> groups) {
        this.groups = groups;
    }

    public void addGroup(String group) {
        groups.add(group);
    }

    public void removeGroup(String group) {
        groups.remove(group);
    }

    public void setDomainUsersCanEdit(Boolean domainUsersCanEdit) {
        this.domainUsersCanEdit = domainUsersCanEdit;
    }
}
