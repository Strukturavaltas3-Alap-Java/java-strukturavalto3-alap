package week07.day05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {

    @Test
    void testCreateByTitle() {
        Recipe recipe = new Recipe("Almás pite");

        assertEquals("Almás pite", recipe.getTitle());
        assertEquals(0, recipe.getIngredients().size());
        assertNull(recipe.getDescription());
    }

    @Test
    void testCreateByTitleAndDescription() {
        Recipe recipe = new Recipe("Almás pite", "Nagyon finom süti.");

        assertEquals("Almás pite", recipe.getTitle());
        assertEquals(0, recipe.getIngredients().size());
        assertEquals("Nagyon finom süti.", recipe.getDescription());
    }

    @Test
    void testAddIngredient() {
        Recipe recipe = new Recipe("Almás pite", "Nagyon finom süti.");
        recipe.addIngredient("liszt");
        recipe.addIngredient("cukor", "alma");
        recipe.addIngredient("sütőpor", "citrom", "fahéj");

        assertEquals(6, recipe.getIngredients().size());
        assertEquals("alma", recipe.getIngredients().get(2));
    }
}