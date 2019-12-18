package com.example.class8a2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class DoubleActivity extends AppCompatActivity {

    private Fragment_A fragment_a;
    private Fragment_B fragment_b;

    private Button main_BTN_a;
    private Button main_BTN_b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_double);

        main_BTN_a = findViewById(R.id.main_BTN_a);
        main_BTN_b = findViewById(R.id.main_BTN_b);


        fragment_a = new Fragment_A();
        fragment_b = new Fragment_B();

        fragment_a.setActivity(this);


        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.main_LAY_top, fragment_a);
        transaction.replace(R.id.main_LAY_bottom, fragment_b);
        transaction.commit();

        main_BTN_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setTextA();
            }
        });
    }

    public void setTextA() {
        fragment_b.setTitle("Hi iam a");
    }


    @Override
    protected void onResume() {
        super.onResume();
        fragment_a.setTitle("onResume");
    }
}
