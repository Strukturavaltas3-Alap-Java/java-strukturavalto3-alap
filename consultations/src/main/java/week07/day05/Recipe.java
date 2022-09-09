package week07.day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recipe {

    private String title;

    private List<String> ingredients;

    private String description;

    public Recipe(String title) {
        this.title = title;
        this.ingredients = new ArrayList<>();
    }

    public Recipe(String title, String description) {
        this(title);
        this.description = description;
    }

    public void addIngredient(String ingredient, String... moreIngredients) {
        ingredients.add(ingredient);
        ingredients.addAll(Arrays.asList(moreIngredients));
    }

    public String getTitle() {
        return title;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public String getDescription() {
        return description;
    }
}
