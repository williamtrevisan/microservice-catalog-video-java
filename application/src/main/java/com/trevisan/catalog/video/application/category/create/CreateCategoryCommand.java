package com.trevisan.catalog.video.application.category.create;

public record CreateCategoryCommand(
        String name,
        String description,
        boolean isActive
) {
    public static CreateCategoryCommand with(
            final String aName,
            final String aDescription,
            final boolean isActive
    ) {
        return new CreateCategoryCommand(aName, aDescription, isActive);
    }
}
