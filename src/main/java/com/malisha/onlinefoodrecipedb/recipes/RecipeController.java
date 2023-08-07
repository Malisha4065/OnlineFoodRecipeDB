package com.malisha.onlinefoodrecipedb.recipes;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class RecipeController {
    private RecipeRepository recipeRepository;
    public RecipeController(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @RequestMapping("home")
    public String showHomePage(ModelMap model) {
        List<Recipe> recipes = recipeRepository.findAll();
        model.addAttribute("recipes", recipes);
        return "index";
    }

    @RequestMapping("welcome")
    public String showWelcome() {
        return "welcome";
    }

    @RequestMapping("add-recipe")
    public String addNewTodo() {
        return "addrecipe";
    }
}
