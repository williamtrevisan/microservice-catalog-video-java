package com.trevisan.catalog.video.application.category.update;

import com.trevisan.catalog.video.application.UseCase;
import com.trevisan.catalog.video.domain.validation.handler.Notification;
import io.vavr.control.Either;

public abstract class UpdateCategoryUseCase
        extends UseCase<UpdateCategoryCommand, Either<Notification, UpdateCategoryOutput>> {
}
