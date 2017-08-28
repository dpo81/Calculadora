package com.example.dpo.calculadora.Main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.dpo.calculadora.R;

public class Activity extends AppCompatActivity {
    View view;
    Controller controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view = new View(this);
        controller = new Controller(this);
    }

    public View getView() {
        return view;
    }

    public Controller getController() {
        return controller;
    }
}
