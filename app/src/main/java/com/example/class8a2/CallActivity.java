package com.example.class8a2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class CallActivity extends AppCompatActivity {

    private Fragment_A_CB fragment_a_cb;
    private Fragment_B fragment_b;

    private Button main_BTN_a;
    private Button main_BTN_b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_double);

        main_BTN_a = findViewById(R.id.main_BTN_a);
        main_BTN_b = findViewById(R.id.main_BTN_b);

        fragment_a_cb = new Fragment_A_CB();
        fragment_b = new Fragment_B();

        fragment_a_cb.setCallBack(myCallBack);


        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.main_LAY_top, fragment_a_cb);
        transaction.replace(R.id.main_LAY_bottom, fragment_b);
        transaction.commit();

    }

    CallBack_ActivityList myCallBack = new CallBack_ActivityList() {
        @Override
        public void setMap(String location) {

        }

        @Override
        public void toast() {

        }
    };

}
