package com.trevisan.catalog.video.domain.validation;

import java.util.List;

public interface ValidationHandler {
    ValidationHandler append(Error anError);

    ValidationHandler append(ValidationHandler anHandler);

    ValidationHandler validate(Validation aValidation);

    List<Error> getErrors();

    default boolean hasErrors() {
        return getErrors() != null && !getErrors().isEmpty();
    }

    default Error firstError() {
        if (getErrors() == null || getErrors().isEmpty()) {
            return null;
        }

        return getErrors().get(0);
    }

    public interface Validation {
        void validate();
    }
}
