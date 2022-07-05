package com.trevisan.catalog.video.application.category.create;

import com.trevisan.catalog.video.application.UseCase;
import com.trevisan.catalog.video.domain.validation.handler.Notification;
import io.vavr.control.Either;

public abstract class CreateCategoryUseCase
        extends UseCase<CreateCategoryCommand, Either<Notification, CreateCategoryOutput>> {
}
