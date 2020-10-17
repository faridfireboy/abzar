package com.example.abzar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

import static android.view.View.*;

public class cal extends AppCompatActivity {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnPercnt, btnBracket, btnPlus, btnMinus, btnMultiply, btnDivision, btnEqual, btnClear, btnDot;
    TextView tvInput, tvOutput;
    String Process;
    boolean checkBracket = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnDivision = findViewById(R.id.btnDivision);
        btnMultiply = findViewById(R.id.btnMultiply);

        btnEqual = findViewById(R.id.btnEqual);

        btnClear = findViewById(R.id.btnClear);

        btnDot = findViewById(R.id.btnDot);
        btnPercnt = findViewById(R.id.btnPercnt);


        tvInput = findViewById(R.id.tvInput);
        tvOutput = findViewById(R.id.tvOutput);

        btnClear.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText("");
                tvOutput.setText("");
            }
        });

        btn0.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Process = tvInput.getText().toString();
                tvInput.setText(Process + "0");
            }
        });
        btn1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Process = tvInput.getText().toString();
                tvInput.setText(Process + "1");
            }
        });
        btn2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Process = tvInput.getText().toString();
                tvInput.setText(Process + "2");
            }
        });
        btn3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Process = tvInput.getText().toString();
                tvInput.setText(Process + "3");
            }
        });
        btn4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Process = tvInput.getText().toString();
                tvInput.setText(Process + "4");
            }
        });
        btn5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Process = tvInput.getText().toString();
                tvInput.setText(Process + "5");
            }
        });
        btn6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Process = tvInput.getText().toString();
                tvInput.setText(Process + "6");
            }
        });
        btn7.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Process = tvInput.getText().toString();
                tvInput.setText(Process + "7");
            }
        });
        btn8.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Process = tvInput.getText().toString();
                tvInput.setText(Process + "8");
            }
        });
        btn9.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Process = tvInput.getText().toString();
                tvInput.setText(Process + "9");
            }
        });
        btnPlus.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Process = tvInput.getText().toString();
                tvInput.setText(Process + "+");
            }
        });
        btnMinus.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Process = tvInput.getText().toString();
                tvInput.setText(Process + "-");
            }
        });
        btnMultiply.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Process = tvInput.getText().toString();
                tvInput.setText(Process + "X");
            }
        });
        btnDivision.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Process = tvInput.getText().toString();
                tvInput.setText(Process + "/");
            }
        });
        btnDot.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Process = tvInput.getText().toString();
                tvInput.setText(Process + ".");
            }
        });
        btnPercnt.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Process = tvInput.getText().toString();
                tvInput.setText(Process + "%");
            }
        });
        /*
        btnBracket.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBracket) {
                    Process = tvInput.getText().toString();
                    tvInput.setText(Process + ")");
                    checkBracket = false;
                } else {
                    Process = tvInput.getText().toString();
                    tvInput.setText(Process + "(");
                    checkBracket = true;
                }


            }
        });
        btnEqual.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Process = tvInput.getText().toString();

                Process = Process.replace("X", "*");
                Process = Process.replace("%", "/100");

                Context rhino = Context.enter();

                rhino.setOptimizationLevel(-1);

                String finalResult = "";

                try {
                    Scriptable scriptable = rhino.initStandardObjects();
                    finalResult = rhino.evaluateString(scriptable, Process, "javascript", 1, null).toString();
                } catch (Exception e) {
                    finalResult = "0";
                }
                tvOutput.setText(finalResult);

            }

        });

*/
    }
}
