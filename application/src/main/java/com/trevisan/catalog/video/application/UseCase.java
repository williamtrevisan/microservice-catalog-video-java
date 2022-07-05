package com.trevisan.catalog.video.application;

import com.trevisan.catalog.video.domain.category.Category;

public class UseCase {
    public Category execute() {
        return new Category();
    }
}