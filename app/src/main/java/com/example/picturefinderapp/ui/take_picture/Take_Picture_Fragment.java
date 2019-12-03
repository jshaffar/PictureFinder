package com.example.picturefinderapp.ui.take_picture;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.picturefinderapp.R;

public class Take_Picture_Fragment extends Fragment {

    private Take_Picture_Model takePictureModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        takePictureModel =
                ViewModelProviders.of(this).get(Take_Picture_Model.class);
        View root = inflater.inflate(R.layout.fragment_take_picture, container, false);
        final TextView textView = root.findViewById(R.id.text_take_picture);
        takePictureModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}