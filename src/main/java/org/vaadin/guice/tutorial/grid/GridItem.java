package org.vaadin.guice.tutorial.grid;

import org.vaadin.guice.tutorial.CurrentUserRole;

public class GridItem {
    private final CurrentUserRole classification;
    private final String description;
    private final int id;

    public GridItem(CurrentUserRole classification, String description, int id) {
        this.classification = classification;
        this.description = description;
        this.id = id;
    }

    public CurrentUserRole getClassification() {
        return classification;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }
}
