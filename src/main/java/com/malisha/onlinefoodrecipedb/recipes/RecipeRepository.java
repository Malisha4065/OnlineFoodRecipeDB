package com.malisha.onlinefoodrecipedb.recipes;

import com.malisha.onlinefoodrecipedb.users.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecipeRepository extends JpaRepository<Recipe, Integer> {
    public List<Recipe> findByUsername(String username);
}
