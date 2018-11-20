package com.bhappy.bpmcalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import static com.bhappy.bpmcalculator.R.id;
import static com.bhappy.bpmcalculator.R.layout;

public class MainActivity extends AppCompatActivity {
    Button btn_125, btn_15, btn_175, btn_2, btn_225, btn_25, btn_275, btn_3, btn_325, btn_35, btn_375, btn_4, btn_45, btn_5, btn_55, btn_6, btn_65, btn_7, btn_75, btn_reset;
    EditText inBPM;

    TextView result, multi;
    SeekBar seek;
    float temp, x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        btn_125 = findViewById(id.button5);
        btn_15 = findViewById(id.button6);
        btn_175 = findViewById(id.button7);
        btn_2 = findViewById(id.button);
        btn_225 = findViewById(id.button2);
        btn_25 = findViewById(id.button3);
        btn_275 = findViewById(id.button4);
        btn_3 = findViewById(id.button10);
        btn_325 = findViewById(id.button8);
        btn_35 = findViewById(id.button9);
        btn_375 = findViewById(id.button11);
        btn_4 = findViewById(id.button13);
        btn_45 = findViewById(id.button12);
        btn_5 = findViewById(id.button14);
        btn_55 = findViewById(id.button15);
        btn_6 = findViewById(id.button16);
        btn_65 = findViewById(id.button17);
        btn_7 = findViewById(id.button18);
        btn_75 = findViewById(id.button19);

        btn_reset = findViewById(id.buttonReset);
        inBPM = findViewById(id.input);
        result = findViewById(id.output);
        multi = findViewById(id.mult);
        seek = findViewById(id.seekBar);

        //hide keyboard and cursor on input
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        inBPM.setCursorVisible(false);

