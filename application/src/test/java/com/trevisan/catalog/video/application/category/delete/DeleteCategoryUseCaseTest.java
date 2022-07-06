package com.trevisan.catalog.video.application.category.delete;

import com.trevisan.catalog.video.domain.category.Category;
import com.trevisan.catalog.video.domain.category.CategoryGateway;
import com.trevisan.catalog.video.domain.category.CategoryID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;

@ExtendWith(MockitoExtension.class)
public class DeleteCategoryUseCaseTest {
    @InjectMocks
    private DefaultDeleteCategoryUseCase deleteCategoryUseCase;

    @Mock
    private CategoryGateway categoryGateway;

    @BeforeEach
    void cleanUp() {
        Mockito.reset(categoryGateway);
    }

    @Test
    public void givenAValidID_whenCallsDeleteCategory_shouldBeOK() {
        final var aCategory = Category.newCategory("Category name", null, true);
        final var expectedId = aCategory.getId();

        Mockito.doNothing().when(categoryGateway).deleteById(eq(expectedId));

        Assertions.assertDoesNotThrow(() -> deleteCategoryUseCase.execute(expectedId.getValue()));

        Mockito.verify(categoryGateway, times(1)).deleteById(eq(expectedId));
    }

    @Test
    public void givenAInvalidID_whenCallsDeleteCategory_shouldBeOK() {
        final var expectedId = CategoryID.from("123");

        Mockito.doNothing().when(categoryGateway).deleteById(eq(expectedId));

        Assertions.assertDoesNotThrow(() -> deleteCategoryUseCase.execute(expectedId.getValue()));

        Mockito.verify(categoryGateway, times(1)).deleteById(eq(expectedId));
    }

    @Test
    public void givenAValidID_whenGatewayThrowsError_shouldReturnException() {
        final var aCategory = Category.newCategory("Category name", null, true);
        final var expectedId = aCategory.getId();

        Mockito.doThrow(new IllegalStateException("Gateway error"))
                .when(categoryGateway).deleteById(eq(expectedId));

        Assertions.assertThrows(IllegalStateException.class, () -> deleteCategoryUseCase.execute(expectedId.getValue()));

        Mockito.verify(categoryGateway, times(1)).deleteById(eq(expectedId));
    }
}
