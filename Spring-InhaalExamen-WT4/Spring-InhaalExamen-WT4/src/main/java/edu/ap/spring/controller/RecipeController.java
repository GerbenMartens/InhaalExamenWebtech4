package edu.ap.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RecipeController {
   
   @RequestMapping("/")
   @ResponseBody
   public String helloWorld() {

	   return "Hello World";
   }   
}
