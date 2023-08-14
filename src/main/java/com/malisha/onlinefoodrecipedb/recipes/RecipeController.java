package com.malisha.onlinefoodrecipedb.recipes;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;

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
    public String showNewRecipe(ModelMap model) {
        Recipe recipe = new Recipe();
        model.put("recipe", recipe);
        return "addrecipe";
    }

    @RequestMapping(value="add-recipe", method=RequestMethod.POST)
    public String addNewRecipe(ModelMap model, @Valid Recipe recipe, BindingResult result)
    {
        if(result.hasErrors())  {
            return "addrecipe";
        }
        recipeRepository.save(recipe);
        return "redirect:home";
    }

    @RequestMapping("delete-recipe")
    public String deleteRecipe(@RequestParam int id)
    {
        recipeRepository.deleteById(id);
        return "redirect:home";
    }

    @RequestMapping(value="update-recipe", method=RequestMethod.GET)
    public String showUpdateRecipePage(ModelMap model, @RequestParam int id)
    {
        Recipe recipe = recipeRepository.findById(id).get();
        model.addAttribute("recipe", recipe);
        return "addrecipe";
    }

    @RequestMapping(value="update-recipe", method=RequestMethod.POST)
    public String updateRecipe(ModelMap model, @Valid Recipe recipe, BindingResult result)
    {
        if (result.hasErrors()) {
            return "addrecipe";
        }
        recipeRepository.save(recipe);
        return "redirect:home";
    }
}