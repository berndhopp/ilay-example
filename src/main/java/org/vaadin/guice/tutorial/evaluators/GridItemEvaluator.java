package org.vaadin.guice.tutorial.evaluators;

import org.ilay.api.InMemoryAuthorizer;
import org.vaadin.guice.tutorial.grid.GridItem;

public class GridItemEvaluator implements InMemoryAuthorizer<GridItem> {

    private final RolePermissionEvaluator rolePermissionEvaluator;

    public GridItemEvaluator(RolePermissionEvaluator rolePermissionEvaluator) {
        this.rolePermissionEvaluator = rolePermissionEvaluator;
    }

    @Override
    public boolean isGranted(GridItem gridItem) {
        return rolePermissionEvaluator.isGranted(gridItem.getClassification());
    }

    @Override
    public Class<GridItem> getPermissionClass() {
        return GridItem.class;
    }
}
