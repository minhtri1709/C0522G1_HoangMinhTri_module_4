package com.excersice.service.impl;

import com.excersice.service.ICalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements ICalculatorService {

    @Override
    public String result(String numberFirst, String numberSecond, String operation) {
        try {

            double number1 = Double.parseDouble(numberFirst);
            double number2 = Double.parseDouble(numberSecond);
            double result = 0;

            switch (operation) {
                case "addition":
                    result = number1 + number2;
                    break;
                case "subtraction":
                    result = number1 - number2;
                    break;
                case "multiplication":
                    result = number1 * number2;
                    break;
                case "division":
                    if (number2 == 0) {
                        return "Can not devide for 0";
                    }
                    result = number1 / number2;
                    break;
            }
            return String.valueOf(result);
        }catch(NumberFormatException e){
            return "Please input the number";
        }
    }
}
