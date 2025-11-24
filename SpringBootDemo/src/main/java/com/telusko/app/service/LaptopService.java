package com.telusko.app.service;

import com.telusko.app.model.Laptop;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    public void addLaptop(Laptop laptop) {
        System.out.println("Laptop added...");
    }

    public boolean isGoodForProgramming() {
        return true;
    }
}
