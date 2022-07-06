package com.trevisan.catalog.video.application.category.update;

import com.trevisan.catalog.video.domain.category.Category;
import com.trevisan.catalog.video.domain.category.CategoryID;

public record UpdateCategoryOutput(
        CategoryID id
) {
    public static UpdateCategoryOutput from(final Category aCategory) {
        return new UpdateCategoryOutput(aCategory.getId());
    }
}
