package exoOCP;

import java.security.InvalidParameterException;

public class Calculator {
    public void calculate(CalculatorOperation operation) {
        if (operation == null) {
            throw new InvalidParameterException("Can not perform operation"); }
        if (operation instanceof Addition) {
            Addition addition = (Addition) operation;
            addition.setResult(addition.addition());} 
        else if (operation instanceof Substraction) {
            Substraction substraction = (Substraction) operation;
            substraction.setResult(substraction.substraction());
        }}
}
