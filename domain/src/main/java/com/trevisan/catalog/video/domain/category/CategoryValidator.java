package com.trevisan.catalog.video.domain.category;

import com.trevisan.catalog.video.domain.validation.Error;
import com.trevisan.catalog.video.domain.validation.ValidationHandler;
import com.trevisan.catalog.video.domain.validation.Validator;

public class CategoryValidator extends Validator {
    private final Category category;

    public CategoryValidator(final Category aCategory, final ValidationHandler aHandler) {
        super(aHandler);
        this.category = aCategory;
    }
    @Override
    public void validate() {
        if (this.category.getName() == null) {
            this.validationHandler().append(new Error("'name' should not be null"));
        }
    }
}
