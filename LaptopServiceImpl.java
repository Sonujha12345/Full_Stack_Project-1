package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Laptop;
import com.example.demo.repository.LaptopRepository;
import com.example.demo.service.LaptopService;
@Service
public class LaptopServiceImpl implements LaptopService {
	@Autowired
	LaptopRepository laptopRepository;

	public List<Laptop> getLaptop() {
		return laptopRepository.findAll();
	}

	public Laptop postLaptop(Laptop laptop) {
       return laptopRepository.save(laptop);
    }

	public Laptop putLaptop(Laptop laptop) {
		
		return laptopRepository.save(laptop);
	}

	public String deleteLaptop(int id) {
		laptopRepository.deleteById(id);
		return "DElete success..";
	}

}
