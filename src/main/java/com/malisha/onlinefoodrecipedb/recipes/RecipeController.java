package com.malisha.onlinefoodrecipedb.recipes;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @RequestMapping(value="add-recipe", method=RequestMethod.GET)
    public String showNewTodo(ModelMap model) {
        Recipe recipe = new Recipe();
        model.put("recipe", recipe);
        return "addrecipe";
    }

    @RequestMapping(value="add-recipe", method=RequestMethod.POST)
    public String addNewTodo(ModelMap model, @Valid Recipe recipe, BindingResult result)
    {
        if(result.hasErrors())  {
            return "addrecipe";
        }
        recipeRepository.save(recipe);
        return "redirect:home";
    }


}
