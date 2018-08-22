package com.example.user.testfunctionandroid.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.user.testfunctionandroid.R;

public class UserFragment extends Fragment{


    EditText editText;
    TextView textView;
    Button button;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_user, container,false);

        editText = view.findViewById(R.id.fmuser_edit);
        textView = view.findViewById(R.id.fmuser_show);
        button = view.findViewById(R.id.fmuser_bt);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(editText.getText());
            }
        });

        return view;


    }


}