        //seekbar function
        seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                inBPM.setText(String.valueOf(progress + 100));
                result.setText(String.valueOf(progress + 100));
                multi.setText(String.valueOf("1x"));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        //button functions
        btn_125.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inBPM.length() > 0) {
                    x = (float) 1.25;
                    multi.setText(String.valueOf(x + "x"));
                    temp = Float.parseFloat(inBPM.getText().toString()) * x;
                    if (temp % 1 == 0)
                        result.setText(String.valueOf((int) temp));
                    else
                        result.setText(String.valueOf(temp));
                }
            }
        });

        btn_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inBPM.length() > 0) {
                    x = (float) 1.5;
                    multi.setText(String.valueOf(x + "x"));
                    temp = Float.parseFloat(inBPM.getText().toString()) * x;
                    if (temp % 1 == 0)
                        result.setText(String.valueOf((int) temp));
                    else
                        result.setText(String.valueOf(temp));
                }
            }
        });

        btn_175.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inBPM.length() > 0) {
                    x = (float) 1.75;
                    multi.setText(String.valueOf(x + "x"));
                    temp = Float.parseFloat(inBPM.getText().toString()) * x;
                    if (temp % 1 == 0)
                        result.setText(String.valueOf((int) temp));
                    else
                        result.setText(String.valueOf(temp));
                }
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inBPM.length() > 0) {
                    x = (float) 2.0;
                    multi.setText(String.valueOf((int) x + "x"));
                    result.setText(String.valueOf(Integer.parseInt(inBPM.getText().toString()) * 2));
                }
            }
        });

        btn_225.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inBPM.length() > 0) {
                    x = (float) 2.25;
                    multi.setText(String.valueOf(x + "x"));
                    temp = Float.parseFloat(inBPM.getText().toString()) * x;
                    if (temp % 1 == 0)
                        result.setText(String.valueOf((int) temp));
                    else
                        result.setText(String.valueOf(temp));
                }
            }
        });

        btn_25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inBPM.length() > 0) {
                    x = (float) 2.5;
                    multi.setText(String.valueOf(x + "x"));
                    temp = Float.parseFloat(inBPM.getText().toString()) * x;
                    if (temp % 1 == 0)
                        result.setText(String.valueOf((int) temp));
                    else
                        result.setText(String.valueOf(temp));
                }
            }
        });

        btn_275.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inBPM.length() > 0) {
                    x = (float) 2.75;
                    multi.setText(String.valueOf(x + "x"));
                    temp = Float.parseFloat(inBPM.getText().toString()) * x;
                    if (temp % 1 == 0)
                        result.setText(String.valueOf((int) temp));
                    else
                        result.setText(String.valueOf(temp));
                }
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inBPM.length() > 0) {
                    x = (float) 3.0;
                    multi.setText(String.valueOf((int) x + "x"));
                    result.setText(String.valueOf(Integer.parseInt(inBPM.getText().toString()) * 3));
                }
            }
        });
        btn_325.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inBPM.length() > 0) {
                    x = (float) 3.25;
                    multi.setText(String.valueOf(x + "x"));
                    temp = Float.parseFloat(inBPM.getText().toString()) * x;
                    if (temp % 1 == 0)
                        result.setText(String.valueOf((int) temp));
                    else
                        result.setText(String.valueOf(temp));
                }
            }
        });
        btn_35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inBPM.length() > 0) {
                    x = (float) 3.5;
                    multi.setText(String.valueOf(x + "x"));
                    temp = Float.parseFloat(inBPM.getText().toString()) * x;
                    if (temp % 1 == 0)
                        result.setText(String.valueOf((int) temp));
                    else
                        result.setText(String.valueOf(temp));
                }
            }
        });

        btn_375.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inBPM.length() > 0) {
                    x = (float) 3.75;
                    multi.setText(String.valueOf(x + "x"));
                    temp = Float.parseFloat(inBPM.getText().toString()) * x;
                    if (temp % 1 == 0)
                        result.setText(String.valueOf((int) temp));
                    else
                        result.setText(String.valueOf(temp));
                }
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inBPM.length() > 0) {
                    x = (float) 4.0;
                    multi.setText(String.valueOf((int) x + "x"));
                    result.setText(String.valueOf(Integer.parseInt(inBPM.getText().toString()) * 4));
                }
            }
        });

        btn_45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inBPM.length() > 0) {
                    x = (float) 4.5;
                    multi.setText(String.valueOf(x + "x"));
                    temp = Float.parseFloat(inBPM.getText().toString()) * x;
                    if (temp % 1 == 0)
                        result.setText(String.valueOf((int) temp));
                    else
                        result.setText(String.valueOf(temp));
                }
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inBPM.length() > 0) {
                    x = (float) 5.0;
                    multi.setText(String.valueOf((int) x + "x"));
                    result.setText(String.valueOf(Integer.parseInt(inBPM.getText().toString()) * 5));
                }
            }
        });

        btn_55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inBPM.length() > 0) {
                    x = (float) 5.5;
                    multi.setText(String.valueOf(x + "x"));
                    temp = Float.parseFloat(inBPM.getText().toString()) * x;
                    if (temp % 1 == 0)
                        result.setText(String.valueOf((int) temp));
                    else
                        result.setText(String.valueOf(temp));
                }
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inBPM.length() > 0) {
                    x = (float) 6.0;
                    multi.setText(String.valueOf((int) x + "x"));
                    result.setText(String.valueOf(Integer.parseInt(inBPM.getText().toString()) * 6));
                }
            }
        });

        btn_65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inBPM.length() > 0) {
                    x = (float) 6.5;
                    multi.setText(String.valueOf(x + "x"));
                    temp = Float.parseFloat(inBPM.getText().toString()) * x;
                    if (temp % 1 == 0)
                        result.setText(String.valueOf((int) temp));
                    else
                        result.setText(String.valueOf(temp));
                }
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inBPM.length() > 0) {
                    x = (float) 7.0;
                    multi.setText(String.valueOf((int) x + "x"));
                    result.setText(String.valueOf(Integer.parseInt(inBPM.getText().toString()) * 7));
                }
            }
        });

        btn_75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inBPM.length() > 0) {
                    x = (float) 7.5;
                    multi.setText(String.valueOf(x + "x"));
                    temp = Float.parseFloat(inBPM.getText().toString()) * x;
                    if (temp % 1 == 0)
                        result.setText(String.valueOf((int) temp));
                    else
                        result.setText(String.valueOf(temp));
                }
            }
        });

        //reset button function
        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seek.setProgress(0);
                inBPM.setText(String.valueOf("100"));
                result.setText(String.valueOf("100"));
                multi.setText(String.valueOf("1x"));
            }
        });

    }
}
