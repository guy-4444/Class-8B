package com.example.class8a2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button main_BTN_a;
    private Button main_BTN_b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_BTN_a = findViewById(R.id.main_BTN_a);
        main_BTN_b = findViewById(R.id.main_BTN_b);


        main_BTN_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showA();
            }
        });

        main_BTN_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showB();
            }
        });
    }
    private void showA() {
        Fragment_A fragment_a = new Fragment_A();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.main_LAY_top, fragment_a);
        transaction.commit();
    }

    private void showB() {
        Fragment_B fragment_b = new Fragment_B();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.main_LAY_top, fragment_b);
        transaction.commit();
    }


}
