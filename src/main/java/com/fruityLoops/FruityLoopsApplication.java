package com.fruityLoops;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fruityLoops.models.Item;

@SpringBootApplication
public class FruityLoopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FruityLoopsApplication.class, args);
	}
	
	@Controller
	public class ItemController {
	    
	    @RequestMapping("/")
	    public String index(Model model) {
	        
	        ArrayList<Item> fruits = new ArrayList<Item>();
	        fruits.add(new Item("Kiwi", 1.5));
	        fruits.add(new Item("Mango", 2.0));
	        fruits.add(new Item("Bayas de Goji", 4.0));
	        fruits.add(new Item("Guayava", .75));
	        fruits.add(new Item("Papaya", 15.88));
	        fruits.add(new Item("Manzana de la Sierra", 1.5));
	        fruits.add(new Item("Pera", 1.8));
	        fruits.add(new Item("Banana de Isla", 0.8));
	        
	        
	        model.addAttribute("frutas", fruits);
	        
	        return "index.jsp";
	    }
	}

}
