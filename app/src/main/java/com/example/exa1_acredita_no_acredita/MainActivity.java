package com.example.exa1_acredita_no_acredita;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtVw1, txtVw2, txtVw3;
    SeekBar seekBar1, seekBar2;
    ImageView imgVw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgVw = findViewById(R.id.imgVw);
        imgVw.setImageResource(R.drawable.img3);
        txtVw1 = findViewById(R.id.txtVw1);
        txtVw2 = findViewById(R.id.txtVw2);
        txtVw3 = findViewById(R.id.txtVw3);
        seekBar1 = findViewById(R.id.seekBar1);
        seekBar2 = findViewById(R.id.seekBar2);

        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                txtVw1.setText("" + progress);

                if (seekBar2.getProgress() >= seekBar1.getProgress()) {
                    txtVw3.setText("ACREDITADO!");
                } else {
                    txtVw3.setText("NO ACREDITADO :(");
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                txtVw2.setText("" + progress);

                if (seekBar2.getProgress() >= seekBar1.getProgress()) {
                    txtVw3.setText("ACREDITADO!");
                } else {
                    txtVw3.setText("NO ACREDITADO :(");
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

}