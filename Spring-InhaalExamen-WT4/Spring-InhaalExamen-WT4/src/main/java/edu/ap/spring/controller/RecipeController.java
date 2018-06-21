package edu.ap.spring.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import edu.ap.spring.jpa.Recipe;
import edu.ap.spring.jpa.RecipeRepository;

@Controller
public class RecipeController {
	
   @Autowired
   RecipeRepository repository;
   
   @RequestMapping("/")
   @ResponseBody
   public String recipe() {
	   return "recipe";
   }   

   @PostMapping("/recipe")
   public String setRecipe(@RequestParam("naam") String naam, 
		   				 @RequestParam("ingredienten") String ingredienten,
		   				 @RequestParam("datum") Date datum,
		   				 Model model) {

      model.addAttribute("naam", naam);
      model.addAttribute("ingredienten", ingredienten);
      model.addAttribute("datum", datum);
      
      repository.save(new Recipe(naam, ingredienten, datum));
      
      return "result";
   }
}
