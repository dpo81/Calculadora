package com.example.dpo.calculadora.Main;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DPO on 26/8/2017.
 */

public class Model {
    List<String> operation;
    Double result;

    public Model() {
        operation = new ArrayList<String>();
    }

    public List<String>  getOperation() {
        return operation;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }

}
