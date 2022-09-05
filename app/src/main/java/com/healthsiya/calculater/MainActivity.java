package com.healthsiya.calculater;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText Input;
    private Button one, two, three, four, five, six, seven, eight, nine, zero, dot, multiply, division, percentage, subtract, addition, clear, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Input = findViewById(R.id.edittext_input);
        one = findViewById(R.id.one_btn);
        two = findViewById(R.id.two_btn);
        three = findViewById(R.id.three_btn);
        four = findViewById(R.id.four_btn);
        five = findViewById(R.id.five_btn);
        six = findViewById(R.id.six_btn);
        seven = findViewById(R.id.seven_btn);
        eight = findViewById(R.id.eight_btn);
        nine = findViewById(R.id.nine_btn);
        zero = findViewById(R.id.zero_btn);
        dot = findViewById(R.id.dot_btn);
        multiply = findViewById(R.id.multiply_btn);
        division = findViewById(R.id.div_btn);
        percentage = findViewById(R.id.percentage_btn);
        subtract = findViewById(R.id.sub_btn);
        addition = findViewById(R.id.add_btn);
        clear = findViewById(R.id.clear_btn);
        back = findViewById(R.id.back_btn);

        Input.setShowSoftInputOnFocus(false); // for keyboard

    }

    private void updateText(String strToAdd) {

        String oddString = Input.getText().toString();
        int current_cursor = Input.getSelectionStart();
        String leftString = oddString.substring(0, current_cursor);
        String rightString = oddString.substring(current_cursor);
        Input.setText(String.format("%s%s%s", leftString, strToAdd, rightString));
        Input.setSelection(current_cursor + strToAdd.length());
    }

    public void zeroBtn(View view) {
        updateText(getResources().getString(R.string.zeroText));
    }

    public void oneBtn(View view) {
        updateText(getResources().getString(R.string.oneText));
    }

    public void twoBtn(View view) {
        updateText(getResources().getString(R.string.twoText));
    }

    public void threeBtn(View view) {
        updateText(getResources().getString(R.string.threeText));
    }

    public void fourBtn(View view) {
        updateText(getResources().getString(R.string.fourText));
    }

    public void fiveBtn(View view) {
        updateText(getResources().getString(R.string.fiveText));
    }

    public void sixBtn(View view) {
        updateText(getResources().getString(R.string.sixText));
    }

    public void sevenBtn(View view) {
        updateText(getResources().getString(R.string.sevenText));
    }

    public void eightBtn(View view) {
        updateText(getResources().getString(R.string.eightText));
    }

    public void nineBtn(View view) {
        updateText(getResources().getString(R.string.nineText));
    }

    public void addBtn(View view) {
        updateText(getResources().getString(R.string.addText));
    }

    public void subBtn(View view) {
        updateText(getResources().getString(R.string.subText));
    }

    public void dotBtn(View view) {
        updateText(getResources().getString(R.string.dotText));
    }

    public void clearBtn(View view) {
        Input.setText("");
    }

    public void backBtn(View view) {
        int cursorPos = Input.getSelectionStart();
        int textLine = Input.getText().length();

        if (cursorPos != 0 && textLine != 0) {
            SpannableStringBuilder selection = (SpannableStringBuilder) Input.getText();
            selection.replace(cursorPos - 1, cursorPos, "");
            Input.setText(selection);
            Input.setSelection(cursorPos - 1);
        }
    }


}