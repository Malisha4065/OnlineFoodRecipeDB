package com.malisha.onlinefoodrecipedb.recipes;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RecipeController {
    public RecipeController() {
    }

    @RequestMapping("home")
    public String showHomePage(ModelMap model) {
        return "index";
    }

    @RequestMapping("welcome")
    public String showWelcome() {
        return "welcome";
    }
}
