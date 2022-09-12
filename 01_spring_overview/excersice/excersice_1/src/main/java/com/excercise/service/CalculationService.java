package com.excercise.service;

import org.springframework.stereotype.Service;

@Service
public class CalculationService implements ICalculationService{

    @Override
    public double exchange(double money) {
        double result =  money*23000;
        return result;
    }
}
