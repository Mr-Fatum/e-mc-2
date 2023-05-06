package com.example.emc2.ui.slideshow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public SlideshowViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Здесь будет вкадка с настройками приложения, чтобы каждый пользователь смог настроить наше приложение под себя");
    }

    public LiveData<String> getText() {
        return mText;
    }
}