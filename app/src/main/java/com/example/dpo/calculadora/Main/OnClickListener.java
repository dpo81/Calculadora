package com.example.dpo.calculadora.Main;

import com.example.dpo.calculadora.R;
/**
 * Created by DPO on 26/8/2017.
 */

public class OnClickListener implements android.view.View.OnClickListener {
    Activity activity;

    public OnClickListener(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void onClick(android.view.View v) {
        int month = 8;
        String choice;

        switch (v.getId()) {
            case R.id.one :  choice = "1";
                break;
            case R.id.two:  choice = "2";
                break;
            case R.id.three:  choice = "3";
                break;
            case R.id.four:  choice = "4";
                break;
            case R.id.five:  choice = "5";
                break;
            case R.id.six:  choice = "6";
                break;
            case R.id.seven:  choice = "7";
                break;
            case R.id.eight:  choice = "8";
                break;
            case R.id.nine:  choice = "9";
                break;
            case R.id.zero:  choice = "0";
                break;
            case R.id.comma:  choice = ",";
                break;
            case R.id.equal:  choice = "=";
                break;
            case R.id.addition:  choice = "+";
                break;
            case R.id.subtraction:  choice = "-";
                break;
            case R.id.multiplication:  choice = "*";
                break;
            case R.id.division:  choice = "/";
                break;
            default: choice = "";
                break;
        }

        this.activity.getController().updateOperation(choice);
    }
}
