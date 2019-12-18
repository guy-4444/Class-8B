package com.example.class8a2;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class Fragment_B extends Fragment {

    private View view;
    private TextView framA_LBL_title;

    @Override
    public void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState);
        Log.d("pttt", "onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d("pttt", "onCreateView");
        if(view==null){
            view = inflater.inflate(R.layout.fragment_b, container, false);
        }


        findViews(view);
        return view;
    }

    private void findViews(View view) {
        framA_LBL_title = view.findViewById(R.id.framA_LBL_title);
    }

    public void setTitle(String text) {
        framA_LBL_title.setText(text);
    }
}
