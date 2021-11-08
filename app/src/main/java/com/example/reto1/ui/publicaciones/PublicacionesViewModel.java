package com.example.reto1.ui.publicaciones;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class PublicacionesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PublicacionesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Publicaciones fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}