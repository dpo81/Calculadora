package com.example.dpo.calculadora.Main;

import android.widget.Button;
import android.widget.TextView;

import com.example.dpo.calculadora.R;

/**
 * Created by DPO on 26/8/2017.
 */

public class View {
    Activity activity;
    Button one, two, three, four, five, six, seven, eight, nine, zero, comma, equal, addition, subtraction, multiplication, division;
    OnClickListener onClickListener;
    TextView display;

    public View(Activity activity) {
        this.activity = activity;

        this.one = (Button) this.activity.findViewById(R.id.one);
        this.two = (Button) this.activity.findViewById(R.id.two);
        this.three = (Button) this.activity.findViewById(R.id.three);
        this.four = (Button) this.activity.findViewById(R.id.four);
        this.five = (Button) this.activity.findViewById(R.id.five);
        this.six = (Button) this.activity.findViewById(R.id.six);
        this.seven = (Button) this.activity.findViewById(R.id.seven);
        this.eight = (Button) this.activity.findViewById(R.id.eight);
        this.nine = (Button) this.activity.findViewById(R.id.nine);
        this.zero = (Button) this.activity.findViewById(R.id.zero);
        this.comma = (Button) this.activity.findViewById(R.id.comma);
        this.equal = (Button) this.activity.findViewById(R.id.equal);
        this.addition = (Button) this.activity.findViewById(R.id.addition);
        this.subtraction = (Button) this.activity.findViewById(R.id.subtraction);
        this.multiplication = (Button) this.activity.findViewById(R.id.multiplication);
        this.division = (Button) this.activity.findViewById(R.id.division);

        onClickListener = new OnClickListener(this.activity);

        this.one.setOnClickListener(onClickListener);
        this.two.setOnClickListener(onClickListener);
        this.three.setOnClickListener(onClickListener);
        this.four.setOnClickListener(onClickListener);
        this.five.setOnClickListener(onClickListener);
        this.six.setOnClickListener(onClickListener);
        this.seven.setOnClickListener(onClickListener);
        this.eight.setOnClickListener(onClickListener);
        this.nine.setOnClickListener(onClickListener);
        this.zero.setOnClickListener(onClickListener);
        this.comma.setOnClickListener(onClickListener);
        this.equal.setOnClickListener(onClickListener);
        this.addition.setOnClickListener(onClickListener);
        this.subtraction.setOnClickListener(onClickListener);
        this.multiplication.setOnClickListener(onClickListener);
        this.division.setOnClickListener(onClickListener);

        this.display = (TextView) this.activity.findViewById(R.id.display);
    }

    public void update(Model model) {
        // TODO: 27/8/2017 actualizar los valores de la vista utilizando el modelo que viene como parámetro

        display.setText(Double.toString(model.getResult()));
    }
}
