package com.example.class8a2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class ShowHideActivity extends AppCompatActivity {

    private Fragment_A fragment_a;
    private Fragment_B fragment_b;

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


        fragment_a = new Fragment_A();
        fragment_b = new Fragment_B();


        FragmentTransaction t = getSupportFragmentManager().beginTransaction();
        t.add(R.id.main_LAY_top, fragment_a);
        t.add(R.id.main_LAY_top, fragment_b);
        t.commit();

        getSupportFragmentManager().beginTransaction().hide(fragment_b).commit();

    }
    private void showA() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().hide(fragment_b).commit();
        fragmentManager.beginTransaction().show(fragment_a).commit();
    }

    private void showB() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().hide(fragment_a).commit();
        fragmentManager.beginTransaction().show(fragment_b).commit();
    }
}
