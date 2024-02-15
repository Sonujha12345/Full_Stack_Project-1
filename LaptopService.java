package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Laptop;

public interface LaptopService {
	public List<Laptop> getLaptop();
	public Laptop postLaptop(Laptop laptop);
	public Laptop putLaptop(Laptop laptop);
	public String deleteLaptop(int id);

}
