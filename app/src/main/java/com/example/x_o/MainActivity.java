package com.example.x_o;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int Provnakrestandnol = 0;
    int Provnazbut1 = 0;
    int Provnazbut2 = 0;
    int Provnazbut3 = 0;
    int Provnazbut4 = 0;
    int Provnazbut5 = 0;
    int Provnazbut6 = 0;
    int Provnazbut7 = 0;
    int Provnazbut8 = 0;
    int Provnazbut9 = 0;
    int Provnazatie1 = 0;
    int Provnazatie2 = 0;
    int Provnazatie3 = 0;
    int Provnazatie4 = 0;
    int Provnazatie5 = 0;
    int Provnazatie6 = 0;
    int Provnazatie7 = 0;
    int Provnazatie8 = 0;
    int Provnazatie9 = 0;
    int nich = 0;
    public void onClick(View view){

        if (Provnakrestandnol == 0){
            Provnakrestandnol++;
            Button button = findViewById(R.id.button1_1);
            button.setText("X");
            view.setClickable(false);
            Provnazbut1+=2;
            Provnazatie1++;
            nich++;
        }
        else if (Provnakrestandnol == 1)
        {
            Provnakrestandnol--;
            Button button = findViewById(R.id.button1_1);
            button.setText("0");

            view.setClickable(false);
            Provnazbut1++;
            Provnazatie1++;
            nich++;
        }
        if (Provnazbut1 == 1 && Provnazbut5 == 1 && Provnazbut9 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut3 == 1 && Provnazbut5 == 1 && Provnazbut7 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut1 == 1 && Provnazbut4 == 1 && Provnazbut7 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut2 == 1 && Provnazbut5 == 1 && Provnazbut8 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut3 == 1 && Provnazbut6 == 1 && Provnazbut9 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut1 == 1 && Provnazbut2 == 1 && Provnazbut3 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut4 == 1 && Provnazbut5 == 1 && Provnazbut6 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut7 == 1 && Provnazbut8 == 1 && Provnazbut9 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut1 == 2 && Provnazbut5 == 2 && Provnazbut9 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut3 == 2 && Provnazbut5 == 2 && Provnazbut7 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut1 == 2 && Provnazbut4 == 2 && Provnazbut7 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut2 == 2 && Provnazbut5 == 2 && Provnazbut8 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut3 == 2 && Provnazbut6 == 2 && Provnazbut9 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut1 == 2 && Provnazbut2 == 2 && Provnazbut3 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut4 == 2 && Provnazbut5 == 2 && Provnazbut6 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut7 == 2 && Provnazbut8 == 2 && Provnazbut9 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (nich == 9) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Ничья", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
        }
    }

    public void onClick2(View view) {
        if (Provnakrestandnol == 0){
            Provnakrestandnol++;
            Button button = findViewById(R.id.button1_2);
            button.setText("X");
            view.setClickable(false);
            Provnazbut2+=2;
            Provnazatie2++;
            nich++;
        }
        else if (Provnakrestandnol == 1)
        {
            Provnakrestandnol--;
            Button button = findViewById(R.id.button1_2);
            button.setText("0");
            view.setClickable(false);
            Provnazbut2++;
            Provnazatie2++;
            nich++;
        }
        if (Provnazbut1 == 1 && Provnazbut5 == 1 && Provnazbut9 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut3 == 1 && Provnazbut5 == 1 && Provnazbut7 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut1 == 1 && Provnazbut4 == 1 && Provnazbut7 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut2 == 1 && Provnazbut5 == 1 && Provnazbut8 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut3 == 1 && Provnazbut6 == 1 && Provnazbut9 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut1 == 1 && Provnazbut2 == 1 && Provnazbut3 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut4 == 1 && Provnazbut5 == 1 && Provnazbut6 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut7 == 1 && Provnazbut8 == 1 && Provnazbut9 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut1 == 2 && Provnazbut5 == 2 && Provnazbut9 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut3 == 2 && Provnazbut5 == 2 && Provnazbut7 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut1 == 2 && Provnazbut4 == 2 && Provnazbut7 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut2 == 2 && Provnazbut5 == 2 && Provnazbut8 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut3 == 2 && Provnazbut6 == 2 && Provnazbut9 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut1 == 2 && Provnazbut2 == 2 && Provnazbut3 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut4 == 2 && Provnazbut5 == 2 && Provnazbut6 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut7 == 2 && Provnazbut8 == 2 && Provnazbut9 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (nich == 9) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Ничья", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
        }
    }

    public void onClick3(View view) {
        if (Provnakrestandnol == 0){
            Provnakrestandnol++;
            Button button = findViewById(R.id.button1_3);
            button.setText("X");
            view.setClickable(false);
            Provnazbut3+=2;
            Provnazatie3++;
            nich++;
        }
        else if (Provnakrestandnol == 1)
        {
            Provnakrestandnol--;
            Button button = findViewById(R.id.button1_3);
            button.setText("0");
            nich++;
            view.setClickable(false);
            Provnazbut3++;
            Provnazatie3++;
        }
        if (Provnazbut1 == 1 && Provnazbut5 == 1 && Provnazbut9 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut3 == 1 && Provnazbut5 == 1 && Provnazbut7 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut1 == 1 && Provnazbut4 == 1 && Provnazbut7 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut2 == 1 && Provnazbut5 == 1 && Provnazbut8 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut3 == 1 && Provnazbut6 == 1 && Provnazbut9 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut1 == 1 && Provnazbut2 == 1 && Provnazbut3 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut4 == 1 && Provnazbut5 == 1 && Provnazbut6 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut7 == 1 && Provnazbut8 == 1 && Provnazbut9 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut1 == 2 && Provnazbut5 == 2 && Provnazbut9 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut3 == 2 && Provnazbut5 == 2 && Provnazbut7 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut1 == 2 && Provnazbut4 == 2 && Provnazbut7 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut2 == 2 && Provnazbut5 == 2 && Provnazbut8 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut3 == 2 && Provnazbut6 == 2 && Provnazbut9 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut1 == 2 && Provnazbut2 == 2 && Provnazbut3 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut4 == 2 && Provnazbut5 == 2 && Provnazbut6 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut7 == 2 && Provnazbut8 == 2 && Provnazbut9 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (nich == 9) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Ничья", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
        }
    }

    public void onClick4(View view) {
        if (Provnakrestandnol == 0){
            Provnakrestandnol++;
            Button button = findViewById(R.id.button2_1);
            button.setText("X");
            view.setClickable(false);
            Provnazbut4+=2;
            Provnazatie4++;
            nich++;
        }
        else if (Provnakrestandnol == 1)
        {
            Provnakrestandnol--;
            Button button = findViewById(R.id.button2_1);
            button.setText("0");
            nich++;
            view.setClickable(false);
            Provnazbut4++;
            Provnazatie4++;
        }
        if (Provnazbut1 == 1 && Provnazbut5 == 1 && Provnazbut9 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut3 == 1 && Provnazbut5 == 1 && Provnazbut7 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut1 == 1 && Provnazbut4 == 1 && Provnazbut7 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut2 == 1 && Provnazbut5 == 1 && Provnazbut8 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut3 == 1 && Provnazbut6 == 1 && Provnazbut9 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut1 == 1 && Provnazbut2 == 1 && Provnazbut3 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut4 == 1 && Provnazbut5 == 1 && Provnazbut6 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut7 == 1 && Provnazbut8 == 1 && Provnazbut9 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut1 == 2 && Provnazbut5 == 2 && Provnazbut9 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut3 == 2 && Provnazbut5 == 2 && Provnazbut7 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut1 == 2 && Provnazbut4 == 2 && Provnazbut7 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut2 == 2 && Provnazbut5 == 2 && Provnazbut8 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut3 == 2 && Provnazbut6 == 2 && Provnazbut9 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut1 == 2 && Provnazbut2 == 2 && Provnazbut3 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut4 == 2 && Provnazbut5 == 2 && Provnazbut6 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut7 == 2 && Provnazbut8 == 2 && Provnazbut9 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (nich == 9) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Ничья", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
        }
    }

    public void onClick5(View view) {
        if (Provnakrestandnol == 0){
            Provnakrestandnol++;
            Button button = findViewById(R.id.button2_2);
            button.setText("X");
            view.setClickable(false);
            Provnazbut5+=2;
            Provnazatie5++;
            nich++;
        }
        else if (Provnakrestandnol == 1)
        {
            Provnakrestandnol--;
            Button button = findViewById(R.id.button2_2);
            button.setText("0");
            nich++;
            view.setClickable(false);
            Provnazbut5++;
            Provnazatie5++;
        }
        if (Provnazbut1 == 1 && Provnazbut5 == 1 && Provnazbut9 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut3 == 1 && Provnazbut5 == 1 && Provnazbut7 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut1 == 1 && Provnazbut4 == 1 && Provnazbut7 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut2 == 1 && Provnazbut5 == 1 && Provnazbut8 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut3 == 1 && Provnazbut6 == 1 && Provnazbut9 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut1 == 1 && Provnazbut2 == 1 && Provnazbut3 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut4 == 1 && Provnazbut5 == 1 && Provnazbut6 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut7 == 1 && Provnazbut8 == 1 && Provnazbut9 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut1 == 2 && Provnazbut5 == 2 && Provnazbut9 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut3 == 2 && Provnazbut5 == 2 && Provnazbut7 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut1 == 2 && Provnazbut4 == 2 && Provnazbut7 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut2 == 2 && Provnazbut5 == 2 && Provnazbut8 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut3 == 2 && Provnazbut6 == 2 && Provnazbut9 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut1 == 2 && Provnazbut2 == 2 && Provnazbut3 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut4 == 2 && Provnazbut5 == 2 && Provnazbut6 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut7 == 2 && Provnazbut8 == 2 && Provnazbut9 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (nich == 9) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Ничья", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
        }
    }

    public void onClick6(View view) {
        if (Provnakrestandnol == 0){
            Provnakrestandnol++;
            Button button = findViewById(R.id.button2_3);
            button.setText("X");
            view.setClickable(false);
            Provnazbut6+=2;
            Provnazatie6++;
            nich++;
        }
        else if (Provnakrestandnol == 1)
        {
            Provnakrestandnol--;
            Button button = findViewById(R.id.button2_3);
            button.setText("0");
            nich++;
            view.setClickable(false);
            Provnazbut6++;
            Provnazatie6++;
        }
        if (Provnazbut1 == 1 && Provnazbut5 == 1 && Provnazbut9 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut3 == 1 && Provnazbut5 == 1 && Provnazbut7 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut1 == 1 && Provnazbut4 == 1 && Provnazbut7 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut2 == 1 && Provnazbut5 == 1 && Provnazbut8 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut3 == 1 && Provnazbut6 == 1 && Provnazbut9 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut1 == 1 && Provnazbut2 == 1 && Provnazbut3 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut4 == 1 && Provnazbut5 == 1 && Provnazbut6 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut7 == 1 && Provnazbut8 == 1 && Provnazbut9 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut1 == 2 && Provnazbut5 == 2 && Provnazbut9 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut3 == 2 && Provnazbut5 == 2 && Provnazbut7 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut1 == 2 && Provnazbut4 == 2 && Provnazbut7 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut2 == 2 && Provnazbut5 == 2 && Provnazbut8 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut3 == 2 && Provnazbut6 == 2 && Provnazbut9 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut1 == 2 && Provnazbut2 == 2 && Provnazbut3 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut4 == 2 && Provnazbut5 == 2 && Provnazbut6 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut7 == 2 && Provnazbut8 == 2 && Provnazbut9 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (nich == 9) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Ничья", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
        }
    }

    public void onClick7(View view) {
        if (Provnakrestandnol == 0){
            Provnakrestandnol++;
            Button button = findViewById(R.id.button3_1);
            button.setText("X");
            view.setClickable(false);
            Provnazbut7+=2;
            Provnazatie7++;
            nich++;
        }
        else if (Provnakrestandnol == 1)
        {
            Provnakrestandnol--;
            Button button = findViewById(R.id.button3_1);
            button.setText("0");
            nich++;
            view.setClickable(false);
            Provnazbut7++;
            Provnazatie7++;
        }
        if (Provnazbut1 == 1 && Provnazbut5 == 1 && Provnazbut9 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut3 == 1 && Provnazbut5 == 1 && Provnazbut7 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut1 == 1 && Provnazbut4 == 1 && Provnazbut7 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut2 == 1 && Provnazbut5 == 1 && Provnazbut8 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut3 == 1 && Provnazbut6 == 1 && Provnazbut9 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut1 == 1 && Provnazbut2 == 1 && Provnazbut3 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut4 == 1 && Provnazbut5 == 1 && Provnazbut6 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut7 == 1 && Provnazbut8 == 1 && Provnazbut9 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut1 == 2 && Provnazbut5 == 2 && Provnazbut9 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut3 == 2 && Provnazbut5 == 2 && Provnazbut7 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut1 == 2 && Provnazbut4 == 2 && Provnazbut7 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut2 == 2 && Provnazbut5 == 2 && Provnazbut8 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut3 == 2 && Provnazbut6 == 2 && Provnazbut9 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut1 == 2 && Provnazbut2 == 2 && Provnazbut3 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut4 == 2 && Provnazbut5 == 2 && Provnazbut6 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut7 == 2 && Provnazbut8 == 2 && Provnazbut9 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (nich == 9) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Ничья", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
        }
    }

    public void onClick8(View view) {
        if (Provnakrestandnol == 0){
            Provnakrestandnol++;
            Button button = findViewById(R.id.button3_2);
            button.setText("X");
            view.setClickable(false);
            Provnazbut8+=2;
            Provnazatie8++;
            nich++;
        }
        else if (Provnakrestandnol == 1)
        {
            Provnakrestandnol--;
            Button button = findViewById(R.id.button3_2);
            button.setText("0");
            view.setClickable(false);
            Provnazbut8++;
            Provnazatie8++;
            nich++;
        }
        if (Provnazbut1 == 1 && Provnazbut5 == 1 && Provnazbut9 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut3 == 1 && Provnazbut5 == 1 && Provnazbut7 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut1 == 1 && Provnazbut4 == 1 && Provnazbut7 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut2 == 1 && Provnazbut5 == 1 && Provnazbut8 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut3 == 1 && Provnazbut6 == 1 && Provnazbut9 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut1 == 1 && Provnazbut2 == 1 && Provnazbut3 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut4 == 1 && Provnazbut5 == 1 && Provnazbut6 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut7 == 1 && Provnazbut8 == 1 && Provnazbut9 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut1 == 2 && Provnazbut5 == 2 && Provnazbut9 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut3 == 2 && Provnazbut5 == 2 && Provnazbut7 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut1 == 2 && Provnazbut4 == 2 && Provnazbut7 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut2 == 2 && Provnazbut5 == 2 && Provnazbut8 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut3 == 2 && Provnazbut6 == 2 && Provnazbut9 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut1 == 2 && Provnazbut2 == 2 && Provnazbut3 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut4 == 2 && Provnazbut5 == 2 && Provnazbut6 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut7 == 2 && Provnazbut8 == 2 && Provnazbut9 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (nich == 9) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Ничья", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
        }
    }

    public void onClick9(View view) {
        if (Provnakrestandnol == 0){
            Provnakrestandnol++;
            Button button = findViewById(R.id.button3_3);
            button.setText("X");
            view.setClickable(false);
            Provnazbut9+=2;
            Provnazatie9++;
            nich++;
        }
        else if (Provnakrestandnol == 1)
        {
            Provnakrestandnol--;
            Button button = findViewById(R.id.button3_3);
            button.setText("0");
            view.setClickable(false);
            Provnazbut9++;
            Provnazatie9++;
            nich++;
        }
        if (Provnazbut1 == 1 && Provnazbut5 == 1 && Provnazbut9 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut3 == 1 && Provnazbut5 == 1 && Provnazbut7 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut1 == 1 && Provnazbut4 == 1 && Provnazbut7 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut2 == 1 && Provnazbut5 == 1 && Provnazbut8 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut3 == 1 && Provnazbut6 == 1 && Provnazbut9 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut1 == 1 && Provnazbut2 == 1 && Provnazbut3 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut4 == 1 && Provnazbut5 == 1 && Provnazbut6 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut7 == 1 && Provnazbut8 == 1 && Provnazbut9 == 1) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа 0", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut1 == 2 && Provnazbut5 == 2 && Provnazbut9 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut3 == 2 && Provnazbut5 == 2 && Provnazbut7 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut1 == 2 && Provnazbut4 == 2 && Provnazbut7 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut2 == 2 && Provnazbut5 == 2 && Provnazbut8 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut3 == 2 && Provnazbut6 == 2 && Provnazbut9 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut1 == 2 && Provnazbut2 == 2 && Provnazbut3 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut4 == 2 && Provnazbut5 == 2 && Provnazbut6 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (Provnazbut7 == 2 && Provnazbut8 == 2 && Provnazbut9 == 2) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Победа X", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
            Button button = findViewById(R.id.button1_1);
            Button button2 = findViewById(R.id.button1_2);
            Button button3 = findViewById(R.id.button1_3);
            Button button4 = findViewById(R.id.button2_1);
            Button button5 = findViewById(R.id.button2_2);
            Button button6 = findViewById(R.id.button2_3);
            Button button7 = findViewById(R.id.button3_1);
            Button button8 = findViewById(R.id.button3_2);
            Button button9 = findViewById(R.id.button3_3);
            button.setClickable(false);
            button2.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button6.setClickable(false);
            button7.setClickable(false);
            button8.setClickable(false);
            button9.setClickable(false);
        }
        else if (nich == 9) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Ничья", Toast.LENGTH_SHORT);
            toast.show();
            nich--;
        }
    }

    public void Ref(View view) {
        Button button = findViewById(R.id.button1_1);
        button.setText("");
        Button button2 = findViewById(R.id.button1_2);
        button2.setText("");
        Button button3 = findViewById(R.id.button1_3);
        button3.setText("");
        Button button4 = findViewById(R.id.button2_1);
        button4.setText("");
        Button button5 = findViewById(R.id.button2_2);
        button5.setText("");
        Button button6 = findViewById(R.id.button2_3);
        button6.setText("");
        Button button7 = findViewById(R.id.button3_1);
        button7.setText("");
        Button button8 = findViewById(R.id.button3_2);
        button8.setText("");
        Button button9 = findViewById(R.id.button3_3);
        button9.setText("");
        Provnakrestandnol = 0;
        Provnazbut1 = 0;
        Provnazbut2 = 0;
        Provnazbut3 = 0;
        Provnazbut4 = 0;
        Provnazbut5 = 0;
        Provnazbut6 = 0;
        Provnazbut7 = 0;
        Provnazbut8 = 0;
        Provnazbut9 = 0;
        Provnazatie1 = 0;
        Provnazatie2 = 0;
        Provnazatie3 = 0;
        Provnazatie4 = 0;
        Provnazatie5 = 0;
        Provnazatie6 = 0;
        Provnazatie7 = 0;
        Provnazatie8 = 0;
        Provnazatie9 = 0;
        nich = 0;
        button.setClickable(true);
        button2.setClickable(true);
        button3.setClickable(true);
        button4.setClickable(true);
        button5.setClickable(true);
        button6.setClickable(true);
        button7.setClickable(true);
        button8.setClickable(true);
        button9.setClickable(true);
    }
}