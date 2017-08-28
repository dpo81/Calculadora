package com.example.dpo.calculadora.Main;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DPO on 26/8/2017.
 */

public class Controller {
    Activity activity;
    Model model;

    public Controller(Activity activity) {
        this.activity = activity;
        model = new Model();
    }

    public void updateOperation(String choice) {
        List<String> operation = model.getOperation();
        Double result;

        // TODO: 27/8/2017 si es el primer elemento a insertar en model.operation, validar que sea un número
        // TODO: 27/8/2017 si se pulsó la coma, validar que el último elemento de model.operation sea un número
        // TODO: 27/8/2017 si se pulsó el igual dos veces, resetear la operación
        // TODO: 27/8/2017 si se pulsó un número, concatenarlo al último elemento de model.operation si es que también es un número
        // TODO: 27/8/2017 si se ingresan dos operadores seguidos , el último es el que vale

        /*
        if (operation.size() == 0) {
            //if(choice.matches("^[+-]?\\d+$")){
            operation.add("9.0");
            //}
        } else {
            operation.add("1.0");
        }
        */

        operation.add(choice);
        operation = model.getOperation();

        // solo se realiza el cálculo cuando la cantidad de elementos del array es impar, lo elementos impares son los operandos
        if ((operation.size() % 2) == 1) {
            model.setResult(resolveOperation(operation));
            activity.getView().update(model);
        }
    }

    private Double resolveOperation(final List<String> value) {
        // TODO: 27/8/2017 recorrer model.operation, realizar la operación, actualizar model.result y actualizar la vista
        // TODO: 27/8/2017 si se pulsó el igual luego de pulsar un operador, utilizar como último operando el resultado parcial de la operación ("2+3+=" = 10)

        List<String> operation = new ArrayList<String>(value);
        Double operand;
        String operator = null;
        Double result = null;
        Integer len = operation.size();

        // si todavía no se ingresó el segundo operando, retorno el primero
        if(len == 1) return Double.parseDouble(operation.get(0));

        // el operando es siempre el último ítem del array
        operand = Double.parseDouble(operation.get(len - 1));
        // el operador es el item del array anterior al operando
        operator = operation.get(len - 2);

        // se eliminan del array el operando y el operador que se están evaluando en esta iteración
        operation.remove(len - 1);
        operation.remove(len - 2);

        switch (operator) {
            case "+":
                result = resolveOperation(operation) + operand;
                break;
            case "-":
                result = resolveOperation(operation) - operand;
                break;
            case "*":
                result = resolveOperation(operation) * operand;
                break;
            case "/":
                // TODO: 27/8/2017 validar que el divisor no sea cero
                if (operand != 0){
                    result = resolveOperation(operation) / operand;
                }
                else{
                    result = 0.0;
                }
                break;
        }

        Log.d("calculo", Double.toString(operand) + "; " + operator + "; " + Double.toString(result));
        return result;
    }
}
