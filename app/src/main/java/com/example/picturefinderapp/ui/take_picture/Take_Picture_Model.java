package com.example.picturefinderapp.ui.take_picture;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Take_Picture_Model extends ViewModel {

    private MutableLiveData<String> mText;

    public Take_Picture_Model() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}