package com.calculator.calculator;

import com.calculator.Exceptions.DivisionByZeroException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public int add(int num1, int num2) {
        return num1 + num2;
    }
    public int minus(int num1, int num2) {
        return num1 - num2;
    }
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }
    public int divide(int num1, int num2) {
        if (num2==0) {
            throw new DivisionByZeroException();
        }
        return num1 / num2;
    }

}