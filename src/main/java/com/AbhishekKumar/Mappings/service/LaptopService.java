package com.AbhishekKumar.Mappings.service;

import com.AbhishekKumar.Mappings.model.Laptop;
import com.AbhishekKumar.Mappings.repository.ILaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {
    @Autowired
    ILaptopRepo lapTopRepo;
    @Autowired
    StudentService studentService;
    @Autowired
    AddressService addressService;
    public String addLaptop(Laptop laptop) {
        addressService.save(laptop.getStudent().getAddress());
        studentService.save(laptop.getStudent());
        lapTopRepo.save(laptop);
        return "laptop Added!!!";
    }

    public List<Laptop> getAllLaptops() {
        return lapTopRepo.findAll();
    }

    public Laptop getLaptopById(Long laptopId) {
        return lapTopRepo.findByLaptopId(laptopId);
    }

    public String updateLaptop(Laptop laptop) {
        if(lapTopRepo.existsById(laptop.getLaptopId())){
            addressService.save(laptop.getStudent().getAddress());
            studentService.save(laptop.getStudent());
            lapTopRepo.save(laptop);
            return "laptop updated!!!";
        }else{
            return "Invalid credentials !!!";
        }
    }

    public String deleteLaptop(Long laptopId) {
        if(lapTopRepo.existsById(laptopId)){
            lapTopRepo.deleteById(laptopId);
            return "laptop deleted";
        }
        return "Invalid credentials !!!";
    }
}