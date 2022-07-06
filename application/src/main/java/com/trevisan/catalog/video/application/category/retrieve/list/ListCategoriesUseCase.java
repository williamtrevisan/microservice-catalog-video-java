package com.trevisan.catalog.video.application.category.retrieve.list;

import com.trevisan.catalog.video.application.UseCase;
import com.trevisan.catalog.video.domain.category.CategorySearchQuery;
import com.trevisan.catalog.video.domain.pagination.Pagination;

public abstract class ListCategoriesUseCase
        extends UseCase<CategorySearchQuery, Pagination<CategoryListOutput>> {
}
