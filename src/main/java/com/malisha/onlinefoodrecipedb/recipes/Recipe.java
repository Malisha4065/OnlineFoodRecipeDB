package com.malisha.onlinefoodrecipedb.recipes;

public class Recipe {
    private int id;
    private String name;
    private String[] steps;
    private String[] ingredients;
    private float rating;

    public Recipe(int id, String name, String[] steps, String[] ingredients, float rating) {
        this.id = id;
        this.name = name;
        this.steps = steps;
        this.ingredients = ingredients;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSteps() {
        return steps;
    }

    public void setSteps(String[] steps) {
        this.steps = steps;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
