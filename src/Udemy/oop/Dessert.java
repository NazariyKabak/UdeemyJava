package Udemy.oop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Dessert {
    private double price;
    private String [] ingredients;
    public Dessert(double price, String[] ingredients) {
        this.price = price;
        this.ingredients = ingredients;
    }

    public Dessert(Dessert dessert) {
        this.price = dessert.price;
        this.ingredients = Arrays.copyOf(dessert.ingredients, dessert.ingredients.length);
    }
    public Dessert(double price) {
        this.price = price;
        this.ingredients = new String[3];
    }

    public String[] getIngredients() {
        return Arrays.copyOf(this.ingredients, this.ingredients.length);
    }
    public void setIngredients(String[] ingredients) {
        this.ingredients = Arrays.copyOf(ingredients, ingredients.length);
    }
}
