package com.example.home_work_23;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button btn_plus;
    private Button btn_result;
    private Button btn_minus;
    private TextView count;
    private int result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_minus.findViewById(R.id.btn_minus);
        btn_plus.findViewById(R.id.btn_plus);
        btn_result.findViewById(R.id.btn_send_result);
        count.findViewById(R.id.tv_count);

        btn_plus.setOnClickListener(view -> {
            result++;
            newCounterText();
        });

        btn_minus.setOnClickListener(view -> {
            result--;
            newCounterText();
        });
        btn_result.setOnClickListener(view -> {
            String result = count.getText().toString();
            Bundle bundle = new Bundle();
            bundle.putString("password", result);
            ResultFragment resultFragment = new ResultFragment();
            resultFragment.setArguments(bundle);
        });
    }

    private void newCounterText() {
        count.setText(String.valueOf(result));
    }
}