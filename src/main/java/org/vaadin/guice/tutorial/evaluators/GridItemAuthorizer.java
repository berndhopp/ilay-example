package org.vaadin.guice.tutorial.evaluators;

import org.ilay.api.Authorizer;
import org.vaadin.guice.tutorial.grid.GridItem;

public class GridItemAuthorizer implements Authorizer<GridItem> {

    private final RolePermissionAuthorizer rolePermissionAuthorizer;

    public GridItemAuthorizer(RolePermissionAuthorizer rolePermissionAuthorizer) {
        this.rolePermissionAuthorizer = rolePermissionAuthorizer;
    }

    @Override
    public boolean isGranted(GridItem gridItem) {
        return rolePermissionAuthorizer.isGranted(gridItem.getClassification());
    }

    @Override
    public Class<GridItem> getPermissionClass() {
        return GridItem.class;
    }
}
