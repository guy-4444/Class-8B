package com.example.class8a2;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class Fragment_A_CB extends Fragment {

    private CallBack_ActivityList callBack_activityList;

    private View view;
    private TextView framA_LBL_title;
    private Button framA_BTN_action;

    public void setCallBack(CallBack_ActivityList _callBack_activityList) {
        this.callBack_activityList = _callBack_activityList;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState);
        Log.d("pttt", "onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d("pttt", "onCreateView");
        if(view==null){
            view = inflater.inflate(R.layout.fragment_a, container, false);
        }

        findViews(view);

        framA_BTN_action.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeTextOfBFragment();
            }
        });


        return view;
    }

    private void changeTextOfBFragment() {
        callBack_activityList.toast();

    }

    private void findViews(View view) {
        framA_LBL_title = view.findViewById(R.id.framA_LBL_title);
        framA_BTN_action = view.findViewById(R.id.framA_BTN_action);
    }

    public void setTitle(String text) {
        Log.d("pttt", "setTitle");
        framA_LBL_title.setText(text);
    }


}
