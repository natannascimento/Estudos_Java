package com.telusko.app.service;

import com.telusko.app.repository.LaptopRepository;
import com.telusko.app.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository laptopRepository;

    public void addLaptop(Laptop laptop) {
        laptopRepository.save(laptop);
    }

    public boolean isGoodForProgramming() {
        return true;
    }
}
