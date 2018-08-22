package com.example.user.testfunctionandroid.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.example.user.testfunctionandroid.R;

public class HomeFragment extends Fragment {


    EditText editText;
    TextView textView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_home, container,false);

        editText = view.findViewById(R.id.fmhome_edit);
        textView = view.findViewById(R.id.fmhome_show);


        return view;


    }



}
