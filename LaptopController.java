package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.entity.Laptop;
import com.example.demo.serviceimpl.LaptopServiceImpl;

@Controller
public class LaptopController {
	@Autowired
	LaptopServiceImpl  laptopserviceImpl ;
	@GetMapping(value = "/get")
	public String getLaptop(Model model){
		model.addAttribute("laptop", laptopserviceImpl.getLaptop());
		return "viewlaptop";
		}
	
	
	
	
	
	
	@PostMapping(value = "/post")
	public Laptop posLaptop(@RequestBody Laptop laptop){
		 return laptopserviceImpl.postLaptop(laptop);
		}
	
	
	
	@PutMapping(value = "/put/{id}")
	public Laptop putLaptop(@PathVariable int id,@RequestBody Laptop laptop){
		laptop.setId(id);
		return laptopserviceImpl.putLaptop(laptop);
		}
	
	
	
	
	@DeleteMapping(value = "/delete/{id}")
	public String deleteLaptop(@PathVariable int id){
		return laptopserviceImpl.deleteLaptop(id);
		}

}
