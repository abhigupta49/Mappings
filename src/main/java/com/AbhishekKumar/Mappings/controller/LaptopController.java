package com.AbhishekKumar.Mappings.controller;

import com.AbhishekKumar.Mappings.model.Laptop;
import com.AbhishekKumar.Mappings.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {
    @Autowired
    LaptopService laptopService;
    @PostMapping("laptop")
    public String addLaptop(@RequestBody Laptop laptop){
        return laptopService.addLaptop(laptop);
    }
    @GetMapping("laptops")
    public List<Laptop> getAllLaptops(){
        return laptopService.getAllLaptops();
    }
    @GetMapping("laptop/{laptopId}")
    public Laptop getLaptopById(@PathVariable Long laptopId){
        return laptopService.getLaptopById(laptopId);
    }
    @PutMapping("laptop")
    public String updateLaptop(@RequestBody Laptop laptop){
        return laptopService.updateLaptop(laptop);
    }
    @DeleteMapping("laptop/{laptopId}")
    public String deleteLaptop(@PathVariable Long laptopId){
        return laptopService.deleteLaptop(laptopId);
    }
}
