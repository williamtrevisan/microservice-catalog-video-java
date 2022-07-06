package com.trevisan.catalog.video.application.category.delete;

import com.trevisan.catalog.video.domain.category.CategoryGateway;
import com.trevisan.catalog.video.domain.category.CategoryID;

import java.util.Objects;

public class DefaultDeleteCategoryUseCase extends DeleteCategoryUseCase {
    private final CategoryGateway categoryGateway;

    public DefaultDeleteCategoryUseCase(CategoryGateway categoryGateway) {
        this.categoryGateway = Objects.requireNonNull(categoryGateway);
    }

    @Override
    public void execute(String anIn) {
        this.categoryGateway.deleteById(CategoryID.from(anIn));
    }
}
