package com.huhuhuhu9292.treedude;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView textView1, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10
            , textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20
            , textView21, textView22, textView23, textView24, textView25, textView26, textView27, textView28, textView29, textView30;

    TextView textView3_1, textView4_1, textView5_1, textView6_1, textView7_1, textView8_1, textView9_1, textView10_1
            , textView11_1, textView12_1, textView13_1, textView14_1, textView15_1, textView16_1, textView17_1, textView18_1, textView19_1, textView20_1
            , textView21_1, textView22_1, textView23_1, textView24_1, textView25_1, textView26_1, textView27_1, textView28_1, textView29_1, textView30_1;

    Button btn_l, btn_r;

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_l = findViewById(R.id.btn_l);
        btn_r = findViewById(R.id.btn_r);

        textView1 = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);

        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);
        textView7 = findViewById(R.id.textView7);
        textView8 = findViewById(R.id.textView8);
        textView9 = findViewById(R.id.textView9);
        textView10 = findViewById(R.id.textView10);

        textView11 = findViewById(R.id.textView11);
        textView12 = findViewById(R.id.textView12);
        textView13 = findViewById(R.id.textView13);
        textView14 = findViewById(R.id.textView14);
        textView15 = findViewById(R.id.textView15);
        textView16 = findViewById(R.id.textView16);
        textView17 = findViewById(R.id.textView17);
        textView18 = findViewById(R.id.textView18);
        textView19 = findViewById(R.id.textView19);
        textView20 = findViewById(R.id.textView20);

        textView21 = findViewById(R.id.textView21);
        textView22 = findViewById(R.id.textView22);
        textView23 = findViewById(R.id.textView23);
        textView24 = findViewById(R.id.textView24);
        textView25 = findViewById(R.id.textView25);
        textView26 = findViewById(R.id.textView26);
        textView27 = findViewById(R.id.textView27);
        textView28 = findViewById(R.id.textView28);
        textView29 = findViewById(R.id.textView29);
        textView30 = findViewById(R.id.textView30);


        textView3_1 = findViewById(R.id.textView3_1);
        textView4_1 = findViewById(R.id.textView4_1);
        textView5_1 = findViewById(R.id.textView5_1);
        textView6_1 = findViewById(R.id.textView6_1);
        textView7_1 = findViewById(R.id.textView7_1);
        textView8_1 = findViewById(R.id.textView8_1);
        textView9_1 = findViewById(R.id.textView9_1);
        textView10_1 = findViewById(R.id.textView10_1);

        textView11_1 = findViewById(R.id.textView11_1);
        textView12_1 = findViewById(R.id.textView12_1);
        textView13_1 = findViewById(R.id.textView13_1);
        textView14_1 = findViewById(R.id.textView14_1);
        textView15_1 = findViewById(R.id.textView15_1);
        textView16_1 = findViewById(R.id.textView16_1);
        textView17_1 = findViewById(R.id.textView17_1);
        textView18_1 = findViewById(R.id.textView18_1);
        textView19_1 = findViewById(R.id.textView19_1);
        textView20_1 = findViewById(R.id.textView20_1);

        textView21_1 = findViewById(R.id.textView21_1);
        textView22_1 = findViewById(R.id.textView22_1);
        textView23_1 = findViewById(R.id.textView23_1);
        textView24_1 = findViewById(R.id.textView24_1);
        textView25_1 = findViewById(R.id.textView25_1);
        textView26_1 = findViewById(R.id.textView26_1);
        textView27_1 = findViewById(R.id.textView27_1);
        textView28_1 = findViewById(R.id.textView28_1);
        textView29_1 = findViewById(R.id.textView29_1);
        textView30_1 = findViewById(R.id.textView30_1);


        if(randomNum() == 1) {
            textView3.setText("       | | | | | | | | \\\\--- ");
            textView4.setText("       | | | | | | | | //--- ");
            textView3_1.setText("1");
            textView4_1.setText("1");
        } else {
            textView3.setText(" ---// | | | | | | | |       ");
            textView4.setText(" ---\\\\ | | | | | | | |       ");
            textView3_1.setText("0");
            textView4_1.setText("0");
        }

        if(randomNum() == 1) {
            textView5.setText("       | | | | | | | | \\\\--- ");
            textView6.setText("       | | | | | | | | //--- ");
            textView5_1.setText("1");
            textView6_1.setText("1");
        } else {
            textView5.setText(" ---// | | | | | | | |       ");
            textView6.setText(" ---\\\\ | | | | | | | |       ");
            textView5_1.setText("0");
            textView6_1.setText("0");
        }

        if(randomNum() == 1) {
            textView7.setText("       | | | | | | | | \\\\--- ");
            textView8.setText("       | | | | | | | | //--- ");
            textView7_1.setText("1");
            textView8_1.setText("1");
        } else {
            textView7.setText(" ---// | | | | | | | |       ");
            textView8.setText(" ---\\\\ | | | | | | | |       ");
            textView7_1.setText("0");
            textView8_1.setText("0");
        }

        if(randomNum() == 1) {
            textView9.setText("       | | | | | | | | \\\\--- ");
            textView10.setText("       | | | | | | | | //--- ");
            textView9_1.setText("1");
            textView10_1.setText("1");
        } else {
            textView9.setText(" ---// | | | | | | | |       ");
            textView10.setText(" ---\\\\ | | | | | | | |       ");
            textView9_1.setText("0");
            textView10_1.setText("0");
        }

        if(randomNum() == 1) {
            textView11.setText("       | | | | | | | | \\\\--- ");
            textView12.setText("       | | | | | | | | //--- ");
            textView11_1.setText("1");
            textView12_1.setText("1");
        } else {
            textView11.setText(" ---// | | | | | | | |       ");
            textView12.setText(" ---\\\\ | | | | | | | |       ");
            textView11_1.setText("0");
            textView12_1.setText("0");
        }

        if(randomNum() == 1) {
            textView13.setText("       | | | | | | | | \\\\--- ");
            textView14.setText("       | | | | | | | | //--- ");
            textView13_1.setText("1");
            textView14_1.setText("1");
        } else {
            textView13.setText(" ---// | | | | | | | |       ");
            textView14.setText(" ---\\\\ | | | | | | | |       ");
            textView13_1.setText("0");
            textView14_1.setText("0");
        }

        if(randomNum() == 1) {
            textView15.setText("       | | | | | | | | \\\\--- ");
            textView16.setText("       | | | | | | | | //--- ");
            textView15_1.setText("1");
            textView16_1.setText("1");
        } else {
            textView15.setText(" ---// | | | | | | | |       ");
            textView16.setText(" ---\\\\ | | | | | | | |       ");
            textView15_1.setText("0");
            textView16_1.setText("0");
        }

        if(randomNum() == 1) {
            textView17.setText("       | | | | | | | | \\\\--- ");
            textView18.setText("       | | | | | | | | //--- ");
            textView17_1.setText("1");
            textView18_1.setText("1");
        } else {
            textView17.setText(" ---// | | | | | | | |       ");
            textView18.setText(" ---\\\\ | | | | | | | |       ");
            textView17_1.setText("0");
            textView18_1.setText("0");
        }

        if(randomNum() == 1) {
            textView19.setText("       | | | | | | | | \\\\--- ");
            textView20.setText("       | | | | | | | | //--- ");
            textView19_1.setText("1");
            textView20_1.setText("1");
        } else {
            textView19.setText(" ---// | | | | | | | |       ");
            textView20.setText(" ---\\\\ | | | | | | | |       ");
            textView19_1.setText("0");
            textView20_1.setText("0");
        }

        if(randomNum() == 1) {
            textView21.setText("       | | | | | | | | \\\\--- ");
            textView22.setText("       | | | | | | | | //--- ");
            textView21_1.setText("1");
            textView22_1.setText("1");
        } else {
            textView21.setText(" ---// | | | | | | | |       ");
            textView22.setText(" ---\\\\ | | | | | | | |       ");
            textView21_1.setText("0");
            textView22_1.setText("0");
        }

        if(randomNum() == 1) {
            textView23.setText("       | | | | | | | | \\\\--- ");
            textView24.setText("       | | | | | | | | //--- ");
            textView23_1.setText("1");
            textView24_1.setText("1");
        } else {
            textView23.setText(" ---// | | | | | | | |       ");
            textView24.setText(" ---\\\\ | | | | | | | |       ");
            textView23_1.setText("0");
            textView24_1.setText("0");
        }

        if(randomNum() == 1) {
            textView25.setText("       | | | | | | | | \\\\--- ");
            textView26.setText("       | | | | | | | | //--- ");
            textView25_1.setText("1");
            textView26_1.setText("1");
        } else {
            textView25.setText(" ---// | | | | | | | |       ");
            textView26.setText(" ---\\\\ | | | | | | | |       ");
            textView25_1.setText("0");
            textView26_1.setText("0");
        }

        if(randomNum() == 1) {
            textView27.setText("       | | | | | | | | \\\\--- ");
            textView28.setText("       | | | | | | | | //--- ");
            textView27_1.setText("1");
            textView28_1.setText("1");
        } else {
            textView27.setText(" ---// | | | | | | | |       ");
            textView28.setText(" ---\\\\ | | | | | | | |       ");
            textView27_1.setText("0");
            textView28_1.setText("0");
        }

        if(randomNum() == 1) {
            textView29.setText("       | | | | | | | | \\\\--- ");
            textView30.setText("       | | | | | | | | //--- ");
            textView29_1.setText("1");
            textView30_1.setText("1");
        } else {
            textView29.setText(" ---// | | | | | | | |       ");
            textView30.setText(" ---\\\\ | | | | | | | |       ");
            textView29_1.setText("0");
            textView30_1.setText("0");
        }

        btn_l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView30_1.getText().toString().equals("1")) {
                    //정답일시
                    score++;
                    textView2.setText(score+"");

                    textView29.setText(textView27.getText());
                    textView30.setText(textView28.getText());
                    textView29_1.setText(textView27_1.getText());
                    textView30_1.setText(textView28_1.getText());

                    textView27.setText(textView25.getText());
                    textView28.setText(textView26.getText());
                    textView27_1.setText(textView25_1.getText());
                    textView28_1.setText(textView26_1.getText());

                    textView25.setText(textView23.getText());
                    textView26.setText(textView24.getText());
                    textView25_1.setText(textView23_1.getText());
                    textView26_1.setText(textView24_1.getText());

                    textView23.setText(textView21.getText());
                    textView24.setText(textView22.getText());
                    textView23_1.setText(textView21_1.getText());
                    textView24_1.setText(textView22_1.getText());

                    textView21.setText(textView19.getText());
                    textView22.setText(textView20.getText());
                    textView21_1.setText(textView19_1.getText());
                    textView22_1.setText(textView20_1.getText());

                    textView19.setText(textView17.getText());
                    textView20.setText(textView18.getText());
                    textView19_1.setText(textView17_1.getText());
                    textView20_1.setText(textView18_1.getText());

                    textView17.setText(textView15.getText());
                    textView18.setText(textView16.getText());
                    textView17_1.setText(textView15_1.getText());
                    textView18_1.setText(textView16_1.getText());

                    textView15.setText(textView13.getText());
                    textView16.setText(textView14.getText());
                    textView15_1.setText(textView13_1.getText());
                    textView16_1.setText(textView14_1.getText());

                    textView13.setText(textView11.getText());
                    textView14.setText(textView12.getText());
                    textView13_1.setText(textView11_1.getText());
                    textView14_1.setText(textView12_1.getText());

                    textView11.setText(textView9.getText());
                    textView12.setText(textView10.getText());
                    textView11_1.setText(textView9_1.getText());
                    textView12_1.setText(textView10_1.getText());

                    textView9.setText(textView7.getText());
                    textView10.setText(textView8.getText());
                    textView9_1.setText(textView7_1.getText());
                    textView10_1.setText(textView8_1.getText());

                    textView7.setText(textView5.getText());
                    textView8.setText(textView6.getText());
                    textView7_1.setText(textView5_1.getText());
                    textView8_1.setText(textView6_1.getText());

                    textView5.setText(textView3.getText());
                    textView6.setText(textView4.getText());
                    textView5_1.setText(textView3_1.getText());
                    textView6_1.setText(textView4_1.getText());

                    if(randomNum() == 1) {
                        textView3.setText("       | | | | | | | | \\\\--- ");
                        textView4.setText("       | | | | | | | | //--- ");
                        textView3_1.setText("1");
                        textView4_1.setText("1");
                    } else {
                        textView3.setText(" ---// | | | | | | | |       ");
                        textView4.setText(" ---\\\\ | | | | | | | |       ");
                        textView3_1.setText("0");
                        textView4_1.setText("0");
                    }
                } else {
                    Toast.makeText(MainActivity.this,"GAYOVER",Toast.LENGTH_SHORT).show();
                    btn_r.setEnabled(false);
                    btn_l.setEnabled(false);
                }
            }
        });

        btn_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView30_1.getText().toString().equals("0")) {
                    //정답일시
                    score++;
                    textView2.setText(score+"");

                    textView29.setText(textView27.getText());
                    textView30.setText(textView28.getText());
                    textView29_1.setText(textView27_1.getText());
                    textView30_1.setText(textView28_1.getText());

                    textView27.setText(textView25.getText());
                    textView28.setText(textView26.getText());
                    textView27_1.setText(textView25_1.getText());
                    textView28_1.setText(textView26_1.getText());

                    textView25.setText(textView23.getText());
                    textView26.setText(textView24.getText());
                    textView25_1.setText(textView23_1.getText());
                    textView26_1.setText(textView24_1.getText());

                    textView23.setText(textView21.getText());
                    textView24.setText(textView22.getText());
                    textView23_1.setText(textView21_1.getText());
                    textView24_1.setText(textView22_1.getText());

                    textView21.setText(textView19.getText());
                    textView22.setText(textView20.getText());
                    textView21_1.setText(textView19_1.getText());
                    textView22_1.setText(textView20_1.getText());

                    textView19.setText(textView17.getText());
                    textView20.setText(textView18.getText());
                    textView19_1.setText(textView17_1.getText());
                    textView20_1.setText(textView18_1.getText());

                    textView17.setText(textView15.getText());
                    textView18.setText(textView16.getText());
                    textView17_1.setText(textView15_1.getText());
                    textView18_1.setText(textView16_1.getText());

                    textView15.setText(textView13.getText());
                    textView16.setText(textView14.getText());
                    textView15_1.setText(textView13_1.getText());
                    textView16_1.setText(textView14_1.getText());

                    textView13.setText(textView11.getText());
                    textView14.setText(textView12.getText());
                    textView13_1.setText(textView11_1.getText());
                    textView14_1.setText(textView12_1.getText());

                    textView11.setText(textView9.getText());
                    textView12.setText(textView10.getText());
                    textView11_1.setText(textView9_1.getText());
                    textView12_1.setText(textView10_1.getText());

                    textView9.setText(textView7.getText());
                    textView10.setText(textView8.getText());
                    textView9_1.setText(textView7_1.getText());
                    textView10_1.setText(textView8_1.getText());

                    textView7.setText(textView5.getText());
                    textView8.setText(textView6.getText());
                    textView7_1.setText(textView5_1.getText());
                    textView8_1.setText(textView6_1.getText());

                    textView5.setText(textView3.getText());
                    textView6.setText(textView4.getText());
                    textView5_1.setText(textView3_1.getText());
                    textView6_1.setText(textView4_1.getText());

                    if(randomNum() == 1) {
                        textView3.setText("       | | | | | | | | \\\\--- ");
                        textView4.setText("       | | | | | | | | //--- ");
                        textView3_1.setText("1");
                        textView4_1.setText("1");
                    } else {
                        textView3.setText(" ---// | | | | | | | |       ");
                        textView4.setText(" ---\\\\ | | | | | | | |       ");
                        textView3_1.setText("0");
                        textView4_1.setText("0");
                    }
                } else {
                    Toast.makeText(MainActivity.this,"GAYOVER",Toast.LENGTH_SHORT).show();
                    btn_r.setEnabled(false);
                    btn_l.setEnabled(false);
                }
            }
        });

    }

    public int randomNum() {
        Random random = new Random();
        int randomValue = random.nextInt(2);

        return randomValue;
    }
}